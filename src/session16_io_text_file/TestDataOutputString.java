package session16_io_text_file;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataOutputString {
    public static void main(String[] args) {
        int[] arr = {3,5,7,8,9};
        try{
            FileOutputStream fout = new FileOutputStream("src/session16_io_text_file/document/out.txt");
            DataOutputStream dout = new DataOutputStream(fout);
            for (int j : arr) {
                dout.writeInt(j);
            }
            dout.close();
        } catch(IOException e){
            e.printStackTrace();
        }

    }
}
