package OracleProject;

import java.util.Date;

/**
 * this is
 * Created by mo3tamed on 8/10/17.
 */
public  abstract class Product implements  Item {

    private  static int curentProductionNumber = 0 ;
    String name ;
    String manufacturer;
    int serialNumber ;
    Date manufactureOn ;

    public Product (String name )
    {
        setName(name);
        curentProductionNumber ++ ;  // now add new product so increase count
        this.manufacturer = Item.manfacturer  ; // ??
        manufactureOn = new Date() ;
        setProductionNumber(curentProductionNumber);

    }

    public void setProductionNumber (int number)
    {
        this.serialNumber = number ;
    }
   public   void setName (String name )
    {
        this.name =name ;
    }
    public String  getName ()
    {
        return this.name  ;
    }
    public Date getManufactureDate()
    {
        return  manufactureOn ;
    }
    public int getSerialNumber()
    {
        return  serialNumber ;
    }
    public  String toString()
    {
        StringBuilder data = new StringBuilder("") ;
        data.append("Manufacturer  ::  " + manufacturer + '\n') ;
        data.append("Name          ::  " + name + '\n') ;
        data.append("SerialNumber  ::  " + serialNumber + '\n') ;
        data.append("DateOn        ::  " + manufactureOn + '\n') ;
        return  data.toString() ;
    }





}
