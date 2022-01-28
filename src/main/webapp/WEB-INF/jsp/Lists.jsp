<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lists</title>
</head>
<body>

	<h1>Today!</h1>
    <ul>
    
    	
    	<c:forEach items="${lists}" var="list">
    	
                        <li>${list.name}</li>
        </c:forEach>
 
    </ul>

</body>
</html>