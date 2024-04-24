<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

<head>
<title>Login Form</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">


<style type="text/css">
body {
	margin: 0;
	padding: 0;
	background-size: cover;
	background-repeat: no-repeat;
    background-image: url("https://img.freepik.com/free-photo/drawing-elements-kids-arrangement_23-2149016431.jpg?t=st=1713865247~exp=1713868847~hmac=c0fca2bb47197740215a5a4c748d909a1f2ddabf5be7a4b67459fa0aaa8cbbab&w=1380");

</style>

</head>

<body>

	
<h1 style="margin-top:0px;padding: 100px 20px 100px 690px;background-color: black;color:yellow;">Teachers's Day Quiz Competition</h1>

	<aside class="form_content_pages">



		<form action="goToPage2">

			<h2>1.Geography: What is the capital city of Australia?</h2>
			<input type="radio" name="geography" value="Sydney" /><h3>Sydney<br> 
			<input type="radio" name="geography" value="Melbourne" /><h3>Melbourne<br> 
			<input type="radio" name="geography" value="Canberra" /><h3>Canberra<br>

		    <h2>2.History: Who was the first female Prime Minister of the United Kingdom?</h2>
						<input type="radio" name="history" value="Margaret Thatcher" /><h3>Margaret Thatcher<br> 
						<input type="radio" name="history"value="Theresa May" /><h3>Theresa May<br> 
						<input type="radio" name="history"value="Indira Gandhi" /><h3>Indira Gandhi<br>

			<h2>3.Science: What is the chemical symbol for gold?</h2>
						<input type="radio" name="science" value="Au" /><h3>Au<br>
						<input type="radio" name="science" value="Ag" /><h3>Ag<br> 
						<input type="radio" name="science" value="Pt" /><h3>Pt<br>

			<h2>4.Literature: Who wrote the novel "To Kill a Mockingbird"?</h2>
					    <input type="radio" name="literature" value="Harper Lee" /><h3>Harper Lee<br> 
					    <input type="radio" name="literature" value="Mark Twain" /><h3>Mark Twain<br> 
					    <input type="radio" name="literature" value="John Steinbeck" /><h3>John Steinbeck<br>

            <h2>5.Mathematics: What is the value of pi (π) to two decimal places?</h2>
						<input type="radio" name="mathematics" value="3.14" /><h3>3.14<br>  
						<input type="radio" name="mathematics" value="3.16" /><h3>3.16<br> 
						<input type="radio" name="mathematics" value="3.12" /><h3>3.12<br> 
						
						<input type="submit" class="button" style="margin-top: 50px" value="Next">
		</form>

	</aside>

</body>

</html>




