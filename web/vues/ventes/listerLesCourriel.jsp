<%-- 
    Document   : listerLesCourriel
    Created on : 10 sept. 2020, 11:46:49
    Author     : sio2
--%>
<%@page import="modele.Courriel"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>LISTE LES MAILS POUR UNE CATEGORIE DE VENTE</title>
    </head>
    <body>
        <h1>LISTE DES MAILS POUR UNE CATEGORIE DE VENTE</h1>
         <%
        ArrayList<Courriel> lesCourriels = (ArrayList)request.getAttribute("pLesMail");
        %>
        <table  class="table table-bordered table-striped table-condensed">  
            <thead>
                <tr>             
                    <th>id</th>
                    <th>date</th>
                    <th>objet</th>
                    <th>corps</th>    
            <br>
            <br>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <%
                    for(int i = 0; i < lesCourriels.size();i++)
                    {
                        
                        Courriel unCourriel = lesCourriels.get(i);
                        out.println("<tr><td>");
                        out.println(unCourriel.getId());
                        out.println("</a></td>");

                        out.println("<td>");
                        out.println(unCourriel.getDates());
                        out.println("</td>");

                        out.println("<td>");
                        out.println(unCourriel.getObjet());
                        out.println("</td>");

                        out.println("<td>");
                        out.println(unCourriel.getCorps());
                        out.println("</td>");
                        
                    }
                    %>
                </tr>
            </tbody>
        </table>
    </body>
</html>
