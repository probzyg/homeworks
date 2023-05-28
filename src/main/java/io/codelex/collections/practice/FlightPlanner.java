package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        Files.readAllLines(path, charset);
        List<String> routesList = new ArrayList<>(Files.readAllLines(path, charset));
        Map<String, List<String>> routeHashMap = new HashMap<>();
        List<String> cities = new ArrayList<>(); 

        for (String route : routesList) {
            String[] parts = route.split("->");

            //set all cities
            for (String el : parts) {
                if (!cities.contains(el.trim())) {
                    cities.add(el.trim());
                }
            }

            String startCity = parts[0].trim();
            String endCity = parts[1].trim();

            if (!routeHashMap.containsKey(startCity)) {
                routeHashMap.put(startCity, new ArrayList<>());
            }
            routeHashMap.get(startCity).add(endCity);

        }
        //output all cities
        System.out.println("All cities:");
        for (String el : cities) {
            System.out.println(el);
        }
        System.out.println();
        //all destinations
        for (Map.Entry<String, List<String>> start : routeHashMap.entrySet()) {
            String location = start.getKey();
            List<String> destinations = start.getValue();

            System.out.println("Start: " + location);
            System.out.println("Ends: " + destinations.toString().replaceAll("\\[|\\]", ""));
            System.out.println();
        }
    }

}
