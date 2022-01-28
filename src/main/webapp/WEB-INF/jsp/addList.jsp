<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add List</title>
</head>
<body>
	<form action="/todo/addList" method="post">
        <p>List Name:</p>
        <input type="text" id="listname" name="listname"><br>
        <button type="submit">Add List</button>
    </form>
</body>
</html>