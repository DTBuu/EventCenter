<%-- 
    Document   : base
    Created on : Aug 31, 2021, 6:19:52 PM
    Author     : Buu Duong Tan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spr" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            <tiles:insertAttribute name="title"/>
        </title>
        <link rel="stylesheet" href="<core:url value="/css/baseStyle.css"/>">
        <link rel="stylesheet" href="<core:url value="/css/head.css"/>">
        <link rel="stylesheet" href="<core:url value="/css/body.css"/>">
        
        <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
        <!--<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"/>-->
        <scpipt src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.min.js"/>
    </head>
    <body style="text-align: center;">
            <!--__________HEAD__________-->
            <tiles:insertAttribute name="head"/>

            <!--__________BODY__________-->
            <tiles:insertAttribute name="body"/>

            <!--__________FOOT__________-->
            <%--<tiles:insertAttribute name="foot"/>--%>
    </body>
</html>
