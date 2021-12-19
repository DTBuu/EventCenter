<%-- 
    Document   : bodyServices
    Created on : Oct 7, 2021, 8:26:17 AM
    Author     : DiepHoangPhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>


<nav class="navbar navbar-expand-lg navbar-light bg-light">
<div>
    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-expanded="false">Restaurant</a>
            <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="<core:url value="/manageHall"/>">Hall</a></li>
                <li><a class="dropdown-item" href="<core:url value="/manageMenu"/>"">Menu</a></li>
            </ul>
        </li>
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-expanded="false">Human Resource</a>
            <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="<core:url value="/manageEmployee"/>">Staff</a></li>
            </ul>
        </li>
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-expanded="false">Services</a>
            <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="<core:url value="/manageHost"/>">Host</a></li>
                <li><a class="dropdown-item" href="<core:url value="/manageEnt"/>">Entertainment</a></li>
                <li><a class="dropdown-item" href="<core:url value="/manageDecor"/>">Decoration</a></li>
                <li><a class="dropdown-item" href="<core:url value="/manageServe"/>">Extra Services</a></li>
            </ul>
        </li>
        <li class="nav-item ">
            <a class="nav-link active" href="<core:url value="/manageCustomer"/>" >Customer</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Cart</a>
        </li>
    </ul>
</div>
</nav>
