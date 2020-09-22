/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import modele.CategVente;
import modele.Cheval;
import modele.Client;
import modele.Pays;
import modele.Vente;
import modele.Courriel;
import modele.Lieu;
import modele.Lot;

/**
 *
 * @author Zakina
 * 22/06/2017
 * Classe faisant la liaison entre la table Vente et la classe Vente
 */
public class VenteDAO {

    
    Connection connection=null;
    static PreparedStatement requete=null;
    static ResultSet rs=null;
    
    /* @author Zakina - 22/06/2017
    /* Méthode permettant de lister toutes les ventes enregistrées en base, triées par date décroissante.
    /* Pour chaque vente, on récupère aussi sa catégorie.
    /* La liste des vente est stockée dans une ArrayList
    */
    public static ArrayList<Vente>  getLesVentes(Connection connection){      
        ArrayList<Vente> lesVentes = new  ArrayList<Vente>();
        try
        {
            //preparation de la requete     
            requete=connection.prepareStatement("SELECT DISTINCT * FROM vente, lieu, CategVente WHERE codeCategVente=code AND LieuVente = lieu.id order by dateDebut desc");          
            //executer la requete
            rs=requete.executeQuery();
            
            //On hydrate l'objet métier Client avec les résultats de la requête
            while ( rs.next() ) {  
                Vente uneVente = new Vente();
                uneVente.setId(rs.getInt("id"));
                uneVente.setNom(rs.getString("nom"));
                uneVente.setDateDebutVente(rs.getString("dateDebut"));
                
                Lieu unLieu = new Lieu();
                unLieu.setId(rs.getInt("id"));
                unLieu.setVille(rs.getString("ville"));
                unLieu.setNbBoxes(rs.getInt("nbBoxes"));
                
                CategVente uneCateg = new CategVente();
                uneCateg.setCode(rs.getString("code"));  // on aurait aussi pu prendre CodeCateg
                uneCateg.setLibelle(rs.getString("libelle"));
                
                uneVente.setUneCategVente(uneCateg);
                uneVente.setUnLieu(unLieu);
                lesVentes.add(uneVente);
            }
        }   
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return lesVentes ;    
    } 
    
    /* @author Zakina - 22/06/2017
    /* Méthode permettant de lister les clients interessés par la catégorie de la vente selectionnée (passée en paramètre de la méthode)
    /* Pour chaque client, on récupère aussi le nom de son pays
    /* La liste des clients est stockée dans une ArrayList
    */
    public static ArrayList<Client>  getLesClients(Connection connection, String codeCateg){      
        ArrayList<Client> lesClients = new  ArrayList<Client>();
        try
        {
            //preparation de la requete     
            //codeCateg="ETE";
            requete=connection.prepareStatement("SELECT c.*, p.nom as nomPays, cv.libelle FROM client c, pays p, clientcategvente cc, categVente cv where c.codePays=p.code and cc.codeClient=c.id and cv.code=cc.codeCategVente and codeCategVente= ? ");
            requete.setString(1, codeCateg);
            //executer la requete
            rs=requete.executeQuery();
             
            //On hydrate l'objet métier Client avec les résultats de la requête
            while ( rs.next() ) {  
                
                
                
                Client unClient = new Client();
                unClient.setId(rs.getInt("id"));
                unClient.setNom(rs.getString("nom"));
                unClient.setPrenom(rs.getString("prenom"));
                unClient.setRue(rs.getString("rue"));
                unClient.setCopos(rs.getString("copos"));
                unClient.setVille(rs.getString("ville"));
                unClient.setMail(rs.getString("mail"));
                
                Pays p = new Pays();
                p.setCode(rs.getString("codePays"));
                p.setNom(rs.getString("nomPays"));
                
                unClient.setUnPays(p);
                /*CategVente uneCateg = new CategVente();
                uneCateg.setCode(rs.getString("code"));  // on aurait aussi pu prendre CodeCateg
                uneCateg.setLibelle(rs.getString("libelle"));*/
                
                lesClients.add(unClient);
            }
        }   
        catch (SQLException e) 
        {
            e.printStackTrace();
            //out.println("Erreur lors de l’établissement de la connexion");
        }
        return lesClients ;    
    } 
    public static ArrayList<Courriel>  getLesMail(Connection connection, String codeVen){      
        ArrayList<Courriel> lesMail = new  ArrayList<Courriel>();
        try
        {
            //preparation de la requete     
            requete=connection.prepareStatement("SELECT c.* FROM courriel c, vente v WHERE c.idvente = v.id AND v.id = ?");
            requete.setString(1, codeVen);
            //executer la requete
            rs=requete.executeQuery();
             
            //On hydrate l'objet métier Client avec les résultats de la requête
            while ( rs.next() ) {  
                
                
                
                Courriel unCourriel = new Courriel();
                unCourriel.setId(rs.getInt("id"));
                Date uneDate = rs.getDate("dates"); 
                String str = String.valueOf(uneDate);
                unCourriel.setDates(str);
                unCourriel.setObjet(rs.getString("objet"));
                unCourriel.setCorps(rs.getString("corps"));
                
                
                
                
                
                
                lesMail.add(unCourriel);
            }
        }   
        catch (SQLException e) 
        {
            e.printStackTrace();
            //out.println("Erreur lors de l’établissement de la connexion");
        }
        return lesMail ;    
    } 
    public static ArrayList<Lot>  getLesLot(Connection connection, String codeVen){      
        ArrayList<Lot> lesLot = new  ArrayList<Lot>();
        try
        {
            //preparation de la requete     
            requete=connection.prepareStatement("SELECT l.*, c.Nom FROM lot l, vente v, cheval c WHERE l.IDCheval = c.ID AND l.IDVENTE = v.id AND v.id = ?");
            requete.setString(1, codeVen);
            
            System.out.println("requete" +requete );
            //executer la requete
            rs=requete.executeQuery();
             
            //On hydrate l'objet métier Client avec les résultats de la requête
            while ( rs.next() ) {  
                
                
                
                Lot unLot = new Lot();
                unLot.setId(rs.getInt("ID"));
                unLot.setPrxDepart(rs.getString("prixDepart"));
                
                Cheval unCheval = new Cheval();
                unCheval.setNom(rs.getString("Nom"));
                        
                unLot.setUnCheval(unCheval);
                lesLot.add(unLot);
            }
            
        }   
        catch (SQLException e){
            e.printStackTrace();
            //out.println("Erreur lors de l’établissement de la connexion");
        }
        return lesLot;    
    }
    
    
    
    
    
}
