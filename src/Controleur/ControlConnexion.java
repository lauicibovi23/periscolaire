package Controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Mairie;
import Vue.InfoProfil;
import Vue.LogIn;
import Vue.SignIn;

public class ControlConnexion {
	private String email;
	private String mdp;
	private Mairie maMairie;
	private LogIn monLogin;
	private InfoProfil monProfil;

	public ControlConnexion(LogIn login,InfoProfil profil) {
		this.monLogin = login;
		monProfil = profil;
		this.email = login.getmail();
		this.mdp = login.getMdpasse();
		
		this.monLogin.otherListener(new ConnexionListener());
		this.monLogin.signUpListen(new SignUpListener());
		

	}
	//lecture de l'événement
	// vérification des entrées utilisateurs

	class ConnexionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try {
				if(maMairie.login(email,mdp)) {
					
					monProfil.setVisible(true);
				}
			}	
			catch(NumberFormatException messageError){
				monLogin.displayErrorMessage("Les informations entrées sont incorrectes, veuillez vérifier vos informations ou Créer un compte");

			}

		}    	
	}
	class SignUpListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
				SignIn inscription = new SignIn();
				inscription.setVisible(true);
		}
	}


}
