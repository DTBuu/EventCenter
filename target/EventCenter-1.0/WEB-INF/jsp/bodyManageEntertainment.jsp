<%-- 
    Document   : bodyManageEntertainment
    Created on : Oct 23, 2021, 10:14:17 PM
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
            <h1 class="float-left">Entertainment</h1>
        </div>
        <div class="col-auto">
            <form   action="" class="d-flex">
                <input class="form-control me-2" type="search" name="kwgiaitri" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
    <div class="float-right">
        <a href="<c:url value="/crudEnt"/>" class="btn btn-primary">Add new</a>
    </div>
</div>
<ul class="pagination" style="margin: auto;">
    <c:forEach begin="1" end="${Math.ceil(counter/6)}" var="page">
        <li class="page-item"><a class="page-link" href="<c:url value="/manageEnt" />?page=${page}">${page}</a></li>
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
        <c:forEach items="${giaitri}" var="giaitri"  >
            <tr id="giaitri${giaitri.giaiTri_id}" class="align-middle">
                <td>${giaitri.giaiTri_id}</td> 
                <td>${giaitri.giaiTri_ten}</td> 
                <td>
                    <fmt:setLocale value="vi_VN"/>
                    <fmt:formatNumber value = "${giaitri.giaiTri_gia}" /> VND
                </td> 
                <td>${giaitri.ghiChu}</td> 
 
                <td><a type="button"  class="editbtn" href="<c:url value="/crudEnt/?GiaiTri_id=${giaitri.giaiTri_id}" />" role="button"></a></td>
                <td><a type="button" href="javascript:;" class="deletebtn" onclick="deleteGiaiTri(${giaitri.giaiTri_id})">
                    </a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<script src="<c:url value="/js/js.js"/>" type="text/javascript"></script>

