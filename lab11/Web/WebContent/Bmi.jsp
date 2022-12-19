<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
 <head>
 <meta http-equiv="Content-Type"
 content="text/html; charset=UTF-8">
 <title>Bmi</title>
 </head>
 <body>
<form action='${requestUri}' method='post'>
<input type='text' name='height' placeholder = 'height'/>
<input type='text' name='weight' placeholder = 'weight'/>
<input type='submit' value='submit' />
</form>
 </body>
</html> 