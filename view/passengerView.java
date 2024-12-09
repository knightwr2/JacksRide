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
             System.out.println("Redirecting to Ride Request Form...");
        });
        
        viewActiveRidesButton.setOnAction(e -> {
            // Placeholder
            System.out.println("Displaying Active Rides...");
        });

        viewProfileButton.setOnAction(e -> {
            // Placeholder
            System.out.println("Opening Profile...");
        });

        logoutButton.setOnAction(e -> {
            // Placeholder
            System.out.println("Logging out...");
            primaryStage.setScene(new Scene(new VBox(), 400, 400));
            
        });

        layout = new VBox(20);
        layout.setPadding(new Insets(50));
        layout.getChildren().addAll(requestRideButton, viewActiveRidesButton, viewProfileButton, logoutButton);
    }

    public VBox getLayout(){
        return layout;
    }
}
