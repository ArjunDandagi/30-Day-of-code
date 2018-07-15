import java.util.*;


/*
<h1>The Datatypes programs implements an application
* that takes 3 inputs from the use an int , a double , a string
* and concatenates or add them and print the output in new line
*</h1>
*
* @author Arjun Dandagi
* @version 1.0
* @since 2018-07-15

 */
public  class Datatypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

         /* Declare second integer, double, and String variables. */

        int secondInt=scan.nextInt();
        double secondDouble = scan.nextDouble();
        scan.nextLine();
        String secondString=scan.nextLine();

        /* Read and save an integer, double, and String to your variables.*/
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+secondInt);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d+secondDouble);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s+secondString);



    }

}