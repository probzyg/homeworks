package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        int lines = 0;
        int words = 0;
        int chars = 0;

        for (String line : Files.readAllLines(path, charset)) {
            lines++;
            chars += line.length();

            String[] wordsArray = line.split(" ");

            for (String word : wordsArray) {
                if (isWord(word)) {
                    words++;
                }
            }
        }

        System.out.println("Lines = " + lines);
        System.out.println("Words = " + words);
        System.out.println("Chars = " + chars);
    }

    private static boolean isWord(String word) {
        for (char el : word.toCharArray()) {
            if (Character.isLetterOrDigit(el)) {
                return true;
            }
        }
        return false;
    }
}
