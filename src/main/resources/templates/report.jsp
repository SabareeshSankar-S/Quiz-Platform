<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

<head>
	<title>Login Form</title>
   <link rel="stylesheet" type="text/css" href="/css/style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
    
    body{
    margin: 0; 
    padding: 0; 
    background-size:cover; 
    background-repeat: repeat;
    background-image: url("https://img.freepik.com/free-photo/drawing-elements-kids-arrangement_23-2149016431.jpg?t=st=1713865247~exp=1713868847~hmac=c0fca2bb47197740215a5a4c748d909a1f2ddabf5be7a4b67459fa0aaa8cbbab&w=1380");
    }
     
    </style>
    
</head>

<body>

<h1 style="margin-top:0px;padding: 100px 20px 100px 790px;background-color: black;color:yellow;">Congratulations!</h1>

		<aside class="reportform">
		
			<form action="/">
						 <h1>Winner:</h1><br><br>
				   			<div style="background-color:graytext;color:white;padding-left: 170px;padding-top: 30px;padding-bottom: 30px">
								  <h5 >My score: <p th:text="${myMarks}" style="display: inline"></p>
								  <h5 >Top score: <p th:text="${winnerMarks}" style="display: inline"></p><br><br>
						    </div>   
	
						<input type="submit"  class="button" style="margin-top:20px" value="Retake">
			</form>	
		</aside>
</body>

</html>