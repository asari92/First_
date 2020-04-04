package sample;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input line: ");
        StringBuilder line = new StringBuilder(in.nextLine());
        int start = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) != ' ') {
                line.replace(i,i+1, "" + Character.toUpperCase(line.charAt(i)));
                start = i;
                break;
            }
        }
        for (int i = start; i < line.length(); i++) {
            if (i < 2) {
                continue;
            } else if (line.charAt(i) != ' ' && line.charAt(i-2) == '.') {
                line.replace(i,i+1, "" + Character.toUpperCase(line.charAt(i)));
            }
        }
        System.out.println(line);
        in.close();
    }
}
