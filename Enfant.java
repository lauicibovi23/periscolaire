
import java.util.*;

/**
 * 
 */
public class Enfant extends Personne{

    /**
     * Default constructor
     */
    public Enfant(int ns,String n, String p, Date d, String c, Parent premier) {
    	super(ns, n, p, d);
    	classe = c;
    	Parent1 = premier;
    }

    /**
     * 
     */
    private Parent Parent1;

    /**
     * 
     */
    private Parent Parent2;

    /**
     * 
     */
    private String classe;

    /**
     * 
     */
    private Parent parents;

    /**
     * 
     */
    private Periscolaire enfants;

    /**
     * @return
     */
    public Parent ajouterParent() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    String modifierClasse() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    Parent getParent() {
        // TODO implement here
        return null;
    }



}