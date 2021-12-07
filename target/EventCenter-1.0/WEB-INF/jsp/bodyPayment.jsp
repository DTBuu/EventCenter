<%-- 
    Document   : bodyPayment
    Created on : Nov 6, 2021, 1:59:31 PM
    Author     : DiepHoangPhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<div class="container mt-5 px-5">
    <div class="mb-4">
        <h2>Confirm and pay</h2> <span>please make the payment.</span>
    </div>
    <div class="row">
        <div class="col-md-8">
            <div class="card p-3">
                <h6 class="text-uppercase">Payment Details ${bookingEvent.dDTCid.DDTC_id}  
                    ${bookingEvent.tempmenuid} </h6>
                    ${bookingEvent}
                <div class="mt-4 mb-4" style="text-align: left">
                    <h6 class="text-uppercase">Event Detail</h6>
                    <div class="container-booking-details">
                        <div class="price-breakdown">
                            <div class="item-name">
                                Event name
                                <span class="price">

                                </span>
                            </div>
                            <div class="item-name">
                                Type
                                <span class="price">

                                </span>
                            </div>
                            <div class="item-name">
                                Tables amount
                                <span class="price">

                                </span>
                            </div>
                            <div class="item-name">
                                Hall
                                <span class="price">
                                    bookingEvent tempdDTCid
                                </span>
                            </div>
                            <div class="item-name">
                                Services
                                <span class="price">
                                    ${bookingEvent.tempchuTriid}<br>
                                    ${bookingEvent.temptrangTriid}<br>
                                    ${bookingEvent.tempgiaiTriid}<br>
                                    ${bookingEvent.tempphucVuid}<br>
                                </span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="mt-4 mb-4 d-flex justify-content-between"> <span>Previous step</span> <button class="btn btn-success px-3">Pay $840</button> </div>
        </div>
        <div class="col-md-4">
            <div class="card card-blue p-3 text-white mb-3"> <span>You have to pay</span>
                <div class="d-flex flex-row align-items-end mb-3">
                    <h1 class="mb-0 yellow">$549</h1> <span>.99</span>
            </div>
        </div>
    </div>
</div>

<link href="<c:url value="/css/Payment.css"/>" rel="stylesheet" type="text/css"/>