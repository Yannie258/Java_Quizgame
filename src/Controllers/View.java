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
import javafx.scene.control.Label;
import javafx.stage.Stage;


/**
 * Ereigniseinstellung per Mausklick
 * Ergebnistabelle anzeigen, 
 * wenn Spieler Beenden drueckt.
 * und das Spielwieder neu zu spielen
 *  oder beendet das Spiel
 *  
 * @author yen_ nguyen
 *
 *Das Schluesselwort implements wird von Klassen verwendet, 
 *die von Interface Initializable erben.
 */

public class View implements Initializable{
	
	/**
	 * Interface Label und Button erstellen
	 */
	@FXML
    private Label Marks;
	
	@FXML
	private Label comment;
    
    @FXML
    private Button home;
    
    @FXML
    private Button tryAgain;
    
    @FXML
    private Button close;

    
    public static int langno;
    
    private static View instance;
	
    /**
     *parameterlose Konstruktor View
     */
    public View()
	{
		instance = this;
	}
	
    /**
     * getter -Methode , um Parameter aufzurufen
     * @return instance
     */
    public static View getInstance()
	{
		return instance;
	}	
    
   
    @FXML
    public void goToHome(ActionEvent event) throws IOException {
    		    	
    	  
		  	Parent view3 = FXMLLoader.load(getClass().getResource("/application/mainView.fxml"));
			Scene scene3 = new Scene(view3,800,600);
			Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// switch scenes
			
			window.setScene(scene3);
			window.show();
    }

    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//Get Final Score
        int no = QuizController.getInstance().calCorrectAnswer();
		//Set Final Score
		Marks.setText(no+"/10");
		if (no<=5) {
			comment.setText("Verlierer!\r\n"
					+ "Ihr taegliches Wissen ist sehr begrenzt.\r\n Sie sollten das Lernen und die Unterhaltung entsprechend beruecksichtigen");
		}
		else if(no >5 && no < 10) {
			comment.setText("Gewinner!\r\n"
					+ "Sie haben relativ gute Kenntnisse");
			}
		else {
			comment.setText("Gewinner!\r\n"
					+ "Wunderbar. Sie haben ein großartiges Gehirn\r\n Sie beherrschen Ihr Leben vollstaendig");
		}
		
		
		
	}
    
    /**
     * Programm schliessen
     * @param e Erstellt ein neues ActionEvent mit dem Aktion- Ereignistyp.
     */
    @FXML
	public void closeApp(ActionEvent e) {
    	System.exit(0);
		
	}



}
