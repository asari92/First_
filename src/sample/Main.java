package sample;

import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Input line: ");

            String[] sentences = in.nextLine().trim().split("[.!?]");

            StringJoiner joiner = new StringJoiner(".");

            for (String sentence : sentences) {
                for (int i = 0; i < sentence.length() - 1; i++) {
                    if (Character.isLetter(sentence.charAt(i))) {
                        joiner.add(Character.toUpperCase(sentence.charAt(i)) + sentence.substring(i + 1));
                        break;
                    }
                }
            }

            System.out.println(joiner.toString());
        }
    }
}