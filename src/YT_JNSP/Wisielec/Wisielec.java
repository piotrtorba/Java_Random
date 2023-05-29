package YT_JNSP.Wisielec;

import java.util.*;

public class Wisielec {
    List<String> words = List.of("kot", "auto", "zwierze", "jajko");
    String randWord;
    char[] userWord;
    private int points;
    private int tries = 3;

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">>> ---> Start <--- <<<\n");
        System.out.println("Rules:");
        System.out.println("Guess the word and gain 1pkt.");
        System.out.println("For every mistake you loose 1 life.");
        System.out.println("------------------------------------------------------------");

        Random random = new Random();
        randWord = words.get(random.nextInt(words.size()));

        userWord = new char[randWord.length()];
        Arrays.fill(userWord, '*'); //Metoda zastepuje znaki ze slowa (arg.1) okreslonym innym
                                        // znakiem, tutaj '*' (arg.2)
        
        while (!gameover()) {
            System.out.println("Enter a letter");
            System.out.println("Your points: " + points);
            System.out.println("You have " + tries + " left");
            System.out.println();
            System.out.println(userWord);

            char letter = scanner.nextLine().charAt(0);

            checkLetter(letter);
        }
        scanner.close();
    }

    private void checkLetter(char letter) {
        boolean foundLetter = false;
        for (int i = 0; i < randWord.length(); i++) {
            if (randWord.charAt(i) == letter) {
                userWord[i] = letter;
                System.out.println("Congratulatijons! +1 point");
                foundLetter = true;
            }
        }
        if (!foundLetter) {
            System.out.println("The word doesn't contain given letter\n".toUpperCase());
            tries--;
        } else {
            points++;
        }
    }

    private boolean gameover() {
        if (tries == 0 || randWord.equals(String.valueOf(userWord))) {
            System.out.println("Total points: " + points);
            System.out.println("----------- Game Over -----------".toUpperCase());
        }
        return tries == 0 || randWord.equals(String.valueOf(userWord));
    }
}
