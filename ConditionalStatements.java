import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*** Given an integer, , perform the following conditional actions:

 If n is odd, print Weird
 If n is even and in the inclusive range of 2 to 5 , print Not Weird
 If n is even and in the inclusive range of  6 to 20 , print Weird
 If n is even and greater than 20 , print Not Weird
 *
 * @author Arjun Dandagi
 * @version 1.0
 * @since 2018-07-17
 */
public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        /* if odd , print Weird*/
        if(N%2==1)
        {
            System.out.println("Weird");
        }
        /* otherwise it is a even number , for whole numbers :p */
        else
        {
            if(N>=2 && N<=5)
            {
                System.out.println("Not Weird");
            }
            if( N>=6 && N<=20)
            {
                System.out.println("Weird");
            }
            if(N>20)
            {
                System.out.println("Not Weird");
            }
        }

        scanner.close();
    }
}
