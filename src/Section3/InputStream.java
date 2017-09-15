package Section3;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 *  Created by root on 8/5/17.
 */
public class InputStream {
    public static void main(String[] args) {

      //  Path p = Paths.get("/home/motamed/Documents/2.txt") ;

        StringBuffer bu = new StringBuffer() ;
        int c ;
        try {
            c = System.in.read();
            while (c != '\n' || c == -1) {
                bu.append((char) c);
                c =System.in.read() ;
            }

        }catch (IOException e ) {
            System.out.println("");
        }
        System.out.println(bu.toString());

    }





    }

