package Controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Model.Mairie;
import Model.Parent;
import Vue.InfoProfil;
import Vue.LogIn;
import Vue.SignIn;

public class ControlConnexion {
	private String email;
	private String mdp;
	private Mairie maMairie;
	private LogIn monLogin;
	private InfoProfil monProfil;
	private Parent parentOnline;

	public ControlConnexion(LogIn login,InfoProfil profil) {
		this.monLogin = login;
		monProfil = profil;
			try{
				this.email = login.getmail();
				this.mdp = login.getMdpasse();
		
				this.monLogin.otherListener(new ConnexionListener());
				this.monLogin.signUpListen(new SignUpListener());
			}
			catch(NumberFormatException messageError){
				System.out.println(messageError);
			}
		}
		
		

	
	//lecture de l'événement
	// vérification des entrées utilisateurs

	class ConnexionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try {
				if(maMairie.login(email,mdp)) {
					JFrame frame = new JFrame("showMessageDialog");
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					JOptionPane.showMessageDialog(frame, "vous êtes connecté", "Successfull", JOptionPane.INFORMATION_MESSAGE);
					//monProfil.setVisible(true);
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
