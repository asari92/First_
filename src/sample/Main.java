package sample;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input line: ");
        StringBuilder line = new StringBuilder(in.nextLine().trim()); //добавляем строку без пробелов по краям

        line.replace(0, 1, "" + Character.toUpperCase(line.charAt(0))); //переводим в верх. регистр 1 символ

        for (int i = 1; i < line.length(); i++) {
            if (line.charAt(i) == '.' && i != line.length() - 1) {
                for (int j = i + 1;; j++) {
                    if (line.charAt(j) != ' ') {
                        line.replace(j, j + 1, "" + Character.toUpperCase(line.charAt(j)));
                        i = j;
                        break;
                    }
                }
            }
        }

        System.out.println(line);
        in.close();
    }
}
