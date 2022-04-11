package Model;
import Vue.TestView;
import Controleur.Control;
public class Main {

	public static void main(String[] args) {
		// Création de Fenetre et d'une Mairie
		 TestView theView = new TestView();
		 theView.setVisible(true);
		 theView.setLocationRelativeTo(null);
		 Mairie maMairie= new Mairie("Mairie","Evry");
		 
		 
		 Control quotient= new Control(maMairie,theView);
		// theView.pack();
	}

}
