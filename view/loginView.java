import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class loginView {
    private Stage primaryStage;

    public loginView(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void showLogin(){
        TextField username = new TextField();
        username.setPromptText("Enter Username");
        PasswordField password = new PasswordField();
        password.setPromptText("Enter Password");

        Button driverLogin = new Button("Login as Driver");
        Button passengerLogin = new Button("Login as Passenger");

        driverLogin.setOnAction(e -> {
            if (isValidLogin(username.getText(), password.getText())) {
                goToDriverView();
            }
        });

        passengerLogin.setOnAction(e -> {
            if (isValidLogin(username.getText(), password.getText())) {
                goToPassengerView();  // Navigate to Admin screen
            }
        });

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(username, password, driverLogin, passengerLogin);

        // Set up the scene and stage
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private boolean isValidLogin(String username, String password) {
        return username != null && password != null && !username.isEmpty() && !password.isEmpty();
    }

    private void goToDriverView() {
        driverView driver = new driverView();
        primaryStage.setScene(new Scene(driver.getLayout(), 300, 200));
    }

    private void goToPassengerView() {
        passengerView passenger = new passengerView();
        primaryStage.setScene(new Scene(passenger.getLayout(), 300, 200));
    }

}
