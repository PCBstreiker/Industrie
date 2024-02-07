package application;

import java.io.IOException;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneControler {

	private Stage stage;
	private Scene scene;
	private Parent root;
	
	
	public void switchToLoginScreen(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		}
	
	public void switchToRegisterScreen(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("RegisterScreen.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public void switchToDashboardScreen(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public void switchToProfileScreen(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("ProfileScreen.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
}
