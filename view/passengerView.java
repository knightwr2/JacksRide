import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class passengerView {
    private VBox layout;

    public passengerView(){
        Button requestRideButton = new Button("Request a Ride");
        Button viewActiveRidesButton = new Button("View Active Rides");
        Button viewProfileButton = new Button("View Profile");
        Button logoutButton = new Button("Logout");

        requestRideButton.setOnAction(e -> {
            // Placeholder
        });
        
        viewActiveRidesButton.setOnAction(e -> {
            // Placeholder
        });

        viewProfileButton.setOnAction(e -> {
            // Placeholder
        });

        logoutButton.setOnAction(e -> {
            // Placeholder
        });

        layout = new VBox(20);
        layout.setPadding(new Insets(50));
        layout.getChildren().addAll(requestRideButton, viewActiveRidesButton, viewProfileButton, logoutButton);
    }

    public VBox getLayout(){
        return layout;
    }
}
