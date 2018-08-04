import java.util.*;

class Printer <T> {

    public void printArray(T []arr)
    {
        for(T el: arr)
        {
            System.out.println(el);
        }
    }

}

public class Generics{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for(int i=0;i<n;i++)
        {
            intArray[i]=scanner.nextInt();

        }
        n = scanner.nextInt();
        String []stringArray = new String[n];
        for (int i = 0; i <n ; i++) {
            StringArray[i]=scanner.nextInt();
        }

        Printer <Integer> integerPrinter = new Printer<Integer>();
        Printer <String> stringPrinter = new Printer<String>();
        integerPrinter.printArray(intArray);
        stringPrinter.printArray(stringArray);
        if(Printer.class.getDeclaredMethods().length>1){
            System.out.println("The printer class should only have 1 method named printArray.");
        }
    }
}