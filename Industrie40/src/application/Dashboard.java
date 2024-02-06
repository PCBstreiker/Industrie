package application;

import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Dashboard extends Application {
	
	private List<String> sensorData;
	private List<String> manufacturingStations;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
	
		primaryStage.setTitle("Dashboard");

        Button loginButton = new Button("Login");
        Button registerButton = new Button("Register");
        Button accountButton = new Button("Account");
        Button exportButton = new Button("Export");
        Button startButton = new Button("Start");

        HBox buttonBox = new HBox(100);
        buttonBox.setPadding(new Insets(650, 10, 500, 275));
        buttonBox.getChildren().addAll(startButton, loginButton, registerButton, accountButton, exportButton);

        BorderPane layout = new BorderPane();
        layout.setTop(buttonBox);

        Scene scene = new Scene(layout, 1200, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
		
	}
	
	public static void exportSensorData() {
		
	}
	
	public static void viewSensorData() {
		
	}
	
	
	public List<String> getSensorData() {
		return sensorData;
	}
	public void setSensorData(List<String> sensorData) {
		this.sensorData = sensorData;
	}
	public List<String> getManufacturingStations() {
		return manufacturingStations;
	}
	public void setManufacturingStations(List<String> manufacturingStations) {
		this.manufacturingStations = manufacturingStations;
	}


}
