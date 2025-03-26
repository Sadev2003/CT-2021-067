package Q06;
import java.util.*;
public class Q06 {
    public static void main(String[] args) {

        System.out.print("Input the year you were born:");
        Scanner S=new Scanner(System.in);
        int year=S.nextInt();
        Calendar C;
        C=Calendar.getInstance();
        int CY=C.get(Calendar.YEAR);
        int age =CY - year;
        System.out.println("You were born in " + year + " and you will be " + age+" this year.");
    }
}
