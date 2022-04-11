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

    private Vector<Enfant> enfants = new Vector<Enfant>();
    


	
    /**
     * Default constructor
     */
    public Parent(int ns,String n, String p, Date d, String m, int tel ) {
    	super(ns,n,p,d);
    	mail = m;
    	telephone = tel;
    	etat_matrimonial = "Celibataire";
    	revenu_fiscal = 0;
    }
    public Parent(String nomParent, String prenomParent,Date d, String email ) {
    	super(nomParent,prenomParent,d);
    	mail = email;
    	etat_matrimonial = "";
    	revenu_fiscal = 0;
    }
    
    

    
    /**
     * @param Enfant
     * @return 
     */
     public Enfant ajouterEnfant(Enfant a) {
        // TODO implement here
    	 enfants.add(a);
    	return a; 
    }
     
     

    /**
     * @return
     */
     String modifierEtatMatrimonial(String etat) {
    	 etat_matrimonial = etat;
    	 
        return etat_matrimonial;
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
   public void afficherListeEnfant() {
    	System.out.println("Les enfants de " +this.nom+ "" +this.prenom +"  sont: ");
   	 	for (int i = 0; i < enfants.size(); i++ ) {
   	 		System.out.println(enfants.get(i));
   	 	}
    }
  

}