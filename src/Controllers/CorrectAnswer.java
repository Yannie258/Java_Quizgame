package Controllers;

public class CorrectAnswer {
	/**
	 * nur eine Antwort ist richtig in jeder Frage
	 * die sind durch Arrays deklariert
	 * bei Array wird Array-Feld ab 0 angefangen
	 * 10 Fragen , 1 Antwort ( 10 Zeilen ,2 Spalten ) 
	 */
	
	static String[][] corr_ans = new String[10][2];
	static String[][] corr_ans1 = new String[10][2];
	static String[][] corr_ans2 = new String[10][2];
	static String[][] corr_ans3 = new String[10][2];
	static String[][] corr_ans4 = new String[10][2];
	/**
	 * man kann mehrere Antwortpackete erstellen
	 * static String[][] corr_ans1 = new String[10][2];
	 * static String[][] corr_ans2 = new String[10][2];...
	 *
	 *getting corr_ans methode, erlaubt nur zu lesen
	 *Die Frage, die zum Vergleichen der Benutzerantwort verwendet wird, 
	 * ist wahr oder falsch im Vergleich zur Programmantwort
	 * @return corr_ans
	 * erste Fragenbogen 
	 */
	public static String[][] getCorr_ans() {
		
		corr_ans[0][0]= "Zahlenreihen!  34, 31, 28,? ";
		corr_ans[0][1]="25";
		
		corr_ans[1][0]= "Welches dieser Laender grenzt nicht an Brasilien? ";
		corr_ans[1][1]="Chile";
		
		corr_ans[2][0]= "Von welchem Land kaufte Amerika den Staat Alaska? ";
		corr_ans[2][1]="Russland";
		
		corr_ans[3][0]= "Welce Farbe hat \"Hipposchweiss\" ? ";
		corr_ans[3][1]="Rot";
		
		corr_ans[4][0]= "Welches Land ueberreichte Amerika die Freiheitsstatue? ";
		corr_ans[4][1]="Frankreich";
		
		corr_ans[5][0]= "Wie heisst die Freundin von Micky Maus?  ";
		corr_ans[5][1]="Minni";
		
		corr_ans[6][0]= "Welche Farbe hat die Schuhe von Micky Maus? ";
		corr_ans[6][1]="Gelb";
		
		corr_ans[7][0]= "Gegeben 14626 = 1; 68009 = 0 ; 56110 = 2 ;\n" +" 67019 = 1 ; 16101 = ? ; was ist ? ";
		corr_ans[7][1]="3";
		
		corr_ans[8][0]= "Gegeben 4 + 1 = 12 ; 8 + 4 = 32 ;\n"+" 3 + 2 = 3 ; 6 + 3 = ? ;  was ist ?";
		corr_ans[8][1]="18";
		
		corr_ans[9][0]= "Was ist der Hauptbestanteil unserer Naegel und Haare? ";
		corr_ans[9][1]="Keratin";
		
		return corr_ans;
		
	}
	
	/**
	 * 2. Fragenbogen 
	 * @return corr_ans1
	 */
	public static String[][] getCorr_ans1() {
		
		corr_ans1[0][0]= "Wie heisst Don Quichottes Gefaehrte, der ihn auf seinen Abendteuern begleitete? ";
		corr_ans1[0][1]="Sancho Pansa";
		
		corr_ans1[1][0]= "Was ist bei dem leisesten Musikstueck, das es gibt, zu hoeren? ";
		corr_ans1[1][1]="Nichts";
		
		corr_ans1[2][0]= "In welchem Musikfilm spielte Madonna die Hauptrolle? ";
		corr_ans1[2][1]="Evita";
		
		corr_ans1[3][0]= "Was bedeutet Sakura in Japanish ? ";
		corr_ans1[3][1]="Die Kirschbluete";
		
		corr_ans1[4][0]= "Warum lachten die Leute, wenn Gottlieb Daimler \r\n"
				+ "auf seinem ersten erfundenen Mororrad fuhr?";
		corr_ans1[4][1]="Er fuhr mit Stuetzraedern";
		
		corr_ans1[5][0]= "Wann wurde der WWF, der World Wide Fund For Nature, gegruendet?";
		corr_ans1[5][1]="1961";
		
		corr_ans1[6][0]= "In welcher Stadt befindet sich die Zentrale \r\n das Headquarter von INTERPOL?";
		corr_ans1[6][1]="Lyon";
		
		corr_ans1[7][0]= "Mit wie viel Jahren begann Michael Jackson seine Karriere? ";
		corr_ans1[7][1]="Mit 5 Jahren";
		
		corr_ans1[8][0]= "Wie lang kann einAlphorn maximal sein?";
		corr_ans1[8][1]="4 Meter";
		
		corr_ans1[9][0]= "Wie viele Personen fasst das groeste Hallenstadion der Welt? ";
		corr_ans1[9][1]="ca. 100.000";
		
		return corr_ans1;
		
	}
	/**
	 * 3. Fragenbogen 
	 * @return corr_ans2
	 */
	
