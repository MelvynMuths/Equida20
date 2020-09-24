<%-- 
    Document   : ListerLesInformation
    Created on : 24 sept. 2020, 08:59:25
    Author     : sio2
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modele.Cheval"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>INFORMATION SUPPLEMENTAIRE SUR LE CHEVAL</title>
    </head>
    <body>
        <h1>INFORMATION SUPPLEMENTAIRE SUR LE CHEVAL</h1>
         <%
        ArrayList<Cheval> lesChevaux = (ArrayList)request.getAttribute("pLesChevaux");
        %>
        <table  class="table table-bordered table-striped table-condensed">  
            <thead>
                <tr>             
                    <th>id</th>
                    <th>nom</th>
                    <th>sexe</th>
                    <th>numero de siret</th>    
                    <th>race</th>
                    <th>vendeur</th>
                    <th>pére</th>
                    <th>mére</th>
            <br>
            <br>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <%
                    for(int i = 0; i < lesChevaux.size();i++)
                    {
                        
                        Cheval unCheval = lesChevaux.get(i);
                        out.println("<tr><td>");
                        out.println(unCheval.getId());
                        out.println("</a></td>");
                        
                        out.println("<td>");
                        out.println(unCheval.getNom());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(unCheval.getSexe());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(unCheval.getnSiret());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(unCheval.getUnTypeCheval().getLibelle());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(unCheval.getUnClient().getNom());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(unCheval.getPere().getNom());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(unCheval.getMere().getNom());
                        out.println("</td>");
                    }
                    %>
                </tr>
            </tbody>
        </table>
    </body>
</html>

