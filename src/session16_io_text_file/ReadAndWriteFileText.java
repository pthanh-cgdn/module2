package session16_io_text_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileText {
    public void sumFile(String fileName) {
        try {
            File file = new File(fileName);
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line = "";
                int sum = 0;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                    sum += Integer.parseInt(line);
                }
                br.close();
                System.out.println("Total: " + sum);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }

        } catch (Exception e) {
            System.err.println("File is not found or contend is invalid");
        }
    }
    public List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return numbers;
    }
    public void writeFile(String fileName, int max) {
        try{
            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("\nMax value is: "+max);
            bw.close();
        } catch (Exception e){
            System.err.println("File is not found or contend is invalid");
        }
    }
    public int findMax(List<Integer> numbers) {
                int max = numbers.get(0);
                for(int i = 1; i < numbers.size(); i++){
                    if(numbers.get(i) > max){
                        max = numbers.get(i);
                    }
                }
                return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFileText readFile = new ReadAndWriteFileText();
        readFile.sumFile("src/session16_io_text_file/document/number.txt");
        readFile.writeFile("src/session16_io_text_file/document/number.txt",readFile.findMax(readFile.readFile("src/session16_io_text_file/document/number.txt")));
    }
}
