package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    public Activite(String nom, String d,int n, Encadrant e) {
    	nom_activite = nom;
    	SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd"); 
		try {
			date = dt.parse(d);
		} catch (ParseException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		} 
    	nombre_enfant = n;
    	prof =e;
    		
    }
    public int getNombre_enfant() {
		return nombre_enfant;
	}

	public void setNombre_enfant(int nombre_enfant) {
		this.nombre_enfant = nombre_enfant;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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