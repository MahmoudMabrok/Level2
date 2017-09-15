package Section3;

import java.util.Scanner;
import  java.util.regex.*;

/**
 *
 * problem to replace spaces ?????!!!
 *
 * Created by root on 7/31/17.
 */
public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in ) ;
        System.out.println("Enter text ");
        String in = sc.next() ;

        //Perform replace operation
       // in = in.replaceAll(" {2,}" , " ") ; // remove spaces more than one

        System.out.println(in);

        Pattern p = Pattern.compile("a{2,}") ;
        Matcher m = p .matcher(in)  ;
        System.out.println(m.replaceAll("mo3tamed")) ;





    }
}
