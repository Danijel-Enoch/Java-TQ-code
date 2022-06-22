public class MathLibrary{

    public static void main(String[] args) {

        System.out.println("N ||	NCube ||	NCubeRoot");
        for(int i = 0; i < 10; i++){
            if(i > 0) {// check if integer is positive or negative
            //loop through list of numbers
            //Cube
            int Cube = Math.pow(i, 3);
            //CubeRoot
            int cubeRoot=java.lang.Math.cbrt(i);
            System.out.println( i+ " || "+cube+" || "+cubeRoot+" ");
            }

        }

    }
    
}