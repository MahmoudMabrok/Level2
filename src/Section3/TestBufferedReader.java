package Section3;

import java.io.*;

/**
 * this is from 3.4
 *  most efficient  method  to work with  files and streams is BufferedReader with FileReader with File
 * Created by mo3tamed on 8/8/17.
 */
public class TestBufferedReader {

    public static void main(String[] args) {
        String line , fileContent ="" ;

            try {

                BufferedReader inputReader = new BufferedReader(new FileReader(new File("/home/motamed/Documents/2.txt")));
                line = inputReader.readLine();
                fileContent = line+'\n' ;

                while(line != null )
                {
                    line = inputReader.readLine() ;
                    if (line != null )
                        fileContent += line+'\n' ;
                }
                inputReader.close();

            }catch (EOFException  eof) // if you try to read beyond(after  reach )  end of file
            {
                System.out.println("End of file ");
            }catch (IOException  ioe)
            {

                System.out.println("Error Reading file");
            }


        System.out.println("fileContent");
        System.out.println(fileContent);
    }
}
