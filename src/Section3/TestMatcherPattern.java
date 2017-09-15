package Section3;

import java.util.Scanner;
import  java.util.regex.Matcher ;
import  java.util.regex.Pattern ;

/**
 *
 *
 * matcher(onj).find  used to check if any substring matches with pattern
 * matcher(onj).group()  not used if and only if there was matching
 *
 * Created by root on 7/30/17.
 */
public class TestMatcherPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in ) ;
        System.out.println("Enter text ");
        String in = sc.next() ;

        Pattern p = Pattern.compile("([0-9]{3})(.)") ;
        Matcher m  = p.matcher(in) ;
        System.out.println(m.matches());
        System.out.println(m.group(2));





    }
}
