<%-- 
    Document   : bodyManageEmployee
    Created on : Oct 7, 2021, 6:25:28 PM
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
            <h1 class="float-left">Employee</h1>
        </div>
        <div class="col-auto">
            <form   action="" class="d-flex">
                <input class="form-control me-2" type="search" name="kw" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
    <div class="float-right">
        <a href="<c:url value="/crudEmployee"/>" class="btn btn-primary">Add new</a>
    </div>
</div>
<ul class="pagination" style="margin: auto;">
    <c:forEach begin="1" end="${Math.ceil(counter/6)}" var="page">
        <li class="page-item"><a class="page-link" href="<c:url value="/manageEmployee" />?page=${page}">${page}</a></li>
        </c:forEach>
</ul>
<table class="table">
    <thead class="table-dark">
        <tr>
            <th>ID</th>
            <th>Full Name</th>
            <th>Roles</th>
            <th>Position</th>
            <th>Birthday</th>
            <th>Address</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Note</th>
            <th> </th>
            <th> </th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${nhanvien}" var="n">
            <tr id="n{n.nhanVien_id}" class="align-middle">
                <td>${n.nhanVien_id}</td>
                <td>${n.ho} ${n.ten}</td>
                <td>${n.login.login_loai}</td>
                <td>${n.viTri.viTri_ten}</td>
                <td><fmt:formatDate pattern = "yyyy-MM-dd" value = "${n.ngaySinh}" /></td>
                <td>${n.queQuan}</td>
                <td>${n.sdt}</td>
                <td>${n.email}</td>
                <td>${n.ghiChu}</td>
                <td><a type="button"  class="editbtn" href="<c:url value="/crudEmployee/?NhanVien_id=${n.nhanVien_id}" />" role="button"></a></td>
                <td><a type="button" href="javascript:;" class="deletebtn" onclick="deleteNhanVien(${n.nhanVien_id})">
                    </a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</div>

<script src="<c:url value="/js/js.js"/>" type="text/javascript"></script>

