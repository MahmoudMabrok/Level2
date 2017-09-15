package Section2;

import java.util.Collections;
import java.util.HashSet;

/**
 *
 * HashSet a set that not concern order
 * no index
 * no repeat if there is just move repeated
 *
 * Created by root on 7/27/17.
 */
public class TestHashSet {
    public static void main(String[] args) {

        HashSet<Integer> h = new HashSet<>() ;
        h.add(45) ;
        h.add(45) ;
        System.out.println(h.size() );
        for (Integer i : h )
            System.out.println(i);

        HashSet<String> hh = new HashSet<>();
        hh.add("asAA");
        System.out.println(hh.contains("asAA"));



    }
}
