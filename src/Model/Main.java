package Model;
import Vue.ConnexionInscription;
import Vue.InfoProfil;
import Vue.LogIn;
import Vue.SignIn;
import Vue.TestView;
import Controleur.Control;
import Controleur.ControlConnexion;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		// Création des Fenetre et d'une Mairie
		
		 TestView theView = new TestView("Quotient Familial");
		 LogIn login = new LogIn();
		 InfoProfil monProfil = new InfoProfil();
		 ConnexionInscription maVue = new ConnexionInscription();
		 theView.setVisible(true);
		 
		 Mairie maMairie= new Mairie("Mairie","Evry");
		 
		 Parent ibovi = new Parent("IBOVI","Lauic","2000-04-23","lolo@gmail.com","1234");
		 maMairie.ajouterParent(ibovi);
		 System.out.println(ibovi.getDate_de_naissance());
		
		 
		 
		 Control quotient= new Control(maMairie,theView,login);
		 System.out.println(login.getMdpasse());		; 
		 ControlConnexion connexion= new ControlConnexion(login,monProfil);
		 
		 theView.setVisible(true);
		
	}

}
;