<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
	<title>Login Form</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    
    <style type="text/css">
    
    body{
    margin: 0; 
    padding: 0; 
    background-size: cover;
    background-repeat: no-repeat;
     background-image: url("https://img.freepik.com/free-photo/drawing-elements-kids-arrangement_23-2149016431.jpg?t=st=1713865247~exp=1713868847~hmac=c0fca2bb47197740215a5a4c748d909a1f2ddabf5be7a4b67459fa0aaa8cbbab&w=1380");
    }
 
    </style>
    
</head>

<body>

<h1 style="margin-top:0px;padding: 100px 20px 100px 685px;background-color: black;color:yellow;">Teachers's Day Quiz Competition</h1>

<aside class="form_content">

	<h1 class="register">Please enter your details</h1>

		<form action="login" method="post">
		
			<h2>Name:         <input type="text" name="name" style="margin:0px 70px"><br>
			<h2>Roll Number:  <input type="text" name="regNo" style="margin:0px 9px"><br>
			<h2>Email:        <input type="text" name="email" style="margin:0px 72px"><br>
			<h2>Gender:       <input type="text" name="gender" style="margin:0px 55px"><br>
			<input type="submit"  class="button" style="margin-top:20px" value="Submit">
		
		<form>

</aside>

</body>

</html>