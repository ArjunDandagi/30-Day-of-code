import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 *  Given a decimal integer convert to Binary representation
 *  and use the same rep and print the longest
 *  consecutive ones in the representation
 *
 *
 *  @Author arjun dandagi
 *  @version V1.0
 *  @Since 24-07-2018
 *
 *
 */


public class DecimalToBinary {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        StringBuffer accumlate_quotient= new StringBuffer();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String binary_rep="";
        int rem=n;
        while(n>1)
        {

            rem=n%2;
            n=n/2;

            accumlate_quotient.append(Integer.toString(rem));

        }
        accumlate_quotient.append(Integer.toString(n));
        //System.out.println(accumlate_quotient.reverse());
        String binary_string=accumlate_quotient.reverse().toString();
        int current_longest_consecutive_ones=0;
        int longest_consecutive_ones=0;
        for(int i=0;i<accumlate_quotient.length();i++)
        {
            if(binary_string.charAt(i)=='0')
            {
                if(current_longest_consecutive_ones > longest_consecutive_ones )
                {
                    longest_consecutive_ones = current_longest_consecutive_ones;

                }
                current_longest_consecutive_ones=0;
                continue;
            }

            current_longest_consecutive_ones+=1;

        }

        // System.out.println(current_longest_consecutive_ones);
        //System.out.println(longest_consecutive_ones);

        if(current_longest_consecutive_ones > longest_consecutive_ones)
        {
            longest_consecutive_ones = current_longest_consecutive_ones;
        }
        System.out.println(longest_consecutive_ones);

        scanner.close();
    }
}
