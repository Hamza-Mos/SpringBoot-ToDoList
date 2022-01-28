<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Items</title>
</head>
<body>

	<form action="/todo/add" method="post">
        <p>Item Name:</p>
        <input type="text" id="itemname" name="itemname"><br>
        <button type="submit">Add Item</button>
    </form>
    
</body>
</html>