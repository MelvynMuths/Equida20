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
public class Lieu {
    private int id ;
    private String ville ;
    private int nbBoxes ;
    private String Commentaires ;
    private ArrayList<Vente> lesVentes ;

    public Lieu() {
    }

    public Lieu(int id, String ville, int nbBoxes, String Commentaires) {
        this.id = id;
        this.ville = ville;
        this.nbBoxes = nbBoxes;
        this.Commentaires = Commentaires;
    }

    
    public Lieu(int id, String ville, int nbBoxes, String Commentaires, ArrayList<Vente> lesVentes) {
        this.id = id;
        this.ville = ville;
        this.nbBoxes = nbBoxes;
        this.Commentaires = Commentaires;
        this.lesVentes = lesVentes;
    }

    public int getId() {
        return id;
    }

    public String getVille() {
        return ville;
    }

    public int getNbBoxes() {
        return nbBoxes;
    }

    public String getCommentaires() {
        return Commentaires;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setNbBoxes(int nbBoxes) {
        this.nbBoxes = nbBoxes;
    }

    public void setCommentaires(String Commentaires) {
        this.Commentaires = Commentaires;
    }

    public ArrayList<Vente> getLesVentes() {
        return lesVentes;
    }

    public void setLesVentes(ArrayList<Vente> lesVentes) {
        this.lesVentes = lesVentes;
    }
    
    public void addVente(Vente Vente){
        if (lesVentes == null){
            lesVentes = new ArrayList<Vente>();
        }
        lesVentes.add(Vente);
    }
    
    
}
