/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import modele.Courriel;

/**
 *
 * @author sio2
 */
public class CourrielTest {
    
    public static void main(String[] args){
        
        Courriel unCourriel = new Courriel(1, "2000-10-12", "Contact Professionnel", "rendez-vous pro le 24122000");
        System.out.println("le courriel du " + unCourriel.getDates() + " a pour objet " + unCourriel.getObjet());
    }
}
