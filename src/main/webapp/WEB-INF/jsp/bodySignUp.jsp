<%-- 
    Document   : bodySignUp
    Created on : Sep 9, 2021, 8:46:13 AM
    Author     : Buu Duong Tan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<h1>Sign Up</h1>

<core:if test="${errMess != null}">
    <div class="alert alert-danger">
        ${errMess}
    </div>
</core:if>


<div class="bodySignUp">
    <core:url value="/sign-up" var="signup"/>
    <form:form method="post" action="${signup}" modelAttribute="newLogin">
        <form:input type="text" path="tempHo" placeholder=" Họ và tên lót"/>
        <form:input type="text" path="tempTen" placeholder=" Tên"/>
        <form:input type="text" path="tempNgaySinh" placeholder=" Ngày sinh"/>
        <form:input type="text" path="tempQueQuan" placeholder=" Quê quán"/>
        <form:input type="text" path="tempSdt" placeholder=" Số điện thoại"/>
        <form:input type="text" path="tempEmail" placeholder=" Email"/>
        
        <form:input type="text" path="Login_user" placeholder=" Username"/>
        <form:input type="password" path="Login_pass" placeholder=" Password"/>
        <form:input type="password" path="confirmPass" placeholder=" Retype password"/>
        
        <button class="btn-sign-up" type="submit">sign up</button>
    </form:form>
        
</div>





<%--<core:url value="/register" var="action"/>--%>
<%--<form:form method="post" action="${action}" modelAttribute="login">--%>
    <!--<div class="form-group">-->
        <!--<label for="type">Type</label>-->
        <%--<form:input type="text" id="type" path="Login_loai" class="form-control"/>--%>
    <!--</div>-->
    <!--<div class="form-group">-->
        <!--<label for="user">Username</label>-->
        <%--<form:input type="text" id="user" path="Login_user" class="form-control"/>--%>
    <!--</div>-->
    <!--<div class="form-group">-->
        <!--<label for="pass">Password</label>-->
        <%--<form:input type="password" id="pass" path="Login_pass" class="form-control"/>--%>
    <!--</div>-->
    <!--<div class="form-group">-->
        <!--<label for="confirm-pass">Confirm Password</label>-->
        <%--<form:input type="password" id="confirm-pass" path="confirm_pass" class="form-control"/>--%>
    <!--</div>-->
    <!--<div class="form-group">-->
        <!--<input type="submit" value="Sign Up"/>-->
    <!--</div>-->
<%--</form:form>--%>