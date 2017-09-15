package Section3;

/**
 * Practice 3.1
 * String % stringBuilder
 *
 * Task 1
 * implement a function to reverse s string
 * Created by root on 7/30/17.
 */
public class Practice31 {


    public static void main(String[] args) {

        backward("d s a ");
    }


    /**
     * used to revrse a string input
     * @param or  string input
     */

    public static void backward (String or  )
    {
        String  back = "" ;
        for (int i = or.length() -1 ; i >= 0   ; i--) {
            back +=  or.charAt(i) ;
        }
        System.out.println(back);



    }}
