package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import model.RideRequest;
import model.Vehicle;

public class PassengerController {

    @FXML
    private TextField pickupLocationField;

    @FXML
    private TextField dropoffLocationField;

    @FXML
    private ComboBox<String> vehicleTypeComboBox;

    @FXML
    private Button requestRideButton;

    @FXML
    private ListView<String> rideHistoryListView;

    @FXML
    private Label statusLabel;

    // Observable list to store ride history
    private ObservableList<String> rideHistory;

    public void initialize() {
        // Initialize vehicle types
        vehicleTypeComboBox.setItems(FXCollections.observableArrayList("Car", "Bike", "Van"));

        // Initialize ride history list
        rideHistory = FXCollections.observableArrayList();
        rideHistoryListView.setItems(rideHistory);

        // Set default status message
        statusLabel.setText("Ready to request a ride");
    }

    @FXML
    private void handleRequestRide() {
        String pickupLocation = pickupLocationField.getText();
        String dropoffLocation = dropoffLocationField.getText();
        String vehicleType = vehicleTypeComboBox.getValue();

        if (pickupLocation.isEmpty() || dropoffLocation.isEmpty() || vehicleType == null) {
            statusLabel.setText("Please fill all fields to request a ride.");
            return;
        }

        // Simulate a ride request
        RideRequest newRequest = new RideRequest(pickupLocation, dropoffLocation, vehicleType);

        // Add ride to history
        String rideDetails = String.format("%s: %s to %s", vehicleType, pickupLocation, dropoffLocation);
        rideHistory.add(rideDetails);

        // Update status
        statusLabel.setText("Ride requested successfully!");

        // Clear fields
        pickupLocationField.clear();
        dropoffLocationField.clear();
        vehicleTypeComboBox.setValue(null);
    }
}
