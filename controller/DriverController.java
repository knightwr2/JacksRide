package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class DriverController 
{
    @FXML
    private Label welcomeLabel;
    @FXML
    private Button acceptRideButton;

    @FXML
    private void onAcceptRide() 
    {
        System.out.println("Ride accepted by driver.");
    }

    public void setWelcomeMessage(String name) 
    {
        welcomeLabel.setText("Welcome, " + name + "!");
    }
}
