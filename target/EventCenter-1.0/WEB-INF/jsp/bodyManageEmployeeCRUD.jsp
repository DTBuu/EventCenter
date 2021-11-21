<%-- 
    Document   : bodyManageEmployeeCRUD
    Created on : Oct 25, 2021, 8:21:20 AM
    Author     : DiepHoangPhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="content-header clearfix">
    <h1 class="float-left"> Information </h1> 
</div>

<c:if test="${errMsg}!=null">
    <div class="alert alert-danger">${errMsg}</div>
</c:if>

<c:url value="/crudEmployee" var="action"/>
<form:form method="post" action="${action}" modelAttribute="crudEmployee">
    <!--    form:errors path="DDTC_ten" cssClass="text-danger" element="div"/>-->
    <div class="form-group row">
        <div class="col-md-3">
            <label class="col-form-label" for="NhanVien_id"> ID dsfasd
                
            </label>
        </div>
        <div class="col-md-9">
            form:input type="text" id="NhanVien_id" path="NhanVien_id" class="form-control text-box single-line"/>
        </div>
    </div>
    <br>
    
    <!--    form:errors path="DDTC_ten" cssClass="text-danger" element="div"/>-->
    <div class="form-group row">
        <div class="col-md-3">
            <label class="col-form-label" for="Ho"> 
                First name
            </label>
        </div>
        <div class="col-md-5">
            <form:input type="text" id="Ho" path="Ho" class="form-control text-box single-line"/>
        </div>
    </div>
    <br>
    <!--    form:errors path="DDTC_ten" cssClass="text-danger" element="div"/>-->
    <div class="form-group row">
        <div class="col-md-3">
            <label class="col-form-label" for="Ten"> 
                Last name
            </label>
        </div>
        <div class="col-md-5">
            <form:input type="text" id="Ten" path="Ten" class="form-control text-box single-line"/>
        </div>
    </div>
    <br>
    <!--    form:errors path="DDTC_ten" cssClass="text-danger" element="div"/>-->
    <div class="form-group row">
        <div class="col-md-3">
            <label class="col-form-label" for="NgaySinh"> 
                Date of birth 
            </label>
        </div>
        <div class="col-md-5">
            <form:input type="date" id="NgaySinh" path="NgaySinh" class="form-control text-box single-line"/>
        </div>
    </div>
    <br>
    <!--    form:errors path="DDTC_ten" cssClass="text-danger" element="div"/>-->
    <div class="form-group row">
        <div class="col-md-3">
            <label class="col-form-label" for="QueQuan"> 
                Address
            </label>
        </div>
        <div class="col-md-5">
            <form:input type="text" id="QueQuan" path="QueQuan" class="form-control text-box single-line"/>
        </div>
    </div>
    <br>
    <!--    form:errors path="DDTC_ten" cssClass="text-danger" element="div"/>-->
    <div class="form-group row">
        <div class="col-md-3">
            <label class="col-form-label" for="Sdt"> 
                Phone number
            </label>
        </div>
        <div class="col-md-5">
            <form:input type="text" id="Sdt" path="Sdt" class="form-control text-box single-line"/>
        </div>
    </div>
    <br>
    <!--    form:errors path="DDTC_ten" cssClass="text-danger" element="div"/>-->
    <div class="form-group row">
        <div class="col-md-3">
            <label class="col-form-label" for="Email"> 
                Mail address
            </label>
        </div>
        <div class="col-md-5">
            <form:input type="text" id="Email" path="Email" class="form-control text-box single-line"/>
        </div>
    </div>
    <br>
    <div class="form-group row">
        <div class="col-md-3">
            <label for="cate">Roles</label>
        </div>
        <div class="col-md-5">
            <form:select id="cate" path="Login" cssClass="form-control">
                <c:forEach items="${login}" var="cat">
                    <c:if test="${cat.login_id == crudEmployee.login.login_id}">
                        <option selected="" value="${cat.login_id}" >${cat.login_loai}</option>
                    </c:if>
                    <c:if test="${cat.login_id != crudEmployee.login.login_id}">
                    <option value="${cat.login_id}" >${cat.login_loai}</option>
                    </c:if>
                </c:forEach>
            </form:select>
        </div>

        <!--                form:errors path="Login" cssClass="text-danger" />-->
    </div>
    <br>
    
    <div class="form-group row">
        <div class="col-md-3">
            <label for="cate">Position</label>
        </div>
        <div class="col-md-5">
            <form:select id="cate" path="ViTri" cssClass="form-control">
                <c:forEach items="${vitri}" var="cat">
                    <c:if test="${cat.viTri_id == crudEmployee.viTri.viTri_id}">
                    <option selected value="${cat.viTri_id}" >${cat.viTri_ten}</option>
                    </c:if>
                    <c:if test="${cat.viTri_id != crudEmployee.viTri.viTri_id}">
                    <option value="${cat.viTri_id}" >${cat.viTri_ten}</option>
                    </c:if>
                </c:forEach>
            </form:select>
            <!--                    form:errors path="Login" cssClass="text-danger" />-->
        </div>
    </div>

<!--    <div class="form-group">
        <input type="submit" value="Confirm" class="btn btn-primary"/>
    </div>-->

            <div class="form-group">
                <form:hidden path="NhanVien_id" />
                <c:if test="${crudEmployee.nhanVien_id> 0}">
                    <input type="submit" class="btn btn-warning" 
                           value="<spring:message code="nhanvien.update" />" />
                </c:if>
                <c:if test="${crudEmployee.nhanVien_id<= 0}">
                    <input type="submit" class="btn btn-success" 
                           value="<spring:message code="nhanvien.save" />" />
                </c:if>
        
            </div>
</form:form>
