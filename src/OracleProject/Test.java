package OracleProject;

/**
 *
 *
 * 10/8/2017 finish audio Player and test it
 * Created by mo3tamed on 8/8/17.
 */
public class Test {

    public static void main(String[] args) {

      /*  ItemType e = ItemType.Audio ;
        e = ItemType.AudioMObule ;
        ItemType r = ItemType.VisualMobile ;

        System.out.println(e.name());
        System.out.println(e.getCode());
*/


      //////////////////////////////////////////

    AudioPlayer  a1 = new AudioPlayer("mo3tamedRadio0x22 " , "6587 bit frame ");
        System.out.println(a1.toString());
        a1.play();
        a1.next();
        a1.stop();
        System.out.println(a1.getClass());

    AudioPlayer a2 = new AudioPlayer( "mo3FF31", "547 bit frame "  ) ;
        System.out.println(a2.toString());

        AudioPlayer a3 = new AudioPlayer( "mo3ee31", "217 bit frame "  ) ;
        System.out.println(a3.toString());


    }
}
