package Q_02;

import javax.swing.*;
import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String firstName = name.next();
        System.out.println("Enter the first name: ");
        String secondName = name.next();

        //System.out.println(firstName+" "+secondName);

        JFrame frame = new JFrame();
        frame.setSize(800,600);
        frame.setTitle(firstName+" "+secondName);
        frame.setVisible(true);
    }
}