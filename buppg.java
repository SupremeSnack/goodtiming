//B-Uppgift programmering 1 av Herman Sundström 2016-12-21

import javax.swing.*;

public class buppg {
	public static void main (String[] arg) {


int a1 = 0, a2 = 0, g1 = 0, g2 = 0, m1 = 0, m2 = 0;

int upprepa = 0;

String resultat1, resultat2;
//Här har jag deklarerat några variabler jag kommer att använda mig av.


int intro = JOptionPane.showConfirmDialog(null, "Vänligen tänk dig en grupp människor och svara på två frågor för varje person i den gruppen. Syftet är att räkna ut Genomsnittsåldern.", "B-uppgift", JOptionPane.OK_CANCEL_OPTION);
//Den här raden används dels för att berätta för användaren vad för input den ska ge och för ge användaren en möjlighet att välja att stänga ner programmet.


if (intro == 0) { // Denna if-sats täcker all kod nedanför den. 
	do {

		/*
		När det kommer till att komma fram till antalet individer i gruppen så funderade jag först på att be användaren definiera antalet i förväg, men valde att fråga om det finns fler efter varje loop och spara ett ja som 0 i upprepa. 
		Det gjorde det enklare för mig när jag ville skilja mellan män och kvinnor. 

		Koden är uppbyggd så att do repeterar satserna så länge upprepa har värdet 0. Frågan om kön leder till att if eller else utförs. Variablen för antalet
		kvinnor/män ökas med 1 och ber sedan om personens ålder och adderar det värdet till g1/g2. Sist så frågas använderaren om den vill lägga till fler individer i gruppen.
		*/


		int steg1 = JOptionPane.showConfirmDialog(null, "Är personen en man?", "B-uppgift", JOptionPane.YES_NO_OPTION); 
		//Jag hade önskat att fråga om personen är en man eller kvinna istället, men att ändra på knappparamertrarna (till [Man]/[Kvinna]) såg ut att vara lite väl svårt att lära mig, så jag valde att strunta i det för den här uppgiften.
		

		if (steg1 == 0) {
			a1++;
			String steg2m = JOptionPane.showInputDialog(null, "Hur gammal är han?");
			g1 = g1 + Integer.parseInt(steg2m);
			upprepa = JOptionPane.showConfirmDialog(null, "Finns det fler personer?", "B-uppgift", JOptionPane.YES_NO_OPTION);
			}


		else {
			a2++;
			String steg2k = JOptionPane.showInputDialog(null, "Hur gammal är hon?");
			g2 = g2 + Integer.parseInt(steg2k);
			upprepa = JOptionPane.showConfirmDialog(null, "Finns det fler personer?", "B-uppgift", JOptionPane.YES_NO_OPTION);
			}

	} while (upprepa == 0);

/* Efter att ha skrivit koden som låter programmet fråga efter kön och ålder, samt att spara dem, så bestämde jag mig för att bugtesta 
innan jag fortsatte. Jag hade framför allt problem med att jag hade glömt ringa in mina if-satser i do-loopen med {}-klamrar. 


I koden nedan så kollas hur många individer gruppen innehåller (med hjälp av a1/a2) för att anpassa grammatiken i resultatmeddelandet och räknar dessutom ihop genomsnittsåldrarna för män och kvinnor om det finns fler än 1 av dem.
I Strukturdiagrammet ser det ut som att man avses räkna och skriva ut det första genomsnittet innan man räknar och skriver ut det andra, så jag hoppas att det är ok att jag inte riktigt gjorde det i den ordningen. Jag tyckte att det kändes
mycket mer praktiskt att räkna ihop resultaten först och sedan skriva ut båda på en gång.
*/

if (a1 > 1) {
	m1 = g1 / a1;
	resultat1 = "Det finns " + a1 + "män som tillsammans har genomsnittsåldern " + m1 + " år och ";
	}
else if (a1 == 1)
	resultat1 = "Det finns en man som är " + g1 + " år gammal och";
else
	resultat1 = "Det finns inga män inom gruppen, men ";


if (a2 > 1) {
	m2 = g2 / a2;
	resultat2 = " det finns " + a2 + "kvinnor som tillsammans har genomsnittsåldern " + m2 + " år.";
	}
else if (a2 == 1)
	resultat2 = "det finns 1 kvinna som är " + g2 + " år gammal.";
else 
	resultat2 = " gruppen saknar kvinnor.";


JOptionPane.showMessageDialog(null, resultat1 + resultat2); //Här visas slutresultatet för användaren.



} //Här slutar if-satsen som går efter variabeln intros värde


	}
}

//På grund av dålig tidsplanering så kommer jag antagligen inte hinna göra A-uppgiften. God jul!