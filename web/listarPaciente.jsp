<%-- 
    Document   : listarPaciente
    Created on : 18-may-2021, 12:25:54
    Author     : edicz
--%>

<%@page import="Entidad.Paciente"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="/header.jsp"%>

<%
    List<Paciente> da= (List<Paciente>)request.getAttribute("data");
%>
<br>
<div class="container">
    <div class="row">
        <div class="col-3">
            <%@include file="/menuAdmin.jsp"%>
        </div>
            
        <div class="col-9 card text-center">
            <h2 align="center">LISTADO DE PACIENTES</h2>
            <!--<p align="center" ><a href="insertaPaciente.jsp" class="btn btn-primary mr-2">Registrar</a>-->
            <table border="1" align="center" width="75%" class="table table-striped">
                <tr>
                    <th>CODIGO</th>
                    <th>NOMBRE</th>
                    <th>APELLIDO</th>
                    <th>FECHA.N</th>
                    <th>DNI</th>
                    <th>USUARIO</th>
                    <th>CLAVE</th>
                    <th>CORREO</th>
                    
                    <th colspan="2">ACCIONES</th>
                </tr>
                <%
                    if(da!=null)
                    {
                        for(Paciente a:da)
                        {
                %>
                    <tr>
                        <td><%=a.getCodPac()%></td>
                        
                        <td><%=a.getNomPac()%></td>
                        <td><%=a.getApePac()%></td>
                        <td><%=a.getFecPac()%></td>
                        <td><%=a.getDniPac()%></td>
                        <td><%=a.getUserPac()%></td>
                        <td><%=a.getPasswordPac()%></td>
                        <td><%=a.getCorreoPac()%></td>
                        
                        <td colspan="2" align="center">
                            <a href="ServletPaciente2?tipo=buscar&id=<%=a.getCodPac()%>" class="icon-pencil"></a>
                            
                            <a href="ServletPaciente2?tipo=eliminar&id=<%=a.getCodPac()%>" class="icon-bin2"></a>
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
