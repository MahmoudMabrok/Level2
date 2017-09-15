package OracleProject;

/**
 * this is
 * Created by mo3tamed on 8/10/17.
 */
public class Screen  implements  ScreenSpec {
    String resolution ;
    int refreshRate ;
    int responseTime ;


    @Override
    public String getResolution() {
        return resolution;
    }

    @Override
    public int getRefreshRate() {
        return refreshRate;
    }

    @Override
    public int getResponseTime() {
        return responseTime;
    }
    public  String toString()
    {
       StringBuilder data = new StringBuilder("") ;
        data.append("Resolution    ::  " + resolution + '\n') ;
        data.append("RefreshRate   ::  " + refreshRate + '\n') ;
        data.append("ResponseTime  ::  " + responseTime + '\n') ;

        return data.toString() ;
    }

}
