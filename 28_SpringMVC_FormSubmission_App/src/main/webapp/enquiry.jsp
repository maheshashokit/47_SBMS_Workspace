<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<html>
   <head>
     <title>enquiry.jsp</title>
   </head>
   <body>
      <div style='text-align:center;color:red;'>Welcome To MaheshIT For SpringMVC Application Development!!!!</div>
      <form action="sendEnquiry" method="post">
      	 <table align="center">
      	    <tr>
      	       <td>Name</td>
      	       <td><input type="text" name="firstName"/></td>
      	    </tr>
      	    <tr>
      	       <td>EmailID</td>
      	       <td><input type="text" name="emailId"/></td>
      	    </tr>
      	    <tr>
      	       <td>ContactNo</td>
      	       <td><input type="text" name="contactNo"/></td>
      	    </tr>
      	      <tr>
      	       <td>Course</td>
      	       <td>
      	         <select name="course" style="width:100%">
      	           <option value="SpringBoot">Spring Boot</option>
      	           <option value="AmazonWebServices">AWS</option>
      	           <option value="AzureWebServices">Azure</option>
      	           <option value="AngularJavaScript">AngularJS</option>
      	           <option value="ReactJavaScript">ReactJS</option>
      	           <option value="DSA">DataStructures</option>
      	         </select>
      	       </td>
      	    </tr>      	          	 
      	 </table>
      	 <div style='text-align:center;margin-top:15px;'>
      	 	<input type="submit" value="Send Enquiry"/>
      	 </div>      
      </form>
   </body>
</html>