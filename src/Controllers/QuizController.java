package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 * Objekte der Klasse QuizController praesentieren QuizGame
 * @author yen_nguyen
 *
 */
public class QuizController implements Initializable{

	   /**
	    * Buttonnamen identifizieren
	    * Da fuer jede Frage nur 1 Antwort ausgewaehlt werden kann,
	    *  muss die ToggleGroup verwendet werden
	    *  Fragen und Antworten sind mit keyvalue zu zugreifen
	    */
	    private ToggleGroup tgGroup;

	    @FXML
	    private RadioButton but_A;

	    @FXML
	    private RadioButton but_B;

	    @FXML
	    private RadioButton but_C;

	    @FXML
	    private RadioButton but_D;

	    @FXML
	    private Button next_but;
		
	    @FXML
	    private Button save_but;
	    
	    @FXML
	    private Text qNo;
	   
	    @FXML
	    private Text question;
		
	    @FXML
	    private Text scores;
		
	    static String s;
        String[][] qpa; //question show
        String[][] qca; //correct answer
        public static int qaid; // question ID
	    HashMap<Integer, String> map;
        public static String chk;//check
        private static QuizController instance; // variable -nur einmal benutzt wird
     	
    /**
     * Konstuktor fuer Variable -nur einmal benutzt wird
     * parameterloser Konstruktor fuer instance Variable
     */
    public QuizController()
     	{
     		instance = this;
     	}
     	
    /**
     * @return instance
     */
    public static QuizController getInstance()
     	{
     		return instance;
     	}	
    /**
     * zufaellige Fragen zugriffen
     * 5 Fragenpackets - Pakets (0-4)
     * @return qaid
     */
    public static int randomFunction() {
    	Random randomGenerator = new Random();
    	int randomInt = randomGenerator.nextInt(5);
		return randomInt;
    	
    }
    
    
    
         /**
          * button gruppen
          * Daten zugriffen im Question und CorrectAnswer
          * Zufaelige Frage von Pakets
          * Fragen und Antworten abgebildet werden 
          */
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
		
			
			tgGroup = new ToggleGroup();
			but_A.setToggleGroup(tgGroup);
			but_B.setToggleGroup(tgGroup);
			but_C.setToggleGroup(tgGroup);
			but_D.setToggleGroup(tgGroup);
			
	         qpa=new String[10][5];
	         qca=new String[10][2];

	          int no = MainController.getInstance().getRandomNo();
	         
	             if(no==0)
	            {
	               qpa = Question.setQuiz();
	               qca = CorrectAnswer.getCorr_ans();
                           
	            }
	             else if (no==1)
	             {
	            	 qpa = Question.setQuiz1();
		             qca = CorrectAnswer.getCorr_ans1();
	            	 
	             }
	             else if (no==2)
	             {
	            	 qpa = Question.setQuiz2();
		             qca = CorrectAnswer.getCorr_ans2();
	            	 
	             }
	             else if (no==3)
	             {
	            	 qpa = Question.setQuiz3();
		             qca = CorrectAnswer.getCorr_ans3();
	            	 
	             }
	             else if (no==4)
	             {
	            	 qpa = Question.setQuiz4();
		             qca = CorrectAnswer.getCorr_ans4();
	            	 
	             }
	          
