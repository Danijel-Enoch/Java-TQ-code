//import Scanner
import java.util.Scanner;

public class Operators{
   

   //Calculate Addition
    private Addition(int fn,int sn){
            return (fn+sn);
    }
    //calculate Subtraction
     private int Subtraction(int fn,int sn){
        return(fn-sn);
    }
    //Caculate Multiplication
    private int Multiplication(int fn,int sn){
            return (fn*sn);
    }
    //Caculate Division
        private int Division(int fn,int sn){
        return (fn/sn);
    }
    //Caculate Modulus
    private int Modulus(int fn,int sn){
        return (fn%sn);
    }

}
public class CaCulate{

    public static void main(String[] args) {
        //instantiate Class by creating new Object
            Operators Calculator= new Operators();
        // Create scanner object/variable
        Scanner sc = new Scanner(System.in);
        //get First number
        System.out.println("Enter First Number: ");
        int fn = sc.nextInt();
        // get Operator
        System.out.println("Enter Operator (+)(-)(*)(/)(%): ");
        String operator = sc.nextString();
        //get Second Number
        System.out.println("Enter Second  Number: ");
        int sn = sc.nextInt();

        switch (operator) {
            //switch case to +
  case "+":
    System.out.println("Your Answer is: "+ Calculator.Addition(fn,sn); );
    break;
    //switch case to +
  case "-":
    System.out.println("Your Answer is: "+ Calculator.Subtraction(fn,sn); );
    break;
    //switch case to -
  case "*":
    cSystem.out.println("Your Answer is: "+ Calculator.Multiplication(fn,sn); );
    break;
    //switch case to *
    case "/":
    System.out.println("Your Answer is: "+ Calculator.Division(fn,sn); );
    break;
    //switch case to /
    case "%":
     System.out.println("Your Answer is: "+ Calculator.Modulus(fn,sn); );
    break;
    //switch case to %
  default:
    System.out.println("Pls Put In Value");
        
    }


}