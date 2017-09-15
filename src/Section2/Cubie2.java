package Section2;

/**
 * Generic class
 * Created by root on 7/26/17.
 */
public class  Cubie2 <T1>{

    private T1 length ;
    private T1 width ;
    private T1 height ;

    public static void main(String[] args) {
        Cubie2 <Integer> c = new Cubie2<>() ;
        c.setHeight(5);
        c.setLength(6);
        c.setWidth(6);
        c.ToString();




    }


    public  void setLength ( T1 l  )
    {
        length = l;

    }
    public void setHeight ( T1 height  )
    {
        this.height = height;

    }
    public void setWidth  ( T1 w )
    {
        width = w;

    }
    public void ToString()
    {

        System.out.println("length  "+length + " width "+width +" height "+ height + "");
    }
}











