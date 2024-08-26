<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LogIn Page</title>
</head>
<body>

<h2>SignIn Page</h2>
<form action="signin" method="post">
<label>EmailId: </label>
<input type="email" name="emailid"/><br/>
<label>Password: </label>
<input type="password" name="password"/><br/>
<label>User Type: </label>
<input type="text" name= "typeofuser"/><br/>
<input type="submit" value="SignIn"/>
<input type="reset" value="reset"/>
</form>
</body>
</html>