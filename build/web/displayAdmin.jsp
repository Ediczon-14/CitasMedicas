<%@page import="Entidad.Admin"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    Admin emp = (Admin) request.getAttribute("admin");
%>
<jsp:useBean id="adminBean1" class="JavaBeans.AdminBean" scope="session">
</jsp:useBean>
<jsp:setProperty name="adminBean1" property ="usuario" value="<%=emp.getUsuario()%>" />
<jsp:setProperty name="adminBean1" property ="nombre" value="<%=emp.getNombre()%>" />
<jsp:setProperty name="adminBean1" property ="apellido" value="<%=emp.getApellido()%>" />
<jsp:setProperty name="adminBean1" property ="clave" value="<%=emp.getClave()%>" />


<%@include file="/header.jsp"%>
<br>
<div class="container">
    <div class="row">
        <div class="col-3"><%@include file="/menuAdmin.jsp"%></div>
        <div class="col-9"></div>
    </div>
</div>
<%@include file="/footer.jsp"%>