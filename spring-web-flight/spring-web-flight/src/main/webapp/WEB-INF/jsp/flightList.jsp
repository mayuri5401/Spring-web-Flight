<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table style="border: solid 1px red">
		<thead style="border: solid 1px red">
			<tr style="border: solid 1px red">
				<th>FlightId</th>
				<th>FlightName</th>
				<th>Source</th>
				<th>Destination</th>
				<th>DepTime</th>
				<th>ArrTime</th>
				<th>Seats</th>
				<th>Cost</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="e">
				<tr style="border: solid 1px red">
					<td>${e.flightID}</td>
					<td>${e.fname}</td>
					<td>${e.source}</td>
					<td>${e.dest}</td>
					<td>${e.depTime}</td>
					<td>${e.arrTime}</td>
					<td>${e.seats}</td>
					<td>${e.cost}</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>