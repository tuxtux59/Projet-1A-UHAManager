


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;


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
		tableau.add(zero);
		tableau.add(two);
		
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
		//On découpe le string date en jour date année grace au séparateur /
		String tab_last[] = tableau.get(tableau.size()-1).dateEvent.split("/");
		String tab_firstbefore[] = tableau.get(tableau.size()-2).dateEvent.split("/");
		//on affecte les vlaeurs des cellules des deux tableaux précédents aux valeurs qui vont bien
		int anneeDernierEvent =	Integer.parseInt(tab_last[2]);
		int anneeAvantDernierEvent =	Integer.parseInt(tab_firstbefore[2]);
		int moisDernierEvent =	Integer.parseInt(tab_last[1]);
		int moisAvantDernierEvent =	Integer.parseInt(tab_firstbefore[1]);
		int jourDernierEvent =	Integer.parseInt(tab_last[0]);
		int jourAvantDernierEvent =	Integer.parseInt(tab_firstbefore[0]);
		//duree entre deux evenement calculée en jour
		float duree=(float) (((anneeDernierEvent-anneeAvantDernierEvent)*365.25)+((moisDernierEvent-moisAvantDernierEvent)*30)+(jourDernierEvent-jourAvantDernierEvent));
		System.out.println(duree);
		//evolution journaliere sur la duree estimee precedemment
		float esperancejour=moy/duree;
		float esperancedemain=(tableau.get(tableau.size()-1).eventMontant+esperancejour);
		float esperancemois=(tableau.get(tableau.size()-1).eventMontant+(30*esperancejour));
		System.out.println(esperancejour+"€/jour");
		System.out.println("solde estimé pour demain: "+esperancedemain+"€");
		System.out.println("solde estimé pour dans un mois: "+esperancemois+"€");
		//calcul "camembert"
		int l,m=0;
		ArrayList<Tab> tabtiers = new ArrayList<Tab>();
		for(l=0;l<tableau.size()-1;l++){
			if(tableau.get(l).eventNom.equals(tableau.get(l+1).eventNom)){
				System.out.println("yes");
				tabtiers.get(m).tiers=tableau.get(l).eventNom;
				tabtiers.get(m).montant+=tableau.get(l+1).eventMontant;
			}
			System.out.println("Tiers"+tabtiers.get(l+1).tiers+" montant:"+tabtiers.get(l).montant);
		}
		
		//partie fenetre
		/*Fenetre fenetre = new Fenetre();
		Fenetre fenetre1 = new Fenetre(1);
		Fenetre fenetre2 = new Fenetre(2);
		Fenetre fenetre3 = new Fenetre(3);
		*/
		
		
		
		
	}

}
