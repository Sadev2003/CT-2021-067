package Q_06;

import javax.swing.*;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width :");
        int W = scanner.nextInt();

        System.out.println("Enter the height :");
        int H = scanner.nextInt();

        frame.setSize(W,H);
        frame.setTitle("Window");
        frame.setVisible(true);
    }
}