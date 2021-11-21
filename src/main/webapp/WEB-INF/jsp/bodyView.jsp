<%-- 
    Document   : bodyView
    Created on : Nov 17, 2021, 9:26:08 AM
    Author     : DiepHoangPhi
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<br>
<br>
<br>
<h1 class="text-center text-danger"></h1>
<div class="row">
    <c:forEach var="v" items="${view}">
    <div class="col-md-4 col-xs-12" style="padding: 10px">
        <div class="card">
            <a href="<c:url value="/products/${v.DDTC_id}" />">
                        <img class="card-img-top img-fluid" src="#" alt="Card image">
            </a>
            <div class="card-body">
              <h4 class="card-title">${v.DDTC_ten}</h4>
              <p class="card-text">${v.DDTC_GiaMotBan} VND</p>
            </div>
        </div>
        
    </div>
    </c:forEach>
</div>
<hr>
