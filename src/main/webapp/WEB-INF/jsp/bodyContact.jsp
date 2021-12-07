<%-- 
    Document   : bodyContact
    Created on : Nov 21, 2021, 2:13:11 PM
    Author     : DiepHoangPhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="contact_info">
    <div class="container">
        <div class="row">
            <div class="col-lg-10 offset-lg-1">
                <div class="contact_info_container d-flex flex-lg-row flex-column justify-content-between align-items-between">
                    <!-- Contact Item -->
                    <div class="contact_info_item d-flex flex-row align-items-center justify-content-start">
                        <div class="contact_info_image"><img src="https://img.icons8.com/office/24/000000/iphone.png" alt=""></div>
                        <div class="contact_info_content">
                            <div class="contact_info_title">Phone</div>
                            <div class="contact_info_text">+0909000000</div>
                        </div>
                    </div> <!-- Contact Item -->
                    <div class="contact_info_item d-flex flex-row align-items-center justify-content-start">
                        <div class="contact_info_image"><img src="https://img.icons8.com/ultraviolet/24/000000/filled-message.png" alt=""></div>
                        <div class="contact_info_content">
                            <div class="contact_info_title">Email</div>
                            <div class="contact_info_text">1851010097@ou.edu.vn</div>
                        </div>
                    </div> <!-- Contact Item -->
                    <div class="contact_info_item d-flex flex-row align-items-center justify-content-start">
                        <div class="contact_info_image"><img src="https://img.icons8.com/ultraviolet/24/000000/map-marker.png" alt=""></div>
                        <div class="contact_info_content">
                            <div class="contact_info_title">Address</div>
                            <div class="contact_info_text">371 Nguyen Kiem street,Go Vap district, Ho Chi Minh city</div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div> <!-- Contact Form -->
<div class="contact_form">
    <div class="container">
        <div class="row">
            <div class="col-lg-10 offset-lg-1">
                <div class="contact_form_container">
                    <div class="contact_form_title">Get in Touch</div>
                    <form action="https://formsubmit.co/59d90eb27b628730f2d34bed77497665" method="POST" id="contact_form">

                        <div class="contact_form_inputs d-flex flex-md-row flex-column justify-content-between align-items-between"> 
                            <input type="text" name="name" id="contact_form_name" class="contact_form_name input_field" 
                                   placeholder="Your name" required="required" data-error="Name is required."> 
                            <input type="email" name="email" id="contact_form_email" class="contact_form_email input_field" 
                                   placeholder="Your email" required="required" data-error="Email is required."> 
                            <input type="text" name="number" id="contact_form_phone" class="contact_form_phone input_field" 
                                   pattern="[0]{1}[0-9]{9}"  title="Phone number must start with 0 and remaing 9 digit with 0-9"  placeholder="Your phone number">
                        </div>
                        <div class="contact_form_text"> 
                            <textarea id="contact_form_message" class="text_field contact_form_message" name="message" rows="4" placeholder="Message" required="required" data-error="Please, write us a message."></textarea> 
                        </div>
                        <div class="contact_form_button"> <button type="submit" class="button contact_submit_button">Send Message</button> </div>
                        <input type="hidden" name="_next" value="http://localhost:8080/EventCenter/pageContact">
                        <input type="hidden" name="_subject" value="You have new feedback!!!">
                    </form>
                </div>
            </div>
        </div>
    </div>
    <div class="panel"></div>
</div>

<link href="<c:url value="/css/contact.css"/>" rel="stylesheet" type="text/css"/>