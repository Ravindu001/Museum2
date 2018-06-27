package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modals.User;

public class MainControler {

	@FXML
	private Label  Sid;
	@FXML
	private TextField textusername;
	@FXML
	private TextField textpassword;
	
	public void Login(ActionEvent event) throws Exception{
		User us = User.getInstance();
		
		String user = textusername.getText();
		String pass = textpassword.getText();
		
		if (us.checkLogin(user, pass)) {
			 Sid.setText("Login Success");
			 Stage primaryStage = new Stage();
			 Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
				
				Scene scene = new Scene(root,400,400);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
		}else {
			 Sid.setText("Login Failed");
			
		}
	}
	
	
	
	
	
}
