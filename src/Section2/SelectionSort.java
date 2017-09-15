package Section2;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by root on 7/27/17.
 */
public class SelectionSort {

    public static void sortSelection (int [] list)
    {
        int minIndex   ;

        for (int i = 0; i < list.length  ; i++) {
            minIndex = i ;
            for (int j = i+1; j <list.length ; j++) {
                if (list[minIndex] >= list[j])
                {

                    minIndex = j ;
                }
            }

            //now swap with i element

            int temp = list[i] ;
            list[i] = list[minIndex] ;
            list[minIndex] = temp ;

           /* list[i] += list[minIndex] ;
            list[minIndex] = list[i] - list[minIndex] ;
            list[i] = list[i] - list[minIndex] ;*/
        }




    }

    public static void main(String[] args) {
        int[] list ={10 , 2 ,5 ,1 ,7} ;
        sortSelection(list);
        for (int e: list)
              {
                  System.out.println(e);

        }

    }
}
