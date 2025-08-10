<!DOCTYPE html>
<html>
<head>
<title>Signup Page</title>
</head>
<body>
	<h1>This is the signup page</h1>

	<form action="done" method="post">
		<label for="RegisterationNumber">Car Number:</label> <input
			type="text" id="RegisterationNumber" name="RegisterationNumber">
		<br> <br> <label for="CarName">Car Name</label> <select
			id="CarName" name="CarName">
			<option value="Seltos">Seltos</option>
			<option value="Creta">Creta</option>
			<option value="Venue">Venue</option>
		</select> <br> <br> <label for="CarDetails">Covered In
			Warranty:</label> <select id="CarDetails" name="CarDetails">
			<option value="YES">YES</option>
			<option value="NO">NO</option>
		</select> <br> <br> <label for="CarWork">Any remarks :</label> <input
			type="text" id="CarWork" name="CarWork"> <br> <br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>
