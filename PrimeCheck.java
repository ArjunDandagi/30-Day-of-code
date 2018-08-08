import java.io.*;
import java.util.*;

public class PrimeCheck{

    public static boolean primeCheck(int n)
    {
        if(n==2){
            return true;
        }//second part is to check if the number is even (2 is already covered )
        else if(n==1 || (n&1)==0 )
        {
            return false;
        }
        else{
            for(int i=3;i<=Math.ceil(Math.sqrt(n));i+=2){

                if(n%i==0 )return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int test_cases=scan.nextInt();
        while(test_cases-->0)
        {
            if(primeCheck(scan.nextInt()))System.out.println("Prime");
            else System.out.println("Not prime");
        }

    }
}