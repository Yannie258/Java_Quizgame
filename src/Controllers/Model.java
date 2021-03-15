package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

//import javafx.animation.KeyFrame;
//import javafx.animation.KeyValue;
//import javafx.animation.Timeline;
//import javafx.beans.property.IntegerProperty;
//import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

//import javafx.util.Duration;


public class Model implements Initializable{
/**
 * Buttonnamen  identifizieren (Question number)
 * wenn button geclickt ist, zeigt die Frage an
 */

	@FXML
    private AnchorPane showQuestion;

    @FXML
    private Button q1;

    @FXML
    private Button q2;

    @FXML
    private Button q3;

    @FXML
    private Button q4;

    @FXML
    private Button q5;

    @FXML
    private Button q6;

    @FXML
    private Button q7;

    @FXML
    private Button q8;

    @FXML
    private Button q9;

    @FXML
    private Button q10;
    
    
    /**
     * Countdown -Timer Variablen deklarieren
     */
    
   // private static final Integer STARTTIME=60;
   
    
   // private Integer seconds= STARTTIME;
    
    
    
    @FXML
    private Label seconds_Lbl = new Label();
    
    
    

 
    @FXML
    private AnchorPane anchorPane;
	
    @FXML
    private HBox counter;
     /**
      *  erhalten Fragen-Bereich
      */
    AnchorPane home;
	private static Model instance;
	
  /**
     *Model Constructor
     */
    public Model()
	{
		instance = this;
	}
	
    /**
     *
     * @return instance
     */
    public static Model getInstance()
	{
		return instance;
	}	
    
    
    @Override
   	public void initialize(URL arg0, ResourceBundle arg1) {
   		
   		this.createPage(home, "/Controllers/Quiz.fxml");
   		//doTime();
   		
   		
   		
   		
        
   	}

    /**
     *fuegt JavaQuizView fxml in MainView hinzu
     * @param node  den Wert der Eigenschaft nodeOrientation festlegen.
     */
    
    public void setNode(Node node)
	{
		showQuestion.getChildren().clear();
		showQuestion.getChildren().add((Node) node);
						
	}

    /**
     * Countdown-Timer methode erstellen
     * 10 Fragen in 60 Sekunden
     * Diese ist noch in der Probezeit
     */
   /* public void doTime() {
    	  Timeline time= new Timeline();
    	 
    	  
    	  KeyFrame frame= new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>(){
    		  @Override
    		  public void handle(ActionEvent event) {
    	    
    			  
    			  seconds--;
    			  seconds_Lbl.setText(seconds.toString());
    			  if(seconds<=0){
    				  time.stop();
    				  
    				  
    				 try {
						QuizController.getInstance().submit();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
    					
    			  }
    	    
    		  }
    	   
    	   
    	  });
    	  
    	  time.setCycleCount(Timeline.INDEFINITE);
    	  time.getKeyFrames().add(frame);
    	  if(time!=null){
    		  time.stop();
    	  }
    	  
    	  
    	  time.playFromStart();
    	  
    	  
    	  
    	  
    	 }
    private Timeline timeline;
    private IntegerProperty timeSeconds = new SimpleIntegerProperty(STARTTIME); 
    
    
   */

