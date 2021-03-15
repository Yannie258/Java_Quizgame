package Controllers;

public class Question {
/**
 * Question strukturieren
 * es gibt 10 Fragen, jede Frage hat 4 Moeglichkeiten 
 * bei Array wird Array-Feld ab 0 angefangen
 * man kann mehrere Fragenpacket erstellen
 * 
 */
	static String[][] ques = new String [10][5];
	static String[][] ques1 = new String [10][5];
	static String[][] ques2 = new String [10][5];
	static String[][] ques3 = new String [10][5];
	static String[][] ques4 = new String [10][5];
	
	
	
	/**
	 * setting setQuiz methode, erlaubt nur hinzufuegen
	 * Fragen sind durch Arrays deklariert
	 * @return ques Zeichenkette
	 */
	public static String[][] setQuiz() {
		
			ques[0][0] = "Zahlenreihen!  34, 31, 28,? ";
			
			ques[0][1] = "24";
			ques[0][2] = "25"; //ca (correct answer)
			ques[0][3] = "26";
			ques[0][4] = "27";
			
			ques[1][0] = "Welches dieser Laender grenzt nicht an Brasilien? ";
			
			ques[1][1] = "Bolivia";
			ques[1][2] = "Chile"; //ca
			ques[1][3] = "Uruguay";
			ques[1][4] = "Venezuela";
			
			ques[2][0] = "Von welchem Land kaufte Amerika den Staat Alaska? ";
			
			ques[2][1] = "Russland"; // ca
			ques[2][2] = "Japan";
			ques[2][3] = "Canada";
			ques[2][4] = "England";
			
			ques[3][0] = "Welce Farbe hat \"Hipposchweiss\" ? ";
			
			ques[3][1] = "Weiss";
			ques[3][2] = "Blau";
			ques[3][3] = "Gelb";
			ques[3][4] = "Rot";//ca
			
			ques[4][0] = "Welches Land ueberreichte Amerika die Freiheitsstatue? ";
			
			ques[4][1] = "Frankreich";//
			ques[4][2] = "Italien";
			ques[4][3] = "Kanada";
			ques[4][4] = "Grossbritannien";
			
			ques[5][0] = "Wie heisst die Freundin von Micky Maus?  ";
			
			ques[5][1] = "Mini";
			ques[5][2] = "Minni";//
			ques[5][3] = "Minny";
			ques[5][4] = "Miny";
			
			ques[6][0] = "Welche Farbe hat die Schuhe von Micky Maus? ";
			
			ques[6][1] = "Rot";
			ques[6][2] = "Schwarz";
			ques[6][3] = "Gelb"; //ca
			ques[6][4] = "Weiss";
			
			ques[7][0] = "Gegeben 14626 = 1; 68009 = 0 ; 56110 = 2 ; 67019 = 1 ; 16101 = ? ; was ist ? ";
			
			ques[7][1] = "1";
			ques[7][2] = "2";
			ques[7][3] = "3";//ca
			ques[7][4] = "4";
			
			ques[8][0] = "Gegeben 4 + 1 = 12 ; 8 + 4 = 32 ; 3 + 2 = 3 ; 6 + 3 = ? ;  was ist ?";
			
			ques[8][1] = "12";
			ques[8][2] = "32";
			ques[8][3] = "3";
			ques[8][4] = "18"; //ca
			
			ques[9][0] = "Was ist der Hauptbestanteil unserer Naegel und Haare? ";
			
			ques[9][1] = "Karotin";
			ques[9][2] = "Kreatin";
			ques[9][3] = "Chitin";
			ques[9][4] = "Keratin"; //
			
			
			
			return ques;
		
	}
	
