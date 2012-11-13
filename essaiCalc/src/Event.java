
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;


public class Event {
	String eventNom;
	float eventMontant;
	String dateEvent;
	String positive;
	//Gestion de l'Heure
	Locale locale = Locale.getDefault();
	DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
	//Gestion de l'affichage
	DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
	

	public Event(){
		
		eventNom="Nouvel Element";
		eventMontant=0;
		dateEvent= dateFormat1.format(System.currentTimeMillis());
		positive="crédit";

	}
	public Event(String Libelle,float montant,String date){
		eventNom=Libelle;
		eventMontant= montant;
		dateEvent=date;
		if(montant>=0){
			positive="crédit";
		}else{
			positive="débit";
		}
		
		
	}
	
	

}
