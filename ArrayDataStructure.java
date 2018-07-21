import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Problem -
 * Given an array, A , of N integers,
 * print A's elements in reverse order as a single line of space-separated numbers.
 *
 * @Author Arjun Dandagi
 * @version v1.0
 * @since 21-07-2018
 */
public class ArrayDataStructure {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = n-1; i >= 0; i--) {
            //int arrItem =
            System.out.print(Integer.parseInt(arrItems[i])+" ");
            //arr[i] = arrItem;
        }



        scanner.close();
    }
}
