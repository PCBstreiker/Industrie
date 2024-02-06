package application;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class RegisterScreen  {
	
	public Scene getScene(int width, int height) {
		
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(8);
        grid.setHgap(10);
        grid.setStyle("-fx-background-color: white;");
        grid.setAlignment(Pos.CENTER);
        
        Label titleLabel = new Label("   Register");
        titleLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 56;");
        GridPane.setMargin(titleLabel, new Insets(0, 0, 65, 0)); 
        GridPane.setConstraints(titleLabel, 0, 0, 2, 1);
        
        Label emailLabel = new Label("E-Mail");
        emailLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 15;");
        GridPane.setConstraints(emailLabel, 0, 1);
        TextField emailInput = new TextField();
        emailInput.setPrefWidth(300);
        emailInput.setPrefHeight(45);
        emailInput.setStyle("-fx-background-radius: 0; -fx-effect: innershadow(gaussian, #e6e6e6, 10, 0, 2, 2);");
        GridPane.setMargin(emailInput, new Insets(0, 0, 25, 0)); 
        GridPane.setConstraints(emailInput, 0,2);

        Label usernameLabel = new Label("Benutzername");
        usernameLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 15;");
        GridPane.setConstraints(usernameLabel, 0, 3);
        TextField usernameInput = new TextField();
        usernameInput.setPrefWidth(300);
        usernameInput.setPrefHeight(45);
        usernameInput.setStyle("-fx-background-radius: 0; -fx-effect: innershadow(gaussian, #e6e6e6, 10, 0, 2, 2);");
        GridPane.setMargin(usernameInput, new Insets(0, 0, 25, 0)); 
        GridPane.setConstraints(usernameInput, 0,4);

        Label passwordLabel = new Label("Passwort");
        passwordLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 15;");
        GridPane.setConstraints(passwordLabel, 0, 5);
        PasswordField passwordInput = new PasswordField();
        passwordInput.setPrefWidth(300);
        passwordInput.setPrefHeight(45);
        passwordInput.setStyle("-fx-background-radius: 0; -fx-effect: innershadow(gaussian, #e6e6e6, 10, 0, 2, 2);");
        GridPane.setMargin(passwordInput, new Insets(0, 0, 25, 0)); 
        GridPane.setConstraints(passwordInput, 0, 6);
        

        Button loginButton = new Button("Registrieren");
        loginButton.setStyle("-fx-background-color: #0077CC; -fx-text-fill: white; -fx-background-radius: 0; -fx-font-weight: bold; -fx-font-size: 15;");
        loginButton.setPrefWidth(300);
        loginButton.setPrefHeight(45);
        GridPane.setConstraints(loginButton, 0, 7);
        GridPane.setMargin(loginButton, new Insets(0, 0, 10, 0)); 

     

        grid.getChildren().addAll(titleLabel, emailLabel,emailInput, usernameLabel, usernameInput, passwordLabel, passwordInput, loginButton);

        // Erstellen der Szene für die Registrierungsansicht
        Scene registerScene = new Scene(grid, 1440,960 );

        return registerScene;
    }



}
