package Section3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption ;

/**
 * Created by root on 8/5/17.
 *
 * exists return T(True ) if exist F if not or can not determine
 */
public class TestFile1 {
    public static void main(String[] args) {

        Path p = Paths.get("/home/motamed/New") ;

        Path p1 = Paths.get("2.txt") ;
        Path p2 = p.resolve(p1);

        boolean  state = Files.exists(p2) ;
        System.out.println(state);

        try
        {
            if (Files.notExists(p) )
                Files.createDirectories(p) ;
            if (Files.notExists(p2) ) {
                Files.createFile(p2);
                Path pNew = Paths.get("/home/motamed/New/") ;
                Files.copy(p2 ,pNew ) ;
            }
            //delete
            if (Files.exists(p2))
            {

                Files.deleteIfExists(p2);
                System.out.println(p2+"  deleted");
            }
        }catch (IOException e)
        {
            System.err.println(e.toString());

        }

        
    }
}
