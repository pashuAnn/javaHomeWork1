import javax.xml.transform.Result;
import java.util.concurrent.SynchronousQueue;

public class Main {


    public static void main(String[] args) {
        // задача 2
        byte b = 1;
        short s = 2000;
        int i = 1000000000;
        long l = 10000000000l;
        float f = 12.345f;
        double d = 25.64775;
        char c = 's';
        boolean bool = true;
        System.out.println("----------------------------------------------------------------------------------------" +
                "-------------------------");
        System.out.printf("%10s | %10s | %10s | %11s | %12s | %19s | %9s | %13s|\n","byte", "short", "int",
                "long", "float", "double", "char", "boolean");
        System.out.println("-------------------------------------------------------------------------------------------" +
                "-------------------------------");
        System.out.printf("%10d | %10d | %10d | %10d | %8a | %10a | %10c | %15b|\n", b, s, i, l, f, d, c, bool );

// задача 3
        int x = 321;

        System.out.println("Первая цифра: " + x/100);
        System.out.println("Первая цифра: " + x/10%10);
        System.out.println("Первая цифра: " + x%10);
















    }
}