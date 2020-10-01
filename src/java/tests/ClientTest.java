/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import modele.CategVente;
import modele.Client;
import modele.Pays;

/**
 *
 * @author Zakina
 */
public class ClientTest {
    
    public static void main(String[] args) {
        
        Client unClient = new Client(1, "dupont", "luc", "","65000", "Tarbes", "luc.dupont@gmail.com");
        unClient.setUnPays(new Pays("FRA", "FRANCE"));    
        System.out.println(unClient.toString());
        System.out.println(unClient.getNom() + "  " + unClient.getUnPays().getNom());
        
        CategVente uneCategVente1 = new CategVente("AUT", "Vente d'automne");
        CategVente uneCategVente2 = new CategVente("EUR", "Grande vente Europeen");
        CategVente uneCategVente3 = new CategVente("VMC", "Vente Mondiale de Carpiquet");
        
        unClient.addUneCategVente(uneCategVente1);
        unClient.addUneCategVente(uneCategVente2);
        unClient.addUneCategVente(uneCategVente3);
        System.out.println("le client est interessé par " + unClient.getNbCategVente() + " categorie de vente");
    }
    
}
