/** 
 * WordGame.java
 * 
 * version 0.1.0
 * 
 * December 9, 2022
 * 
 * This class was created by Rev. Drew Brown, a student at Indiana University Kokomo,
 * whose student number is 2001047582. It was prepared as a class assignment for
 * CSCI-C103 Computer Programming I §30187 taught by Dr. Yang Liu.
 * This file shall not be reproduced for any non-academic purposes without
 * prior authorization of the author and the instructor.
 */
 
 
import java.util.*;
import java.io.*;

public class WordGame {
    static Scanner keybd = new Scanner(System.in);

    public static void main(String[] args) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
        final String FILE_PATH = "wordlist.10000.txt";
        System.out.println("Welcome to Reverend Brown's Word Puzzle!");
        int difficulty = 0;
        while (difficulty > 3 || difficulty < 1) {
        System.out.print("Difficulty Levels: 1 = Easy, 2 = Medium, 3 = Hard. Which would you like? ");
            difficulty = Integer.parseInt(keybd.nextLine());
        }
        System.out.println("Type the full word for the following puzzles.");
        final long START_TIME = System.currentTimeMillis();
        long stopTime = 0;
        ArrayList<String> dict = getWordList(FILE_PATH, difficulty);

        int counter = 0;
        int score = 0;
        for (String word : dict) {
            String puzzle = maskWord(word, difficulty);
            if (validateWord(puzzle, dict)) {
                counter++;
                System.out.print(puzzle + ": ");
                String guess = keybd.nextLine();
                if (guess.equals(word)) {
                    System.out.println("Correct!");
                    score++;
                }
                else {
                    System.out.println("Wrong! Correct answer is " + word + ".");
                }
            }
            else {
                continue;
            }
            if (counter == 10) {
                stopTime = System.currentTimeMillis();
                System.out.printf("You correctly guessed %d out of 10 words in %.1f seconds.",
                        score, (stopTime - START_TIME)/1000.0);
                break;
            }
        }
    }

    /**
     * Load word list from dictionary to an ArrayList and shuffle the dictionary.
     * 
     * @param filePath source of dictionary.
     * @param level user requested level of difficulty.
     * @return ArrayList for the words in dictionary.
     * 
     */
     
    public static ArrayList<String> getWordList(String filePath, int level) throws IOException{
        ArrayList<String> dict = new ArrayList<>();
        Scanner readFile = new Scanner(new File(filePath));
        while (readFile.hasNext()) {
            String word = readFile.nextLine();
            if (word.length() >= (level + 2)) {
                dict.add(word);
            }
        }
        Collections.shuffle(dict);
        return dict;
    }

    /**
     * Randomly mask difficulty level number of letters in a word.
     * 
     * @param word word to be masked.
     * @param level number of letters to mask based on difficulty.
     * @return masked word
     * 
     */
     
    public static String maskWord(String word, int level) {
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 1; i < word.length() - 1; i++) {
            indices.add(i);
        }
        Collections.shuffle(indices);
        StringBuilder maskedWord = new StringBuilder(word);
        for (int i = 0; i < level; i++){
            maskedWord.setCharAt(indices.get(i), '_');
        }
        return maskedWord.toString();
    }

    /**
     * Validate that the solution to the puzzle is unique.
     *
     * @param puzzle masked word to validate.
     * @param dict dictionary to check masked word against.
     * @return whether there is a unique solution to the puzzle.
     */
     
    public static boolean validateWord(String puzzle, ArrayList<String> dict) {
        int solutions = 0;
        for (String word : dict) {
            if (puzzleMatch(word, puzzle)) {
                solutions++;
                if (solutions > 1) {
                    return false;
                }
            }
        }
        if (solutions == 1) {
            return true;
        }
        else {
            return false;
        }
    }

    /** 
     * Check that the word matches the puzzle.
     * 
     * @param word word in dictionary to check.
     * @param puzzle masked word to match.
     * @return whether the word matches the puzzle.
     */

    public static boolean puzzleMatch(String word, String puzzle) {
        if (word.length() != puzzle.length()) {
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            if (puzzle.charAt(i) != '_' && word.charAt(i) != puzzle.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}