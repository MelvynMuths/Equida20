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
public class Cheval {
    private int id;
    private String nom;
    private String sexe;
    private String nSiret;
    private String ddn;
    private TypeCheval unTypeCheval;
    private ArrayList<Lot> lesLot;
    private ArrayList<Client> lesClient;
    private Client unClient;
    private Cheval Pere;
    private Cheval Mere;

    public Cheval() {
    }

    public Cheval(int id, String sexe, String nSiret, String ddn, Cheval Pere, Cheval Mere) {
        this.id = id;
        this.sexe = sexe;
        this.nSiret = nSiret;
        this.ddn = ddn;
        this.Pere = Pere;
        this.Mere = Mere;
    }

    public Cheval(int id, String nom, String sexe, String nSiret, String ddn, TypeCheval unTypeCheval, ArrayList<Lot> lesLot, ArrayList<Client> lesClient, Client unClient, Cheval Pere, Cheval Mere) {
        this.id = id;
        this.nom = nom;
        this.sexe = sexe;
        this.nSiret = nSiret;
        this.ddn = ddn;
        this.unTypeCheval = unTypeCheval;
        this.lesLot = lesLot;
        this.lesClient = lesClient;
        this.unClient = unClient;
        this.Pere = Pere;
        this.Mere = Mere;
    }

    
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getSexe() {
        return sexe;
    }

    public String getnSiret() {
        return nSiret;
    }

    public String getDdn() {
        return ddn;
    }   

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setnSiret(String nSiret) {
        this.nSiret = nSiret;
    }

    public void setDdn(String ddn) {
        this.ddn = ddn;
    }

    public TypeCheval getUnTypeCheval() {
        return unTypeCheval;
    }

    public void setUnTypeCheval(TypeCheval unTypeCheval) {
        this.unTypeCheval = unTypeCheval;
    }

    public ArrayList<Lot> getLesLot() {
        return lesLot;
    }

    public void setLesLot(ArrayList<Lot> lesLot) {
        this.lesLot = lesLot;
    }
    
    public void addLot(Lot Lot){
        if(lesLot == null){
           lesLot = new ArrayList<Lot>();
        }
        lesLot.add(Lot);
    }

    public ArrayList<Client> getLesClient() {
        return lesClient;
    }

    public void setLesClient(ArrayList<Client> lesClient) {
        this.lesClient = lesClient;
    }
    
    public void addClient(Client Client){
        if(lesClient == null){
            lesClient = new ArrayList<Client>();
        }
        lesClient.add(Client);
    }

    public Client getUnClient() {
        return unClient;
    }

    public void setUnClient(Client unClient) {
        this.unClient = unClient;
    }

    public Cheval getPere() {
        return Pere;
    }

    public Cheval getMere() {
        return Mere;
    }

    public void setPere(Cheval Pere) {
        this.Pere = Pere;
    }

    public void setMere(Cheval Mere) {
        this.Mere = Mere;
    }
    
}
