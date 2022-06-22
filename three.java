//import Scanner
import java.util.Scanner;

public class Operators{
   
   // Create scanner object/variable
        Scanner sc = new Scanner(System.in);
        //get n
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        //get r
        System.out.println("Enter r: ");
        int r = sc.nextInt();
        CaCulateCombination(n,r);

         public int factorial(int number){
                int fact = 1;
        for (int i = number; i > 0; i--) {
            fact *= i;
        }
        return fact;
            }
            
        public int CaCulateCombination(int fn,int sn){
            int nFac=factorial(fn);
            int nMinusRFac=factorial(fn-sn);
            int rfac=factorial(sn);
            int Combination=nFac/nMinusRFac*rfac;
            System.println.out(fn +" combination "+sn +" is "+Combination);
        }
         


}