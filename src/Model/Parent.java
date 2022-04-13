package Model;


import java.util.*;

/**
 * 
 */
public class Parent extends Personne {


	/**
	 * 
	 */
	private String etat_matrimonial;

	private String mail;

	private int telephone;

	private int revenu_fiscal;

	private String motDePasse;

	private Vector<Enfant> enfants = new Vector<Enfant>();




	/**
	 * Constructeurs
	 */
	public Parent(int ns,String n, String p, String d, String m, int tel ) {
		super(ns,n,p,d);
		mail = m;
		telephone = tel;
		etat_matrimonial = "Celibataire";
		revenu_fiscal = 0;
	}
	public Parent(String nomParent, String prenomParent,String d, String email, String mdp ) {
		super(nomParent,prenomParent,d);
		mail = email;
		motDePasse = mdp;
		etat_matrimonial = "";
		revenu_fiscal = 0;
	}




	/**
	 * @param Enfant
	 * @return 
	 */
	public Enfant ajouterEnfant(Enfant a) {
		enfants.add(a);
		return a; 
	}



	/**
	 * modification de l'état matrimonial(Marié, Celibataire etc...)
	 */
	String modifierEtatMatrimonial(String etat) {
		etat_matrimonial = etat;

		return etat_matrimonial;
	}

	public String getMail() {
		return mail;
	}

	/**
     Modification  mail
	 **/
	String modifierMail(String m) {
		mail = m;
		return mail;
	}

	/**
    Modification Telephone
	 **/
	int modifierTelephone(int t1) {
		telephone = t1;
		return telephone;
	}

	/**

	 **/
	Parent getParent(int n_secu) {
		if (n_secu == numero_secu) {
			return this;
		}

		return null;
	}
	Parent getParent(String email) {
		if (this.mail == email) {
			return this;
		}

		return null;
	}


	/**
	 * @return
	 */

	int modifierRevenu(int r) {
		revenu_fiscal = r;
		return revenu_fiscal;


	}

	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public void afficherListeEnfant() {
		System.out.println("Les enfants de " +this.nom+ "" +this.prenom +"  sont: ");
		for (int i = 0; i < enfants.size(); i++ ) {
			System.out.println(enfants.get(i));
		}
	}



}