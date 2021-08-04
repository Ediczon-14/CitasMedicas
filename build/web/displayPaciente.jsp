<%-- 
    Document   : displayPaciente
    Created on : 18-may-2021, 12:31:23
    Author     : edicz
--%>

<%@page import="Entidad.Paciente"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    Paciente emp = (Paciente) request.getAttribute("paciente");
%>
<jsp:useBean id="pacienteBean1" class="JavaBeans.PacienteBean" scope="session">
</jsp:useBean>
<jsp:setProperty name="pacienteBean1" property ="codPac" value="<%=emp.getCodPac()%>" />
<jsp:setProperty name="pacienteBean1" property ="nomPac" value="<%=emp.getNomPac()%>" />
<jsp:setProperty name="pacienteBean1" property ="apePac" value="<%=emp.getApePac()%>" />
<jsp:setProperty name="pacienteBean1" property ="fecPac" value="<%=emp.getFecPac()%>" />
<jsp:setProperty name="pacienteBean1" property ="dniPac" value="<%=emp.getDniPac()%>" />
<jsp:setProperty name="pacienteBean1" property ="userPac" value="<%=emp.getUserPac()%>" />
<jsp:setProperty name="pacienteBean1" property ="passwordPac" value="<%=emp.getPasswordPac()%>" />
<jsp:setProperty name="pacienteBean1" property ="correoPac" value="<%=emp.getCorreoPac()%>" />
<%@include file="/header.jsp"%>
<br>
<div class="container">
    <div class="row">
        <div class="col-3"><%@include file="/menuPaciente.jsp"%></div>
        <div class="col-9"></div>
    </div>
</div>
<%@include file="/footer.jsp"%>
