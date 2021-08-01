package hackerrank;
import java.util.ArrayList;

public class RunTest2 {


    int MAX_LENGTH = 10;

    private void run() {
        ArrayList<Integer> myList = new ArrayList<Integer>();

//        for (int i = 0; i < MAX_LENGTH; i++) {
//            int value = (int) (Math.random() * 8);
//            myList.add(value);
//        }

        for(int item : new int[] {1,5,8,-15,23,44}) {
            myList.add(item);
        }

        System.out.println(myList);

        // find min
        // find max
        // output with delimiter ':'
//        1:5:8:-15:23:44

//        for(Integer item : myList) {
//            System.out.println(item);
//        }



    }


    public static void main(String[] args) {
        new RunTest2().run();
    }
}
