package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {

	
	public static void main(String[] args) {
		launch(args);
	}

		
		@Override
		 public void start(Stage stage) {
		  try {
		   
		   Parent root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
		   Scene scene = new Scene(root);
		   Screen screen = Screen.getPrimary();
		   Rectangle2D bounds = screen.getVisualBounds();
		   stage.setX(bounds.getMinX());
		   stage.setY(bounds.getMinY());
		   stage.setWidth(bounds.getWidth());
		   stage.setHeight(bounds.getHeight());
		   stage.setScene(scene);
		   stage.show();
		   
		  } catch(Exception e) {
		   e.printStackTrace();
		  }
		 } 
		


	

}
