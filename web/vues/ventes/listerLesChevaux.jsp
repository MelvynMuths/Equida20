<%-- 
    Document   : listerLesChevaux
    Created on : 17 sept. 2020, 15:33:10
    Author     : sio2
--%>

<%@page import="modele.Lot"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>LISTE LES LOTS POUR UNE CATEGORIE DE VENTE</title>
    </head>
    <body>
        <h1>LISTE DES LOTS POUR UNE CATEGORIE DE VENTE</h1>
         <%
        ArrayList<Lot> lesLot = (ArrayList)request.getAttribute("pLesLot");
        %>
        <table  class="table table-bordered table-striped table-condensed">  
            <thead>
                <tr>             
                    <th>id</th>
                    <th>Prix de départ</th>
                    <th>Nom du cheval</th>   
            <br>
            <br>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <%
                    for(int i = 0; i < lesLot.size();i++)
                    {
                        
                        Lot unLot = lesLot.get(i);
                        out.println("<tr><td>");
                        out.println(unLot.getId());
                        out.println("</a></td>");

                        out.println("<td>");
                        out.println(unLot.getPrxDepart());
                        out.println("</td>");

                        out.println("<td>");
                        out.println(unLot.getUnCheval().getNom());
                        out.println("</td>");
                        
                    }
                    %>
                </tr>
            </tbody>
        </table>
    </body>
</html>
