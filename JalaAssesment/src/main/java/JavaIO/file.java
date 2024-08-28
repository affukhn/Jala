package JavaIO;

import java.io.*;
import java.nio.Buffer;

public class ReadTextFile {
    public void textFIleReadInputStream() throws IOException {
        String FileName="C:\\Users\\user\\Desktop\\JalaStram.txt";
        FileInputStream fs=new FileInputStream(FileName);
       char c =(char) fs.read();
       while((c>='A'&& c<='Z') || (c>='a' && c<='z') || c==' ')
       {
           System.out.print(c);
           c =(char) fs.read();
       }
    }

    public void textFileReader() throws IOException {
        String FileName="C:\\Users\\user\\Desktop\\JalaStram.txt";
        FileReader fs=new FileReader(FileName);
        char c =(char) fs.read();
        while((c>='A'&& c<='Z') || (c>='a' && c<='z') || c==' ')
        {
            System.out.print(c);
            c =(char) fs.read();
        }
    }

    public void textFIleReadOutStream() throws IOException {
        String FileName="C:\\Users\\user\\Desktop\\JalaStram.txt";
        FileOutputStream fs=new FileOutputStream(FileName);
        String content="Stream Data for the information";
        fs.write(content.getBytes());
        fs.close();
    }

    public void textFileReadBuffer() throws IOException {
         File f=new File("C:\\Users\\user\\Desktop\\carrer.txt");
        BufferedReader r= new BufferedReader(new FileReader(f));

        String st=r.readLine();
        while(st != null)
        {
            System.out.println(st);
            st=r.readLine();


        }
        r.close();
    }
    public void textFileWriteBuffer() throws IOException {
        File f=new File("C:\\Users\\user\\Desktop\\Jala.txt");
        BufferedWriter writer= new BufferedWriter(new FileWriter(f));

       String Word="New work should be done";
       writer.write(Word);
       writer.close();
       System.out.println("successfull the record has been saved");

    }
}
