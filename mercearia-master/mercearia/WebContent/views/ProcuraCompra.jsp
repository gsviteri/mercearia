<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<link rel="stylesheet" type="text/css" href="../css/style.css">
	<meta charset="UTF-8" />
	<script src="../js/jquery.js"></script>
	<script src="../js/scripts.js"></script>
	<title>Compra existente</title>
</head>
<body>
	<div class="container">
	
		<div class="metadeEsquerda"><p class="margemP"><h1>Compra existente</h1></p> 
			<p class="margemM form">
				Data início: <br />
				<input type="date" autofocus><br />
				Data fim:<br />
				<input type="date"><br />
				
				<input type="button" value="Buscar">	<br /><br />
			</p>
			<div id="fim">
			</div>
		</div>
		<div class="metadeDireita"> 
		</div>
	</div>
</body>
</html>