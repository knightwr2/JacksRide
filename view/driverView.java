import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class driverView {
    private VBox layout;

    public driverView(){
        Button viewRideRequestsButton = new Button("Request a Ride");
        Button trackActiveRidesButton = new Button("View Active Rides");
        Button viewProfileButton = new Button("View Profile");
        Button viewEarningsButton = new Button("View Earnings");
        Button logoutButton = new Button("Logout");

        viewRideRequestsButton.setOnAction(e -> {
            // Placeholder action
        });
        
        trackActiveRidesButton.setOnAction(e -> {
            // Placeholder action
        });

        viewProfileButton.setOnAction(e -> {
            // Placeholder action
        });

        viewEarningsButton.setOnAction(e -> {
            // Placeholder action
        });

        logoutButton.setOnAction(e -> {
            // Placeholder action
        });

        layout = new VBox(20);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(viewRideRequestsButton, trackActiveRidesButton, viewProfileButton, viewEarningsButton, logoutButton);
    }

    public VBox getLayout(){
        return layout;
    }
}
