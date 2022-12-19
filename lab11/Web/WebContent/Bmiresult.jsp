<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
 <head>
 <meta http-equiv="Content-Type"
 content="text/html; charset=UTF-8">
 <title>BmiResult</title>
 </head>
 <body>
<%
double weight = Double.parseDouble(request.getParameter("weight"));
double height = Double.parseDouble(request.getParameter("height"));
double bmi = weight / height / height;
out.println("Bmi : " + bmi);
%>
 </body>
</html> 