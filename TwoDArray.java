import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 *  given a 6*6 array
 *
 * We define an hourglass in A to be a subset of values with indices falling in this pattern in A's graphical representation:
 *
 * a b c
 *   d
 * e f g
 *
 * print the max of the hourGlass in a given 2-d array
 */
public class TwoDArray {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int greatest_sum=-9999;
        int current_sum;

        for(int i=0;i< arr.length-2;i++)
        {
            for(int j=0;j<arr.length-2;j++)
            {
                current_sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]


                        +arr[i+1][j+1]+

                        arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];

                if(current_sum>=greatest_sum)
                {
                    greatest_sum=current_sum;
                }
            }
        }
        System.out.println(greatest_sum);






        scanner.close();
    }
}
