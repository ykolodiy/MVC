<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register new User</title>
</head>
<body>

<!-- here we connecting to database and inserting staff -->
  <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://ec2-54-l..."
         user = "v"  password = ""/>
 
 
   <sql:update dataSource = "${snapshot}" var = "result">
         INSERT INTO RegisteredUsers VALUES (null, "${param.username}", "${param.password}", "${param.email}");
      </sql:update>
      
      
<!-- here we printing some message that user was created -->   
 Hey <% out.println(request.getParameter("username")); %>,  you have been registered.
 
<!-- redirect the pacge back after 5 sec | its the same as <meta http-equiv="Refresh" content="5;url=next_page.jsp">-->
<% response.setHeader("Refresh", "5; url=index.jsp"); %>

</body>
</html>
