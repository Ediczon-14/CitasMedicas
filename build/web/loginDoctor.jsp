<%-- 
    Document   : loginPaciente
    Created on : 12-may-2021, 19:20:17
    Author     : edicz
--%>
<%@include file="/header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<br> 
<br>
<br> 

<div class="container">
    <div class="row align-items-center">
        <div class="col-sm text-center"></div>
        <div class="col-sm text-center">
            <div class="card">
                <img class="d-block w-100" src="img/logoAQP.png" width="100" height="200">
            </div>
        </div>
        <div class="col-sm text-center"></div>
    </div><br>
    <div class="row align-items-center sidebar" >
        <%
            String x=(String) request.getAttribute("mensaje");
            String a="";
            if(x!=null)
                a=x;
        %> 
        <div class="col-sm text-center"></div>
        <div class="col-sm text-center">
            <div class="card">
                
                <div class="card-header">
                    <h4>Sesion Doctor</h4>
                </div>
                <div class="card-doby">
                    <br>
                    <br>
                    <div class="d-flex justify-content-center form_container">
			<form method="post" action="ServletDoctor">
                            <div class="input-group mb-3" id="busqueda-cerrar">
				<div class="input-group-append">
                                    <span class="input-group-text busqueda-etiqueta"><i class="fas fa-user"></i></span>
				</div>
				<input type="text" name="txtlogin" class="form-control input_user form-submit" value="" placeholder="username">
                            </div>
                            <div class="input-group mb-2" id="busqueda-cerrar">
                                <div class="input-group-append">
                                    <span class="input-group-text"><i class="fas fa-key"></i></span>
				</div>
				<input type= "password" name="txtpass" class="form-control form-submit input_pass" value="" placeholder="password">
                            </div><br>
                            <div class="container-login100-form-btn">
                                <div class="wrap-login100-form-btn">
                                    <input type="submit" id="busqueda-submit"  class="form-button btn btn-primary mr-2" value="Iniciar" />
                                    <h5 align="center"><%=a %></h5> 
                                </div>
                            </div>
			</form>
                    </div>
                </div>
                                <div class="card-footer"><br></div>
            </div>
        </div>
        <div class="col-sm text-center"></div>
    </div>
</div>

<br> 
<br>
<br> 
<%@include file="/footer.jsp"%>
