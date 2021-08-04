<%-- 
    Document   : insertaPaciente
    Created on : 18-may-2021, 11:56:32
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
        </div>
            
        <div class="col-9 text-center">
            <div class="row">
                <div class="col-sm"></div>
                <div class="col-sm card">
                    <h1>Registrar Paciente</h1>
                    <div>
                        <form action="ServletPaciente2">
                            <input type="hidden" name="tipo" value="registrar">	
                            <table>
                                <tr>
                                    <td>Nombre</td>
                                    <td><input type="text" name="nomPac" required></td>
                                </tr>
                                <tr>
                                    <td>Apellido</td>
                                    <td><input type="text" name="apePac" required></td>
                                </tr>
                                <tr>
                                    <td>Fecha de Nacimiento</td>
                                    <td><input type="date" name="fecPac" required></td>
                                </tr>
                                <tr>
                                    <td>DNI</td>
                                    <td><input type="text" name="dniPac" required></td>
                                </tr>
                                <tr>
                                    <td>Usuario</td>
                                    <td><input type="text" name="userPac" required></td>
                                </tr>
                                <tr>
                                    <td>Password</td>
                                    <td><input type="password" name="passwordPac" required></td>
                                </tr>
                                <tr>
                                    <td>Correo</td>
                                    <td><input type="text" name="correoPac" required></td>
                                </tr>
                                <tr>
                                    <td><input type="submit" value="enviar"></td>
                                    <td><input type="reset" value="borrar"></td>
                                    </tr>						
                            </table><br>
                        </form>
                    </div>
                    
                </div>
                <div class="col-sm"></div>
            </div>
        </div>
    </div>
</div>
 <br>
 <br>
 <br>
 <br>
<%@include file="/footer.jsp"%>