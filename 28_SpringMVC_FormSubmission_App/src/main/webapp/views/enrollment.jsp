<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<html>
   <head>
     <title>enquiry.jsp</title>
   </head>
   <body>
      <div style='text-align:center;color:red;'>Welcome To AshokIT For SpringMVCTags Application Development!!!!</div>
      <spring:form action="sendDetails" modelAttribute="enrollmentObj">
      	 <table align="center">
      	    <tr>
      	       <td>Name</td>
      	       <td><spring:input path="firstName"/></td>
      	    </tr>
      	    <tr>
      	       <td>EmailID</td>
      	       <td><spring:input path="emailId"/></td>
      	    </tr>
      	    <tr>
      	       <td>ContactNo</td>
      	       <td><spring:input path="contactNo"/></td>
      	    </tr>
      	      <tr>
      	       <td>Course</td>
      	       <td>
      	         <spring:select path="course" cssStyle="width:100%">
      	           <spring:option value="SpringBoot">Spring Boot</spring:option>
      	           <spring:option value="AmazonWebServices">AWS</spring:option>
      	           <spring:option value="AzureWebServices">Azure</spring:option>
      	           <spring:option value="AngularJavaScript">AngularJS</spring:option>
      	           <spring:option value="ReactJavaScript">ReactJS</spring:option>
      	           <spring:option value="DSA">DataStructures</spring:option>
      	         </spring:select>
      	       </td>
      	    </tr>      	          	 
      	 </table>
      	 <div style='text-align:center;margin-top:15px;'>
      	 	<spring:button name="Send Details">Send Details</spring:button>
      	 </div>      
      </spring:form>
   </body>
</html>