
<%@page import="Entidad.Doctor"%>
<%@include file="/header.jsp"%>


<%   Doctor a = (Doctor) request.getAttribute("data"); %>
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
                    <h1>Actualiza Doctor</h1>
                    <form action="ServletDoctor2">
                        <input type="hidden" name="tipo" value="actualizar">
                        <input type="hidden" name="id" value="<%= a.getCodDoc()%>" >	
                        <table >
                            <tr>
                                <td>Nombre</td>
                                <td><input type="text" name="nomDoc" required value="<%= a.getNomDoc()%>"></td>
                            </tr>
                            <tr>
                                <td>Apellido</td>
                                <td><input type="text" name="apeDoc" required value="<%= a.getApeDoc()%>"></td>
                            </tr>
                            <tr>
                                <td>Fecha Nac</td>
                                <td><input type="text" name="fecDoc" required  value="<%= a.getFecDoc()%>" ></td>     
                            </tr>
                            <tr>
                                <td>DNI</td>
                                <td><input type="text" name="dniDoc" required  value="<%= a.getDniDoc()%>" ></td>     
                            </tr>
                            <tr>
                                <td>Usuario</td>
                                <td><input type="text" name="userDoc" required  value="<%= a.getUserDoc()%>" ></td>     
                            </tr>
                            <tr>
                                <td>Password</td>
                                <td><input type="text" name="passwordDoc" required  value="<%= a.getPasswordDoc()%>" ></td>     
                            </tr>
                            <tr>
                                <td>Codigo Especialidad</td>
                                <td><input type="text" name="idEsp" required  value="<%= a.getIdEsp()%>" ></td>     
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