package com.hz;

public class Adapter {
    //TODO
    // the reader should accept the following values as true:
    // "true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"

    public static String CheckString(String input) {
        String[] words = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};

        for (String word : words) {
            if (input.equals(word)) {
                return "Yep";
            }
        }
        return "No";
    }
}
