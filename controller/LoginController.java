package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginController
 {
    @FXML
    private TextField usernameField;
    @FXML
    private Button loginButton;

    @FXML
    private void onLogin()
     {
        String username = usernameField.getText();
        if (username.equalsIgnoreCase("driver"))
         {
            System.out.println("Redirecting to Driver Dashboard...");
        } else if (username.equalsIgnoreCase("passenger")) 
        {
            System.out.println("Redirecting to Passenger Dashboard...");
        } else
         {
            System.out.println("Invalid Login");
        }
    }
}