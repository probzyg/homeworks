package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private String title;
    private boolean checkedOut;
    private int averageRating;

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public Video(String title, int rating) {
        this.title = title;
        this.averageRating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int setRating(int rating) {
        this.averageRating = rating;
        return averageRating;
    }

    public int getAverageRating() {
        return averageRating;
    }

    public void checkOut() {
        checkedOut = true;
    }

    public void returnVideo() {
        checkedOut = false;
    }

    public int receiveRating(int rating) {
        this.averageRating = (averageRating + rating) / 2;
        return averageRating;
    }
}
