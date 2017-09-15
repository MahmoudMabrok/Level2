package Section2;

/**
 * Created by root on 7/26/17.
 * Oracle Academy
 * Practice 2.3
 * problem 4
 */
public class Map <K,V> {


    private  K key ;
    private  V  value ;


    public static void main(String[] args) {
        Map <String , Integer> m = new Map<>("Capri " , 1995) ;
        System.out.println(m.toString());
    }

    public Map ( K k , V v )
    {
        key= k ;
        value = v ;
    }

    public String toString()
    {

    return key + "  " + value ;

    }

}
