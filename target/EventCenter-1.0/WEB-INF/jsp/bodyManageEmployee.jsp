<%-- 
    Document   : bodyManageEmployee
    Created on : Oct 7, 2021, 6:25:28 PM
    Author     : DiepHoangPhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<div class="content-header clearfix">
    <h1 class="float-left">Employees</h1> 
    <div class="float-right">
        <div class="btn-group" role="group">
            <a href="<c:url value="/crudEmployee"/>" class="btn btn-primary">Add new</a>
        </div>
    </div>
</div>
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

