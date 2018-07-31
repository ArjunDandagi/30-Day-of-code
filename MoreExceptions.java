import java.util.*;
import java.lang.Math;

class Calculator
{
    public int power(int n , int p ) throws Exception
    {
        if(n<0||p<0)
            throw new IllegalArgumentException("n and p should be non-negative");
        return (int)Math.pow(n,p);
    }

}

public class MoreExceptions{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int p=scan.nextInt();
        Calculator calculator= new Calculator();
        scan.close();
        try {
            System.out.println(calculator.power(n, p));

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}