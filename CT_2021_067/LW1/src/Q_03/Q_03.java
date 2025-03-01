package Q_03;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String firstName = name.next();
        System.out.println("Enter the middle name: ");
        String middleName = name.next();
        System.out.println("Enter the Last name: ");
        String lastName = name.next();

        String initial = middleName.substring(0,1);

        System.out.println(firstName+"."+initial+"."+lastName);


    }
}