package Section2;

/**
 * Created by root on 7/27/17.
 *
 *
 * work with sorted list
 * divide & conquer
 * low , middle  (calculated), high
 * if target high middle --- so must it become right so move low to m +1
 * else must become left so move high to m-1
 *
 * while (l <= h )
 * break if reach index target
 * return -1 or index
 *
 * reminder case :: if repeated which  one return
 */
public class BInarySesrch

{

    public static void main(String[] args) {
        int[] list ={1,5, 5, 8,9,11 ,11,11,11} ;
        System.out.println(BinarySesrch(list , 11));
    }

    public static  int BinarySesrch(int [] list , int t )
    {
        int index = -1  , l = 0 ,  h = list.length -1  , m  ;
        while(l <= h)
        {
            m = (h+l) / 2;
//            System.out.println(m);

            if (list[m] < t)
            {
                l = m +1 ;

            }
            else if (list[m] > t)
            {
                h = m-1 ;

            }
            else
            {
                index    = m ;
                break ;
            }


        }
        return  index ;

    }
}
