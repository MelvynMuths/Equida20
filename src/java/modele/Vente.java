/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;

/**
 *
 * @author Zakina
 */
public class Vente {
    private int id;
    private String nom;
    private String dateDebutVente;
    private Lieu unLieu ;
    private CategVente uneCategVente;
    private ArrayList<Courriel> unCourriel ;
    private ArrayList<Lot> lesLot;
    
    public Vente() {
    }

    public Vente(int id, String nom, String dateDebutVente) {
        this.id = id;
        this.nom = nom;
        this.dateDebutVente = dateDebutVente;
    }

    public Vente(int id, String nom, String dateDebutVente, Lieu unLieu, CategVente uneCategVente, ArrayList<Courriel> unCourriel, ArrayList<Lot> lesLot) {
        this.id = id;
        this.nom = nom;
        this.dateDebutVente = dateDebutVente;
        this.unLieu = unLieu;
        this.uneCategVente = uneCategVente;
        this.unCourriel = unCourriel;
        this.lesLot = lesLot;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDateDebutVente() {
        return dateDebutVente;
    }

    public void setDateDebutVente(String dateDebutVente) {
        this.dateDebutVente = dateDebutVente;
    }

    public CategVente getUneCategVente() {
        return uneCategVente;
    }

    public void setUneCategVente(CategVente uneCategVente) {
        this.uneCategVente = uneCategVente;
    }

    public Lieu getUnLieu() {
        return unLieu;
    }

    public void setUnLieu(Lieu unLieu) {
        this.unLieu = unLieu;
    }

    public ArrayList<Courriel> getUnCourriel() {
        return unCourriel;
    }

    public void setUnCourriel(ArrayList<Courriel> unCourriel) {
        this.unCourriel = unCourriel;
    }
    
    public void addUnCourriel(Courriel lesCourriel){
        if(unCourriel == null){
            unCourriel = new ArrayList<Courriel>();
        }
        unCourriel.add(lesCourriel);
    }

    public void setUnLieuVente(Lieu unLieu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Lot> getLesLot() {
        return lesLot;
    }

    public void setLesLot(ArrayList<Lot> LesLot) {
        this.lesLot = lesLot;
    }
    
    public void addLot(Lot Lot){
        if(lesLot == null){
           lesLot = new ArrayList<Lot>();
        }
        lesLot.add(Lot);
    }
}
