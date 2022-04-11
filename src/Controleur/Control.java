package Controleur;
//ajout des class nécessaires 
import Model.*;
import Vue.*;
import java.awt.event.*;

public class Control {
	private Mairie maMairie;
	private TestView maVue;
	
	public Control(Mairie maMairie,TestView maVue) {
		this.maMairie = maMairie;
	    this.maVue = maVue;
	    //lectur de l'événement
	    this.maVue.addQuotientListener(new ControlListener());
	    	
	}
	     
	
	
	class ControlListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String situation;
			int nbre_enfants;
			float revenu_familial;
			float montant;
			
			//recupération des entrées de la vue
			try {
				situation =maVue.getValeurOption(); 
				nbre_enfants = Integer.parseInt(maVue.getNbre_Enfant());
				revenu_familial = Integer.parseInt(maVue.getRevenu());
				
			//Calcul du quotient	
				montant = maMairie.quotientFamiliale(situation,nbre_enfants,revenu_familial);
				
			//Transmission du résultat à la vue
				maVue.setSolution("Le montant de votre quotient familiale est de "+montant);
				
				
			}
			
			catch(NumberFormatException messageError) {
				maVue.displayErrorMessage("Vous devez rentrez toutes les informations demandées");
			}
		}
	}
	
}
