package Q01;
import java.sql.SQLOutput;
import java.util.*;

public class Q01_3 {
    public static void main(String[] args) {

        Scanner s;
        s=new Scanner(System.in);

        System.out.print("Enter value for X:");
        int X;
        X=s.nextInt();

        System.out.print("Enter value for Y:");
        int Y;
        Y=s.nextInt();

        int M=X*Y;
        float C=(float)Math.cbrt(M);
        System.out.println(C);

    }
}
