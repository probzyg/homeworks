package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;
    private static VideoStore videoStore = new VideoStore();

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to see list of movies (as user)");
            System.out.println("Choose 5 to set your rating for a movie (as user)");

            int n = keyboard.nextInt();

            switch (n) {
                case 0 -> System.exit(0);
                case 1 -> fillVideoStore(keyboard);
                case 2 -> rentVideo(keyboard);
                case 3 -> returnVideo(keyboard);
                case 4 -> videoStore.listInventory();
                case 5 -> videoStore.takeRating(keyboard);
                default -> {
                }
            }
        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movieName = scanner.next() + scanner.nextLine();
            System.out.println("Enter rating");
            int rating = scanner.nextInt();

            Video video = new Video(movieName, rating);
            videoStore.addVideo(movieName, rating);
        }
    }

    private static void rentVideo(Scanner scanner) {
        System.out.println("Enter movie title: ");
        String movieName = scanner.next() + scanner.nextLine();

        Video video = videoStore.findVideoByTitle(movieName);

        if (video != null) {
            if (video.isCheckedOut()) {
                System.out.println("It's already rented");
                System.out.println();
            } else {
                videoStore.rentOut(video);
                System.out.println("The video has been rented!");
                System.out.println();
            }
        } else {
            System.out.println("Video not found!");
            System.out.println();
        }
    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("Enter movie title: ");
        String movieName = scanner.next() + scanner.nextLine();

        Video video = videoStore.findVideoByTitle(movieName);
        if (video != null) {
            if (video.isCheckedOut()) {
                videoStore.returnVideo(video);
                System.out.println("The video has been returned!");
                System.out.println();
            } else {
                System.out.println("The video is not rented!");
                System.out.println();
            }
        } else {
            System.out.println("Video not found!");
            System.out.println();
        }
    }
}

