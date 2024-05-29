package session16_io_text_file;

import java.io.FileWriter;
import java.io.IOException;

public class WriteATextFile {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("src/session16_io_text_file/document/Hello.txt");
            writer.write("Hello World");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
