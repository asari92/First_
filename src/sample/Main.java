package sample;

import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input line: ");

        String[] sentences = in.nextLine().trim().split(".");

        StringJoiner joiner = new StringJoiner(".");

        for (String sentence: sentences) {
            joiner.add(Character.toUpperCase(sentence.charAt(0)) + sentence.substring(1));
        }

        System.out.println(joiner.toString());
        in.close();
    }
}
