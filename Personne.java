
import java.util.*;

/**
 * 
 */
public class Personne {

    protected int numero_secu;

    protected String nom;

    protected String prenom;

    protected Date date_de_naissance;

    protected String profession;
    /**
     * Default constructor
     */
    protected Personne(int ns,String n, String p, Date d ) {
    	numero_secu = ns;
    	nom = n;
    	prenom = p;
    	date_de_naissance = d;
    	profession = "";
    }



    public void modifierPrenom(String p) {
        // TODO implement here
    	prenom = p;
    }

    /**
     * @return
     */
    public void modifierNom(String n) {
        // TODO implement here
        nom = n;
    }

    /**
     * @return
     */
    public Personne getInformation(int nsecu) {
        // TODO implement here
    	if (nsecu == numero_secu) {
    		return this;
    	}
        return null;
    }

}