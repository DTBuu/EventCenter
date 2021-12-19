<%-- 
    Document   : bodyManageServe
    Created on : Oct 24, 2021, 2:23:48 PM
    Author     : DiepHoangPhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<br>
<br>
<div class="container-fluid">
    <div class="row g-3 align-items-center">
        <div class="col-auto">
            <h1 class="float-left">Serve</h1>
        </div>
        <div class="col-auto">
            <form   action="" class="d-flex">
                <input class="form-control me-2" type="search" name="kwphucvu" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
    <div class="float-right">
        <a href="<c:url value="/crudServe"/>" class="btn btn-primary">Add new</a>
    </div>
</div>
<ul class="pagination" style="margin: auto;">
    <c:forEach begin="1" end="${Math.ceil(counter/6)}" var="page">
        <li class="page-item"><a class="page-link" href="<c:url value="/manageServe" />?page=${page}">${page}</a></li>
        </c:forEach>
</ul>
<table class="table" id="table-hall">
    <thead class="table-dark">
        <tr>
            <th style="width:100px;">ID</th>
            <th style="width:300px;">Name</th>
            <th style="width:200px;">Price</th>
            <th style="width:200px;">Note</th>
            <th style="width:100px;"> </th>
            <th style="width:100px;"> </th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${phucvu}" var="phucvu"  >
            <tr id="phucvu${phucvu.phucVu_id}" class="align-middle">
                <td>${phucvu.phucVu_id}</td>  
                <td>${phucvu.phucVu_ten}</td>  
                <td>
                    <fmt:setLocale value="vi_VN"/>
                    <fmt:formatNumber value = "${phucvu.phucVu_gia}" /> VND
                </td> 
                <td>${phucvu.ghiChu}</td>  
                <td><a type="button"  class="editbtn" href="<c:url value="/crudServe/?PhucVu_id=${phucvu.phucVu_id}" />" role="button"></a></td>
                <td><a type="button" href="javascript:;" class="deletebtn" onclick="deletePhucVu(${phucvu.phucVu_id})">
                    </a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<script src="<c:url value="/js/js.js"/>" type="text/javascript"></script>
