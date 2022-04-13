package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 
 */
public class Personne {

	protected int numero_secu;

	protected String prenom;
	protected String nom;
	protected Date date_de_naissance;

	protected String profession;

	/**
	 * constructeur de personne 
	 */
	protected Personne(int ns,String n, String p, String d ) {
		numero_secu = ns;
		nom = n;
		prenom = p;
		//format de date exigé
		SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd"); 
		try {
			date_de_naissance = dt.parse(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		profession = "";
	}
	/* second constructeur avec moins d'information pour pouvoir l'utiliser à la mairie*/
	protected Personne(String n, String p, String d ) {
		nom = n;
		prenom = p;
		SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd"); 
		try {
			date_de_naissance = dt.parse(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		profession = "";
	}


	public Date getDate_de_naissance() {
		return date_de_naissance;
	}
	public void setDate_de_naissance(Date date_de_naissance) {
		this.date_de_naissance = date_de_naissance;
	}
	//getter et setter des variables
	public int getNumero_secu() {
		return numero_secu;
	}

	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Personne getInformation(int nsecu) {
		// TODO implement here
		if (nsecu == numero_secu) {
			return this;
		}
		return null;
	}

}