
import java.util.*;

/**
 * 
 */
public class Parent extends Personne {

    /**
     * Default constructor
     */
    public Parent(int ns,String n, String p, Date d, String m, int tel ) {
    	super(ns,n,p,d);
    	mail = m;
    	telephone = tel;
    	
    }

    /**
     * 
     */
    private String etat_matrimonial;

    /**
     * 
     */
    private String mail;

    /**
     * 
     */
    private int telephone;

    /**
     * 
     */
    private Double revenu_fiscal;

    /**
     * 
     */
    private Set<Enfant> enfants;



    /**
     * @param Enfant
     * @return 
     */
     Enfant ajouterEnfant(Enfant a) {
        // TODO implement here
    	return a; 
    }

    /**
     * @return
     */
     String modifierEtatCivil() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    String modifierMail() {
        // TODO implement here
    	
        return "";
    }

    /**
     * @return
     */
    int modifierTelephone(int t1) {
        // TODO implement here
    	telephone = t1;
        return telephone;
    }

    /**
     * @return
     */
    Parent getParent() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    Enfant afficherListeEnfant() {
        // TODO implement here
        return null;
    }

}