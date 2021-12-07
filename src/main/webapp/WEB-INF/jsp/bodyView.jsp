<%-- 
    Document   : bodyView
    Created on : Nov 17, 2021, 9:26:08 AM
    Author     : DiepHoangPhi
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--<h1 class="text-center text-danger"></h1>-->
<br>
<div class="container">
    <form action="">
        <div class="clearfix">
            <input class="form-control" type="text" name="kw" placeholder="Search" />
            &ensp;<input type="submit" value="Search" class="btn btn-danger" />
        </div>
    </form>
</div>

<div class="row">
    <c:forEach var="v" items="${view}">
        <div class="col-md-4 col-xs-9" style="padding: 20px">
            <div class="card" style="width: 18rem; height: 20rem ">
                <a href="<c:url value="/pageEvent/${v.DDTC_id}" />">
                    <c:choose>
                        <c:when test="${v.DDTC_hinhanh!= null && v.DDTC_hinhanh.startsWith('https') == true}">
                            <img class="card-img-top img-fluid" src="${v.DDTC_hinhanh}" alt="Card image">
                        </c:when>
                        <c:when test="${v.DDTC_hinhanh == null || v.DDTC_hinhanh.startsWith('https') == false}">
                            <img class="card-img-top img-fluid" src="<c:url value="/images/default.png" />" alt="Card image">
                        </c:when>
                    </c:choose>
                </a>
                <div class="card-body">
                    <h4 class="card-title">${v.DDTC_ten}</h4>
                    <p class="card-text">${v.DDTC_GiaMotBan} VND</p>
                </div>
            </div>
        </div>
    </c:forEach>
</div>
<div class="page-content page-container" id="page-content">
    <div class="padding">
        <div class="row container d-flex justify-content-center">
            <div class="col-md-4 col-sm-6 grid-margin stretch-card">
                <nav>
                    <ul class="pagination d-flex justify-content-center flex-wrap pagination-flat pagination-success" style="margin: auto;">
                        <c:forEach begin="1" end="${Math.ceil(counter/6)}" var="page">
                            <li class="page-item"><a class="page-link" href="<c:url value="/pageEvent" />?page=${page}">${page}</a></li>
                            </c:forEach>
                    </ul>
                </nav>
            </div>
        </div>
    </div>
</div>
<hr>
