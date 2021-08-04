<%-- 
    Document   : displayDoctor
    Created on : 18-may-2021, 12:31:10
    Author     : edicz
--%>
<%@page import="Entidad.Doctor"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    Doctor emp = (Doctor) request.getAttribute("doctor");
%>
<jsp:useBean id="doctorBean1" class="JavaBeans.DoctorBean" scope="session">
</jsp:useBean>
<jsp:setProperty name="doctorBean1" property ="codDoc" value="<%=emp.getCodDoc()%>" />
<jsp:setProperty name="doctorBean1" property ="nomDoc" value="<%=emp.getNomDoc()%>" />
<jsp:setProperty name="doctorBean1" property ="apeDoc" value="<%=emp.getApeDoc()%>" />
<jsp:setProperty name="doctorBean1" property ="fecDoc" value="<%=emp.getFecDoc()%>" />
<jsp:setProperty name="doctorBean1" property ="dniDoc" value="<%=emp.getDniDoc()%>" />
<jsp:setProperty name="doctorBean1" property ="userDoc" value="<%=emp.getUserDoc()%>" />
<jsp:setProperty name="doctorBean1" property ="passwordDoc" value="<%=emp.getPasswordDoc()%>" />
<jsp:setProperty name="doctorBean1" property ="idEsp" value="<%=emp.getIdEsp()%>" />
<%@include file="/header.jsp"%>
<br>
<div class="container">
    <div class="row">
        <div class="col-3"><%@include file="/menuDoctor.jsp"%></div>
        <div class="col-9"></div>
    </div>
</div>
<%@include file="/footer.jsp"%>
