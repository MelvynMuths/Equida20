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
public class Courriel {
    private int id;
    private String dates;
    private String objet;
    private String Corps;
    private Vente unVente;
    private ArrayList<PieceJointe> lesPieceJointe ;

    public Courriel() {
    }

    public Courriel(int id, String dates, String objet, String Corps) {
        this.id = id;
        this.dates = dates;
        this.objet = objet;
        this.Corps = Corps;
    }

    public Courriel(int id, String dates, String objet, String Corps, Vente unVente, ArrayList<PieceJointe> lesPieceJointe) {
        this.id = id;
        this.dates = dates;
        this.objet = objet;
        this.Corps = Corps;
        this.unVente = unVente;
        this.lesPieceJointe = lesPieceJointe;
    }

    public int getId() {
        return id;
    }

    public String getDates() {
        return dates;
    }

    public String getObjet() {
        return objet;
    }

    public String getCorps() {
        return Corps;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public void setCorps(String Corps) {
        this.Corps = Corps;
    }

    public Vente getUnVente() {
        return unVente;
    }

    public void setUnVente(Vente unVente) {
        this.unVente = unVente;
    }
    
    public ArrayList<PieceJointe> getLesPieceJointe() {
        return lesPieceJointe;
    }

    public void setLesPieceJointe(ArrayList<PieceJointe> lesPieceJointe) {
        this.lesPieceJointe = lesPieceJointe;
    }
    
    public void addUnePieceJointe(PieceJointe unePieceJointe){
        if(lesPieceJointe == null){
            lesPieceJointe = new ArrayList<PieceJointe>();
        }
        lesPieceJointe.add(unePieceJointe);
    }
    
}
