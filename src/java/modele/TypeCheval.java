/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;

/**
 *
 * @author sio2
 */
public class TypeCheval {
    private int id;
    private String Libelle;
    private String Description;
    private ArrayList<Cheval> lesCheval;

    public TypeCheval() {
    }

    public TypeCheval(int id, String Libelle, String Description) {
        this.id = id;
        this.Libelle = Libelle;
        this.Description = Description;
    }

    public TypeCheval(int id, String Libelle, String Description, ArrayList<Cheval> lesCheval) {
        this.id = id;
        this.Libelle = Libelle;
        this.Description = Description;
        this.lesCheval = lesCheval;
    }
    

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return Libelle;
    }

    public String getDescription() {
        return Description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String Libelle) {
        this.Libelle = Libelle;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ArrayList<Cheval> getLesCheval() {
        return lesCheval;
    }

    public void setLesCheval(ArrayList<Cheval> lesCheval) {
        this.lesCheval = lesCheval;
    }
    
    public void addCheval(Cheval Cheval){
        if(lesCheval == null){
           lesCheval = new ArrayList<Cheval>();
        }
        lesCheval.add(Cheval);
    }
}
