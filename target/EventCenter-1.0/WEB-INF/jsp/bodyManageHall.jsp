<%-- 
    Document   : bodyManageHall
    Created on : Oct 7, 2021, 10:25:27 AM
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
            <h1 class="float-left">Halls</h1>
        </div>
        <div class="col-auto">
            <form   action="" class="d-flex">
                <input class="form-control me-2" type="search" name="kw" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
    <div class="float-right">
        <a href="<c:url value="/crudHall"/>" class="btn btn-primary">Add new</a>
    </div>
</div>
<ul class="pagination" style="margin: auto;">
    <c:forEach begin="1" end="${Math.ceil(counter/6)}" var="page">
        <li class="page-item"><a class="page-link" href="<c:url value="/manageHall" />?page=${page}">${page}</a></li>
        </c:forEach>
</ul>
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
            <th style="width:100px;">Table quantity</th>
            <th style="width:200px;">Table Price</th>
            <th style="width:200px;">Note</th>
            <th style="width:100px;"> </th>
            <th style="width:100px;"> </th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${sanhtiec}" var="sanh"  >
            <tr id="sanh${sanh.DDTC_id}" class="align-middle">
                <!--                <td>
                                    <div class="checkbox">
                                        <label><input name="DDTC_id" value="$\{sanh.DDTC_id}" type="checkbox" class="checkboxsanhtiec"></label>
                                    </div>
                                </td>-->
                <td>${sanh.DDTC_id}</td> 
                <td>${sanh.DDTC_ten}</td> 
                <td>${sanh.DDTC_SoBanMax}</td> 
                <td>
                    <fmt:setLocale value="vi_VN"/>
                    <fmt:formatNumber value = "${sanh.DDTC_GiaMotBan}" /> VND
                </td> 
                <td>${sanh.DDTC_GhiChu}</td> 
                <td><a type="button"  class="editbtn" href="<c:url value="/crudHall/?DDTC_id=${sanh.DDTC_id}" />" role="button"></a></td>
                <td><a type="button" href="javascript:;" class="deletebtn" onclick="deleteSanh(${sanh.DDTC_id})">
                    </a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<script src="<c:url value="/js/js.js"/>" type="text/javascript"></script>

