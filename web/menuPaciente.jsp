<%-- 
    Document   : menuPaciente
    Created on : 18-may-2021, 12:22:09
    Author     : edicz
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<br> 
<br>
<br>
<div class="container">
    <div class="row align-items-center">
        <div class="col-sm text-center card">
            <img class="d-block w-100" src="img/logoAQP.png" width="100" height="150">
        </div>
    </div><br>
    <div class="row align-items-center">
        <div class="col-sm text-center card" id="busqueda-cerrar">
            <span class="busqueda-etiqueta">Bienvenido :</span>
            <jsp:getProperty name="pacienteBean1" property ="nomPac" />
        </div>
    </div>
        <br>
    <div class="row align-items-center">
        <div class="col-sm text-center card">
            <br>
            <a class="btn btn-primary mr-2 " href="index.jsp">Cerrar Sesion</a>
            <br>
            <a class="btn btn-primary mr-2" href="ServletCita?tipo=listarCitaPaciente&id=<jsp:getProperty name="pacienteBean1" property ="codPac"/>">Mis Citas</a>
            <br>
            <a class="btn btn-primary mr-2" href="perfilPaciente.jsp" class="icon-pencil">Mi Perfil</a>
            <br>
            <a class="btn btn-primary mr-2" href="ServletCita?tipo=listar">Reservar Cita</a>
            <br>
        </div>
    </div>
        
</div>
<br> 
<br>
<br>