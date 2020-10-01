/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import modele.Courriel;
import modele.Vente;

/**
 *
 * @author sio2
 */
public class VenteText {
    
    public static void main(String[] args){
        
        Vente uneVente = new Vente(48652, "Vente international", "10-01-2021");
        System.out.println("la vente " + uneVente.getNom() + " ce deroule le " + uneVente.getDateDebutVente() );
        
        Courriel unCourriel1 = new Courriel(1, "10/10/2020", "Vente exceptionnel le 10 janvier 2022", "");
        Courriel unCourriel2 = new Courriel(2, "18/12/2020", "La vente International approche !!", "");
        
        uneVente.addUnCourriel(unCourriel1);
        uneVente.addUnCourriel(unCourriel2);
        System.out.println("Pour la vente du " + uneVente.getDateDebutVente() + " " +uneVente.getNbCourriel() + " mail on etait envoyer.");
    } 
            
            
            
}
