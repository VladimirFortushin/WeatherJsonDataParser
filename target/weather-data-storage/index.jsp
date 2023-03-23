<%@ page import="ru.fortushin.model.ExternalData" %>
<%@ page import="java.util.Map" %>
<%@ page import="ru.fortushin.util.ReadZip" %>
<%@ page import="java.util.HashMap" %>


<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Main page</title>

</head>
<body>
<%

    ExternalData data = (ExternalData) request.getAttribute("data");


%>


<h1>Weather Information</h1>
<p>Country: <%=data.getCountry()%></p>
<p>Temp: <%=data.getTemp()%></p>
<p>Pressure: <%=data.getPressure()%></p>
<p>Humidity: <%=data.getHumidity()%></p>


<form action="${pageContext.request.contextPath}/index.jsp" method="get">
    <label>
        <input type="text" id="zip" name="zip">
    </label>
    <input type="submit" value="Submit">
</form>


</body>
</html>
