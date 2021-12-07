<%-- 
    Document   : bodyManageService
    Created on : Oct 7, 2021, 6:25:46 PM
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
            <h1 class="float-left">Decoration</h1>
        </div>
        <div class="col-auto">
            <form   action="" class="d-flex">
                <input class="form-control me-2" type="search" name="kwtrangtri" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
    <div class="float-right">
        <a href="<c:url value="/crudDecor"/>" class="btn btn-primary">Add new</a>
    </div>
</div>
<!--<ul class="pagination" style="margin: auto;">
    <c:forEach begin="1" end="${Math.ceil(counter/6)}" var="page">
        <li class="page-item"><a class="page-link" href="<c:url value="/manageDecor" />?page=${page}">${page}</a></li>
        </c:forEach>
</ul>-->
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
        <c:forEach items="${trangtri}" var="trangtri"  >
            <tr id="trangtri${trangtri.trangTri_id}" class="align-middle">
                <td>${trangtri.trangTri_id}</td>  
                <td>${trangtri.trangTri_ten}</td>  
                <td>
                    <fmt:setLocale value="vi_VN"/>
                    <fmt:formatNumber value = "${trangtri.trangTri_gia}" /> VND
                </td> 
                <td>${trangtri.ghiChu}</td>  
 
                <td><a type="button"  class="editbtn" href="<c:url value="/crudDecor/?TrangTri_id=${trangtri.trangTri_id}" />" role="button"></a></td>
                <td><a type="button" href="javascript:;" class="deletebtn" onclick="deleteTrangTri(${trangtri.trangTri_id})">
                    </a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<script src="<c:url value="/js/js.js"/>" type="text/javascript"></script>


