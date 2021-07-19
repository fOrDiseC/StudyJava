import java.util.ArrayList;
import java.util.Collections;

public class RunTest {

    private void run() {
        System.out.println("Hello world");
        ArrayList<Integer> myList = new ArrayList<Integer>(); // Обявили и инцициализироывали список от Integer
//        int length = 10;
//        int[] myArray = new int[length];// Массив целых чисел
//
//        int k = 0;
//
//
//        // Заполнение массива целыми числа от 0 до 7
//        for (int i = 0; i < length; i++) {
//
//            myArray[i] = (int) (Math.random() * 8);
//
//
//        }
        int[] myArray = new int[] {1,5,8,-15,23,44};

        //Вывод массива
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        // Заполнянем список массивом
        for (int i = 0; i < myArray.length; i++) {
            myList.add(myArray[i]);
        }

//        for (int item : myArray) {
//            myList.add(myArray[item]);
//        }

        System.out.println(myList);
        // Преобразование списка
        Collections.sort(myList);
        System.out.println(myList);
        Collections.reverse(myList);
        System.out.println(myList);

    }


    public static void main(String[] args) {
        new RunTest().run();
    }
}
