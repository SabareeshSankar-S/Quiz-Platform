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

 
    </style>
    
</head>

<body>

<h1 style="margin-top:0px;padding: 100px 20px 100px 690px;background-color: black;color:yellow;">Teachers's Day Quiz Competition</h1>

<aside class="form_content_pages">

		<form action="displayThankyou">
			
				<h2>6.Music: Which band released the album "The Dark Side of the Moon"?</h2>
							<input type="radio" name="music" value="The Beatles"/><h3>The Beatles<br>
							<input type="radio" name="music" value="Pink Floyd"/><h3>Pink Floyd<br>
							<input type="radio" name="music" value="Led Zeppelin"/><h3>Led Zeppelin<br>
									
				<h2>7.Sports: In which year did the first modern Olympic Games take place?</h2>
							<input type="radio" name="sports" value="1896" /><h3>1896<br>
							<input type="radio" name="sports" value="1900"/><h3>1900<br>
							<input type="radio" name="sports" value="1920"/><h3>1920<br>
									
				<h2>8.Technology: Who is known as the founder of Microsoft?</h2>
							<input type="radio" name="technology" value="Steve Jobs"/><h3>Steve Jobs<br>
							<input type="radio" name="technology" value="Bill Gates"/><h3>Bill Gates<br>
							<input type="radio" name="technology" value="Jeff Bezos"/><h3>Jeff Bezos<br>
									
				<h2>9.Movies: What is the highest-grossing film of all time (as of 2022)?</h2>
							<input type="radio" name="movies" value="Avatar"/><h3>Avatar<br>
							<input type="radio" name="movies" value="Avengers: Endgame"/><h3>Avengers: Endgame<br>
							<input type="radio" name="movies" value="Titanic"/><h3>Titanic<br>
									
				<h2>10.Biology: What is the smallest bone in the human body?</h2>
							<input type="radio" name="biology" value="Stapes"/><h3>Stapes<br>
							<input type="radio" name="biology" value="Femur"/><h3>Femur<br>
							<input type="radio" name="biology" value="Radius"/><h3>Radius<br>			
							
							<input type="submit"  class="button" style="margin-top:20px" value="Submit">
			
		<form>

</aside>

</body>

</html>