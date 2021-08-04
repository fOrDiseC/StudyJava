package hackerrank;

public class Stringmanipulation {
    public static void main(String[] args) {
        String A = "Hello";
        String B ="Word";

        int a =A.length();
        int b =B.length();
        System.out.println(a+b);
        if (a>b) System.out.println("No");
        else System.out.println("Yes");

        String newA =A.substring(0,1).toUpperCase()+A.substring(1);
        String newB =B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(newA+" "+newB);
        String str = "Java";
    StringBuffer strBuffer = new StringBuffer(str);
    System.out.println("Емкость: " + strBuffer.capacity()); // 20
    strBuffer.ensureCapacity(32);
    System.out.println("Емкость: " + strBuffer.capacity()); // 42
    System.out.println("Длина: " + strBuffer.length()); // 4
    StringBuilder strBild =new StringBuilder(str);
    
        


    }

    




}
