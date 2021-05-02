<%-- 
    Document   : mostrarResultado
    
    Author     : jmmm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.suma" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            suma Suma =(suma) request.getAttribute("Suma");
        %>
        
        
        <h2>Resultado de la suma realizada es: </h2>
        <p><%=Suma.hacerSuma()%></p> 
        <a href="index.jsp">Regresar</a>
    </body>
</html>
