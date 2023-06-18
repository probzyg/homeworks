package io.codelex.trivia;

import java.io.*;
import java.net.*;
import java.util.*;

public class TriviaGame {
    private static final String API_URL = "http://numbersapi.com/random?min=1&max=2000";


    public static void main(String[] args) {
        startTrivia();
        playTriviaGame();
    }

    public static void startTrivia() {
        System.out.println("Welcome to the Numbers Trivia Game!");
        System.out.println("I will give you a trivia about a number, and you need to guess the correct number.");
        System.out.println("Maximum count of questions is 20, you win if you hit 20 correct answers.");
        System.out.println("Let's get started!");
    }

    public static void playTriviaGame() {
        try {
            int score = 0;
            int questionCount = 0;

            String lastQuestion = "";
            String lastAnswer = "";

            while (questionCount < 20) {
                String question = getTrivia();
                String trivia = question.split(" ", 2)[1];

                int correctAnswer = extractNumber(question);

                List<Integer> answerOptions = generateUniqueAnswerOptions();

                System.out.println("\nQuestion " + (questionCount + 1) + ":");
                System.out.println("... " + trivia);
                String[] options = shuffleOptions(correctAnswer, answerOptions);
                presentAnswerOptions(options);

                System.out.print("Enter your choice: ");
                Scanner scanner = new Scanner(System.in);
                int userChoice = scanner.nextInt();

                if (userChoice == correctAnswer) {
                    System.out.println("Congratulations! That's the correct answer.");
                    score++;
                } else {
                    System.out.println("Oops! The correct answer is: " + correctAnswer);
                    lastQuestion = trivia;
                    lastAnswer = String.valueOf(correctAnswer);
                    break;
                }

                questionCount++;
            }

            System.out.println("\nGAME OVER!");
            System.out.println("\nYou answered " + score + " out of " + 20 + " questions correctly.");

            if (!lastQuestion.isEmpty()) {
                System.out.println("\nThe last question was:");
                System.out.println(">" + lastQuestion);
                System.out.println("The correct answer was: ");
                System.out.println(">" + lastAnswer);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while retrieving trivia. Please try again later.");
        }

        System.out.println("\nThanks for playing the Numbers Trivia Game!");
    }

    public static String getTrivia() throws IOException {
        URL url = new URL(API_URL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }

        reader.close();
        connection.disconnect();

        return response.toString();
    }

    public static int extractNumber(String trivia) {
        String[] parts = trivia.split("\\s+",2);
        return Integer.parseInt(parts[0]);
    }

    public static List<Integer> generateUniqueAnswerOptions() {
        List<Integer> answerOptions = new ArrayList<>();
        while (answerOptions.size() < 3) {
            int randomNumber = (int) (Math.random() * 2000) + 1;
            if (!answerOptions.contains(randomNumber)) {
                answerOptions.add(randomNumber);
            }
        }
        Collections.shuffle(answerOptions);
        return answerOptions;
    }

    public static String[] shuffleOptions(int correctAnswer, List<Integer> answerOptions) {
        List<String> options = new ArrayList<>();
        options.add(String.valueOf(correctAnswer));
        for (int answer : answerOptions) {
            options.add(String.valueOf(answer));
        }
        Collections.shuffle(options);
        return options.toArray(new String[0]);
    }

    public static void presentAnswerOptions(String[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }
}