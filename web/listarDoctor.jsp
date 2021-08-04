<%-- 
    Document   : listarDoctor
    Created on : 18-may-2021, 12:25:34
    Author     : edicz
--%>

<%@page import="Entidad.Doctor"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="/header.jsp"%>

<%
    List<Doctor> da= (List<Doctor>)request.getAttribute("data");
%>
<br>
<div class="container">
    <div class="row">
        <div class="col-3">
            <%@include file="/menuAdmin.jsp"%>
        </div>
            
        <div class="col-9 card text-center">
            <h2 align="center">LISTADO DE DOCTOR</h2>
            <p align="center" ><a href="insertaDoctor.jsp" class="btn btn-primary mr-2">Registrar</a>
            <table border="1" align="center" width="75%" class="table table-striped">
                <tr>
                    <th>CODIGO</th>
                    <th>NOMBRE</th>
                    <th>APELLIDO</th>
                    <th>FECHA.N</th>
                    <th>DNI</th>
                    <th>USUARIO</th>
                    <th>CLAVE</th>
                    <th>ID.ESP</th>
                    
                    <th colspan="2">ACCIONES</th>
                </tr>
                <%
                    if(da!=null)
                    {
                        for(Doctor a:da)
                        {
                %>
                    <tr>
                        <td><%=a.getCodDoc()%></td>
                        
                        <td><%=a.getNomDoc()%></td>
                        <td><%=a.getApeDoc()%></td>
                        <td><%=a.getFecDoc()%></td>
                        <td><%=a.getDniDoc()%></td>
                        <td><%=a.getUserDoc()%></td>
                        <td><%=a.getPasswordDoc()%></td>
                        <td><%=a.getIdEsp()%></td>
                        
                        <td colspan="2" align="center">
                            <a href="ServletDoctor2?tipo=buscar&id=<%=a.getCodDoc()%>" class="icon-pencil"></a>
                            
                            <a href="ServletDoctor2?tipo=eliminar&id=<%=a.getCodDoc()%>" class="icon-bin2"></a>
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