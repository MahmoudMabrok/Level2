package Section3;

import java.util.Scanner;

/**
 * Created by root on 7/31/17.
 */
public class SplitAndRegex {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in ) ;
        System.out.println("Enter text ");
        String in = sc.next() ;
        String[] tokens = in.split("[0-9]");
        for (String s : tokens)
        {
            System.out.println("s = " + s);

        }
    }
}
