package JavaifElse;

public class JavaIfElse {


    public static void main(String[] args) {
        System.out.println("Helloworld");
        int n = 9;
        comparenumbers(n);
    }


    private static String comparenumbers(int n) {
        boolean evenodd = true;
    if (n % 2 == 0 ) {

             System.out.println("Weird");
            evenodd = false;


        }
     if (evenodd == true)  {
         if ( ((2<= n) && (n <=5)) || (n>20) ) System.out.println("Not Weird");
            else System.out.println("Weird");

     }

      return null;
    }
}