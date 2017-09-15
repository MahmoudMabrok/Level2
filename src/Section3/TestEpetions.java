package Section3;

import java.util.Scanner;


/**
 *
 * Test Repetition  operaTOR
 * Created by root on 7/30/17.
 */
public class TestEpetions {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in ) ;
        System.out.println("Enter text ");
        String in = sc.next() ;
        System.out.println(in.matches("[Aa]{2,3}b"));
        System.out.println(in.matches("a?b?a"));
        System.out.println(in.matches("a*b"));



    }
}
