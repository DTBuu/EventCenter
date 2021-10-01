<%-- 
    Document   : bodySignIn
    Created on : Sep 8, 2021, 4:23:57 PM
    Author     : Buu Duong Tan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>




<div class="bodySignIn">
    <form method="POST" action="<core:url value="/sign-in"/>" class="form-sign-in">
        <!-- Username<br> -->
        <i class="uil uil-user-circle"></i>
        <input type="text" name="Login_user" placeholder=" Username"/>
        <br>
        <!-- Password<br> -->
        <i class="uil uil-keyhole-circle"></i>
        <input type="password" name="Login_pass" placeholder=" Password">
        <br>
        <core:if test="${param.fail != null}">
            <div class="err-mess-box">
                Your Username or Password is incorrect !<br>
                Please try again...
            </div>
        </core:if>
        <button class="btn-sign-in" type="submit">sign in</button>
        <br>
        <a href="<core:url value="/sign-up"/>" class="sign-up-link">sign up</a>
    </form>
</div> 