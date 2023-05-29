package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws URISyntaxException, IOException {
        final String scores = fileContent();
        List<String> listOfScores = new ArrayList<>(List.of(scores.split(" ")));
        int[] scoreRanges = getRanges(listOfScores);
        printHistogram(scoreRanges);
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }

    private static int[] getRanges(List<String> scores) {
        int[] scoreRanges = new int[11];

        for (String el : scores) {
            int value = Integer.parseInt(el);
            int indexOfRange = value / 10;
            scoreRanges[indexOfRange]++;
        }

        return scoreRanges;
    }

    private static void printHistogram(int[] scoreRanges) {
        for (int i = 0; i < scoreRanges.length; i++) {
            int rangeStart = i*10;
            int rangeEnd = i*10+9;

            StringBuilder bar = new StringBuilder();
            bar.append("*".repeat(Math.max(0, scoreRanges[i])));
            if (i < 10) {
                System.out.println(rangeStart + "-" + rangeEnd + ": " + bar);
            }
            else {
                System.out.println(rangeStart + ": " + bar);
            }
        }
    }
}
