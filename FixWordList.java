import java.util.*;
import java.io.*;

public class FixWordList {
    public static void main(String...args) throws Exception {
        Scanner input = new Scanner(new File("Wordlist2PRE.txt"));
        FileWriter output = new FileWriter (new File("Wordlist2.txt"));
        
        while (input.hasNext()) {
            String word = input.nextLine();
            if (isValid(word)) {
                output.write(word);
                output.write("\n");
            }
        }
    }

    static boolean isValid(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) < 'a' || word.charAt(i) > 'z') {
                return false;
            }
        }
        return true;
    }
}