<%-- 
    Document   : bodyManageServe
    Created on : Oct 24, 2021, 2:23:48 PM
    Author     : DiepHoangPhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="content-header clearfix">
    <h1 class="float-left">Halls</h1> 
    <div class="float-right">
        <div class="btn-group" role="group">
            <a href="<c:url value="/crudServe"/>" class="btn btn-primary">Add new</a>
        </div>
    </div>
</div>

<table class="table" id="table-hall">
    <thead class="table-dark">
        <tr>
<!--            <th rowspan="1" colspan="1">
                <div>
                    <label> <input type="checkbox" class="check" id="checkAll"></label>
                </div>
            </th>-->
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
<!--                <td>
                    <div class="checkbox">
                        <label><input name="DDTC_id" value="$\{sanh.DDTC_id}" type="checkbox" class="checkboxsanhtiec"></label>
                    </div>
                </td>-->
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
