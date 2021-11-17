<%-- 
    Document   : bodyManageHostCRUD
    Created on : Nov 1, 2021, 8:20:41 PM
    Author     : DiepHoangPhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="content-header clearfix">
    <h1 class="float-left">Host Detail</h1> 
</div>

<c:if test="${errMsg}!=null">
    <div class="alert alert-danger">${errMsg}</div>
</c:if>

<c:url value="/crudHost" var="action"/>
<form:form method="post" action="${action}" modelAttribute="crudHost">
    <div class="form-group row">
        <div class="col-md-3">
            <label class="col-form-label" for="ChuTri_ten"> 
                <spring:message code="diadiemtochuc.DDTC_ten" /> Name
            </label>
        </div>
        <div class="col-md-5">
            <form:input type="text" id="ChuTri_ten" path="ChuTri_ten" class="form-control text-box single-line"/>
        </div>
    </div><br>
    <div class="form-group row">
        <div class="col-md-3">
            <label class="col-form-label" for="ChuTri_gia">
                <spring:message code="diadiemtochuc.DDTC_SoBanMax" /> Price
            </label>
        </div>
        <div class="col-md-5">
            <form:input type="text" id="ChuTri_gia" path="ChuTri_gia" cssClass="form-control"/>
        </div>
    </div><br>
    <div class="form-group row">
        <div class="col-md-3">
            <label class="col-form-label" for= "GhiChu">
                <spring:message code="diadiemtochuc.DDTC_GhiChu" />
            </label>
        </div>
        <div class="col-md-5">
            <form:input type="text"  id="GhiChu" path="GhiChu" cssClass="form-control"/>
        </div>
    </div><br>
    <div class="form-group">
        <form:hidden path="ChuTri_id" />
        <c:if test="${crudHost.chuTri_id > 0}">
            <input type="submit" class="btn btn-warning" 
                   value="<spring:message code="diadiemtochuc.update" />" />
        </c:if>
        <c:if test="${crudHost.chuTri_id<= 0}">
            <input type="submit" class="btn btn-success" 
                   value="<spring:message code="diadiemtochuc.save" />" />
        </c:if>

    </div>
</form:form>
