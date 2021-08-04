<%-- 
    Document   : listarCita
    Created on : 07-jul-2021, 11:41:34
    Author     : edicz
--%>

<%@page import="Entidad.Citas"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="/header.jsp"%>

<%
    List<Citas> da= (List<Citas>)request.getAttribute("data");
%>
<br>
<div class="container">
    <div class="row">
        <div class="col-3">
            <%@include file="/menuAdmin.jsp"%>
        </div>
            
        <div class="col-9 card text-center">
            <h2 align="center">LISTADO DE CITAS</h2>
            <p align="center" ><a class="btn btn-primary mr-2" href="ServletCita?tipo=listarRegistro">Reservar Cita</a>
            <table border="1" align="center" width="75%" class="table table-striped">
                <tr>
                    <th>CODIGO</th>
                    <th>PRECIO</th>
                    <th>FECHA CITA</th>
                    <th>HORA CITA</th>
                    <th>DURACION</th>
                    <th>DOCTOR</th>
                    <th>PACIENTE</th>
                    
                    <th colspan="2">ACCIONES</th>
                </tr>
                <%
                    if(da!=null)
                    {
                        for(Citas a:da)
                        {
                %>
                    <tr>
                        <td><%=a.getIdCit()%></td>
                        
                        <td><%=a.getPrecio()%></td>
                        <td><%=a.getFechaCit()%></td>
                        <td><%=a.getHoraCit()%></td>
                        <td><%=a.getDuracionCit()%></td>
                        <td><%=a.getIdDoctor()%></td>
                        <td><%=a.getIdPaciente()%></td>
                        
                        <td colspan="2" align="center">
                            <a href="ServletCita?tipo=buscar&id=<%=a.getIdCit()%>" class="icon-pencil"></a>
                            
                            <a href="ServletCita?tipo=eliminar&id=<%=a.getIdCit()%>" class="icon-bin2"></a>
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