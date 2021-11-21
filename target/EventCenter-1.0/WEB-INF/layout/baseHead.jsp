<%-- 
    Document   : header
    Created on : Aug 31, 2021, 7:33:11 PM
    Author     : Buu Duong Tan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="baseHead">
    <ul class="nav-bar">
        <li class="nav-item">
            <a class="nav-item-link" href="<core:url value="/"/>">
                <i class="uil uil-estate"></i>
                Home
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-item-link" href="#">
                <i class="uil uil-info-circle"></i>
                About
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-item-link" href="<core:url value="/pageEvent"/>">
                <i class="uil uil-flower"></i>
                Events
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-item-link" href="#">
                <i class="uil uil-envelope"></i>
                Contact
            </a>
        </li>
        
        
        <li class="nav-item">
            <a class="nav-item-link" href="<core:url value="/sign-in"/>" onclick="myFunction()">
                <i class="uil uil-user-square"></i>
                Sign in
            </a>
        </li>
    </ul>
</div>