	/**
	 * setting setQuiz1 methode, erlaubt nur hinzufuegen
	 * Fragen sind durch Arrays deklariert
	 * @return ques1 Zeichenkette
	 */
	public static String[][] setQuiz1() {
		
			ques1[0][0] = "Wie heisst Don Quichottes Gefaehrte, der ihn auf seinen Abendteuern begleitete? ";
			
			ques1[0][1] = "Peppone";
			ques1[0][2] = "Sancho Pansa"; //ca (correct answer)
			ques1[0][3] = "Pat";
			ques1[0][4] = "Don Quichottes";
			
			ques1[1][0] = "Was ist bei dem leisesten Musikstueck, das es gibt, zu hoeren? ";
			
			ques1[1][1] = "Nur der Ton einer Floete";
			ques1[1][2] = "Nur der fein gestrichene Ton einer Geige"; 
			ques1[1][3] = "Ton von Gitarre";
			ques1[1][4] = "Nichts";//
			
			ques1[2][0] = "In welchem Musikfilm spielte Madonna die Hauptrolle? ";
			
			ques1[2][1] = "Hair"; 
			ques1[2][2] = "Evita";//
			ques1[2][3] = "Jesus Chirst Superstar";
			ques1[2][4] = "Santa Claus";
			
			ques1[3][0] = "Was bedeutet Sakura in Japanish ? ";
			
			ques1[3][1] = "Die Sonne";
			ques1[3][2] = "Der Mond";
			ques1[3][3] = "Die Kirschbluete";//
			ques1[3][4] = "Eine schoene Prinzessin";
			
			ques1[4][0] = "Warum lachten die Leute, wenn Gottlieb Daimler \r\n"
					+ "auf seinem ersten erfundenen Mororrad fuhr?";
			
			ques1[4][1] = "Er fuhr im Nachthemd";
			ques1[4][2] = "Er fuhr mit Stuetzraedern";//
			ques1[4][3] = "Er hatte seine Hose vergessen";
			ques1[4][4] = "Er fuhr barfuss";
			
			ques1[5][0] = "Wann wurde der WWF, der World Wide Fund For Nature, gegruendet?";
			
			ques1[5][1] = "1962";
			ques1[5][2] = "1961";//
			ques1[5][3] = "1963";
			ques1[5][4] = "1960";
			
			ques1[6][0] = "In welcher Stadt befindet sich die Zentrale \r\n das Headquarter von INTERPOL?";
			
			ques1[6][1] = "London";
			ques1[6][2] = "Paris";
			ques1[6][3] = "Berlin"; 
			ques1[6][4] = "Lyon";//
			
			ques1[7][0] = "Mit wie viel Jahren begann Michael Jackson seine Karriere? ";
			
			ques1[7][1] = "Mit 5 Jahren";//
			ques1[7][2] = "Mit 12 Jahren";
			ques1[7][3] = "Mit 18 Jahren";
			ques1[7][4] = "Mit 8 Jahren";
			
			ques1[8][0] = "Wie lang kann ein Alphorn maximal sein?";
			
			ques1[8][1] = "2 Meter";
			ques1[8][2] = "3 Meter";
			ques1[8][3] = "4 Meter";//
			ques1[8][4] = "5 Meter"; 
			
			ques1[9][0] = "Wie viele Personen fasst das groeste Hallenstadion der Welt? ";
			
			ques1[9][1] = "ca. 30.000";
			ques1[9][2] = "ca. 70.000";
			ques1[9][3] = "ca. 100.000";//
			ques1[9][4] = "ca. 120.000";
			
			
			
			return ques1;
			
	}
	
