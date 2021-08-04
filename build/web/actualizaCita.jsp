<%-- 
    Document   : actualizaCita
    Created on : 14-jul-2021, 9:46:00
    Author     : edicz
--%>

<%@page import="Entidad.Citas"%>
<%@include file="/header.jsp"%>


<%   Citas a = (Citas) request.getAttribute("data"); %>

<br>
<div class="container">
    <div class="row">
        <div class="col-3">
            <%@include file="/menuAdmin.jsp"%>
        </div>
            
        <div class="col-9 text-center">
            <div class="row">
                <div class="col-sm"></div>
                <div class="col-sm card">
                    <h1>Actualiza Cita</h1>
                    <form action="ServletCita">
                        <input type="hidden" name="tipo" value="actualizar">
                        <input type="hidden" name="id" value="<%= a.getIdCit()%>" >	
                        <table >
                            <tr>
                                <td>Precio</td>
                                <td><input type="text" name="precio" required value="<%= a.getPrecio()%>"></td>
                            </tr>
                            <tr>
                                <td>FechaCit</td>
                                <td><input type="text" name="fechaCit" required value="<%= a.getFechaCit()%>"></td>
                            </tr>
                            <tr>
                                <td>Hora Cita</td>
                                <td><input type="text" name="horaCit" required  value="<%= a.getHoraCit()%>" ></td>     
                            </tr>
                            <tr>
                                <td>Duracion Cita</td>
                                <td><input type="text" name="duracionCit" required  value="<%= a.getDuracionCit()%>" ></td>     
                            </tr>
                            <tr>
                                <td>ID Doctor</td>
                                <td><input type="text" name="idDoctor" required  value="<%= a.getIdDoctor()%>" ></td>     
                            </tr>
                            <tr>
                                <td>ID Paciente</td>
                                <td><input type="text" name="idPaciente" required  value="<%= a.getIdPaciente()%>" ></td>     
                            </tr>
                            <tr>
                                <td><input type="submit" value="enviar" class="btn btn-primary mr-2 "></td>
                                <td><input type="reset" value="borrar" class="btn btn-primary mr-2"></td>
                            </tr>						
                        </table>
                    </form>
                            <br>
                </div>
                <div class="col-sm"></div>
            </div>
        </div>
    </div>
</div>

<%@include file="/footer.jsp"%>