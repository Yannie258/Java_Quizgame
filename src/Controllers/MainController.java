package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.stage.Stage;


public class MainController implements Initializable{
	
	/**
	 * den Pfad zur fxml-Datei einstellen,
	 *  die die Oberfläche des Quiz enthaelt
	 *  Wenn User auf Start klickt,
	 *   wird die Quiz-Oberflaeche aufgerufen
	 */
	
	
	@FXML
	private Button start_but;
	
	/**
    *statische Variable erfolgt ueber die Klasse
    *nur einmal angelegt
    */
	
	private static MainController instance;

    
    public MainController()
     	{
     		instance = this;
     	}
    public static MainController getInstance()
 	{
 		return instance;
 	}	

    public static int random_no;
    /**
     * getter Methode
     * @return random_no
     */
    public int getRandomNo()
	 {
		
		 return random_no; 
		   
	 }

	
	
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		 
            }
	/**
	 * switch zum MainQuestionView Oberflaeche
	 * mit zufaelige Fragenpakets
	 * @param event Erstellt ein neues ActionEvent mit dem Aktion- Ereignistyp.
	 * @throws IOException Ausnahmen, die durch fehlgeschlagene 
	 * oder unterbrochene E / A-Operationen erzeugt werden.
	 */
	@FXML
	public void changeQuizScene(ActionEvent event) throws IOException  {
		Parent view2 = FXMLLoader.load(getClass().getResource("/Controllers/MainQuestionView.fxml"));
		
		Scene scene2 = new Scene(view2,750,650);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// switch scenes
		window.setScene(scene2);
		window.show();
		random_no = QuizController.randomFunction();
	}
		
	
}
	

	
