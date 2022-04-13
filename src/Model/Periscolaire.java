package Model;

import java.util.*;

/**
 * 
 */
public class Periscolaire {

    private Vector<Parent> liste_parents = new Vector<Parent>();

    private Vector<Enfant> liste_enfants = new Vector<Enfant>();

    private Vector<Activite> liste_activites = new Vector<Activite>();

    private String nomEcole;

    /**
      Default constructor
     **/
    public Periscolaire(Parent p, Enfant e, String n) {
    	liste_parents.add(p);
    	liste_enfants.add(e);
    	setNomEcole(n);
    }


    /**
     ajout d'enfant
     **/
    Enfant ajouterEnfant(Enfant premier) {
        liste_enfants.add(premier);
        return premier;
    }

    /**
     * @return
     */
    void supprimerEnfant(Enfant enfant1) {
        if(liste_enfants.contains(enfant1)) {
        	liste_enfants.remove(enfant1);
        	System.out.println("ok");
        	
        }
        System.out.println("l'enfant n'existe pas");
    }

    /**
     * @return
     */
    Enfant consulterEnfant(String nom,String prenom) {
    	for (int i=0;i<liste_enfants.size();i++) {
    		(liste_enfants.get(i)).getEnfant(nom,prenom);
    	}
        return null;
    }

    /**
     * @return
     */

    /**
     * @return
     */
    void ajouterActivite(Activite b) {
        liste_activites.add(b);
    }

    /**
     * suppression d'activite
     */
    String supprimerActivite(Activite a) {
        if (liste_activites.contains(a)) {
        	liste_activites.remove(a);
        return "ok";
        }
        else return "l'élément n'existe pas";
    }


	/**
	 * @return the nomEcole
	 */
	public String getNomEcole() {
		return nomEcole;
	}

	/**
	 * @param nomEcole the nomEcole to set
	 */
	public void setNomEcole(String nomEcole) {
		this.nomEcole = nomEcole;
	}

	/**
	 * @return the liste_actives
	 */
	public Vector<Activite> getListe_actives() {
		return liste_activites;
	}

	/**
	 * @param liste_actives the liste_actives to set
	 */
	public void setListe_activites(Vector<Activite> liste_actives) {
		this.liste_activites = liste_actives;
	}

}