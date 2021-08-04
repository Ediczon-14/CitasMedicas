<%-- 
    Document   : insertaCita
    Created on : 14-jul-2021, 10:19:28
    Author     : edicz
--%>

<%@page import="Entidad.DoctorEspecialidad"%>
<%@page import="Entidad.Paciente"%>
<%@page import="Entidad.Especialidad"%>
<%@page import="Entidad.Doctor"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registro de Cita / Clinica AQP</title>
    <meta name="viewport" content="width=device-width, initial-scale=1"> <!-- Ensures optimal rendering on mobile devices. -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge" /> <!-- Optimal Internet Explorer compatibility -->
</head>
<body>
    <script src="https://www.paypal.com/sdk/js?client-id=ASfs9unTplkXbOH4scE7VbycNUfM_pC8tTBvG6tOGAenCMGBBGK1SukzP_sJG_fUWTMEJCH2vqlZQ3H5&currency=USD" data-sdk-integration-source="button-factory"></script>
    <%@include file="/header.jsp"%>
    <br>
    <div class="container">
        <div class="row">
            <div class="col-3">
                <%@include file="/menuAdmin.jsp"%>
            </div>
            <div class="col-2">
                
            </div>
            <div class="col-6 card ">
                <h1 class="text-center">Registrar Paciente</h1>
                <hr><br>
                <div class="form-group" >
                    <form action="ServletCita" name="formulario1">
                        <input type="hidden" name="tipo" value="registrarRegistro">	
                        <table>
                            <tr>
                                <td>Especializacion Medica - Doctor:</td>
                                <td>
                                    <select name="idDoctor" class="custom-select mr-sm-2" required>
                                    <%
                                        List<DoctorEspecialidad> da3= (List<DoctorEspecialidad>)request.getAttribute("data3");
                                        if(da3!=null)
                                        {
                                            for(DoctorEspecialidad a:da3)
                                            {
                                    %>
                                        <option value="<%=a.getIdDoc()%>"><%=a.getDocEspecialidad()%> - <%=a.getNomDocEsp()%> <%=a.getApeDocEsp()%></option>
                                    <%
                                            }
                                        }
                                    %>
                                    </select>
                                </td>
                            </tr>
                                <tr>
                                    <td>Fecha Cita: </td>
                                    <td><input type="date" name="fechaCit" required class="form-control"></td>
                                </tr>
                                <tr>
                                    <td>Hora Cita: </td>
                                    <td><input type="time" name="horaCit" required class="form-control"></td>
                                </tr>
                                <tr>
                                    <td>Duracion Cita: </td>
                                    <td>
                                        <select class="seleccion form-control" onchange="cambia()" name="duracionCit" required>
                                            <option value="0">seleccionar
                                            <option value="1500">00:15:00
                                            <option value="3000">00:30:00
                                            <option value="5900">00:59:00
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Precio: </td>
                                    <td>
                                        <select name=precio required class="form-control"> 
                                            <option value="-">- 
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <td>idPaciente</td>
                                    <td><input type="text" name="idPaciente" required class="form-control"></td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td><input type="submit" value="Registrar Cita" class="btn btn-primary form-control" ></td>
                                </tr>
                        </table><br>
                    </form>
                </div>        
            </div>   
        </div> 
    </div>                   
    <br>
    <script type="text/javascript">
                                //1) Definir Las Variables Correspondintes

                                var opt_1500 = new Array ("S/.40");
                                var opt_3000 = new Array ("S/.70");
                                var opt_5900= new Array ("S/.99");
                                // 2) crear una funcion que permita ejecutar el cambio dinamico

                                function cambia()
                                {
                                    var duracionCit;
                                    //Se toma el vamor de la "duracionCit seleccionada"
                                    duracionCit = document.formulario1.duracionCit[document.formulario1.duracionCit.selectedIndex].value;
                                    //se chequea si la "duracionCit" esta definida
                                    if(duracionCit!=0)
                                    {
                                        //selecionamos las duracionCit Correctas
                                        mis_opts=eval("opt_" + duracionCit);
                                        //se calcula el numero de duracionCit
                                        num_opts=mis_opts.length;
                                        //marco el numero de precio en el select
                                        document.formulario1.precio.length = num_opts;
                                        //para cada precio del array, la pongo en el select
                                        if(duracionCit=="1500") {
                                            for(i=0; i<num_opts; i++)
                                            {
                                                document.formulario1.precio.options[i].value=40;
                                                document.formulario1.precio.options[i].text=mis_opts[i];
                                            }
                                        }else if (duracionCit=="3000") {
                                            for(i=0; i<num_opts; i++)
                                            {
                                                document.formulario1.precio.options[i].value=70;
                                                document.formulario1.precio.options[i].text=mis_opts[i];
                                            }
                                        }else{
                                            for(i=0; i<num_opts; i++)
                                            {
                                                document.formulario1.precio.options[i].value=99;
                                                document.formulario1.precio.options[i].text=mis_opts[i];
                                            }
                                        }
                                            
                                    }else
                                    {
                                        //si no habia ninguna precio seleccionada, elimino las duracionCit del select
                                        document.formulario1.precio.length = 1;
                                        //ponemos un guion en la unica opt que he dejado
                                        document.formulario1.precio.options[0].value="-";
                                        document.formulario1.precio.options[0].text="-";
                                    }
                                    //hacer un reset de las precio
                                    document.formulario1.precio.options[0].selected = true;

                                }
    </script>
    <%@include file="/footer.jsp"%>
</body>
