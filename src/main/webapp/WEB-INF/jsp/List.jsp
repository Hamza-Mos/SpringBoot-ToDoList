<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${list.name}</title>
</head>
<body>

	<h1>${list.name}</h1>
	
	<ul>
        <c:forEach items="${items}" var="item">
    		<li>${item.name}</li>
        </c:forEach>
    </ul>

</body>
</html>