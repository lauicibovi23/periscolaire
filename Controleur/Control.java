package Controleur;
//ajout des class n�cessaires 
import Model.*;
import Vue.*;
import java.awt.event.*;

public class Control {
	private Mairie maMairie;
	private TestView maVue;
	
	public Control(Mairie maMairie,TestView maVue) {
		this.maMairie = maMairie;
	    this.maVue = maVue;
	    //lectur de l'�v�nement
	    this.maVue.addQuotientListener(new ControlListener());
	    	
	}
	     
	
	
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
	
}
