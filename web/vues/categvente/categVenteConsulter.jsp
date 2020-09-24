<%-- 
    Document   : CategVenteConsulter
    Created on : 24 sept. 2020, 15:28:54
    Author     : sio2
--%>

<%@page import="modele.CategVente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultation Categorie Vente</title>
    </head>
    <body>
        <h1>Infos Categories Ventes</h1>
        
         <%
        CategVente uneCategVente = (CategVente)request.getAttribute("pCategVente");
        %>
        
        
        <table class="table table-bordered table-striped table-condensed">
            <tr><td>CODE :</td><td><% out.println(uneCategVente.getCode());%></td></tr>
            <tr><td>LIBELLE :</td><td><%  out.println(uneCategVente.getLibelle());%></td>  </tr> 
        </table>
        
    </body>
</html>
