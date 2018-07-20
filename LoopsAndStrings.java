import java.io.*;
import java.util.*;
/**
*   Given a string, S , of length N that is indexed from 0 to N-1
*   print its even-indexed and odd-indexed characters as
* space-separated strings on a single line
* (see the Sample below for more detail).
*
* INPUT --------
* 2
* Hacker
* Rank
* OUTPUT ---------
* Hce akr
* Rn ak
*
* @Author Arjun Dandagi
 *  @Version v1.0
 *  @since 20-07-2018
*
 */
public class LoopsAndStrings {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int noOfTimes=scan.nextInt();

        while(noOfTimes-->0)
        {
            char []CharArray = scan.next().toCharArray();
            String evenString="";
            String oddString="";
            for(int i=0;i<CharArray.length;i++)
            {
                if(i%2==0)
                {
                    evenString+=CharArray[i];

                }
                else
                {
                    oddString+=CharArray[i];
                }
            }
            System.out.println(evenString+" "+oddString);
        }
    }
}