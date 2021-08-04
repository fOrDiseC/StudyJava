package hackerrank;

public class JavaLoops {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int n = 5;
        int summary =a;
        int expoint =1;
        for (int index=0; index<n; index++) {
            summary=summary+b*expoint;
            expoint=expoint<<1;
            System.out.print(summary+" ");


        }

        System.out.println();


    }
}
