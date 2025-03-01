package Q_10;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an odd-length word: ");
        String word = scanner.nextLine();
        scanner.close();

        if (word.length() % 2 == 1) {
            int middleIndex = word.length() / 2;
            char middleChar = word.charAt(middleIndex);
            System.out.println(middleChar);
        } else {
            System.out.println("Please enter a word with an odd length.");
        }
    }
}