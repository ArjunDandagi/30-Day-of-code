import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
<h1>The Operator programs implements an application
* that takes 3 inputs from the user..  a double meal_cost , an int tip_percent
* and int tax_percent
* and apply the formula -
* total_mealcost=meal_cost+ meal_cost*tip_percent/100 + meal_cost * tax_percent / 100
*</h1>
*
* @author Arjun Dandagi
* @version 1.0
* @since 2018-07-16

 */
public class Solution {

    // Complete the solve function below.

    /**
     * @param meal_cost the meal cost in double
     * @param tip_percent the tip percentage in int
     * @param tax_percent the tax percent in int
     * @return the total meal cost is returned
     */

    static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double tip= meal_cost *  tip_percent/100 ;

        double tax=meal_cost * tax_percent/100 ;
        double total = meal_cost + tip + tax ;
        int rounded_total = (int) Math.round(total);
        System.out.println("The total meal cost is "+rounded_total+" dollars.");

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}