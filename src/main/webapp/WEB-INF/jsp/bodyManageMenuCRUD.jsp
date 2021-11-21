<%-- 
    Document   : bodyManageMenuCRUD
    Created on : Oct 29, 2021, 2:32:45 PM
    Author     : DiepHoangPhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="content-header clearfix">
    <h1 class="float-left">Menu Detail</h1> 
</div>

<c:if test="${errMsg}!=null">
    <div class="alert alert-danger">${errMsg}</div>
</c:if>

<c:url value="/crudMenu" var="action"/>
<form:form method="post" action="${action}" modelAttribute="crudMenu">
    
    <div class="form-group row">
        <div class="col-md-3">
            <label class="col-form-label" for="menu"> 
                Menu id
            </label>
        </div>
        <div class="col-md-5">
            <form:input type="text" id="menu" path="itemsInMenusPK.menuid" class="form-control text-box single-line"/>
        </div>
    </div><br>
        
    <div class="form-group row">
        <div class="col-md-1">
            <label class="col-form-label" for="items"> 
                Item id 1
            </label>
        </div>
        <div class="col-md-2">
            <form:input type="text" id="items" path="itemsInMenusPK.itemid" class="form-control text-box single-line"/>
        </div>
        <div class="col-md-1">
            <label class="col-form-label" for="giaMotDV"> 
                giaMotDV
            </label>
        </div>
        <div class="col-md-2">
            <form:input type="text" id="giaMotDV" path="giaMotDV" class="form-control text-box single-line"/>
        </div>
        <div class="col-md-1">
            <label class="col-form-label" for="soLuong"> 
                soLuong
            </label>
        </div>
        <div class="col-md-1">
            <form:input type="text" id="soLuong" path="soLuong" class="form-control text-box single-line"/>
        </div>
    </div>
        <br>
        
    <div class="form-group row">
        <div class="col-md-1">
            <label class="col-form-label" for="items"> 
                Item id 2
            </label>
        </div>
        <div class="col-md-2">
            <form:input type="text" id="items" path="itemsInMenusPK.itemid" class="form-control text-box single-line"/>
        </div>
        <div class="col-md-1">
            <label class="col-form-label" for="giaMotDV"> 
                giaMotDV
            </label>
        </div>
        <div class="col-md-2">
            <form:input type="text" id="giaMotDV" path="giaMotDV" class="form-control text-box single-line"/>
        </div>
        <div class="col-md-1">
            <label class="col-form-label" for="soLuong"> 
                soLuong
            </label>
        </div>
        <div class="col-md-1">
            <form:input type="text" id="soLuong" path="soLuong" class="form-control text-box single-line"/>
        </div>
    </div>
        <br>
<!--    <div class="form-group row">
        <div class="col-md-3">
            <label class="col-form-label" for="giaMotDV"> 
                giaMotDV
            </label>
        </div>
        <div class="col-md-3">
            <form:input type="text" id="giaMotDV" path="giaMotDV" class="form-control text-box single-line"/>
        </div>
    </div>
        
    <div class="form-group row">
        <div class="col-md-3">
            <label class="col-form-label" for="soLuong"> 
                soLuong
            </label>
        </div>
        <div class="col-md-5">
            <form:input type="text" id="soLuong" path="soLuong" class="form-control text-box single-line"/>
        </div>
    </div>-->

        
   

        
            <br>
            <br>
            <br>
        <div class="form-group">
            <input type="submit" value="Confirm" class="btn btn-primary"/>
        </div>
</form:form>



