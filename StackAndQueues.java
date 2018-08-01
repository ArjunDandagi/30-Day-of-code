import java.util.*;
import java.io.*;
public class StackAndQueues
{
    static Stack <Character> stack = new Stack<>();
    static Queue <Character> q  = new LinkedList<Character>();

    public static void pushCharacter(char c)
    {
        stack.push(c);

    }
    public static void enqueueCharacter(char c )
    {

        q.add(c);
    }
    public static char popCharacter()
    {
        return stack.pop();
    }
    public static char dequeueCharacter()
    {
        return q.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        char []s= input.toCharArray();
        StackAndQueues stackAndQueues= new StackAndQueues();
        for(char c:s)
        {
            stackAndQueues.pushCharacter(c);
            stackAndQueues.enqueueCharacter(c);
        }
        boolean isPalindrome =  true;
        for(int i=0 ; i < s.length / 2 ;i++)
        {
           if(stackAndQueues.popCharacter() != stackAndQueues.dequeueCharacter())
           {
               isPalindrome = false;break;
           }
        }
        System.out.println("The word, "+input+", is "+
                ((!isPalindrome)? "not a palindrome.":"a palindrome."));




    }



}