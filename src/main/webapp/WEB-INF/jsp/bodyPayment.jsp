<%-- 
    Document   : bodyPayment
    Created on : Nov 6, 2021, 1:59:31 PM
    Author     : DiepHoangPhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="container mt-5 px-5">
    <div class="mb-4">
        <h2>Confirm and pay</h2> <span>please make the payment.</span>
    </div>

    <form:form method="post" action="/EventCenter/payment/id/${event.suKienid}" >
        <div class="row">
            <div class="col-md-7">
                <div class="card p-3">
                    <h6 class="text-uppercase">Payment Details</h6>
                    <div class="mt-4 mb-4" style="text-align: left">
                        <h6 class="text-uppercase">Event Detail</h6>
                        <div class="container-booking-details">
                            <div class="price-breakdown">
                                <div class="item-name">
                                    Event name
                                    <span class="price">
                                        ${event.suKienten}
                                    </span>
                                </div>
                                <div class="item-name">
                                    Type
                                    <span class="price">
                                        ${event.suKienloai}
                                    </span>
                                </div>
                                <div class="item-name">
                                    Tables amount
                                    <span class="price">
                                        ${event.soBan}
                                    </span>
                                </div>
                                <div class="item-name">
                                    Hall
                                    <span class="price">
                                        ${event.dDTCid.DDTC_ten}
                                    </span>
                                </div>
                                <div class="item-name">
                                    Services
                                    <span class="price">
                                        ${event.menuid.menuten}<br>
                                        ${event.chuTriid.chuTri_ten}<br>
                                        ${event.trangTriid.trangTri_ten}<br>
                                        ${event.phucVuid.phucVu_ten}<br>
                                        ${event.giaiTriid.giaiTri_ten}
                                    </span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="mt-4 mb-4 d-flex justify-content-between"> <span>Previous step</span> <button class="btn btn-success px-3">Pay <fmt:setLocale value="vi_VN"/>
                        <fmt:formatNumber value = "${event.getTotalFee()}" /> VND</button>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card card-blue p-3 text-white mb-3"> <span>You have to pay</span>
                    <div class="d-flex flex-row align-items-end mb-3">
                        <h1 class="mb-0 yellow">
                            <fmt:setLocale value="vi_VN"/>
                            <fmt:formatNumber value = "${event.getTotalFee()}" /> VND
                        </h1>
                    </div>
                </div>
            </div>     
        </div>
    </form:form> 
</div>
<link href="<c:url value="/css/Payment.css"/>" rel="stylesheet" type="text/css"/>