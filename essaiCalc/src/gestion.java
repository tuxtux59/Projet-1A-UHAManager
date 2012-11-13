import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.*;


/**
 * 
 */

/**
 * @author Tibo
 *
 */
public class gestion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Gestion de l'Heure
		Locale locale = Locale.getDefault();
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
		//Gestion de l'affichage
		DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
		//création du tableau
		ArrayList<Event> tableau = new ArrayList<Event>();
		//création des elements
		Event zero = new Event();
		long a = new java.util.Date().getTime();
		String b =dateFormat1.format(a);
		Event two =new Event("toto",-45,"25/10/2015");
		//ajout des elements au tableau
		
		tableau.add(two);
		tableau.add(zero);
		tableau.add(two);
		//affichage du tableau
		int i;
		
		
		for(i=0;i<tableau.size();i++){
			
			System.out.println("Date Evenement: "+tableau.get(i).dateEvent+" | Libellé : "+tableau.get(i).eventNom+" | Montant :"+tableau.get(i).eventMontant+"€ Nature: "+tableau.get(i).positive);
		}
		
		System.out.println("Taille : "+tableau.size());
		//calcul de l'esperance des deux dernieres valeurs
		float moy=(tableau.get(tableau.size()-1).eventMontant)-(tableau.get(tableau.size()-2).eventMontant);
		System.out.println(moy+"€");
		int k;
		String tab_last[] = tableau.get(tableau.size()-1).dateEvent.split("/");
		String tab_firstbefore[] = tableau.get(tableau.size()-2).dateEvent.split("/");
		
		int anneeDernierEvent =	Integer.parseInt(tab_last[2]);
		int anneeAvantDernierEvent =	Integer.parseInt(tab_firstbefore[2]);
		int moisDernierEvent =	Integer.parseInt(tab_last[1]);
		int moisAvantDernierEvent =	Integer.parseInt(tab_firstbefore[1]);
		int jourDernierEvent =	Integer.parseInt(tab_last[0]);
		int jourAvantDernierEvent =	Integer.parseInt(tab_firstbefore[0]);
		float duree=(float) (((anneeDernierEvent-anneeAvantDernierEvent)*365.25)+((moisDernierEvent-moisAvantDernierEvent)*30)+(jourDernierEvent-jourAvantDernierEvent));
		System.out.println(duree);
		float esperancejour=moy/duree;
		float esperancedemain=(tableau.get(tableau.size()-1).eventMontant+esperancejour);
		float esperancemois=(tableau.get(tableau.size()-1).eventMontant+(30*esperancejour));
		System.out.println(esperancejour+"€/jour");
		System.out.println("solde estimé pour demain: "+esperancedemain+"€");
		System.out.println("solde estimé pour dans un mois: "+esperancemois+"€");
		Fenetre fenetre = new Fenetre();
		Fenetre fenetre1 = new Fenetre(1);
		Fenetre fenetre2 = new Fenetre(2);
		Fenetre fenetre3 = new Fenetre(3);
		
		
		
		
		
	}

}
