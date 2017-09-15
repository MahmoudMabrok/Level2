package Section3;

/**
 * this is
 * Created by mo3tamed on 8/6/17.
 */
public class Factorial {
    public static void main(String[] args) {

        //System.out.println(fact(12));
        long d = fibonacci(0) ;
        System.out.println("d = " + d);


    }

    public static long fact (int n )
    {

        if (n <= 1 )
            return  1 ;

        return n * fact(n-1) ;
    }


    public static long fibonacci(int n )
    {
        if (n < 2 )
            return n ;
        else
            return fibonacci(n-1) + fibonacci(n-2) ;


    }
}
