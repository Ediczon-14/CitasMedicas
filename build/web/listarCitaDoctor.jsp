<%-- 
    Document   : listarCitaDoctor
    Created on : 08-jul-2021, 18:30:10
    Author     : edicz
--%>

<%@page import="Entidad.Citas"%>
<%@page import="java.util.List"%>
<%@include file="/header.jsp"%>
<%
    List<Citas> da= (List<Citas>)request.getAttribute("data");
%>
<br>
<div class="container">
    <div class="row">
        <div class="col-3">
            <%@include file="/menuDoctor.jsp"%>
        </div>
            
        <div class="col-9 text-center">
            <div class="col-sm card">
                    <h1>Listar Citas Paciente</h1>
                    <form action="ServletCita">
                        <input type="hidden" name="id" value="<jsp:getProperty name="doctorBean1" property ="codDoc" />" >	
                        <table  border="1" align="center" width="75%" class="table table-striped" >
                            <tr>
                                <th>CODIGO</th>
                                <th>PRECIO</th>
                                <th>FECHA CITA</th>
                                <th>HORA CITA</th>
                                <th>DURACION</th>
                                <th>DOCTOR</th>
                                <th>PACIENTE</th>
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
                                </tr>
                            <%
                                    }
                                }
                            %> 						
                        </table>
                    </form>
                            <br>
                </div>
        </div>
    </div>
</div>

<%@include file="/footer.jsp"%>
