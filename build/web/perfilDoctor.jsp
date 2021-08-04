<%-- 
    Document   : PerfilDoctor
    Created on : 24-may-2021, 13:02:21
    Author     : edicz
--%>

<%@page import="Entidad.Doctor"%>
<%@include file="/header.jsp"%>

<br>
<div class="container">
    <div class="row">
        <div class="col-3">
            <%@include file="/menuDoctor.jsp"%>
        </div>
            
        <div class="col-9 card">
            <h1 class="text-center">Perfil Doctor</h1>
            <span class="busqueda-etiqueta">Codigo: <jsp:getProperty name="doctorBean1" property ="codDoc" /></span>
            <span class="busqueda-etiqueta">Nombre: <jsp:getProperty name="doctorBean1" property ="nomDoc" /></span>
            <span class="busqueda-etiqueta">Apellido: <jsp:getProperty name="doctorBean1" property ="apeDoc" /></span>
            <span class="busqueda-etiqueta">Fecha de Nacimiento: <jsp:getProperty name="doctorBean1" property ="fecDoc" /></span> 
            <span class="busqueda-etiqueta">DNI: <jsp:getProperty name="doctorBean1" property ="dniDoc" /></span> 
            <span class="busqueda-etiqueta">Usuario: <jsp:getProperty name="doctorBean1" property ="userDoc" /></span> 
            <span class="busqueda-etiqueta">Password: <jsp:getProperty name="doctorBean1" property ="passwordDoc" /></span>
            <span class="busqueda-etiqueta">Id Especialidad: <jsp:getProperty name="doctorBean1" property ="idEsp" /></span> 
        </div>
            
    </div>
</div>
            <br>


<%@include file="/footer.jsp"%>