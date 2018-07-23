import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Given an integer N . with condition 2<= N <=12
 * write a recursive method which gives back the factorilal
 * of the given number
 *
 * @Author arjun dandagi
 * @version v1.0
 * @Since 23-07-2018
 *
 *
 *
 *
 */
public class Recursion {

    // Complete the factorial function below.
    static int factorial(int n) {
        if (n<2)
        {
            return 1;
        }
        else
        {
            return factorial(n-1)*n;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
