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
        System.out.println(">>> ---> Start gry <--- <<<\n");
        System.out.println("Zasady:");
        System.out.println("Odgadnij slowo i zdobodz 1pkt");
        System.out.println("Za kazda nie odgadnieta litere tracisz 1 probe.");
        System.out.println("------------------------------------------------------------");

        Random random = new Random();
        randWord = words.get(random.nextInt(words.size()));

        userWord = new char[randWord.length()];
        Arrays.fill(userWord, '*'); //Metoda zastepuje znaki ze slowa (arg.1) okreslonym innym
                                        // znakiem, tutaj '*' (arg.2)
        
        while (!gameover()) {
            System.out.println("Podaj litere slowa.");
            System.out.println("Liczba zdobytych punktow: " + points);
            System.out.println("Pozostalo Ci " + tries + " proby.");
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
                System.out.println("Zbobyles 1 pkt.");
                foundLetter = true;
            }
        }
        if (!foundLetter) {
            System.out.println("Niestety slowo nie zawiera podanej litery.\n".toUpperCase());
            tries--;
        } else {
            points++;
        }
    }

    private boolean gameover() {
        if (tries == 0 || randWord.equals(String.valueOf(userWord))) {
            System.out.println("Zdobyles: " + points + " punktow.");
            System.out.println("----------- game over -----------".toUpperCase());
        }
        return tries == 0 || randWord.equals(String.valueOf(userWord));
    }
}
