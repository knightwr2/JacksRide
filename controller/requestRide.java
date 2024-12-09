import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class requestRide {
    private Stage primaryStage;

    public requestRide(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void showRequestRide() {
        TextField pickupLocation = new TextField();
        pickupLocation.setPromptText("Enter Pickup Location");

        TextField dropoffLocation = new TextField();
        dropoffLocation.setPromptText("Enter Dropoff Location");

        TextField rideTime = new TextField();
        rideTime.setPromptText("Enter Ride Time (e.g., 10:30 AM)");

        Button requestRideButton = new Button("Request Ride");

        requestRideButton.setOnAction(e -> {
            System.out.println("Ride requested from " + pickupLocation.getText() + " to " + dropoffLocation.getText() + " at " + rideTime.getText());

            goToPassengerView();
        });

        Button cancelButton = new Button("Cancel");

        cancelButton.setOnAction(e -> {
            goToPassengerView();
        });

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(pickupLocation, dropoffLocation, rideTime, requestRideButton, cancelButton);

        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setTitle("Request a Ride");
        primaryStage.setScene(scene);
    }

    private void goToPassengerView() {
        passengerView passenger = new passengerView(primaryStage);
        primaryStage.setScene(new Scene(passenger.getLayout(), 300, 200));
    }
}
