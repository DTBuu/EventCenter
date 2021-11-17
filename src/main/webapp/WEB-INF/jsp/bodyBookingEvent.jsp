<%-- 
    Document   : bodyBookingEvent
    Created on : Nov 2, 2021, 10:23:38 AM
    Author     : DiepHoangPhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<%--<c:url value="/bookingEvent" var="action"/>
<form:form method="post" action="${action}" modelAttribute="bookingEvent">
    <div class="content-header clearfix">
        <h1 class="float-left">Test </h1> 
    </div>
    <div class="form-group"> 
        <div class="form-group">
            <form:select class="form-control" type="text" id="dDTCid" path="dDTCid.DDTC_id" required="required" placeholder="Hall">
                <c:forEach items="${sanh}" var="cat">
<!--                    <option value="" disable="" selected hidden>Hall</option>-->
                    <option value="${cat.DDTC_id}" >${cat.DDTC_ten}</option>
                </c:forEach>
            </form:select>
            <form:select class="form-control" type="text" id="giaTriid" path="giaiTriid.giaiTri_id" required="true">
                <c:forEach items="${giaitri}" var="cat">
<!--                    <option value="" selected hidden>Entertainment</option>-->
                    <option value="${cat.giaiTri_id}" >${cat.giaiTri_ten}</option>
                </c:forEach>
            </form:select>
            <form:input type="text" id="suKienten" path="suKienten" class="form-control text-box single-line"/><span class="form-label">Name</span> 

        </div>
        <input type="submit" value="Confirm" class="btn btn-primary"/>
    </div>
    ${valueController}
</form:form>--%>


<c:url value="/bookingEvent" var="action"/>
<form:form method="post" action="${action}" modelAttribute="bookingEvent">
    <div id="booking" class="section">
        <div class="section-center">
            <div class="container">
                <div class="row">
                    <div class="booking-form">
                        <div class="form-header">
                            <h1>Booking Information</h1>
                        </div>
                        <div>
                            <div class="form-group"> <form:input class="form-control" type="text" id="suKienten" path="suKienten" required="required"  placeholder="Event name(Birthday, Wedding, Ceremony,...)"/> <span class="form-label">Name</span> </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group"> <form:input class="form-control" type="date" id="ngayBatDau" path="ngayBatDau" required="required" /> <span class="form-label">Start date</span> </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group"> <form:input class="form-control" type="date" id="ngayKetThuc" path="ngayKetThuc" required="required"/> <span class="form-label">End date</span> </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-4">
                                    <div class="form-group"> 
                                        <form:select class="form-control" type="text" id="dDTCid" path="dDTCid.DDTC_id" required="required" placeholder="Hall">
                                            <c:forEach items="${sanh}" var="cat">
                                                <option value="${cat.DDTC_id}" >${cat.DDTC_ten}</option>
                                            </c:forEach>
                                        </form:select>
                                        <span class="form-label">Hall</span> 
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="form-group"> <form:input class="form-control" type="number" id="soBan" path="soBan" required="required" placeholder="No of tables"/> <span class="form-label">No of tables</span> </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="form-group"> 
                                        <form:select class="form-control" type="text" id="menuid" path="menuid.menuid" required="required" placeholder="Menu">
                                            <c:forEach items="${menu}" var="cat">
                                                <option value="${cat.menuid}" >${cat.menuten}</option>
                                            </c:forEach>
                                        </form:select>
                                        <span class="form-label">Menu</span> </div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-3">
                                    <div class="form-group">
                                        <form:select class="form-control" type="text" id="chuTriid" path="chuTriid.chuTri_id" required="required">
                                            <c:forEach items="${chutri}" var="cat">
                                                <!--                                                <option value="" selected hidden>Host</option>-->
                                                <option value="${cat.chuTri_id}" >${cat.chuTri_ten}</option>
                                            </c:forEach>
                                        </form:select>
                                        <span class="select-arrow"></span> <span class="form-label"></span> </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="form-group"> 
                                        <form:select class="form-control" type="text" id="giaTriid" path="giaiTriid.giaiTri_id" required="required">
                                            <c:forEach items="${giaitri}" var="cat">
                                                <!--                                                <option value="" selected hidden>Entertainment</option>-->
                                                <option value="${cat.giaiTri_id}" >${cat.giaiTri_ten}</option>
                                            </c:forEach>
                                        </form:select>
                                        <span class="select-arrow"></span> <span class="form-label"></span> </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="form-group"> 
                                        <form:select class="form-control" type="text" id="trangTriid" path="trangTriid.trangTri_id" required="required">
                                            <c:forEach items="${trangtri}" var="cat">
                                                <!--                                                <option value="" selected hidden>Decoration</option>-->
                                                <option value="${cat.trangTri_id}" >${cat.trangTri_ten}</option>
                                            </c:forEach>
                                        </form:select>
                                        <span class="select-arrow"></span> <span class="form-label"></span> </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="form-group"> 
                                        <form:select class="form-control" type="text" id="phucVuid" path="phucVuid.phucVu_id" required="required">
                                            <c:forEach items="${phucvu}" var="cat">
                                                <!--                                                <option value="" selected hidden>Serve</option>-->
                                                <option value="${cat.phucVu_id}" >${cat.phucVu_ten}</option>
                                            </c:forEach>
                                        </form:select>
                                        <span class="select-arrow"></span> <span class="form-label"></span> </div>
                                </div>
                            </div>
                        </div>
                        <!--                        <div class="row">
                                                    <div class="col-md-6">
                                                        <div class="form-group"> <input class="form-control" type="email" placeholder="Enter your Email"> <span class="form-label">Email</span> </div>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <div class="form-group"> <input class="form-control" type="tel" placeholder="Enter you Phone"> <span class="form-label">Phone</span> </div>
                                                    </div>
                                                </div>-->
                        <div class="form-btn"><div class="form-group"><input type="submit" class="submit-btn" value="Book Now"/></div></div>
                    </div>
                </div>

            </div>
        </div>
    </div>
</form:form>

