<%-- 
    Document   : bodyManageCustomer
    Created on : Oct 24, 2021, 9:07:20 PM
    Author     : DiepHoangPhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<br>
<br>
<div class="container-fluid">
    <div class="row g-3 align-items-center">
        <div class="col-auto">
            <h1 class="float-left">Customer</h1>
        </div>
        <div class="col-auto">
            <form   action="" class="d-flex">
                <input class="form-control me-2" type="search" name="kw" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
    <div class="float-right">
        <a href="<c:url value="/"/>" class="btn btn-primary">Add new</a>
    </div>
</div>
<ul class="pagination" style="margin: auto;">
    <c:forEach begin="1" end="${Math.ceil(counter/6)}" var="page">
        <li class="page-item"><a class="page-link" href="<c:url value="/manageCustomer" />?page=${page}">${page}</a></li>
        </c:forEach>
</ul>
<table class="table">
    <thead class="table-dark">
        <tr>
            <th>ID</th>
            <th>Full Name</th>
            <th>Roles</th>
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
        <c:forEach items="${khachhang}" var="khachhang">
            <tr id="khachhang${khachhang.khachHang_id}" class="align-middle">
                <td>${khachhang.khachHang_id}</td>
                <td>${khachhang.ho} ${khachhang.ten}</td>
                <td>${khachhang.login.login_loai}</td>
                <td>${khachhang.ngaySinh}</td>
                <td>${khachhang.queQuan}</td>
                <td>${khachhang.sdt}</td>
                <td>${khachhang.email}</td>
                <td>${khachhang.ghiChu}</td>
                <td><a type="button"  class="editbtn" href="#" role="button"></a></td>
                <td><a type="button" href="javascript:;" class="deletebtn" onclick="#">
                    </a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</div>

