package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginScreen {
	
	

    public Scene getScene(int width, int height) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(8);
        grid.setHgap(10);
        grid.setStyle("-fx-background-color: white;");
        grid.setAlignment(Pos.CENTER);
        
        Label titleLabel = new Label("     Login");
        titleLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 56;");
        GridPane.setMargin(titleLabel, new Insets(0, 0, 65, 0)); 
        GridPane.setConstraints(titleLabel, 0, 0, 2, 1);

        Label usernameLabel = new Label("Benutzername");
        usernameLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 15;");
        GridPane.setConstraints(usernameLabel, 0, 1);
        TextField usernameInput = new TextField();
        usernameInput.setPrefWidth(300);
        usernameInput.setPrefHeight(45);
        usernameInput.setStyle("-fx-background-radius: 0; -fx-effect: innershadow(gaussian, #e6e6e6, 10, 0, 2, 2);");
        GridPane.setMargin(usernameInput, new Insets(0, 0, 25, 0)); 
        GridPane.setConstraints(usernameInput, 0,2);

        Label passwordLabel = new Label("Passwort");
        passwordLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 15;");
        GridPane.setConstraints(passwordLabel, 0, 3);
        PasswordField passwordInput = new PasswordField();
        passwordInput.setPrefWidth(300);
        passwordInput.setPrefHeight(45);
        passwordInput.setStyle("-fx-background-radius: 0; -fx-effect: innershadow(gaussian, #e6e6e6, 10, 0, 2, 2);");
        GridPane.setMargin(passwordInput, new Insets(0, 0, 25, 0)); 
        GridPane.setConstraints(passwordInput, 0, 4);
        

        Button loginButton = new Button("Einloggen");
        loginButton.setStyle("-fx-background-color: #0077CC; -fx-text-fill: white; -fx-background-radius: 0; -fx-font-weight: bold; -fx-font-size: 15;");
        loginButton.setPrefWidth(300);
        loginButton.setPrefHeight(45);
        GridPane.setConstraints(loginButton, 0, 5);
        GridPane.setMargin(loginButton, new Insets(0, 0, 10, 0)); 

        Button registerButton = new Button("Registrieren");
        registerButton.setStyle("-fx-background-radius: 0; -fx-font-weight: bold; -fx-font-size: 15;");
        registerButton.setPrefWidth(300);
        registerButton.setPrefHeight(45);
        
   
        
        GridPane.setConstraints(registerButton, 0, 6);
        GridPane.setMargin(registerButton, new Insets(0, 0, 10, 0)); 

        grid.getChildren().addAll(titleLabel,usernameLabel, usernameInput, passwordLabel, passwordInput, loginButton, registerButton);

     // Erstellen der Szene für die Registrierungsansicht
        Scene loginScene = new Scene(grid, 1440,960 );

        return loginScene;
    }


}