	             map=new HashMap<Integer, String>();
	             readqa(qaid);
	                    	                        
		    }
					
		
		
		
		
		
    /**
     * optionale Einstellungsmethode fuer ToggleGroup
     * @param i Parameter von Methode readqa,
     * die Nummer der Frage
     */
    public void readqa(int i){
		        		       
	          question.setText(qpa[i][0]);
	          but_A.setText("A)  "+qpa[i][1]);
	          but_B.setText("B)  "+qpa[i][2]);
	          but_C.setText("C)  "+qpa[i][3]);
	          but_D.setText("D)  "+qpa[i][4]);
	            
	          but_A.getText().substring(4);  
	          but_B.getText().substring(4);
	          but_C.getText().substring(4); 
	          but_D.getText().substring(4);
	         
	          
	        /**
	         * muss man an Button clicken
	         */
	          
	       String btn = selectedToggle(i,but_A,but_B,but_C,but_D);
	        
	       if(Objects.equals(btn, "b1"))
	       {
	    	   but_A.setSelected(true);
	       }
	       else if(Objects.equals(btn, "b2"))
	       {
	    	   but_B.setSelected(true);
	       }
	       else if(Objects.equals(btn, "b3"))
	       {
	    	   but_C.setSelected(true);
	       }
	       else if(Objects.equals(btn, "b4"))
	       {
	    	   but_D.setSelected(true);
	       }
	       else
	       {
	    	   but_A.setSelected(false);
	    	   but_B.setSelected(false);
	    	   but_C.setSelected(false);
	    	   but_D.setSelected(false);
	       }
	       
	    }	
		 
    /**
     *
     * @param i Nummer der Question erstellen
     */
    public void setQid(int i)
		 {
			qaid =  i;
			
		 }
		
    /**
     *
     * @return qaid
     */
    public int getQid()
		 {
			 return qaid;
		 }
		
    /**
     *Multichoice kombinieren
     * @param qa Nummer der Question 
     * @param r1 Button A
     * @param r2 Button B
     * @param r3 Button C
     * @param r4 Button D
     * @return selection  zurück, was der Spieler ausgewaehlt hat
     */
    public String selectedToggle(int qa, RadioButton r1, RadioButton r2, RadioButton r3, RadioButton r4)
		 {
			String temp = map.get(qa);
				       
			String sel = null;
			
			if(Objects.equals(temp, r1.getText().substring(4)))
			{
			    sel = "bA";
			}
			else if(Objects.equals(temp, r2.getText().substring(4)))
			{
				sel = "bB";
				
			}
			else if(Objects.equals(temp, r3.getText().substring(4)))
			{
				sel = "bC";
				
			}
			else if(Objects.equals(temp, r4.getText().substring(4)))
			{
				sel = "bD";
				
			}
			
			
			 return sel;
			 
		 }
		 
    /**
     *getter SelectionMethode
     * @return checken was der Spieler ausgewaehlt
     */
    public String getSelection()
		 {
	            
			 return chk;
         }
	
    /**
     *setter FragennummerMethode
     * @param i Nummer des Questions
     */
    public void setQuestionNO(int i)
		 {
			 int qN = i;
			 qN++;
			 qNo.setText("Fr."+qN+" ");
			 
		 }
		 
    /**
     *jede Frage gibt nur einen ausgewaehlten Button
     * @param event  Erstellt ein neues ActionEvent mit dem Aktion- Ereignistyp.
     */
    @FXML
		 public void groupAction(ActionEvent event) {
		      
		  if(but_A.isSelected())
		  {
			  chk = but_A.getText().substring(4);
		  }
		  else if(but_B.isSelected())
		  {
			  chk = but_B.getText().substring(4);
		  
		  }
		  else if(but_C.isSelected())
		  {
			  chk = but_C.getText().substring(4); 
		  }
		  else if(but_D.isSelected())
		  {
			  chk = but_D.getText().substring(4);
		  }
		 
		}

    /**
     *ActionEvent fuer weiter Button
     *wenn Spieler Weiter button clickt, 
     *neue Frage wird gezeigt 
     *Fragen Button ist gruen 
     *wenn der beenden Button clickt, zeigt automatische Dialogbox an,
     *um zu confirmieren, dass er wirklich beenden und abgeben
     * @param e  Erstellt ein neues ActionEvent mit dem Aktion- Ereignistyp.
     * @throws IOException Ausnahmen, die durch fehlgeschlagene 
	 * oder unterbrochene E / A-Operationen erzeugt werden.
     */
    @FXML	 
	  public void btnNext(ActionEvent e) throws IOException
	  {
		  if(qaid<10)
		  {
             
             map.put(qaid,getSelection());
             if(Objects.equals(getSelection(), null))
             {
            	 Model.getInstance().setColorRed(qaid, true);
             }
             else
             {
            	Model.getInstance().setColorGreen(qaid, true);
             }
            
             if(Objects.equals(qaid, 9))
             {   
                 setQuestionNO(qaid); 
                 readqa(qaid);
                 qaid++;
             }
             else
              {
            	 qaid++;
            	 chk = null;
                 setQuestionNO(qaid); 
                 readqa(qaid);
              }
               
             
           }
      
	  else {
		  
		     this.setDialogBox();    	  
         }
				 
      }
	 
    /**
     *setDialog Fenster anlagen
     * @throws IOException wenn es Fehler gibt
     */
    public void setDialogBox() throws IOException
	 {
		 Alert alert = new Alert(AlertType.CONFIRMATION);
		 alert.setTitle("Confirmation");
		 String s = " Wollen Sie abgeben ?";
		 alert.setContentText(s);

		  Optional<javafx.scene.control.ButtonType> action = alert.showAndWait();

		  if ((action.isPresent()) && (action.get() ==javafx.scene.control.ButtonType.OK)) {

                    this.submit();		 
	    	    System.gc();  
		  }
		  else
		  {
			  qaid--;
		  }
		 
	 }
	  
    /**
     *richtige Antworte kalkulieren
     * @return count Anzahl den richtigen Antworten
     */
    public int calCorrectAnswer(){
         int qnum=10;
         int count=0;
         for(int qid=0;qid<qnum;qid++) 
         
         if(qca[qid][1].equals(map.get(qid)))
          {
        	 count++;
          
          }
         return count;
     }
	 
    /**
     *ActionEvent wenn Spielerbei Dialogbox ok clickt
     * @param event Erstellt ein neues ActionEvent mit dem Aktion- Ereignistyp.
     * @throws IOException Ausnahmen, die durch fehlgeschlagene 
	 * oder unterbrochene E / A-Operationen erzeugt werden.
     */
    @FXML
	 public void sumbitQuiz(ActionEvent event) throws IOException {
		     
		      this.setDialogBox();		    	
	  }
	 
    /**
     *Report das Ergebnis
     * @throws IOException alle moeglichen Fehler bei Ein- und Ausgabeoperationen abdeckt.
     */
    public void submit() throws IOException
	 {
		  qaid=0;
		  save_but.getScene().getWindow().hide();
			
		  Stage Result = new Stage();
		  Parent root = FXMLLoader.load(getClass().getResource("/Controllers/Report_.fxml"));
		  Scene scene = new Scene(root);
		  Result.setScene(scene);
		
		  
		  
		  Result.show();
		
		 
	 }
    
    
		
}








