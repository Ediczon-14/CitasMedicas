
<%@include file="/header.jsp"%>
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
                        <input type="hidden" name="tipo" value="registrar">	
                        <table >
                            <tr>
                                <td>Usuario</td>
                                <td><input type="text" name="usuario" required class="form-control"></td>
                            </tr>
                            <tr>
                                <td>Clave</td>
                                <td><input type="password" name="clave" required class="form-control"></td>
                            </tr>
                            <tr>
                                <td>Nombre</td>
                                <td><input type="text" name="nombre" required class="form-control"></td>
                            </tr>
                            <tr>
                                <td>Apellido</td>
                                <td><input type="text" name="apellido" required class="form-control"></td>
                            </tr>
                                <tr>
                                    <td><input type="submit" value="enviar" class="form-control btn btn-primary"></td>
                                    <td><input type="reset" value="borrar" class="form-control btn btn-primary"></td>
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