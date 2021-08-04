<%-- 
    Document   : insertaDoctor
    Created on : 18-may-2021, 11:56:49
    Author     : edicz
--%>


<%@include file="/header.jsp"%>
<br>
<br>
<br>
<br>
<div class="container">
    <div class="row">
        <div class="col-3">
            <%@include file="/menuAdmin.jsp"%>
        </div>
        
        <div class="col-2"></div> 
        
        <div class="col-4 text-center">
            <div class="row">
                <div class="col-sm card">
                    <h1>Registrar Doctor</h1>
                    <div>
                        <form action="ServletDoctor2">
                            <input type="hidden" name="tipo" value="registrar">	
                            <table >
                                <tr>
                                    <td>Nombre: </td>
                                    <td><input type="text" name="nomDoc" required class="form-control"></td>
                                </tr>
                                <tr>
                                    <td>Apellido: </td>
                                    <td><input type="text" name="apeDoc" required class="form-control"></td>
                                </tr>
                                <tr>
                                    <td>Fecha de Nacimiento: </td>
                                    <td><input type="date" name="fecDoc" required class="form-control"></td>
                                </tr>
                                <tr>
                                    <td>DNI: </td>
                                    <td><input type="text" name="dniDoc" required class="form-control"></td>
                                </tr>
                                <tr>
                                    <td>Usuario: </td>
                                    <td><input type="text" name="userDoc" required class="form-control"></td>
                                </tr>
                                <tr>
                                    <td>Password: </td>
                                    <td><input type="password" name="passwordDoc" required class="form-control"></td>
                                </tr>
                                <tr>
                                    <td>Codigo Especialidad: </td>
                                    <td><input type="text" name="idEsp" required class="form-control" ></td>
                                </tr>
                                <tr>
                                    <td><input type="submit" value="enviar" class="form-control btn btn-primary"></td>
                                    <td><input type="reset" value="borrar" class="form-control btn btn-primary"></td>
                                    </tr>						
                            </table><br>
                        </form>
                    </div>
                    
                </div>
            </div>
        </div>
        <div class="col-3"></div> 
    </div>
</div>
 <br>
 <br>
 <br>
 <br>
<%@include file="/footer.jsp"%>