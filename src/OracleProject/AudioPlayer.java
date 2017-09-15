package OracleProject;

/**
 * this is
 * Created by mo3tamed on 8/10/17.
 */
public class AudioPlayer extends Product implements  MultimediaControl  {
    ItemType mediaType ;
    String audioSpecification ;

    public AudioPlayer(String name ,String audioSpecification  )
    {
        super(name);
        this.audioSpecification = audioSpecification ;
        mediaType = ItemType.Audio ;

    }


    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void next() {
        System.out.println("Go th next .... ");
    }

    @Override
    public void previous() {
        System.out.println("GO to the previous ");
    }

    @Override
    public void stop() {
        System.out.println("Stopped");
    }

    @Override
    public String toString()
    {
        //get data then add new rows of AudioPlayer
        StringBuilder data =new StringBuilder(super.toString())  ;
        data.append("Audio Spec.   ::   " + audioSpecification + '\n') ;
        data.append("Type          ::   " + mediaType.name()  + '\n' ) ;
        return  data.toString() ;
    }


}
