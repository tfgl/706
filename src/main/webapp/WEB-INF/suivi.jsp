<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
	<script src="http://code.jquery.com/jquery-2.0.1.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<header>
	<button>Progression</button>
	<button>Suivi</button>
</header>

<div data-role="tabs" id="tabs-1">
	<div class="ui-body-d ui-content">
		<h4>Enrgistrement de colis</h4>
		<form method="post" action="Register">
			<label for="poids"> Poids </label>
			<input type="text" id="poids" name="poids">
			
			<label for="valeur"> Valeur </label>
			<input type="text" id="valeur" name="valeur">
			
			<label for="origine"> Origine </label>
			<input type="text" id="origine" name="origine">
			
			<label for="destination"> Destination </label>
			<input type="text" id="destination" name="destination">
			
			<label for="latitude"> Latitude </label>
			<input type="text" id="latitude" name="latitude">
			
			<label for="longitude"> Longitude </label>
			<input type="text" id="longitude" name="longitude">
			
			<label for="emplacement"> Emplacement </label>
			<input type="text" id="emplacement" name="emplacement">
			
			<input type="submit" name="send" value="Enregitrer">
		</form>
	</div>
</div>

</body>
</html>