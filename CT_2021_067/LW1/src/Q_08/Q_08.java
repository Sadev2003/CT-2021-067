package Q_08;

import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string containing an exclamation mark: ");
        String input = scanner.nextLine();
        scanner.close();

        int index = input.indexOf('!');
        if (index != -1) {
            String before = input.substring(0, index).trim();
            String after = input.substring(index + 1).trim();
            System.out.println(before);
            System.out.println(after);
        } else {
            System.out.println("No exclamation mark found in the input.");
        }
    }
}