	public static String[][] setQuiz2() {
		
			ques2[0][0] = "Welche Nationalitaet hatte der Maler Picasso ";
			
			ques2[0][1] = "Er war Spanier";//ca
			ques2[0][2] = "Er war Italiener"; 
			ques2[0][3] = "Er war Franzose";
			ques2[0][4] = "Er war Oesterreicher";
			
			ques2[1][0] = "Welches Gemaelde gilt als das wertvollste Gemaelde der Welt? ";
			
			ques2[1][1] = "\"Sonnenblumen\" von Vincent van Gogh";
			ques2[1][2] = "\"Salvator Mundi\" von Leonardo da Vinci"; //ca
			ques2[1][3] = "\"Guernica\" von Picasso";
			ques2[1][4] = "\"Nu couche\" von Modigliani";
			
			ques2[2][0] = "Mit welcher britischen Organisation ist das amerikanische FBI vergleichbar? ";
			
			ques2[2][1] = "Scotland Yard";
			ques2[2][2] = "MI6";
			ques2[2][3] = "MI5";//
			ques2[2][4] = "MDP";
			
			ques2[3][0] = "In welchem Land liegt der Wintersportort Oppdal? ";
			
			ques2[3][1] = "Schweiz";
			ques2[3][2] = "Schweden";
			ques2[3][3] = "Norwegen";//
			ques2[3][4] = "Finnland";
			
			ques2[4][0] = "Wie lange ist die Elternzeit in Deutschland maximal? ";
			
			ques2[4][1] = "1 Jahr";
			ques2[4][2] = "2 Jahre";
			ques2[4][3] = "3 Jahre";//
			ques2[4][4] = "20 Monaten";
			
			ques2[5][0] = "Wer entwickelte das \"Jenaer Glas\"? ";
			
			ques2[5][1] = "Walther Hermann Nernst";
			ques2[5][2] = "Friedrich Hoffman";
			ques2[5][3] = "Heinrich Gustav Magnus";
			ques2[5][4] = "Otto Schott";//
			
			ques2[6][0] = "Wer sich heimlich verdrueckt, macht sich aus dem...?";
			
			ques2[6][1] = "Mist";
			ques2[6][2] = "Dreck";
			ques2[6][3] = "Schmutz";
			ques2[6][4] = "Staub";//
			
			ques2[7][0] = "Wo lebten die Inka ";
			
			ques2[7][1] = "In Suedamerika";//
			ques2[7][2] = "In Nordamerika";
			ques2[7][3] = "In Indien";
			ques2[7][4] = "In Suedafrika";
			
			ques2[8][0] = "Wie wurde Siddharta Gautama spaeter genannt?";
			
			ques2[8][1] = "Jesus Christus";
			ques2[8][2] = "Buddha";//
			ques2[8][3] = "Konfuzius";
			ques2[8][4] = "Zeus"; 
			
			ques2[9][0] = "Wer ist Waslaw Nijinski? ";
			
			ques2[9][1] = "Ein russischer Balletttaenzer";//ca
			ques2[9][2] = "Ein russischer Politiker";
			ques2[9][3] = "Ein russischer Schriftsteller";
			ques2[9][4] = "Ein russischer Geschaeftsman";
			
			
			
			return ques2;
			
	}
	

