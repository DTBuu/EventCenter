<%-- 
    Document   : bodyManageHallCRUD
    Created on : Oct 16, 2021, 8:38:20 PM
    Author     : DiepHoangPhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="content-header clearfix">
    <h1 class="float-left">Halls Information </h1> 
</div>

<c:if test="${errMsg}!=null">
    <div class="alert alert-danger">${errMsg}</div>
</c:if>

<c:url value="/crudHall" var="action"/>
<form:form method="post" action="${action}" modelAttribute="crudHall">
    <div class="form-group row">
        <div class="col-md-3">
            <label class="col-form-label" for="DDTC_ten"> 
                <spring:message code="diadiemtochuc.DDTC_ten" />
            </label>
        </div>
        <div class="col-md-9">
            <form:input type="text" id="DDTC_ten" path="DDTC_ten" class="form-control text-box single-line"/>
            <form:errors path="DDTC_ten" cssClass="text-danger" element="div"/>
        </div>
    </div>

    <div class="form-group row">
        <div class="col-md-3">
            <label class="col-form-label" for="DDTC_SoBanMax">
                <spring:message code="diadiemtochuc.DDTC_SoBanMax" />
            </label>
        </div>
        <div class="col-md-9">
            <form:input type="text" id="DDTC_SoBanMax" path="DDTC_SoBanMax" cssClass="form-control"/>
            <form:errors path="DDTC_SoBanMax" cssClass="text-danger" element="div"/>
        </div>
    </div>

    <div class="form-group row">
        <div class="col-md-3">
            <label class="col-form-label" for= "DDTC_GiaMotBan">
                <spring:message code="diadiemtochuc.DDTC_GiaMotBan" />
            </label>
        </div>
        <div class="col-md-9">
            <form:input type="text"  id="DDTC_GiaMotBan" path="DDTC_GiaMotBan" cssClass="form-control"/>
            <form:errors path="DDTC_GiaMotBan" cssClass="text-danger" element="div"/>
        </div>

    </div>
    <div class="form-group row">
        <div class="col-md-3">
            <label class="col-form-label" for= "DDTC_GhiChu">
                <spring:message code="diadiemtochuc.DDTC_GhiChu" />
            </label>
        </div>
        <div class="col-md-9">
            <form:input type="text"  id="DDTC_GhiChu" path="DDTC_GhiChu" cssClass="form-control"/>
            <form:errors path="DDTC_GhiChu" cssClass="text-danger" element="div"/>
        </div>
    </div>
    <!--    <div class="form-group">
            <input type="submit" value="Confirm" class="btn btn-primary"/>
        </div>-->
    <div class="form-group">
        <form:hidden path="DDTC_id" />
        <c:if test="${crudHall.DDTC_id > 0}">
            <input type="submit" class="btn btn-warning" 
                   value="<spring:message code="diadiemtochuc.update" />" />
        </c:if>
        <c:if test="${crudHall.DDTC_id <= 0}">
            <input type="submit" class="btn btn-success" 
                   value="<spring:message code="diadiemtochuc.save" />" />
        </c:if>

    </div>
</form:form>


