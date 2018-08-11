import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NestedLogic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);

        int actual_day=scan.nextInt();
        int actual_month=scan.nextInt();
        int actual_year = scan.nextInt();
        int expected_day=scan.nextInt();
        int expected_month=scan.nextInt();
        int expected_year=scan.nextInt();
        int fine;


        if(actual_day+actual_month+actual_year==(expected_day+expected_month+expected_year))
        {
            fine=0;
        }
        else
        {
            if(actual_year>expected_year)
            {
                fine=10000;
            }
            else if(actual_year<expected_year || actual_month < expected_month)
            {
                fine=0;
            }

            else if(actual_month>expected_month)
            {
                fine=500*(actual_month-expected_month);
            }
            else{
                fine=15*(actual_day-expected_day);
            }
        }
        System.out.println(fine);


    }
}