<%-- 
    Document   : chevak
    Created on : 29 sept. 2020, 08:21:40
    Author     : sio2
--%>

<%@page import="formulaires.ChevalForm"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ajouter un Cheval</title>
    </head>
    <body>
        <h1>NOUVEAU CHEVAL</h1>
        
         <%
                //Client client=(Client)request.getAttribute("client");
                ChevalForm form = (ChevalForm)request.getAttribute("form");
            %>
        
        <form class="form-inline" action="ajouterCheval" method="POST">
                           
                <label for="libelle">NOM : </label>
                <input id="libelle"  type="text"  name="libelle" size="30" maxlength="30">      
                </br>
          
                <label for="libelle">SEXE : </label>
                <input id="libelle"  type="text"  name="libelle" size="30" maxlength="30">      
                </br>
                
                <label for="libelle">NUMERO DE SIRET : </label>
                <input id="libelle"  type="text"  name="libelle" size="30" maxlength="30">      
                </br>
                
                <label for="libelle">ID TYPE DE CHEVAL : </label>
                <input id="libelle"  type="text"  name="libelle" size="30" maxlength="30">      
                </br>
                
                <label for="libelle">ID CLIENT : </label>
                <input id="libelle"  type="text"  name="libelle" size="30" maxlength="30">      
                </br>
                
                <label for="libelle">ID PERE : </label>
                <input id="libelle"  type="text"  name="libelle" size="30" maxlength="30">      
                </br>
                
                <label for="libelle">ID MERE : </label>
                <input id="libelle"  type="text"  name="libelle" size="30" maxlength="30">      
                </br>
                
            <input type="submit" name="valider" id="valider" value="Valider"/>
            </form>
        
    </body>
</html>
