import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Random; 

public class GuessingGame extends Application {

    private int randomNumber;
    private int attempts;

    @Override
    public void start(Stage primaryStage) {
        
        Random randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(100) + 1;

        Label instructionLabel = new Label("Guess the number (between 1 and 100):");
        TextField guessField = new TextField();
        Button guessButton = new Button("Guess");
        Label resultLabel = new Label();
        Label attemptsLabel = new Label(); 

        guessButton.setOnAction(event -> {
            // Increment attempts
            attempts++;

            try {
                int guess = Integer.parseInt(guessField.getText());
                if (guess == randomNumber) {
                    resultLabel.setText("Congratulations! You've guessed the number correctly in " + attempts + " attempts.");
                } else if (guess < randomNumber) {
                    resultLabel.setText("Try a higher number.");
                } else {
                    resultLabel.setText("Try a lower number.");
                }
            } catch (NumberFormatException e) {
                resultLabel.setText("Please enter a valid number.");
            }

            // Update attemptsLabel to display the number of attempts
            attemptsLabel.setText("Attempts: " + attempts);
        });

        VBox root = new VBox(10);
        root.setPadding(new Insets(10));
        root.getChildren().addAll(instructionLabel, guessField, guessButton, resultLabel, attemptsLabel);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Guessing Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
