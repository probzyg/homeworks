package io.codelex.javaAdvancedTest.exercise4;

import java.io.*;

public class Exercise4 {
    public static void main(String[] args) throws IOException {
        String file = "/C:/Users/kavec/Documents/java/homeworks/src/main/resources/collections/lear.txt"; //
        StringBuilder content = new StringBuilder();
        String reversed;

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }

        reversed = content.reverse().toString();

        File original = new File(file);
        String originalName = original.getName();

        StringBuilder reversedName = new StringBuilder();
        for (int i = originalName.length() - 1; i >= 0; i--) {
            reversedName.append(originalName.charAt(i));
        }
        String reversedFileName = reversedName.toString();
        String reversedFilePath = original.getParent() + File.separator + reversedFileName;


        BufferedWriter writer = new BufferedWriter(new FileWriter(reversedFilePath));
        writer.write(reversed);

        writer.close();
    }
}
