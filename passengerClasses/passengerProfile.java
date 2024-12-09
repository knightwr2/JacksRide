import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class passengerProfile {
    private Stage primaryStage;

    public passengerProfile (Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void showProfile() {
        TextField nameField = new TextField("John Doe");
        nameField.setPromptText("Enter your name");

        TextField emailField = new TextField("john.doe@example.com");
        emailField.setPromptText("Enter your email");

        TextField phoneField = new TextField("123-456-7890");
        phoneField.setPromptText("Enter your phone number");

        Button saveButton = new Button("Save");
        Button cancelButton = new Button("Cancel");

        saveButton.setOnAction(e -> {
            System.out.println("Profile updated: ");
            System.out.println("Name: " + nameField.getText());
            System.out.println("Email: " + emailField.getText());
            System.out.println("Phone: " + phoneField.getText());
            goToPassengerView();
        });

        cancelButton.setOnAction(e -> {
            goToPassengerView();
        });

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(nameField, emailField, phoneField, saveButton, cancelButton);

        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setTitle("Profile");
        primaryStage.setScene(scene);
    }

    private void goToPassengerView() {
        passengerView passenger = new passengerView(primaryStage);
        primaryStage.setScene(new Scene(passenger.getLayout(), 300, 200));
    }

}
