package io.codelex.classesandobjects.practice;

import java.util.Arrays;

public class Movie {
    private final String title;
    private final String studio;
    private final String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public String getRating() {
        return rating;
    }

    public static Movie[] getPG(Movie[] movies) {
        Movie[] pgMovies = new Movie[movies.length];
        int index = 0;
        for (Movie movie : movies) {
            if (movie.getRating().equals("PG")) {
                pgMovies[index] = movie;
                index++;
            }
        }

        return Arrays.copyOf(pgMovies, index);
    }

    @Override
    public String toString() {
        return "[" + title + ", " + studio + ", " + rating + "]"; //additional square brackets added just for better output readability
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("Casino Royale", "Eon Productions", "PG\u00AD13");
        Movie movie2 = new Movie("Glass", "Buena Vista International", "PG");
        Movie movie3 = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG");
        Movie[] movies = {movie1, movie2, movie3};
        Movie[] pgMovies = getPG(movies);
        String pgMovie = Arrays.toString(pgMovies);
        System.out.println(pgMovie);
    }
}
