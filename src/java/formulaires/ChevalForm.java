/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulaires;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import modele.CategVente;
import modele.Cheval;

/**
 *
 * @author sio2
 */
public class ChevalForm {
       
    private String resultat;
    private Map<String, String> erreurs      = new HashMap<String, String>();

    public String getResultat() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }

    public void setErreurs(Map<String, String> erreurs) {
        this.erreurs = erreurs;
    }
    
    //méthode de validation du champ de saisie nom
    private void validationNom( String Nom ) throws Exception {
        if ( Nom != null && Nom.length() < 3 ) {
        throw new Exception( "le Nom d'un cheval doit contenir au moins 3 caractères." );
        }
    }

    private void setErreur( String champ, String message ) {
    erreurs.put(champ, message );
    }    
    
    private static String getDataForm( HttpServletRequest request, String nomChamp ) {
        String valeur = request.getParameter( nomChamp );
        if ( valeur == null || valeur.trim().length() == 0 ) {
            return null;
        } else {
            return valeur.trim();
        }   
    }
    
    
    public Cheval ajouterCheval( HttpServletRequest request ) {
      
        Cheval unCheval= new Cheval();
         
        
        String Nom = getDataForm( request, "Nom");
        String Sexe = getDataForm( request, "Sexe");
        String nSiret = getDataForm( request, "nSiret");
        try {
             validationNom( Nom );
        } catch ( Exception e ) {
            setErreur( "Nom", e.getMessage() );
        }
        unCheval.setNom(Nom);

        if ( erreurs.isEmpty() ) {
            resultat = "Succès de l'ajout.";
        } else {
            resultat = "Échec de l'ajout.";
        }
         
      
        unCheval.setSexe(Sexe);
        unCheval.setnSiret(nSiret);
       
               
       
        return unCheval;
    }
    
    
    

} 

