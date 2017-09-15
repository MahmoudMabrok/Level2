package Section3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * this is
 * Created by mo3tamed on 8/5/17.
 *
 */
public class TestFile2 {


    public static void main(String[] args) {


        Path p = Paths.get("/home") ;
        Path p1 = Paths.get("data1") ;
        Path p2 = Paths.get("backup2") ;
        Path p3 = Paths.get("w3.txt") ;

        Path woD = p.resolve(p1) ;
        Path woF = woD.resolve(p3) ;
        Path baD = p.resolve(p2) ;
        Path baF = baD.resolve(p3) ;


       /* System.out.println(woF);
        System.out.println(baF);*/




        try
        {
            if (Files.exists(woF) )
            {
                if(Files.notExists(baD))
                    Files.createDirectories(baD) ;

                Files.copy(woF , baF , StandardCopyOption.REPLACE_EXISTING , StandardCopyOption.COPY_ATTRIBUTES) ;
            }

            else
            {
                //create working file
                //first test id directory exist
                if (Files.notExists(woD))
                    Files.createDirectories(woD);
                //now create file
                Files.createFile(woF) ;
                //copy to backup

                if(Files.notExists(baD))
                    Files.createDirectories(baD) ;

                Files.copy(woF , baF , StandardCopyOption.REPLACE_EXISTING , StandardCopyOption.COPY_ATTRIBUTES) ;


            }

        }catch (IOException e)
        {
            System.out.println(e.toString());
        }


        try {
            if (Files.exists(baF))
                Files.deleteIfExists(baF) ;
            Files.deleteIfExists(baD) ;
            if (Files.exists(woF))
                Files.deleteIfExists(woF);
            Files.deleteIfExists(woD);
        }catch (IOException i )
        {
            System.out.println("i.toString() = " + i.toString());
        }



    }
}
