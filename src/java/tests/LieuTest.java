/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import modele.Lieu;

/**
 *
 * @author sio2
 */
public class LieuTest {
    
    public static void main(String[] args) {
        
        Lieu unLieu = new Lieu(1, "Tarbes", 8, "Sympa");
        
        System.out.println(unLieu.getVille() + " est une ville qui possede " + unLieu.getNbBoxes() + "boxes");
        
        
    }
}
