<%-- 
    Document   : bodyManageHost
    Created on : Oct 23, 2021, 9:49:53 PM
    Author     : DiepHoangPhi
--%>

<%-- 
    Document   : bodyManageHall
    Created on : Oct 7, 2021, 10:25:27 AM
    Author     : DiepHoangPhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="content-header clearfix">
    <h1 class="float-left">Hosts</h1> 
    <div class="float-right">
        <div class="btn-group" role="group">
            <a href="<c:url value="/crudHost"/>" class="btn btn-primary">Add new</a>
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
        <c:forEach items="${chutri}" var="chutri"  >
            <tr id="chutri${chutri.chuTri_id}" class="align-middle">
                <td>${chutri.chuTri_id}</td> 
                <td>${chutri.chuTri_ten}</td> 
                <td>
                    <fmt:setLocale value="vi_VN"/>
                    <fmt:formatNumber value = "${chutri.chuTri_gia}" /> VND
                </td> 
                <td>${chutri.ghiChu}</td> 

                <td><a type="button"  class="editbtn" href="<c:url value="/crudHost/?ChuTri_id=${chutri.chuTri_id}" />" role="button"></a></td>
                <td><a type="button" href="javascript:;" class="deletebtn" onclick="deleteChuTri(${chutri.chuTri_id})"></a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<script src="<c:url value="/js/js.js"/>" type="text/javascript"></script>