    /**
     *die Fragen Bereich erstellen
     * @param homeN ist der Name ein AnchorPane-Layout 
     * @param loc ist den angegebenen untergeordneten Elementen.
     */
    public void createPage(AnchorPane homeN,String loc) {
		
		try {
			homeN = FXMLLoader.load(getClass().getResource(loc));
			setNode(homeN);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
   
	
    /**
     *ActionEvent fuer jede Frage Button 
     * @param event  Erstellt ein neues ActionEvent mit dem Aktion- Ereignistyp.
     */
    @FXML
	 public void q1Action(ActionEvent event) {

	    	
	    		QuizController.getInstance().readqa(0);
		    	QuizController.getInstance().setQuestionNO(0);;
		    	QuizController.getInstance().setQid(0);
		    	
		   	
	    
	    }

	    @FXML
	    void q2Action(ActionEvent event) {

	          QuizController.getInstance().readqa(1);
	    	  QuizController.getInstance().setQuestionNO(1);
	    	  QuizController.getInstance().setQid(1);
	    	
	    	
	    }

	    @FXML
	    void q3Action(ActionEvent event) {

	    	
	    	  QuizController.getInstance().readqa(2);
	    	  QuizController.getInstance().setQuestionNO(2);
	    	  QuizController.getInstance().setQid(2);
	    	
	    }

	    @FXML
	    void q4Action(ActionEvent event) {
	    	
	    	   QuizController.getInstance().readqa(3);
	    	   QuizController.getInstance().setQuestionNO(3);
	    	   QuizController.getInstance().setQid(3);
	    	
	    }

	    @FXML
	    void q5Action(ActionEvent event) {
	    	
	    	  QuizController.getInstance().readqa(4);
	    	  QuizController.getInstance().setQuestionNO(4);
	    	  QuizController.getInstance().setQid(4);
	    	
	    }

	    @FXML
	    void q6Action(ActionEvent event) {
	    	
	    	 QuizController.getInstance().readqa(5);
	    	 QuizController.getInstance().setQuestionNO(5);
	    	 QuizController.getInstance().setQid(5);
	    	
	    }

	    @FXML
	    void q7Action(ActionEvent event) {
	    	
	    	  QuizController.getInstance().readqa(6);
	    	  QuizController.getInstance().setQuestionNO(6);
	    	  QuizController.getInstance().setQid(6);
	    	
	    }

	    @FXML
	    void q8Action(ActionEvent event) {
	    	
	    	 QuizController.getInstance().readqa(7);
	    	 QuizController.getInstance().setQuestionNO(7);
	    	 QuizController.getInstance().setQid(7);
	    	
	    }

	    @FXML
	    void q9Action(ActionEvent event) {
	    	
	    	
	    	  QuizController.getInstance().readqa(8);
	    	  QuizController.getInstance().setQuestionNO(8);
	    	  QuizController.getInstance().setQid(8);
	    	
	    }
      
	    @FXML
	    void q10Action(ActionEvent event) {
	    	
	    	
	    	  QuizController.getInstance().readqa(9);
	    	  QuizController.getInstance().setQuestionNO(9);
	    	  QuizController.getInstance().setQid(9);
	    	
	    }
	
    /**
     * Farben fuer Button fragen einstellen, um zu identifizieren,
     *  welche Sätze beantwortet wurden.
     *  Wenn der Satz ausgewaehlt und gespeichert wurde, wird er gruen verfarbt,
     *  Wenn der Satz weder ausgewaehlt noch gespeichert wurde, wird er nicht verfarbt 
     *  (in diesem Fall ist er weisst)
     * @param qaid Parameter von Methode setColorGreen
     * qaid ist Identify von Question 
     * @param value Parameter von Methode setColorGreen
     * value ist der Wert wahr oder false
     */
    public void setColorGreen(int qaid , boolean value)
	    {
	    	if(Objects.equals(value, true))
	    	{
	    		if(Objects.equals(qaid, 0))
	    		{
	    			q1.setStyle("-fx-background-color: #29a827; -fx-text-fill: white;");
	    			
	    		}
	    		else if(Objects.equals(qaid, 1))
	    		{
	    			q2.setStyle("-fx-background-color: #29a827; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 2))
	    		{
	    			q3.setStyle("-fx-background-color: #29a827; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 3))
	    		{
	    			q4.setStyle("-fx-background-color: #29a827; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 4))
	    		{
	    			q5.setStyle("-fx-background-color: #29a827; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 5))
	    		{
	    			q6.setStyle("-fx-background-color: #29a827; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 6))
	    		{
	    			q7.setStyle("-fx-background-color: #29a827; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 7))
	    		{
	    			q8.setStyle("-fx-background-color: #29a827; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 8))
	    		{
	    			q9.setStyle("-fx-background-color: #29a827; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 9))
	    		{
	    			q10.setStyle("-fx-background-color: #29a827; -fx-text-fill: white;");
	    		}
	    		
	    	}
	    	
	    }
	
    /**
     * ohne Antwort ist rot
     * Wenn der Satz nicht ausgewaehlt aber gespeichert wurde.
     * @param qaid Parameter von Methode setColorRed
     * qaid ist Identify von Question 
     * @param value Parameter von Methode setColorRed
     * value ist der Wert wahr oder false
     */
    public void setColorRed(int qaid, boolean value)
	    {
	    	if(Objects.equals(value, true))
	    	{
	    		if(Objects.equals(qaid, 0))
	    		{
	    			q1.setStyle("-fx-background-color: #eb3b3b; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 1))
	    		{
	    			q2.setStyle("-fx-background-color: #eb3b3b; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 2))
	    		{
	    			q3.setStyle("-fx-background-color: #eb3b3b; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 3))
	    		{
	    			q4.setStyle("-fx-background-color: #eb3b3b; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 4))
	    		{
	    			q5.setStyle("-fx-background-color: #eb3b3b; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 5))
	    		{
	    			q6.setStyle("-fx-background-color: #eb3b3b; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 6))
	    		{
	    			q7.setStyle("-fx-background-color: #eb3b3b; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 7))
	    		{
	    			q8.setStyle("-fx-background-color: #eb3b3b; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 8))
	    		{
	    			q9.setStyle("-fx-background-color: #eb3b3b; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 9))
	    		{
	    			q10.setStyle("-fx-background-color: #eb3b3b; -fx-text-fill: white;");
	    		}
	    		
	    	}
	    	    	
	    }

	
	  

}