	public static String[][] getCorr_ans2() {
		
		corr_ans2[0][0]= "Welche Nationalitaet hatte der Maler Picasso ";
		corr_ans2[0][1]="Er war Spanier";
		
		corr_ans2[1][0]= "Welches Gemaelde gilt als das wertvollste Gemaelde der Welt? ";
		corr_ans2[1][1]="\"Salvator Mundi\" von Leonardo da Vinci";
		
		corr_ans2[2][0]= "Mit welcher britischen Organisation ist das amerikanische FBI vergleichbar? ";
		corr_ans2[2][1]="MI5";
		
		corr_ans2[3][0]= "In welchem Land liegt der Wintersportort Oppdal? ";
		corr_ans2[3][1]="Norwegen";
		
		corr_ans2[4][0]= "Wie lange ist die Elternzeit in Deutschland maximal? ";
		corr_ans2[4][1]="3 Jahre";
		
		corr_ans2[5][0]= "Wer entwickelte das \"Jenaer Glas\"? ";
		corr_ans2[5][1]="Otto Schott";
		
		corr_ans2[6][0]= "Wer sich heimlich verdrueckt, macht sich aus dem...?";
		corr_ans2[6][1]="Staub";
		
		corr_ans2[7][0]= "Wo lebten die Inka ";
		corr_ans2[7][1]="In Suedamerika";
		
		corr_ans2[8][0]= "Wie wurde Siddharta Gautama spaeter genannt?";
		corr_ans2[8][1]="Buddha";
		
		corr_ans2[9][0]= "Wer ist Waslaw Nijinski? ";
		corr_ans2[9][1]="Ein russischer Balletttaenzer";
		
		return corr_ans2;
		
	}
	
	/**
	 * 3. Fragenbogen 
	 * @return corr_ans3
	 */
	public static String[][] getCorr_ans3() {
		
		corr_ans3[0][0]= "Wie viele Saiten hat eine Gitarre? ";
		corr_ans3[0][1]="6";
		
		corr_ans3[1][0]= "Mit welcher Boygroup wurde Robbie Williams in den 90er-Jahren bekannt?";
		corr_ans3[1][1]="Take That";
		
		corr_ans3[2][0]= "Was ist ein Bandoneon?";
		corr_ans3[2][1]="Eine Art Akkordeon";
		
		corr_ans3[3][0]= "Was ist die Firma Leonhardt & Blumberg fuer ein Betrieb? ";
		corr_ans3[3][1]="Reederei";
		
		corr_ans3[4][0]= "Was war der fruehere Name von St.Petersburg? ";
		corr_ans3[4][1]="Leningrad";
		
		corr_ans3[5][0]= "Wo finden wir Dendriten? ";
		corr_ans3[5][1]="Nervenzellen";
		
		corr_ans3[6][0]= "Welche Stadt befindet sich in Deutschland? ";
		corr_ans3[6][1]="Trier";
		
		corr_ans3[7][0]= "Was bedeutet \"unverschaemt\" auf Englisch? ";
		corr_ans3[7][1]="impudent";
		
		corr_ans3[8][0]= "Was muessen wir entspannen, um den Darm zu entleeren?";
		corr_ans3[8][1]="Schliessmuskel";
		
		corr_ans3[9][0]= "Fuer 12 Pferde reicht das Futter fuer 4 Tage. "
				+ "\r\n Wie lange koennten 3 Pferde mit dem Futter ueberleben?";
		corr_ans3[9][1]="16";
		
		return corr_ans3;
		
	}
	
	/**
	 * 5. Fragenbogen 
	 * @return corr_ans4
	 */
	
	public static String[][] getCorr_ans4() {
		
		corr_ans4[0][0]= "Wer ist Onkel Tom aus dem Roman \"Onkel Toms Huette\" ? " ;
		corr_ans4[0][1]="Auf einer einsamen Insel";
		
		corr_ans4[1][0]= "Welches dieser Laender grenzt nicht an Brasilien? ";
		corr_ans4[1][1]="Ein schwarzer Sklave";
		
		corr_ans4[2][0]= "Wie viele Tasten hat ein Klavier? ";
		corr_ans4[2][1]="88";
		
		corr_ans4[3][0]= "Wann durchquerte der erste Mensch schwimmend den Aermelkanal";
		corr_ans4[3][1]="In 1876";
		
		corr_ans4[4][0]= "Was ist der groesste lebende Vogel ?";
		corr_ans4[4][1]="Strauss";
		
		corr_ans4[5][0]= "Wo befindet sich die Spanische Treppe ? ";
		corr_ans4[5][1]="Rom";
		
		corr_ans4[6][0]= "Was gilt als Vorlaeufer des Rock n' Roll ? ";
		corr_ans4[6][1]="Rhythm and Blues";
		
		corr_ans4[7][0]= "Von welchem Teil des Zimbaums stammt der Zimt ? ";
		corr_ans4[7][1]="Rinde";
		
		corr_ans4[8][0]= "Der Dom zu Roskilde ist die Grabstaette der Koenige von ...?";
		corr_ans4[8][1]="Daenemark";
		
		corr_ans4[9][0]= "Welches Land gehoert NICHT zu den Beneluxstaaten ? ";
		corr_ans4[9][1]="Schweiz";
		
		return corr_ans4;
		
	}
	
	
	
}
