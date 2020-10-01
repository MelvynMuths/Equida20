package database;

import static database.ClientDAO.requete;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modele.CategVente;
import modele.Cheval;
import modele.Client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sio2
 */
public class ChevalDAO {
    
    Connection connection=null;
    static PreparedStatement requete=null;
    static ResultSet rs=null;
    
    /*public static ArrayList<Cheval>  getLesChevaux(Connection connection){      
        ArrayList<Cheval> lesChevaux = new  ArrayList<Cheval>();
        try
        {
            //preparation de la requete     
            requete=connection.prepareStatement("select * from cheval");
            
            //executer la requete
            rs=requete.executeQuery();
            
            //On hydrate l'objet métier Client avec les résultats de la requête
            while ( rs.next() ) {  
                Cheval unCheval = new Cheval();
                unCheval.setId(rs.getInt("ID"));
                unCheval.setNom(rs.getString("Nom"));
                lesChevaux.add(unCheval);
            }
        }   
        catch (SQLException e) 
        {
            e.printStackTrace();
            //out.println("Erreur lors de l’établissement de la connexion");
        }
        return lesChevaux ;    
    }*/
    public static Cheval ajouterCheval(Connection connection, Cheval unCheval){      
        int idGenere = -1;
        try
        {
            
            requete=connection.prepareStatement("INSERT INTO CHEVAL ( Nom, Sexe, nSiret, IDTypeCheval, IDClient, IDPere, IDMere)\n" +
                    "VALUES (?,?,?,?,?,?,?)", requete.RETURN_GENERATED_KEYS );
            requete.setString(1, unCheval.getNom());
            requete.setString(2, unCheval.getSexe());
            requete.setString(3, unCheval.getnSiret());
            //requete.setInt(4, unCheval.getUnTypeCheval().getId());
            requete.setInt(4,1);
            /*requete.setInt(5, unCheval.getUnClient().getId());
            requete.setInt(6, unCheval.getPere().getId());
            requete.setInt(7, unCheval.getMere().getId());*/
            
            requete.setInt(5, 1);
            requete.setInt(6, 1);
            requete.setInt(7, 1);
            
            

           /* Exécution de la requête */
            requete.executeUpdate();
            
             // Récupération de id auto-généré par la bdd dans la table client
            rs = requete.getGeneratedKeys();
            while ( rs.next() ) {
                idGenere = rs.getInt( 1 );
                unCheval.setId(idGenere);
            }
            
        }   
        catch (SQLException e) 
        {
            e.printStackTrace();
            //out.println("Erreur lors de l’établissement de la connexion");
        }
        return unCheval;    
    }
}
