<%-- 
    Document   : bodyServices
    Created on : Oct 7, 2021, 8:26:17 AM
    Author     : DiepHoangPhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>


<div>
    <ul class="nav">
        <li class="nav-item ">
            <a class="nav-link active" style="color: red;" href="<core:url value="/manageHall"/>" >Restaurant Configuration-Hall</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" style="color: red;" href="<core:url value="/manageEmployee"/>">Human Resource-Staff</a>
        </li>

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
                <li><a class="dropdown-item" href="#">Login</a></li>
                <li><a class="dropdown-item" href="#">Position</a></li>
            </ul>
        </li>
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-expanded="false">Services</a>
            <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="manageHost">Host</a></li>
                <li><a class="dropdown-item" href="manageEnt">Entertainment</a></li>
                <li><a class="dropdown-item" href="manageDecor">Decoration</a></li>
                <li><a class="dropdown-item" href="manageServe">Extra Services</a></li>
            </ul>
        </li>
        <li class="nav-item ">
            <a class="nav-link active" href="<core:url value="/manageCustomer"/>" >Customer</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="<core:url value="/manageEmployee"/>">Cart</a>
        </li>
    </ul>
</div>
