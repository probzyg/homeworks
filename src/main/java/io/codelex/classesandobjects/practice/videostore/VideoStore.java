package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VideoStore {
    private String title;
    private int rating;
    private boolean checkedOut;
    private int newRating;

    private static List<Video> videos = new ArrayList<>();

    public static void addVideo(String movieName, int rating) {
        videos.add(new Video(movieName, rating));
    }

    public void rentOut(Video video) {
        if (!video.isCheckedOut()) {
            video.checkOut();
        } else {
            System.out.println("Video is already checked out!");
            System.out.println();
        }
    }

    public void returnVideo(Video video) {
        if (video.isCheckedOut()) {
            video.returnVideo();
        } else {
            System.out.println("Video is already available: " + title);
            System.out.println();
        }
    }

    public void listInventory() {
        System.out.println("Inventory:");
        for (Video video : videos) {
            System.out.printf("- %s, rating: %d, %s%n",
                    video.getTitle(),
                    video.getAverageRating(),
                    video.isCheckedOut() ? "checked out" : "available");
        }
        System.out.println();
    }

    public Video findVideoByTitle(String title) {
        for (Video video : videos) {
            if (video.getTitle().equals(title)) {
                return video;
            }
        }
        System.out.println("Video not found: " + title);
        System.out.println();
        return null;
    }

    public void takeRating(Scanner scanner) {
        System.out.println("Enter movie title: ");
        String movieName = scanner.next() + scanner.nextLine();

        Video video = findVideoByTitle(movieName);

        if (video != null) {
            System.out.println("Enter your rating: ");
            int rating = scanner.nextInt();

            int newRating = video.receiveRating(rating);
            System.out.println("Rating added: " + rating);
            System.out.println("New average rating for " + video.getTitle() + ": " + newRating);
            System.out.println();
        }
    }
}
