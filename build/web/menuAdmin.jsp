
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
            <jsp:getProperty name="adminBean1" property ="nombre" />
        </div>
    </div>
        <br>
    <div class="row align-items-center">
        <div class="col-sm text-center card">
            <br>
            <a class="btn btn-primary mr-2 " href="index.jsp">Cerrar Sesion</a>
            <br>
            <a class="btn btn-primary mr-2" href="ServletAdmin2?tipo=listar">Admin</a>
            <br>
            <a class="btn btn-primary mr-2" href="ServletPaciente2?tipo=listar">Paciente</a>
            <br>
            <a class="btn btn-primary mr-2" href="ServletDoctor2?tipo=listar">Doctor</a>
            <br>
            <a class="btn btn-primary mr-2" href="ServletCita?tipo=listarCita">Citas</a>
            <br>
        </div>
    </div>
</div>
<br> 
<br>
<br>

