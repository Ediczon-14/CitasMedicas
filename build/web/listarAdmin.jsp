
<%@page import="Entidad.Admin"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="/header.jsp"%>

<%
    List<Admin> da= (List<Admin>)request.getAttribute("data");
%>
<br>
<div class="container">
    <div class="row">
        <div class="col-3">
            <%@include file="/menuAdmin.jsp"%>
        </div>
            
        <div class="col-9 card text-center">
            <h2 align="center">LISTADO DE ADMIN</h2>
            <p align="center" ><a href="insertaAdmin.jsp" class="btn btn-primary mr-2">Registrar</a>
            <table border="1" align="center" width="75%" class="table table-striped">
                <tr>
                    <th>CODIGO</th>
                    <th>USUARIO</th>
                    <th>CLAVE</th>
                    <th>NOMBRE</th>
                    <th>APELLIDO</th>
                    
                    <th colspan="2">ACCIONES</th>
                </tr>
                <%
                    if(da!=null)
                    {
                        for(Admin a:da)
                        {
                %>
                    <tr>
                        <td><%=a.getCodAdmin()%></td>
                        <td><%=a.getUsuario()%></td>
                        <td><%=a.getClave()%></td>
                        <td><%=a.getNombre()%></td>
                        <td><%=a.getApellido()%></td>
                        
                        <td colspan="2" align="center">
                            <a href="ServletAdmin2?tipo=buscar&id=<%=a.getCodAdmin()%>" class="icon-pencil"></a>
                            
                            <a href="ServletAdmin2?tipo=eliminar&id=<%=a.getCodAdmin()%>" class="icon-bin2"></a>
                        </td>
                    </tr>
                <%
                        }
                    }
                %> 
            </table>
        </div>
    </div>
</div>
            <br>


<%@include file="/footer.jsp"%>
