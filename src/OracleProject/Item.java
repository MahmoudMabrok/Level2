package OracleProject;

import java.util.Date;

/**
 * Created by root on 7/31/17.
 *
 */
public interface Item {

    public final  String manfacturer = "OracleProduction "  ;
    void setProductionNumber (int num ) ;
    void setName (String name ) ;
    String getName() ;
    Date getManufactureDate();
    int getSerialNumber ();

}
