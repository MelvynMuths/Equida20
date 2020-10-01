<%-- 
    Document   : chevalConsulter
    Created on : 29 sept. 2020, 08:22:21
    Author     : sio2
--%>

<%@page import="modele.Cheval"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultation Cheval ajouter</title>
    </head>
    <body>
        <h1>Infos Cheval</h1>
        
         <%
        Cheval unCheval = (Cheval)request.getAttribute("pCheval");
        %>
         <% 
            System.out.println(unCheval);
         %>
        
        <table class="table table-bordered table-striped table-condensed">
            <tr><td>NOM :</td><td><%  out.println(unCheval.getNom());%></td>  </tr> 
            <tr><td>SEXE :</td><td><%  out.println(unCheval.getSexe());%></td>  </tr> 
            <tr><td>NUMERO DE SIRET :</td><td><%  out.println(unCheval.getnSiret());%></td>  </tr>
            <tr><td>ID TYPE CHEVAL :</td><td><%  out.println(unCheval.getUnTypeCheval().getId());%></td>  </tr> 
            <tr><td>ID CLIENT :</td><td><%  out.println(unCheval.getUnClient().getId());%></td>  </tr> 
            <tr><td>ID PERE :</td><td><%  out.println(unCheval.getPere().getId());%></td>  </tr> 
            <tr><td>ID MERE :</td><td><%  out.println(unCheval.getMere().getId());%></td>  </tr> 
        </table>
        
    </body>
</html>