package Section3;

import java.util.Scanner;

/**
 * Created by root on 7/30/17.
 */
public class TestRhyming {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in ) ;
        System.out.println("ENter animal to test it ");
        String anaimal = sc.next() ;

        if (isRhyming(anaimal))
        {
            System.out.println("is ryhming  with dog ");

        }else
        {
            System.out.println("not  ryhming  with dog ");
        }

    }

    /**
     * check if input is rhyming (same expect first character)
     *
     * @param in    input
     * @return  ture if it is otherwise false
     */
    public static boolean isRhyming (String in )
    {
        return in.matches(".og") ;
    }
}
