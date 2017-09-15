package Section2;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by root on 7/28/17.
 */
public class TestLinked {

    public static void main(String[] args) {


        LinkedList<String> l = new LinkedList<>();
        l.add("first");
        l.add("abbaA") ;

        l.add("aa") ;
        System.out.println(l.size());
        System.out.println(l.getLast());
        System.out.println(l.remove()); // retrieve first element then unlink (remove/ delete ) it
        System.out.println(l.size());
        System.out.println(l.getClass());
        Collections.sort(l);
        l.addFirst("FFirstAdded");
        System.out.println(l.getFirst());


    }
}