	public static String[][] setQuiz3() {
	
		ques3[0][0] = "Wie viele Saiten hat eine Gitarre? ";
		
		ques3[0][1] = "4";
		ques3[0][2] = "5"; 
		ques3[0][3] = "6";//ca (correct answer)
		ques3[0][4] = "nach Wunsch";
		
		ques3[1][0] = "Mit welcher Boygroup wurde Robbie Williams in den 90er-Jahren bekannt?";
		
		ques3[1][1] = "New Kids on the Block";
		ques3[1][2] = "Take That"; //ca
		ques3[1][3] = "Westlife";
		ques3[1][4] = "Abba";
		
		ques3[2][0] = "Was ist ein Bandoneon?";
		
		ques3[2][1] = "Eine Drehorgel"; 
		ques3[2][2] = "Eine Art Dudelsack";
		ques3[2][3] = "Eine Art Akkordeon";//
		ques3[2][4] = "Eine Art Fluete";
		
		ques3[3][0] = "Was ist die Firma Leonhardt & Blumberg für ein Betrieb? ";
		
		ques3[3][1] = "Gewuerzhandel";
		ques3[3][2] = "Baumaschinenhersteller";
		ques3[3][3] = "Diamantenmine";
		ques3[3][4] = "Reederei";//ca
		
		ques3[4][0] = "Was war der fruehere Name von St.Petersburg? ";
		
		ques3[4][1] = "Stalingrad";
		ques3[4][2] = "Leningrad";//
		ques3[4][3] = "Martowograd";
		ques3[4][4] = "Wolgograd";
		
		ques3[5][0] = "Wo finden wir Dendriten? ";
		
		ques3[5][1] = "Spermazellen";
		ques3[5][2] = "Krebszellen";
		ques3[5][3] = "Blutzellen";
		ques3[5][4] = "Nervenzellen";//
		
		ques3[6][0] = "Welche Stadt befindet sich in Deutschland? ";
		
		ques3[6][1] = "Graz";
		ques3[6][2] = "Odense";
		ques3[6][3] = "Trier"; //ca
		ques3[6][4] = "Frauenfeld";
		
		ques3[7][0] = "Was bedeutet \"unverschaemt\" auf Englisch? ";
		
		ques3[7][1] = "tacium";
		ques3[7][2] = "ubiquitous";
		ques3[7][3] = "impudent";//ca
		ques3[7][4] = "concomitant";
		
		ques3[8][0] = "Was muessen wir entspannen, um den Darm zu entleeren?";
		
		ques3[8][1] = "Vas deferens";
		ques3[8][2] = "Schliessmuskel";//
		ques3[8][3] = "Epiglottis";
		ques3[8][4] = "Frenulum"; 
		
		ques3[9][0] = "Fuer 12 Pferde reicht das Futter fuer 4 Tage. "
				+ "\r\n Wie lange koennten 3 Pferde mit dem Futter ueberleben?";
		
		ques3[9][1] = "16";//ca
		ques3[9][2] = "4";
		ques3[9][3] = "12";
		ques3[9][4] = "7";
		
		
		
		return ques3;
		
	}
	public static String[][] setQuiz4() {
		
		ques4[0][0] = "Wo landete die Romanfigur Robinson Crusoe?";
		
		ques4[0][1] = "In einer anderen Galaxis";
		ques4[0][2] = "Auf einer einsamen Insel"; //ca (correct answer)
		ques4[0][3] = "In Chicago";
		ques4[0][4] = "In Zombieland";
		
		ques4[1][0] = "Wer ist Onkel Tom aus dem Roman \"Onkel Toms Huette\" ? " ;
		
		ques4[1][1] = "Ein weisser Sklavenhaendler";
		ques4[1][2] = "Ein schwarzer Sklave"; //ca
		ques4[1][3] = "Der Onkel eines Sklavenhaendler";
		ques4[1][4] = "Ein Bauer";
		
		ques4[2][0] = "Wie viele Tasten hat ein Klavier? ";
		
		ques4[2][1] = "68";
		ques4[2][2] = "78";
		ques4[2][3] = "88";//
		ques4[2][4] = "98";
		
		ques4[3][0] = "Wann durchquerte der erste Mensch schwimmend den Aermelkanal";
		
		ques4[3][1] = "In 1876";//
		ques4[3][2] = "In 1899";
		ques4[3][3] = "In 1912";
		ques4[3][4] = "In 1933";
		
		ques4[4][0] = "Was ist der groesste lebende Vogel ?";
		
		ques4[4][1] = "Strauss";//
		ques4[4][2] = "Emu";
		ques4[4][3] = "Kaiserpinguin";
		ques4[4][4] = "Kasuar";
		
		ques4[5][0] = "Wo befindet sich die Spanische Treppe ? ";
		
		ques4[5][1] = "Berlin";
		ques4[5][2] = "London";
		ques4[5][3] = "Rom";//ca
		ques4[5][4] = "Paris";
		
		ques4[6][0] = "Was gilt als Vorlaeufer des Rock n' Roll ? ";
		
		ques4[6][1] = "Mazurka";
		ques4[6][2] = "Bossa Nova";
		ques4[6][3] = "Polka"; 
		ques4[6][4] = "Rhythm and Blues";//
		
		ques4[7][0] = "Von welchem Teil des Zimbaums stammt der Zimt ? ";
		
		ques4[7][1] = "Wurzel";
		ques4[7][2] = "Blaetter";
		ques4[7][3] = "Rinde";//ca
		ques4[7][4] = "Samen";
		
		ques4[8][0] = "Der Dom zu Roskilde ist die Grabstaette der Koenige von ...?";
		
		ques4[8][1] = "Oesterreich";
		ques4[8][2] = "Schweden";
		ques4[8][3] = "Belgien";
		ques4[8][4] = "Daenemark"; //ca
		
		ques4[9][0] = "Welches Land gehoert NICHT zu den Beneluxstaaten ? ";
		
		ques4[9][1] = "Schweiz";//
		ques4[9][2] = "Belgien";
		ques4[9][3] = "Niederlande";
		ques4[9][4] = "Luxemburg"; 
		
		
		
		return ques4;
	
}
}
