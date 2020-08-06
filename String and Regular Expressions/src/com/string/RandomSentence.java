package com.string;

import java.security.SecureRandom;

public class RandomSentence {
    public static void main(String... args) {
        String[] article = {"the", "a", "one", "some", "any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};

        for (int i = 1; i <= 20; i++) {
            String firstArticle = article[randomizeNumbers()];
            String newFirstArticle = firstArticle.substring(0, 1).toUpperCase() + firstArticle.substring(1);
            System.out.print(i + "."+ "\t" + newFirstArticle
                    + " " + noun[randomizeNumbers()] + " " + verb[randomizeNumbers()] + " "
                    + preposition[randomizeNumbers()] + " " + article[randomizeNumbers()] + " "
                    + noun[randomizeNumbers()] + ".");
            System.out.println();
        }
    }

    public static int randomizeNumbers() {
        SecureRandom randomNumber = new SecureRandom();
        int random = randomNumber.nextInt(5);
        return random;
    }

}
