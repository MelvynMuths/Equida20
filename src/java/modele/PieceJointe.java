/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author sio2
 */
public class PieceJointe {
    private int id;
    private String Chemin;
    private String Description;

    public PieceJointe(int id, String Chemin, String Description) {
        this.id = id;
        this.Chemin = Chemin;
        this.Description = Description;
    }

    public PieceJointe() {
    }

    public int getId() {
        return id;
    }

    public String getChemin() {
        return Chemin;
    }

    public String getDescription() {
        return Description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setChemin(String Chemin) {
        this.Chemin = Chemin;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    
}
