import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Spliterator;

public class Test3 {


    public static void main(String[] args) throws IOException {
        String filename = args[0];
        processFile(filename);
    }

    private static void processFile(String filename) throws IOException {
        System.out.println("read file " + filename);
        File file = new File(filename);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                processLine(line);
            }
        }
        printSummary();
}

    private static HashMap<String,Integer > map = new HashMap<>();


    private static void processLine(String line) {
//        System.out.println(line);
        for (String  word : line.split(" ") ) {
            Integer counter = map.get(word);
            if ( counter == null ) {
                counter = 0;
            }
            map.put(word, counter + 1);
        }
    }

    private static void printSummary() {
        System.out.println("Word frequencies:");
        ArrayList<String> words = new ArrayList<>(map.keySet());
        Collections.sort(words);
        for(String word :words) {
            System.out.println(word + "=" + map.get(word));
        }
    }

}

