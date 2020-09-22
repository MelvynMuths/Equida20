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
public class Lot {
    private int id;
    private String PrxDepart;
    private Vente uneVente;
    private Cheval unCheval;
    

    public Lot() {
    }

    public Lot(int id, String PrxDepart) {
        this.id = id;
        this.PrxDepart = PrxDepart;
    }

    public Lot(int id, String PrxDepart, Vente uneVente, Cheval unCheval) {
        this.id = id;
        this.PrxDepart = PrxDepart;
        this.uneVente = uneVente;
        this.unCheval = unCheval;
    }

    

    public int getId() {
        return id;
    }

    public String getPrxDepart() {
        return PrxDepart;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrxDepart(String PrxDepart) {
        this.PrxDepart = PrxDepart;
    }

    public Cheval getUnCheval() {
        return unCheval;
    }

    public void setUnCheval(Cheval unCheval) {
        this.unCheval = unCheval;
    }

    public Vente getUneVente() {
        return uneVente;
    }

    public void setUneVente(Vente uneVente) {
        this.uneVente = uneVente;
    }

    public void setUneVente(CategVente uneCateg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
