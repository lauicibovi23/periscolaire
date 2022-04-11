package Model;

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
    protected Personne(int ns,String n, String p, Date d ) {
    	numero_secu = ns;
    	nom = n;
    	prenom = p;
    	date_de_naissance = d;
    	profession = "";
    }
    /* second constructeur avec moins d'information pour pouvoir l'utiliser à la mairie*/
    protected Personne(String n, String p, Date d ) {
    	nom = n;
    	prenom = p;
    	date_de_naissance = d;
    	profession = "";
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