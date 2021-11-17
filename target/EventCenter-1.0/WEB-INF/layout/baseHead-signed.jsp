<%-- 
    Document   : baseHead-signed
    Created on : Sep 8, 2021, 6:03:11 PM
    Author     : Buu Duong Tan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>

<img src="<core:url value="/img/logo.png"/>" class="logo"/>
<ul class="nav-bar">
    <li class="nav-item">
        <a class="nav-item-link" href="<core:url value="/HomeManager"/>">
            <i class="uil uil-estate"></i>
            Home
        </a>
    </li>
    <li class="nav-item">
        <a class="nav-item-link" href="<core:url value="/Dashboard"/>">
            <i class="uil uil-dashboard"></i>
            Dashboard
        </a>
    </li>
    <li class="nav-item">
        <a class="nav-item-link" href="<core:url value="/tab"/>" onclick="myFunction()">
            <i class="uil uil-apps"></i>
            Management
        </a>
    </li>
    <li class="nav-item">
        <a class="nav-item-sign-out" href="<core:url value="/sign-in"/>" onclick="myFunction()">
            <i class="uil uil-sign-out-alt"></i>
            Sign out
        </a>
    </li>
</ul>
<a class="nav-item-user-box" href="#">
    <i class="uil uil-user-square"></i>
    ${pageContext.request.userPrincipal.name}
</a>
</div>
