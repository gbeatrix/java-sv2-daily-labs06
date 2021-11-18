package hangman;

import java.util.Scanner;

public class HangmanMain {
    private String wordToFind = "alma";
    private String wordFound = "____";
    private int chances = 8;

    public static void main(String[] args) {
        new HangmanMain().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);

        while(!wordToFind.equals(wordFound) && (chances > 0)){
            System.out.println("Itt tartasz: " + wordFound);
            System.out.println("Ennyit hibázhatsz: " + chances);
            System.out.print("Mi a következő tipped? ");
            String guess=scanner.next();
            if(wordToFind.contains(guess)){
                wordFound = updateWordFound(wordToFind, wordFound, guess);
            } else {
                --chances;
            }
        }

        if(wordToFind.equals(wordFound)){
            System.out.println("Ügyes vagy!");
        } else {
            System.out.println("Vesztettél.");
        }
    }

    private String updateWordFound(String wordToFind, String status, String guess) {
        char[] chars = status.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (wordToFind.charAt(i) == guess.charAt(0)) {
                chars[i] = guess.charAt(0);
            }
        }
        return new String(chars);
    }
}
