package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner input = new Scanner(System.in);
        System.out.print("What would you like to do:\nTo display list of the cities press 1\nTo exit program press #\n> ");
        String choice = input.nextLine();
        while (true) {
            if (choice.equals("1")) {
                printAllCities();
                System.out.print("To select a city from which you would like to start press 1\n> ");
                choice = input.nextLine();
                if (choice.equals("1")) {
                    routePlanner();
                    break;
                }
            } else if (choice.equals("#")) {
                System.out.println("Goodbye, have a nice day!");
                break;
            } else {
                System.out.println("Invalid input, you can only enter '1' to continue or '#' to quit!");
                break;
            }
        }
    }

    public static Map<String, List<String>> parseRoutes() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> routesList = new ArrayList<>(Files.readAllLines(path, charset));
        Map<String, List<String>> routeHashMap = new HashMap<>();

        for (String route : routesList) {
            String[] parts = route.split("->");
            String startCity = parts[0].trim();
            String endCity = parts[1].trim();
            if (!routeHashMap.containsKey(startCity)) {
                routeHashMap.put(startCity, new ArrayList<>());
            }
            routeHashMap.get(startCity).add(endCity);

        }
        return routeHashMap;
    }

    public static List<String> parseCities() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        Files.readAllLines(path, charset);
        List<String> routesList = new ArrayList<>(Files.readAllLines(path, charset));
        List<String> cities = new ArrayList<>();

        for (String route : routesList) {
            String[] parts = route.split("->");

            for (String el : parts) {
                if (!cities.contains(el.trim())) {
                    cities.add(el.trim());
                }
            }
        }
        return cities;
    }

    public static void printAllCities() throws URISyntaxException, IOException {
        List<String> cities = parseCities();
        for (String city : cities) {
            System.out.println(city);
        }
    }

    public static void routePlanner() throws URISyntaxException, IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter city you want to start from: ");
        String startCity = input.nextLine();

        System.out.println("Starting city: " + startCity);

        List<String> destinations = parseRoutes().get(startCity);

        System.out.print("Possible destinations: " + destinations.toString().replaceAll("\\[|\\]", ""));
        System.out.println();

        System.out.print("Select next destination: ");
        String currentCity = input.nextLine();
        List<String> route = new ArrayList<>();
        route.add(startCity);
        route.add(currentCity);

        while (!currentCity.equals(startCity)) {
            System.out.println("Current city: " + currentCity);

            destinations = parseRoutes().get(currentCity);

            System.out.println("Possible destinations: " + destinations.toString().replaceAll("\\[|\\]", ""));
            System.out.print("Select next destination: ");
            currentCity = input.nextLine();
            route.add(currentCity);
        }
        for (int i = 0; i < route.size(); i++) {
            String city = route.get(i);
            System.out.print(city);

            if (i < route.size() - 1) {
                System.out.print(" -> ");
            }
        }
    }
}

