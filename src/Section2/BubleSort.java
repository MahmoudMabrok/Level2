package Section2;

/**
 *
 *
 * Created by root on 7/27/17.
 */


public class BubleSort {


    public static void sort (int  [] list )
    {
        System.out.println("Before");
        for (int i = 0; i <list.length-1  ; i++) { // n compare must be size -1
            for (int j = 0; j <list.length -i-1; j++) { // -i-1 int first iteration  to end with (last -1 ) element and so on
                if (list[j] > list[j+1])
                {

                    int temp = list[j] ;
                    list[j] = list[j+1] ;
                    list[j+1] = temp ;

                }
            }
            System.out.println("after " + (i+1) + " sort" );
            show(list);
        }

    }

    public static void main(String[] args) {

        int[] list ={10 , 2 ,5 ,1 ,7 , 12 , 0 , 5 , 3 , 4 ,9} ;
        sort(list);


    }


    public static void show (int [] list){

        for (int e : list)
            System.out.print(e + " ");

        System.out.println("");
    }

}
