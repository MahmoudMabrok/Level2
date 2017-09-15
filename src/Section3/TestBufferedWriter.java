package Section3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;

/**
 * this is
 * Created by mo3tamed on 8/8/17.
 */
public class TestBufferedWriter {

    public static void main(String[] args) {
        writeFile("My Name is Mao3tamed  ");

    }

    /**
     * function to write file
     * BufferedWriter acquire Path , Charset (encoding ) , StandardOpenOption (create , append)
     *
     * obg.write ( content , start , end )
     * @param content what to write
     *
     */
    public static void writeFile ( String content)
    {
        Path p = Paths.get("/media/motamed/course/MYLINUXLIVE/Level2/New folder/writer.txt") ;
        try
        {
          //  BufferedWriter b = new BufferedWriter(p ,Charset.forName("UTF-8") , StandardOpenOption.CREATE) ;  ???
            BufferedWriter bw = Files.newBufferedWriter(p
                    , Charset.forName("UTF-8")
                    , StandardOpenOption.CREATE
                    ,StandardOpenOption.APPEND  );
            bw.write( content,0,content.length() );
            bw.close();                                   //if u not close it -- will not write content to the file

        }catch (IOException e)
        {
            System.out.println("error with writing file ");
        }

    }
}
