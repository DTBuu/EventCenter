<%-- 
    Document   : bodyBookingEvent
    Created on : Nov 2, 2021, 10:23:38 AM
    Author     : DiepHoangPhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:url value="/bookingEvent" var="action"/>

${currentUser.login_id} 
<form:form method="post" action="${action}" modelAttribute="bookingEvent">
    <div id="booking" class="section">
        <div class="section-center">
            <div class="container">
                <div class="row">
                    <div class="booking-form">
                        <div class="form-header">
                            <h1>Booking Information</h1>
                            <form:input class="form-control" type="hidden" id="khachHangid" path="khachHangid" required="required"  placeholder="Customer name" value="${currentUser.login_id}"/>
                        </div>
                        <div>

                            <div class="form-group"> <form:input class="form-control" type="text" id="suKienten" path="suKienten" required="required"  placeholder="Event name"/> <span class="form-label">Name</span> </div>
                            <div class="form-group"> <form:input class="form-control" type="text" id="suKienloai" path="suKienloai" required="required"  placeholder="Event type (Birthday, Wedding, Ceremony,...)"/> <span class="form-label">Type</span> </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group"> <form:input class="form-control" onchange="checkDate()" type="date" id="ngayBatDau" path="ngayBatDau" required="required" /> 
                                        <script>
                                            function checkDate() {
                                                var selectedText = document.getElementById('ngayBatDau').value;
                                                var selectedDate = new Date(selectedText);
                                                var now = new Date();
                                                if (selectedDate < now) {
                                                    alert("Date must be in the future");
                                                }
                                            }
                                        </script>
                                        <span class="form-label">Start date</span> </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group"> <form:input class="form-control" type="date" id="ngayKetThuc" path="ngayKetThuc" required="required"/> <span class="form-label">End date</span> </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <select class="form-control" type="text" name="ddtcId" id="" path="dDTCid.DDTC_id" required="required" placeholder="Hall">
                                            <c:forEach items="${sanh}" var="cat">
                                                <option value="${cat.DDTC_id}" id="ddtcId" >${cat.DDTC_ten}</option>
                                            </c:forEach>
                                        </select>
                                        <span class="form-label">Hall</span>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="form-group"> <form:input class="form-control" type="number" id="soBan" path="soBan" required="required" placeholder="Nos. of tables"/> <span class="form-label">No of tables</span> </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="form-group">
                                        <select class="form-control" type="text" name="menuid" path="menuid.menuid" required="required" placeholder="Menu">
                                            <c:forEach items="${menu}" var="cat">
                                                <option value="${cat.menuid}" >${cat.menuten}</option>
                                            </c:forEach>
                                        </select>
                                        <span class="form-label">Menu</span> </div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-3">
                                    <div class="form-group">
                                        <select class="form-control" type="text" name="chuTriid" path="chuTriid.chuTri_id" required="required">
                                            <c:forEach items="${chutri}" var="cat">
                                                <!--                                                <option value="" selected hidden>Host</option>-->
                                                <option value="${cat.chuTri_id}" >${cat.chuTri_ten}</option>
                                            </c:forEach>
                                        </select>
                                        <span class="select-arrow"></span> <span class="form-label"></span> </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="form-group">
                                        <select class="form-control" type="text" name="giaTriid" path="giaiTriid.giaiTri_id" required="required">
                                            <c:forEach items="${giaitri}" var="cat">
                                                <!--                                                <option value="" selected hidden>Entertainment</option>-->
                                                <option value="${cat.giaiTri_id}" >${cat.giaiTri_ten}</option>
                                            </c:forEach>
                                        </select>
                                        <span class="select-arrow"></span> <span class="form-label"></span> </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="form-group">
                                        <select class="form-control" type="text" name="trangTriid" path="trangTriid.trangTri_id" required="required">
                                            <c:forEach items="${trangtri}" var="cat">
                                                <!--                                                <option value="" selected hidden>Decoration</option>-->
                                                <option value="${cat.trangTri_id}" >${cat.trangTri_ten}</option>
                                            </c:forEach>
                                        </select>
                                        <span class="select-arrow"></span> <span class="form-label"></span> </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="form-group">
                                        <select class="form-control" type="text" name="phucVuid" path="phucVuid.phucVu_id" required="required">
                                            <c:forEach items="${phucvu}" var="cat">
                                                <!--                                                <option value="" selected hidden>Serve</option>-->
                                                <option value="${cat.phucVu_id}" >${cat.phucVu_ten}</option>
                                            </c:forEach>
                                        </select>
                                        <span class="select-arrow"></span> <span class="form-label"></span> </div>
                                </div>
                            </div>
                        </div>
                        <div class="form-btn"><div class="form-group"><input type="submit" class="submit-btn" value="Book Now"/></div></div>
                    </div>
                </div>

            </div>
        </div>
    </div>
</form:form>

