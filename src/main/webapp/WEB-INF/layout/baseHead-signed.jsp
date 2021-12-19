<%-- 
    Document   : baseHead-signed
    Created on : Sep 8, 2021, 6:03:11 PM
    Author     : Buu Duong Tan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>

<core:if test="${pageContext.request.userPrincipal.name != null}">
    <!--    <img src="core:url value="/img/logo.png"/>" class="logo"/>-->
    <ul class="nav-bar">
        <li class="nav-item">
            <a class="nav-item-link" href="<core:url value="/HomeManager"/>">
                <i class="uil uil-estate"></i>
                Home
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-item-link" href="<core:url value="/admin/Dashboard"/>">
                <i class="uil uil-dashboard"></i>
                Dashboard
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-item-link" href="<core:url value="/bookingEvent"/>">
                <i class="uil uil-flower"></i>
                Event
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-item-link" href="<core:url value="/admin/tab"/>" onclick="myFunction()">
                <i class="uil uil-apps"></i>
                Management
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-item-sign-out" href="<core:url value="/logout"/>" onclick="myFunction()">
                <i class="uil uil-sign-out-alt"></i>
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-item-user-box" style="width: 50px;" href="#">
                <img src="${currentUser.login_avatar}" class="rounded-circle"   style="width: 40px;"/> 
                ${pageContext.request.userPrincipal.name}
            </a>
        </li>
    </ul>

</core:if>
<core:if test="${pageContext.request.userPrincipal.name == null}">
    <meta http-equiv="refresh" content="1; url =
          http://localhost:8080/EventCenter/sign-in" />
</core:if>