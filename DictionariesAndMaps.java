//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

/**
 * create a dictionary which will hold name and phone number
 * when asked for a number given a name , print name=phone
 * else print Not found
 *
 * @Author arjun dandagi
 * @version v1.0
 * @since 23-07-2018
 *
 *
 *
 *
 *
 */

class DictionariesAndMaps{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map <String,Integer>  phoneBook = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phoneBook.containsKey(s))
            {
                System.out.println(s+"="+phoneBook.get(s));
            }
            else
            {
                System.out.println("Not found");
            }

        }
        in.close();
    }
}