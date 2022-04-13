package Controleur;
//ajout des class n�cessaires 
import Model.*;
import Vue.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class Control {
	private Mairie maMairie;
	private TestView maVue;
	private LogIn login;
	
	public Control(Mairie maMairie,TestView maVue, LogIn login) {
		this.maMairie = maMairie;
	    this.maVue = maVue;
	    this.login = login;
	    //lecture de l'�v�nement
	    this.maVue.addQuotientListener(new ControlListener());
	    this.maVue.buttonListener(new OtherControlListener());
	    	
	}
	     
	
	// v�rification des entr�es utilisateurs
	class ControlListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String situation;
			int nbre_enfants;
			float revenu_familial;
			float montant;
			
			//recup�ration des entr�es de la vue
			try {
				situation =maVue.getValeurOption(); 
				nbre_enfants = Integer.parseInt(maVue.getNbre_Enfant());
				revenu_familial = Integer.parseInt(maVue.getRevenu());
				
			//Calcul du quotient	
				montant = maMairie.quotientFamiliale(situation,nbre_enfants,revenu_familial);
				
			//Transmission du r�sultat � la vue
				maVue.setSolution("Le montant de votre quotient familiale est de "+montant);
				
				
			}
			
			catch(NumberFormatException messageError) {
				maVue.displayErrorMessage("Vous devez rentrez toutes les informations demand�es");
			}
		}
	}
	//diff�rencier les 2 class servant d'�coute pour les boutons
	class OtherControlListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try {
				 
				login.setVisible(true);
			}
			catch(NumberFormatException messageError){
				maVue.displayErrorMessage("Erreur Transmission Page, veuillez contacter l'ADMIN");
			}
		}
	}
	
}
