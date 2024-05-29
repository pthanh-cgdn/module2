package session16_io_text_file;

import java.io.*;

public class WriteData {
    public static void main(String[] args) {
        try {
            File fileScore = new File("src/session16_io_text_file/document/scores.txt");
            PrintWriter output = new PrintWriter(fileScore);
            output.print("John ");
            output.println(90);
            output.print("Eric ");
            output.println(95);
            output.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
