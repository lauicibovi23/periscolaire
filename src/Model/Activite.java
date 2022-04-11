package Model;

import java.util.*;

/**
 * 
 */
public class Activite  {

    private String nom_activite;

    private int nombre_enfant;

    private Date date;

    private Encadrant prof;
    
    /**
     * Default constructor
     */
    public Activite(String nom, Date d,int n, Encadrant e) {
    	nom_activite = nom;
    	date = d;
    	nombre_enfant = n;
    	prof =e;
    		
    }

    String modifierNom(String n) {
    	nom_activite = n;
        return nom_activite;
    }

    /**
     * @return
     */
    int modifierNombre(int n) {
    	nombre_enfant = n;
        return nombre_enfant;
    }

    /**
     * @return
     */
    Date modifierDate(Date d) {
        date = d;
        return date;
    }

    /**
     * @return
     */
    public Encadrant modifierProf(Encadrant e) {
        prof = e;
        return prof;
    }

    /**
     * @return
     */
    public Encadrant getProf() {
        return this.prof;
    }

}