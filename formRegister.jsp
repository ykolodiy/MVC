<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form</title>
</head>
<body>
<h1>Registration Form</h1>
<br><br>
<form name="formjsp" method="post" action="register.jsp">
<table width="100%" border="0" cellspacing="0" cellpadding="0">

  <tr>
    <td>Username </td>
    <td><input type="text" name="username"></td>
    </tr>
  
  
    <tr>
    <td>Password</td>
    <td><input type="text" name="password"></td>
    </tr>
  
  
  
    <tr>
    <td>Email</td>
    <td><input type="text" name="email"></td>
    </tr>
  
  
  
  
  <tr>
       <td><input type="submit" name="submit" value="Register"></td>
    </tr>

</table>
</form>


</body>
</html>
