<%-- 
    Document   : bodyManageMenu
    Created on : Oct 26, 2021, 10:40:20 PM
    Author     : DiepHoangPhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="content-header clearfix">
    <h1 class="float-left">Menus</h1> 
    <div class="float-right">
        <div class="btn-group" role="group">
            <a href="<c:url value="/crudMenu"/>" class="btn btn-primary">Add new</a>
        </div>
    </div>
</div>

<table class="table" id="table-hall">
    <thead class="table-dark">
        <tr>
            <th style="width:100px;">ID</th>
            <th style="width:300px;">Name</th>
            <th style="width:100px;"> </th>
            <th style="width:100px;"> </th>
        </tr>
    </thead>
    <c:forEach items="${m}" var="ten"  >
    <tbody>
        <tbody class="labels">
            <tr>
                <td colspan="6">
                    <label for="ten">${ten.menuten}</label>
                    <input type="checkbox" name="ten" id="ten${ten.menuid}"  data-toggle="toggle">
                    <a type="button"  class="editbtn" href="<c:url value="/crudMenu/?itemsInMenusPK=${ten.menuid}" />" role="button"></a>
                    <a type="button" href="javascript:;" class="deletebtn" onclick="#">
                    </a>
                </td>
            </tr>
        </tbody>
        <tbody class="hide" >
            <c:forEach var="item" items="${menus}">
                <tr id="item${item.itemsInMenusPK}" class="align-middle">
                    <c:if test="${ten.menuid eq item.itemsInMenusPK.menuid}">
                        <td>${item.itemsInMenusPK.itemid}</td> 
                        <td>${item.items.itemten}</td> 
                        <td>${item.items .itemloai}</td> 
                        <td></td> 
                    </c:if>
                </tr>
            </c:forEach>
        </tbody>        
    </tbody>
</c:forEach>
</table>

<script src="<c:url value="/js/js.js"/>" type="text/javascript"></script>