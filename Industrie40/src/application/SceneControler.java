package application;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.scene.Node;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class SceneControler {

	private Stage stage;
	private Scene scene;
	private Parent root;
	
	//Bereitet das LoginScreen-Layout vor und erzeugt es dann
	public void switchToLoginScreen(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		}
	
	//Bereitet das RegisterScreen-Layout vor und erzeugt es dann
	public void switchToRegisterScreen(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("RegisterScreen.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();	
	}
	
	//Bereitet das Dashboard-Layout vor und erzeugt es dann
	public void switchToDashboardScreen(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
		
		//Auswahl der Stationen
		setStationenauswahl();
		
        
        //Erzeugen der Scene
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	

	//Bereitet das ProfileScreen-Layout vor und erzeugt es dann
	public void switchToProfileScreen(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("ProfileScreen.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	//Bereitet das NotificationScren-Layout vor und erzeugt es dann
	public void switchToNotificationScreen(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("NotificationScreen.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	private void setBarchart(Boolean zeitraumGewaehlt, Boolean clearBarchart, String selectedOption) {		
				
				BarChart<String, Number> barChart = (BarChart<String, Number>) root.lookup("#barchartDisplay");
				
				barChart.setTitle("Füllstand " + selectedOption);    

				if (clearBarchart) {
					barChart.getData().clear();	
					setZeitraumauswahl();
				}
				
				if(zeitraumGewaehlt) {
		       
		          
		        
		     // Diese deaktivieren der Legende
				barChart.setLegendVisible(false);
				
				XYChart.Series<String, Number> series = new XYChart.Series<>();
		        
		        series.getData().add(new XYChart.Data<>("00:30", 15));
		        series.getData().add(new XYChart.Data<>("01:30", 15));
		        series.getData().add(new XYChart.Data<>("02:30", 15));
		        series.getData().add(new XYChart.Data<>("03:30", 15));
		        series.getData().add(new XYChart.Data<>("04:30", 15));
		        series.getData().add(new XYChart.Data<>("05:30", 15));
		        series.getData().add(new XYChart.Data<>("06:30", 15));
		        series.getData().add(new XYChart.Data<>("07:30", 15));
		        series.getData().add(new XYChart.Data<>("08:30", 12));
		        series.getData().add(new XYChart.Data<>("09:30", 10));
		        series.getData().add(new XYChart.Data<>("10:30", 8));
		        series.getData().add(new XYChart.Data<>("11:30", 7));
		        series.getData().add(new XYChart.Data<>("12:30", 5));
		        series.getData().add(new XYChart.Data<>("13:30", 4));
		        series.getData().add(new XYChart.Data<>("14:30", 2));
		        series.getData().add(new XYChart.Data<>("15:30", 0));
		        series.getData().add(new XYChart.Data<>("16:30", 0));
		        series.getData().add(new XYChart.Data<>("17:30", 7));
		        series.getData().add(new XYChart.Data<>("18:30", 15));
		        series.getData().add(new XYChart.Data<>("19:30", 15));
		        series.getData().add(new XYChart.Data<>("20:30", 15));
		        series.getData().add(new XYChart.Data<>("21:30", 15));
		        series.getData().add(new XYChart.Data<>("22:30", 15));
		        series.getData().add(new XYChart.Data<>("23:30", 15));
		        
		        

		        // Hinzufügen der Werte(Serie) zur Barchart
		        barChart.getData().add(series);
				}
	}
	
	private void setStationenauswahl() {
		ChoiceBox<String> stationen = (ChoiceBox<String>) root.lookup("#dropDownListe");
		Label stationenLabel = (Label) root.lookup("#LabelStation");
		stationen.setValue("Station auswählen");
		stationenLabel.setText("Bitte Station auswählen!");
		ObservableList<String> options = FXCollections.observableArrayList(
                "Station: Befüllung",
                "Station: 2",
                "Station: 3",
                "Station: 4",
                "Station: 5"
        );
		stationen.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, selectedOption) -> {
            
			if(selectedOption != null && selectedOption != "Station auswählen") {
			
				// Passe das Label je nach ausgewähltem Feld an
            stationenLabel.setText(selectedOption);
            Boolean clearBarchart= true;
            selectedOption = "Zeitraum auswählen";
            setBarchart(false, clearBarchart, selectedOption);
			}
        });
		
	 stationen.setItems(options);
		
	}

	private void setZeitraumauswahl() {
		ChoiceBox<String> zeitraumauswahl = (ChoiceBox<String>) root.lookup("#dropDownZeiten");
		
		LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        
        String formattedDate = currentDate.format(formatter);
        
        LocalDate yesterday = currentDate.minusDays(1);
        String formattedDate1 = yesterday.format(formatter);
        
        LocalDate yesterday2 = currentDate.minusDays(2);
        String formattedDate2 = yesterday2.format(formatter);
        
        LocalDate yesterday3 = currentDate.minusDays(3);
        String formattedDate3 = yesterday3.format(formatter);

        LocalDate yesterday4 = currentDate.minusDays(4);
        String formattedDate4 = yesterday4.format(formatter);
       
        LocalDate yesterday5 = currentDate.minusDays(5);
        String formattedDate5 = yesterday5.format(formatter);
       
        LocalDate yesterday6 = currentDate.minusDays(6);
        String formattedDate6 = yesterday6.format(formatter);
      
        LocalDate yesterday7 = currentDate.minusDays(7);
        String formattedDate7 = yesterday7.format(formatter);

       
        
		zeitraumauswahl.setValue("Zeitraum wechseln");
		ObservableList<String> optionsZeiten = FXCollections.observableArrayList(
                formattedDate.toString(),
                formattedDate1.toString(),
                formattedDate2.toString(),
                formattedDate3.toString(),
                formattedDate4.toString(),
                formattedDate5.toString(),
                formattedDate6.toString(),
                formattedDate7.toString()
        );
		
		zeitraumauswahl.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, selectedOption) -> {
            
			if(selectedOption != null && selectedOption != "Zeitraum wechseln") {
				
				boolean zeitraumGewaehlt = true;
				
				//Befüllen der Barchart
				setBarchart(zeitraumGewaehlt,true,selectedOption);
			} 
		
        });
		
		zeitraumauswahl.setItems(optionsZeiten);
		
		
	}
}

