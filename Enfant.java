
import java.util.*;

/**
 * 
 */
public class Enfant extends Personne{

	private String nom;
	
	private String prenom;
	
    private String classe;

    private Vector<Parent> parents = new Vector<Parent>();

    /**
     * Default constructor
     * on considère que un enfant à au moins un parent dans sa liste de parents
     */
    public Enfant(int ns,String n, String p, Date d, String c, Parent responsable) {
    	super(ns, n, p, d);
    	classe = c;
    	parents.add(responsable);
    	
    }


    /**
     * @return
     */
    Parent ajouterParent(Parent a) {
    	parents.add(a);
        return a;
    }

    /**
     * @return
     */
    String modifierClasse(String c) {
    	classe = c;
        return classe;
    }

    /**
     * @return
     */
    Parent getParent(int n) {
        for(int i =0; i<parents.size(); i++) {
        	(parents.get(i)).getParent(n);
        }
        return null;
    }
    
    Enfant getEnfant(String nom,String prenom) {
    	if (nom==this.nom && prenom == this.prenom) {
    		return this;
    	}
    	else return null;
    }



}