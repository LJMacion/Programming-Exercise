import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleCalculator extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Text fields for user input
        TextField num1Field = new TextField();
        TextField num2Field = new TextField();

        // Label to display the result
        Label resultLabel = new Label();

        // Buttons for arithmetic operations
        Button addButton = new Button("+");
        addButton.setOnAction(event -> {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = num1 + num2;
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException e) {
                resultLabel.setText("Error: Invalid input");
            }
        });

        Button subtractButton = new Button("-");
        subtractButton.setOnAction(event -> {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = num1 - num2;
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException e) {
                resultLabel.setText("Error: Invalid input");
            }
        });

        Button multiplyButton = new Button("*");
        multiplyButton.setOnAction(event -> {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = num1 * num2;
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException e) {
                resultLabel.setText("Error: Invalid input");
            }
        });

        Button divideButton = new Button("/");
        divideButton.setOnAction(event -> {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                if (num2 == 0) {
                    resultLabel.setText("Error: Division by zero");
                    return;
                }
                double result = num1 / num2;
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException e) {
                resultLabel.setText("Error: Invalid input");
            }
        });

        // Layout
        VBox root = new VBox(10);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(num1Field, num2Field, addButton, subtractButton, multiplyButton, divideButton, resultLabel);

        // Scene
        Scene scene = new Scene(root, 300, 300);

        // Stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Simple Calculator");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}