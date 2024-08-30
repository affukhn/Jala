package JavaIO;

import java.io.*;
import java.util.Scanner;

public class file {
    public void textFIleReadInputStream() throws IOException {
        String FileName = "C:\\Users\\user\\Desktop\\JalaStram.txt";
        FileInputStream fs = new FileInputStream(FileName);
        char c = (char) fs.read();
        while ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || c == ' ') {
            System.out.print(c);
            c = (char) fs.read();
        }
    }

    public void textfileWriter() throws IOException {
        String FileName = "C:\\Users\\user\\Desktop\\JalaStream.txt";
        FileWriter fs = new FileWriter(FileName);
        String s = "New Time To work with file,let create using file Reader";
        fs.write(s);
        fs.close();

    }

    public void textFileReader() throws IOException {
        String FileName = "C:\\Users\\user\\Desktop\\JalaStram.txt";
        FileReader fs = new FileReader(FileName);
        char c = (char) fs.read();
        while ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || c == ' ') {
            System.out.print(c);
            c = (char) fs.read();
        }
    }

    public void textFIleReadOutStream() throws IOException {
        String FileName = "C:\\Users\\user\\Desktop\\JalaStram.txt";
        FileOutputStream fs = new FileOutputStream(FileName);
        String content = "Stream Data for the information";
        fs.write(content.getBytes());
        fs.close();
    }

    public void textFileReadBuffer() throws IOException {
        File f = new File("C:\\Users\\user\\Desktop\\carrer.txt");
        BufferedReader r = new BufferedReader(new FileReader(f));

        String st = r.readLine();
        while (st != null) {
            System.out.println(st);
            st = r.readLine();


        }
        r.close();
    }

    public void textFileWriteBuffer() throws IOException {
        File f = new File("C:\\Users\\user\\Desktop\\Jala.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(f));

        String Word = "New work should be done";
        writer.write(Word);
        writer.close();
        System.out.println("successfull the record has been saved");

    }

    public void textBufferedInputStream() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n enter the String");
        String c = reader.readLine(); // Read a single character (returns -1 at EOF)

        if (c != null) { // Ensure there's input

            System.out.println(c);
        } else {
            System.out.println("No input available.");
        }
    }

    public void textBufferedOutputStream() {
        String filePath = "C:\\Users\\user\\Desktop\\JalaStreamWork.txt"; // Path to the file
        String text = "Hello, world!";   // Text to write to the file

        try (FileOutputStream fos = new FileOutputStream(filePath);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bw = new BufferedWriter(osw)) {

            bw.write(text);  // Write the text to the fileF
            System.out.println("Text written to file successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}