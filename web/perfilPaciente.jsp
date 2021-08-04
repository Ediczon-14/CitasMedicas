<%-- 
    Document   : perfilPaciente
    Created on : 24-may-2021, 11:37:21
    Author     : edicz
--%>



<%@page import="Entidad.Paciente"%>
<%@include file="/header.jsp"%>

<br>
<div class="container">
    <div class="row">
        <div class="col-3">
            <%@include file="/menuPaciente.jsp"%>
        </div>
            
        <div class="col-9 card">
            <h1 class="text-center">Perfil Paciente</h1>
            <span class="busqueda-etiqueta">Codigo: <jsp:getProperty name="pacienteBean1" property ="codPac" /></span>
            <span class="busqueda-etiqueta">Nombre: <jsp:getProperty name="pacienteBean1" property ="nomPac" /></span>
            <span class="busqueda-etiqueta">Apellido: <jsp:getProperty name="pacienteBean1" property ="apePac" /></span>
            <span class="busqueda-etiqueta">Fecha de Nacimiento: <jsp:getProperty name="pacienteBean1" property ="fecPac" /></span> 
            <span class="busqueda-etiqueta">DNI: <jsp:getProperty name="pacienteBean1" property ="dniPac" /></span> 
            <span class="busqueda-etiqueta">Usuario: <jsp:getProperty name="pacienteBean1" property ="userPac" /></span> 
            <span class="busqueda-etiqueta">Password: <jsp:getProperty name="pacienteBean1" property ="passwordPac" /></span>
            <span class="busqueda-etiqueta">Correo: <jsp:getProperty name="pacienteBean1" property ="correoPac" /></span> 
        </div>
            
    </div>
</div>
            <br>


<%@include file="/footer.jsp"%>