package OracleProject;

/**
 * this is
 * Created by mo3tamed on 8/8/17.
 */
public enum ItemType {

    Audio("AU"),
    Visual ("VU") ,
    AudioMobile("AM"),
    VisualMobile("VM");

    private String code ;
    private ItemType(String code)
    {
        this.code = code ;
    }
    String getCode()
    {
        return code ;
    }





}
