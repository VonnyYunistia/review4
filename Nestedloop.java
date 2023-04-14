package review4;

public class Nestedloop {

    public static void main(String[] args) {


        //nested loop, loop inside another loop

        for (int i = 1; i <=3 ; i++) {

            System.out.print(i+" ");

            System.out.println();

            for (int j = 0; j <=1 ; j++) { //inner loop depends on outer loop
                System.out.print(j+" ");

            }

        }








    }
}
