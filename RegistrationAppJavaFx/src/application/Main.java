package application;
	
import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	
	ComboBox<String> cbCountry;
	@Override
	public void start(Stage primaryStage) {
		// Creating label for names
		Label labelfname = new Label("First Name:");
		Label labelmname = new Label("Middle Name:");
		Label labellname = new Label("Last Name:");
		Label labelEmail = new Label("Email:");
		Label labelphone = new Label("Phone No:");
		Label labelNationality = new Label("Nationality:");
		Label lpassword = new Label("Password:");
		Label lconfirmpassword = new Label("Confirm Password:");
		
		
		// Creating TextField for names
		TextField fnameField = new TextField();
		TextField MnameField = new TextField();
		TextField lnameField = new TextField();
		TextField EmailField = new TextField();
		TextField phoneField = new TextField();
		PasswordField password = new PasswordField();
		PasswordField confirmpassword = new PasswordField();
		
		cbCountry = new ComboBox<>();
		cbCountry.getItems().addAll("Algeria","Angola","Botswana","Chad","Democratic Republic of Congo","Kenya","South Africa","Tanzania","Uganda");
		
		cbCountry.setPromptText("Select Country");
		//cbCountry.setEditable(true);
		
		
		//Creating buttons
		Button btnSubmit = new Button("Submit");
		Button btnReset = new Button("Reset");
		Button btnExit = new Button("Exit");
		btnSubmit.setPrefWidth(150);
		btnReset.setPrefWidth(100);
		btnExit.setPrefWidth(100);
		
		
		
		//try {
		
		    
			GridPane root = new GridPane();
			Scene scene = new Scene(root,800,600);
			
			//Setting the padding 
					root.setPadding(new Insets(10, 10, 10, 10));
			
			// Setting the vertical and horizontal gaps between the columns
			 root.setVgap(10);
			 root.setHgap(10);
			
			 // setting the grid pane alignment
			  root.setAlignment(Pos.CENTER);
			 
			//Arranging the nodes on the grid
			
			 root.add(labelfname, 0, 0);
			 root.add(fnameField, 1, 0);
			 
			 root.add(labelmname, 2, 0);
			 root.add(MnameField, 3, 0);
			 
			 root.add(labellname, 4, 0);
			 root.add(lnameField, 5, 0);
			 
			 root.add(labelEmail, 0, 1);
			 root.add(EmailField, 1, 1);
			 
			 root.add(labelphone, 0, 2);
			 root.add(phoneField, 1, 2);
			 
			 root.add(labelNationality, 0, 3);
			 root.add(cbCountry, 1, 3);
			 
			 root.add(lpassword, 0, 4);
			 root.add(password, 1, 4);
			 
			 root.add(lconfirmpassword, 0, 5);
			 root.add(confirmpassword, 1, 5);
			 
			 root.add(btnSubmit, 2, 8);
			 root.add(btnReset, 3, 8);
			 root.add(btnExit, 5, 8);
		
			 
			 btnSubmit.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Name: "+fnameField.getText()+" "+MnameField.getText()+" "+lnameField.getText()+
				"\nEmail: "+EmailField.getText()+
				"\nPhone No: "+phoneField.getText()+
				"\nNationality: "+cbCountry.getValue()
				);
	
				}
				 
			 });
			 
			 
			 btnReset.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					// TODO Auto-generated method stub
					
					fnameField.setText("");
					MnameField.setText("");
					lnameField.setText("");
					EmailField.setText("");
					phoneField.setText("");
					password.setText("");
					confirmpassword.setText("");
					//NationalityCombox;
					
					
				}
				 
			 });
			 
			 //Exit button - closes the window
			 btnExit.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent ev) {
					System.exit(0);
					
				}
				 
			 });
			 
			 //Styling the nodes
			 
			 root.setStyle("-fx-background-color: lightgray");
			 btnSubmit.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font: normal bold 20px 'serif'");
			 btnReset.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font: normal bold 20px 'serif'");
			 btnExit.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font: normal bold 20px 'serif'");
			 
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Registration Form");
			primaryStage.setWidth(1200);
			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
