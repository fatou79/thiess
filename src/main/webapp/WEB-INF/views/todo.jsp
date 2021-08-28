<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Yahoo!!</title>
</head>
<body>
<H1>Welcome ${name}</H2>
<div>
Your Todos are
<ol>
<c:forEach items="${todos}" var="todo">
		 <li>${todo.name} : ${todo.categorie}</li>
   		 
</c:forEach>
</ol>
</div>
</body>
</html>