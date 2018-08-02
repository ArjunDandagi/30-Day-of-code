import java.util.*;

interface AdvancedArithmetic
{
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic
{

    public int divisorSum(int n )
    {
        int divisor_sum=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                divisor_sum+=i;
        }
        return divisor_sum;
    }
}

public class Interfaces
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        AdvancedArithmetic mycal=new Calculator();
        int sum=mycal.divisorSum(n);
        System.out.println("I implemented:"+mycal.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}