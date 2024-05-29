package session16_io_text_file;

import java.io.*;

public class ReadATextFile {
    public static void main(String[] args) {
        try {
            File file = new File("src/session16_io_text_file/document/hello.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
