import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RegexAndPattern {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int i=0;
        List <String> nameList = new ArrayList<String>();
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            Pattern p= Pattern.compile("@gmail.com");
            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            Matcher m = p.matcher(emailID);
            if(m.find())
            {
                nameList.add(firstName);
            }
        }
        //System.out.println(Arrays.toString(names));
        //Arrays.sort(names);
        Object [] names= nameList.toArray();
        Arrays.sort(names);
        for(Object el:names)
        {
            System.out.println(el);
        }

        scanner.close();
    }
}