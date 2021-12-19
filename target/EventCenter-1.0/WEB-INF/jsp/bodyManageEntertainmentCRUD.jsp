<%-- 
    Document   : bodyManageEntertainmentCRUD
    Created on : Nov 1, 2021, 11:31:18 PM
    Author     : DiepHoangPhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="content-header clearfix">
    <h1 class="float-left">Entertainment Detail</h1> 
</div>

<c:if test="${errMsg}!=null">
    <div class="alert alert-danger">${errMsg}</div>
</c:if>

<c:url value="/crudEnt" var="action"/>
<form:form method="post" action="${action}" modelAttribute="crudEnt">
    <div class="form-group row">
        <div class="col-md-3">
            <label class="col-form-label" for="GiaiTri_ten"> 
                Name
            </label>
        </div>
        <div class="col-md-5">
            <form:input type="text" id="GiaiTri_ten" path="GiaiTri_ten" class="form-control text-box single-line"/>
            <form:errors path="GiaiTri_ten" cssClass="text-danger" element="div"/>
        </div>
    </div><br>
    <div class="form-group row">
        <div class="col-md-3">
            <label class="col-form-label" for="GiaiTri_gia">
                Price
            </label>
        </div>
        <div class="col-md-5">
            <form:input type="number" id="GiaiTri_gia" path="GiaiTri_gia" cssClass="form-control"/>
            <form:errors path="GiaiTri_gia" cssClass="text-danger" element="div"/>
        </div>
    </div><br>
    <div class="form-group row">
        <div class="col-md-3">
            <label class="col-form-label" for= "GhiChu">
                Note
            </label>
        </div>
        <div class="col-md-5">
            <form:input type="text"  id="GhiChu" path="GhiChu" cssClass="form-control"/>
        </div>
    </div><br>
    <div class="form-group">
        <form:hidden path="GiaiTri_id" />
        <c:if test="${crudEnt.giaiTri_id> 0}">
            <input type="submit" class="btn btn-warning" 
                   value="<spring:message code="diadiemtochuc.update" />" />
        </c:if>
        <c:if test="${crudEnt.giaiTri_id<= 0}">
            <input type="submit" class="btn btn-success" 
                   value="<spring:message code="diadiemtochuc.save" />" />
        </c:if>
    </div>
</form:form>