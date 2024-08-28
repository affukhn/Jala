package JavaIO;

import java.io.IOException;

public class MangeFile {
    public MangeFile() throws IOException {
        file r= new file();
//        1.write a program to read text from .txt file using Inputstream.
        r.textFIleReadInputStream();
//        2. write a program to write text to .txt file OutputStream.
        r.textFIleReadOutStream();
//        3.Read text  from a .txt file using BufferedInputStream.
        r.textFileReadBuffer();
//        4. wtite a program  to read  text from .txt file using  BufferedOutputStream.
        r.textFileWriteBuffer();
//       5.  Write a program to write  text to .txt file using FileReader
        r.textFileReader();
//        6. Write a program to write text to .txt file using FileWriter.
        r.textfileWriter();
//        r.
        r.textBufferedInputStream();
        r.textBufferedOutputStream();
    }
}
