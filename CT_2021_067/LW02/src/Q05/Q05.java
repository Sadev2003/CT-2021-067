package Q05;
import java.util.*;
public class Q05 {
    public static void main(String[] args) {

        System.out.print("input temperature in fahrenheit:");
        Scanner S;
        S=new Scanner(System.in);
        double F;
        F=S.nextInt();
        double C=0.56*(F-32);
        System.out.println(C);
    }
}

