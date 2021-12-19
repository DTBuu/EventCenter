<%-- 
    Document   : bodyManageHostCRUD
    Created on : Nov 1, 2021, 8:20:41 PM
    Author     : DiepHoangPhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="content-header clearfix">
    <h1 class="float-left">Host Detail</h1> 
</div>

<c:if test="${errMsg}!=null">
    <div class="alert alert-danger">${errMsg}</div>
</c:if>

<c:url value="/crudHost" var="action"/>
<form:form method="post" action="${action}" modelAttribute="crudHost">
    <div class="form-group row">
        <div class="col-md-3">
            <label class="col-form-label" for="ChuTri_ten"> 
                Name
            </label>
        </div>
        <div class="col-md-5">
            <form:input type="text" id="ChuTri_ten" path="ChuTri_ten" class="form-control text-box single-line"/>
            <form:errors path="ChuTri_ten" cssClass="text-danger" element="div"/>
        </div>
    </div><br>
    <div class="form-group row">
        <div class="col-md-3">
            <label class="col-form-label" for="ChuTri_gia">
                Price
            </label>
        </div>
        <div class="col-md-5">
            <form:input type="number" id="ChuTri_gia" path="ChuTri_gia" cssClass="form-control"/>
<!--            <script>
                var formatter = new Intl.NumberFormat('en-US', {
                    style: 'currency',
                    currency: 'USD',
                });

                document.querySelector('#ChuTri_gia').addEventListener('change', (e) => {
                    if (isNaN(e.target.value)) {
                        e.target.value = ''
                    } else {
                        e.target.value = formatter.format(e.target.value);
                    }
                })
            </script>-->
            <form:errors path="ChuTri_gia" cssClass="text-danger" element="div"/>
        </div>
    </div><br>
    <div class="form-group row">
        <div class="col-md-3">
            <label class="col-form-label" for= "GhiChu">
                <!--                spring:message code="diadiemtochuc.DDTC_GhiChu" />-->
                Note
            </label>
        </div>
        <div class="col-md-5">
            <form:input type="text"  id="GhiChu" path="GhiChu" cssClass="form-control"/>
        </div>
    </div><br>
    <div class="form-group">
        <form:hidden path="ChuTri_id" />
        <c:if test="${crudHost.chuTri_id > 0}">
            <input type="submit" class="btn btn-warning" 
                   value="<spring:message code="diadiemtochuc.update" />" />
        </c:if>
        <c:if test="${crudHost.chuTri_id<= 0}">
            <input type="submit" class="btn btn-success" 
                   value="<spring:message code="diadiemtochuc.save" />" />
        </c:if>

    </div>
</form:form>
