public class CaCulate{

    public static void main(String[] args) {

        System.out.println("N    || Nsq    ||	NSqRoot || 	NCube ||	NCubeRoot");
        for(int i = 0; i < 10; i++){
            //loop through list of numbers
            //find Square Root
            int squareRoot=Math.sqrt(i);
            //find Square
            int square = Math.pow(i, 2);
            //Cube
            int Cube = Math.pow(i, 3);
            //CubeRoot
            int cubeRoot=java.lang.Math.cbrt(i);
            System.out.println( i+ " ||"+square+"||"+squareRoot+"|| "+cube+"||"+cubeRoot+" ");

        }

    }
    
}