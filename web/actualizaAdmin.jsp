
<%@page import="Entidad.Admin"%>
<%@include file="/header.jsp"%>


<%   Admin a = (Admin) request.getAttribute("data"); %>
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
                    <h1>Actualiza Admin</h1>
                    <form action="ServletAdmin2">
                        <input type="hidden" name="tipo" value="actualizar">
                        <input type="hidden" name="id" value="<%= a.getCodAdmin()%>" >	
                        <table >
                            <tr>
                                <td>Usuario</td>
                                <td><input type="text" name="usuario" required value="<%= a.getUsuario()%>"></td>
                            </tr>
                            <tr>
                                <td>Clave</td>
                                <td><input type="text" name="clave" required value="<%= a.getClave()%>"></td>
                            </tr>
                            <tr>
                                <td>Nombre</td>
                                <td><input type="text" name="nombre" required  value="<%= a.getNombre() %>" ></td>     
                            </tr>
                            <tr>
                                <td>Apellido</td>
                                <td><input type="text" name="apellido" required  value="<%= a.getApellido()%>" ></td>     
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