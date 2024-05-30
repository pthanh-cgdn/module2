package session17_io_binary_file;

import java.io.*;

public class CopiedFile {
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try{
            in = new FileInputStream(source);
            out = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
        } finally {
            in.close();
            out.close();
        }
    }
    public static void main(String[] args) {

        String sourcePath = "src/session17_io_binary_file/data/scores.txt";
        String destPath = "src/session17_io_binary_file/data/copy.txt";

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            copyFileUsingStream(sourceFile, destFile);
            System.out.printf("Copy completed");
        } catch (IOException ioe) {
            System.out.printf("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }
    }
}
