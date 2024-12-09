import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class activeRides {
    private Stage primaryStage;

    public activeRides(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void showActiveRides() {
        ListView<String> activeRidesList = new ListView<>();
        
        activeRidesList.getItems().addAll(
            "Ride 1: From ABC to XYZ at 10:00 AM",
            "Ride 2: From DEF to GHI at 11:00 AM"
        );

        Button cancelRideButton = new Button("Cancel Ride");
        Button backButton = new Button("Back");

        cancelRideButton.setOnAction(e -> {
            // Logic to cancel a ride (this can be modified as needed)
            String selectedRide = activeRidesList.getSelectionModel().getSelectedItem();
            if (selectedRide != null) {
                System.out.println("Canceling ride: " + selectedRide);
                activeRidesList.getItems().remove(selectedRide);
            }
        });

        backButton.setOnAction(e -> {
            goToPassengerView();
        });

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(activeRidesList, cancelRideButton, backButton);

        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setTitle("Active Rides");
        primaryStage.setScene(scene);
    }

    private void goToPassengerView() {
        passengerView passenger = new passengerView(primaryStage);
        primaryStage.setScene(new Scene(passenger.getLayout(), 300, 200));
    }

}
