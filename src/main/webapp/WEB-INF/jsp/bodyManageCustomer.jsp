<%-- 
    Document   : bodyManageCustomer
    Created on : Oct 24, 2021, 9:07:20 PM
    Author     : DiepHoangPhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="content-header clearfix">
    <h1 class="float-left">Staff</h1> 
    <!--button add,edit,delete-->
    <div class="float-right">
        <button class="btn btn-primary" href="#">
            <i class="fa-plus-square"></i>
            Add new
        </button>
    </div>
</div>

<table class="table">
    <thead class="table-dark">
        <tr>
<!--            <th rowspan="1" colspan="1">
                <input class="mastercheckbox" type="checkbox">
            </th>-->
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
<!--                <td class="align-middle">
                    <input name="checkboxSanh" value="1" type="checkbox" class="checkboxGroups">
                </td>-->
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

