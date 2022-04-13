package Model;

import java.util.*;

/**
 * 
 */
public class Encadrant extends Personne {

    private int telephone;

    private  String mail;

    /**
     * Default constructor
     */
    public Encadrant(int ns,String n, String p, String d, int tel, String m ) {
    	super(ns, n, p, d);
    	telephone = tel;
    	mail = m;
    	
    }
    String getMail(String m) {
    	return mail;
    }
    String setMail(String m) {
    	mail = m;
    	return mail;
    }
    
    int getTel (int t){
    	telephone = t;
    	return telephone;
    }
    
    int modifierTel(int t) {
    	telephone = t;
    	return telephone;
    }
    
    


}