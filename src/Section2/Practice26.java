package Section2;


import java.util.ArrayList;
import java.util.Collections;

/**
 * Practice 2.6
 * Sorting & Searching
 * array of strings -- student
 * then sort
 * then search
 * Created by root on 7/27/17.
 */
public class Practice26 {
    public static void main(String[] args) {

        String [] st = { "Mahmoud","Ahmed", "Mohamed" , "Islam" };
        ArrayList<String> a = new ArrayList<>();
        a.add("Mahmoud") ;
        a.add("Ahmed") ;
        Collections.sort(a);
        System.out.println(Collections.binarySearch( a , "Mahmoud") );




/*
        for (String s : a)
            System.out.println(s);*/
    }
}
