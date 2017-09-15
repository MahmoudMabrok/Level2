package Section2;
import java.util.HashMap ;
/**
 * Created by root on 7/28/17.
 */
public class TestHashMap {

    public static void main(String[] args) {


        HashMap < String, Integer  > num = new HashMap<>() ;
        System.out.println(num.size());
        num.put( "1",1 );
        num.put( "2",200 );
        num.put( "3",3 );
        System.out.println(num.get("2"));
        System.out.println(num.keySet());
        System.out.println(num.values());



    }
}
