
<%@page import="Entidad.Paciente"%>
<%@include file="/header.jsp"%>


<%   Paciente a = (Paciente) request.getAttribute("data"); %>
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
                    <h1>Actualiza Paciente</h1>
                    <form action="ServletPaciente2">
                        <input type="hidden" name="tipo" value="actualizar">
                        <input type="hidden" name="id" value="<%= a.getCodPac()%>" >	
                        <table >
                            <tr>
                                <td>Nombre</td>
                                <td><input type="text" name="nomPac" required value="<%= a.getNomPac()%>"></td>
                            </tr>
                            <tr>
                                <td>Apellido</td>
                                <td><input type="text" name="apePac" required value="<%= a.getApePac()%>"></td>
                            </tr>
                            <tr>
                                <td>Fecha Nac</td>
                                <td><input type="text" name="fecPac" required  value="<%= a.getFecPac()%>" ></td>     
                            </tr>
                            <tr>
                                <td>DNI</td>
                                <td><input type="text" name="dniPac" required  value="<%= a.getDniPac()%>" ></td>     
                            </tr>
                            <tr>
                                <td>Usuario</td>
                                <td><input type="text" name="userPac" required  value="<%= a.getUserPac()%>" ></td>     
                            </tr>
                            <tr>
                                <td>Password</td>
                                <td><input type="text" name="passwordPac" required  value="<%= a.getPasswordPac()%>" ></td>     
                            </tr>
                            <tr>
                                <td>Correo</td>
                                <td><input type="text" name="correoPac" required  value="<%= a.getCorreoPac()%>" ></td>     
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