<%-- 
    Document   : Cliente
    Created on : 10/10/2018, 06:49:14 PM
    Author     : ONivia
    Metodo: scriplet
--%>

<%@page import="processlogiclayer.CustomerPLL"%>
<%@page import="repositorio.Customer"%>
<%@page import="java.util.Arrays"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!
    enum EstadosPagina { PRIMERLLAMADO,CONSULTARLLAMADO };
%>
<%
    EstadosPagina estadopagina = EstadosPagina.PRIMERLLAMADO;
    String CustomerID = null;
    String CompanyName = null;
    String City = null;
    Customer cust = null;
    
    if(request.getParameter("accion")!=null && request.getParameter("accion").equals("Consultar") && request.getParameter("customerid")!=null && request.getParameter("customerid").length()>0) {
        cust = CustomerPLL.obtenerCustomer(request.getParameter("customerid"));
        CustomerID = cust.getCustomerID();
        CompanyName = cust.getCompanyName();
        City = cust.getCity();
        
        estadopagina = EstadosPagina.CONSULTARLLAMADO;
    }            
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Entre Numero del Cliente: </h2>
        <form name="form1" method="get" action="Cliente.jsp" autocomplete="off">
            <input type="text" name="customerid" value="">
            <input type="submit" name="accion" value="Consultar">
        </form>
        <%if(estadopagina==EstadosPagina.CONSULTARLLAMADO) {%>
            <span>CustomerID: </span><input type="text" name="customerId" value="<%=CustomerID%>" readonly><br>
            <span>CompanyName: </span><input type="text" name="CompanyName" value="<%=CompanyName%>"><br>            
            <span>City: </span><input type="text" name="City" value="<%=City%>"><br>            
            <input type="submit" name="accion" value="Actualizar" >
        <%}%>
    </body>
</html>
