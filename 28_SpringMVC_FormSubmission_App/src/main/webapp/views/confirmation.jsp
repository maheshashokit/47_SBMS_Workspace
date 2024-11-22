<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>confirmation.jsp</title>
</head>
<body>
 <div style='text-align:center;'>
    <c:if test="${courseEnquiryInfo.firstName ne null && courseEnquiryInfo.course ne null}">
    	<div>Student Name : <span>${courseEnquiryInfo.firstName}</span></div>
 	    <div>Course Name  : <span>${courseEnquiryInfo.course}</span></div> 	
    </c:if>
    <div>Your Enquiry has been received Admin team will connect with you shortly.....</div>
    
    <!-- <c:choose>
        <c:when test="${courseEnquiryInfo.firstName ne null && courseEnquiryInfo.course ne null}">
        	<div>Student Name : <span>${courseEnquiryInfo.firstName}</span></div>
 	  	    <div>Course Name  : <span>${courseEnquiryInfo.course}</span></div> 	
        </c:when>
        <c:otherwise>
        	 <div>Your Enquiry has been received Admin team will connect with you shortly.....</div>
        </c:otherwise>
    </c:choose> -->
 	
 </div>
</body>
</html>