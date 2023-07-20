package io.codelex.exceptions.practice;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercise3 {
    public static void cat(File file){
        RandomAccessFile input = null;
        String line;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }}
        catch (IOException e) {
                System.out.println("Error reading the file: " + e.getMessage());
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    System.out.println("Error closing the file: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        File f = new File("C:\\Users\\kavec\\Documents\\java\\homeworks\\src\\main\\java\\io\\codelex\\exceptions\\practice\\README.md");
        cat(f);
    }
}
