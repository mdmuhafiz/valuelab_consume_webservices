<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Contact Data</title>
</head>
<body>
<h3>Contact details | Value Lab data</h3>
<hr>
<pre>
Id:${contact.id}<br/>
Please specify the nature of your enquiry:${contact.pleaseSpecifyTheNatureOfYourEnquiry}<br/>
First name:${contact.firstName}<br/>
Last name:${contact.lastName}<br/>
Email:${contact.email}<br/>
How did you hear about us?:${contact.howDidYouHearAboutUs}<br/>
Country:${contact.country}<br/>
Comments:${contact.comments}<br/>

</pre>
</body>
</html>