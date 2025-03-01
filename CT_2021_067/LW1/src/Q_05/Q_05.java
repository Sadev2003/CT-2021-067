package Q_05;

import javax.swing.*;
import java.util.Scanner;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q_05 {
    public static void main(String[] args) {

        Date day = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        System.out.println(sdf.format(day));
    }
}
