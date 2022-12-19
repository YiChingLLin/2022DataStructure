<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
 <head>
 <meta http-equiv="Content-Type"
 content="text/html; charset=UTF-8">
 <title>Bmi</title>
 </head>
 <body>
 <% if (request.getParameter("weight") == null){ %>
<form action='${requestUri}' method='post'>
<input type='text' name='height' placeholder = 'height'/>
<input type='text' name='weight' placeholder = 'weight'/>
<input type='submit' value='submit' />
</form>
<% } else{
	double weight = Double.parseDouble(request.getParameter("weight"));
	double height = Double.parseDouble(request.getParameter("height"));
	double bmi = weight / height / height;
	out.println("Bmi : " + bmi);
}
 %>
 </body>
</html> 