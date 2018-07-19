import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Given an integer n , print its first 10 multiples.
 * Each multiple n X i (where 1<= i <=10)
 * shoule be printed on a new line in the form: n x i = result
 *
 * @Author Arjun Dandagi
 * @version v1.0
 * @since 19-07-2018
 *
 *
 */
public class Loops {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int i=1;i<=10;i++)
        {
            System.out.println(n+ " x "+i+" = "+n*i);
        }

        scanner.close();
    }
}
