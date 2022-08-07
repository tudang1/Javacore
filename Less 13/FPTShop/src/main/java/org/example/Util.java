package org.example;

import com.aventrix.jnanoid.jnanoid.NanoIdUtils;

import java.util.Random;

public class Util {
    private static final String alpha = "abcdefghijklmnopqrstuvwxyz"; // a-z
    private static final String alphaUpperCase = alpha.toUpperCase(); // A-Z
    private static final String digits = "0123456789"; // 0-9
    private static final String specials = "~=+%^*/()[]{}/!@#$?|";
    private static final String ALPHA_NUMERIC = alpha + alphaUpperCase + digits;
    private static final String ALL = alpha + alphaUpperCase + digits + specials;

    private static Random generator = new Random();
    public static int randomNumber(int min, int max) {
        return generator.nextInt((max - min) + 1) + min;
    }


    public static String randomId(int numberOfCharactor) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfCharactor; i++) {
            int number = randomNumber(0, ALPHA_NUMERIC.length() - 1);
            char ch = ALPHA_NUMERIC.charAt(number);
            sb.append(ch);
        }
        return sb.toString();
    }

    public static String generateId(int size){
        String number = "1234567890";
        String character = "~!@#$%^&*()_+";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        String allCharacter = number + character + alphabet + alphabet.toUpperCase();


        //char[] ch = allCharacter.toCharArray();
        char[] ch = number.toCharArray();

        String id = "NV" + NanoIdUtils.randomNanoId(generator, ch, size);

        return id;
    }

}