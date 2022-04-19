package Model;

import java.util.*;

/**
 * 
 */
public class Mairie {
   private String nom;

    private String adresse;

    private Vector<Activite> liste_activites;

    private Vector<Periscolaire> liste_ecoles;

    private Vector<Parent> liste_parents;

    /**
     * Default constructor
     */
    public Mairie(String n, String a) {
    	nom = n;
    	adresse = a;
    	liste_activites = new Vector<Activite>();
    	liste_ecoles= new Vector<Periscolaire>();
    	liste_parents= new Vector<Parent>();
    	
    }


    /**
     * @return
     */
    String getNom() {
    	return nom;
    }
    
    String getAdresse() {
    	return adresse;
    }
    
    void modifierAdressse(String a) {
    	adresse = a;
    }
    
    void afficherListeEcole() {
        for(int i=0; i<liste_ecoles.size();i++) {
        	System.out.println(liste_ecoles.get(i));
        }
       
    }

    /**
     * @return
     */
    void afficherListeActivite() {
    	for(int i=0; i<liste_activites.size();i++) {
        	System.out.println(liste_activites.get(i));
        }
    }

    /**
     * @return
     */
    void afficherListeParent() {
    	for(int i=0; i<liste_parents.size();i++) {
        	System.out.println(liste_parents.get(i));
        }
      
    }
    /*
    public Parent rechercherParent(String email) {
    	for(int i=0; i<liste_parents.size();i++) {
        	if((liste_parents.get(i)).getParent(email)) {
        		
        	}
        }
    }
    */

    /**
     * @return
     */
    Personne ajouterParent(Parent a) {
        liste_parents.add(a);
        return a;
    }

    /**
     * @return
     */
    Activite ajouterActivite(Activite x) {
        liste_activites.add(x);
        return x ;
    }

    /**
     * @return
     */
    Periscolaire AjouterEcole(Periscolaire x) {
        liste_ecoles.add(x);
        return x;
    }

    /**
     calcul du quotient familiale 
     */
    public float quotientFamiliale(String situation,int nbre_enfants, float revenu_familial ) {
    	//float revenu_imposable = (revenu_familial/12);
    	float qf=0;
    	int n =0;
    	
    	//verification de la situation matrimoniale avant calcul
    	if(situation == "Marié")
    	{
    		//les caculs pour les couples
    	
    		if (nbre_enfants==1) {
    			qf= (float) (revenu_familial/2.5);
    		}
    		else if(nbre_enfants==2){
    			n=3;
    			qf=(revenu_familial/n);
    		}
    		else if(nbre_enfants>3){
    			n= nbre_enfants +1;
    			qf=(revenu_familial/n);
    		}
    		return qf;
    	}
    	//calcul pour les celibataires, divorcés etc...
    	else {
    		if (nbre_enfants==1) {
    			qf= (float) (revenu_familial/1.5);
    		}
    		else {
    			n= nbre_enfants;
    			qf=(revenu_familial/n);
    		}
    		
    		return qf;
    	}
    }

    /**
     * Fonction pour s'inscrire à la mairie
     */
    void SignUp(String nomParent, String prenomParent, String mail, String motDepasse) {
    	
    }
    

    /**
     * Pour se connecter
    */
    public boolean login(String mail, String mdp) {
    	boolean autorisation_connexion = false;
    	if(!this.liste_parents.isEmpty()){
    		for (var parent: this.liste_parents) {
    			if (parent.getMail() == mail && parent.getMotDePasse() == mdp) {
    				autorisation_connexion = true;
    			}
    		}
    	}
        return autorisation_connexion;
    }
    //recupérer les information d'un parent
    public Parent informationParent(String mail, String mdp) {
    	if(login(mail,mdp)) {
    		for (var parent: this.liste_parents) {
    			if (parent.getMail() == mail && parent.getMotDePasse() == mdp) {
    				return parent;
    			}
    	}
    }
    	return null;
    }
}
