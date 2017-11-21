<%@page import="Database.CountryDAO"%>
<%@page import="Database.Country"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<link rel="stylesheet" href=css/bootstrap.min.css>
<!-- <link rel="stylesheet" href=css/bootstrap_superman.css> -->
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/jq-3.2.1/dt-1.10.16/fh-3.1.3/r-2.2.0/datatables.min.css"/>
 
<script type="text/javascript" src="https://cdn.datatables.net/v/dt/jq-3.2.1/dt-1.10.16/fh-3.1.3/r-2.2.0/datatables.min.js"></script>
<script type="text/javascript" src=js/bootstrap.min.js></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Countries Database</title>
</head>
<body>
<a href="hello.jsp"> Return to Home </a>
<h1> List of Countries </h1>

	<table id="countries" class="table countries table-striped">
		<thead>
			<tr>
				<th>Country Code</th>
				<th>Name</th>
				<th>Continent</th>
				<th>Region</th>
				<th>Surface Area(sq km.)</th>
			</tr>
		</thead>
		<tbody>
		<%
		CountryDAO countryDAO = new CountryDAO();
		ArrayList<Country> countries = countryDAO.retrieveAllCountries();
		
		for(Country c: countries){
			%>
			<tr>
				<td><%=c.getCode()%>	</td>
				<td><%=c.getName() %> 	</td>
				<td><%=c.getContinent() %>	</td>
				<td><%=c.getRegion() %>	</td>
				<td><%=c.getSurfaceArea() %>	</td>
			</tr>		
		<%
		}
		%>


	</tbody>
	</table>
<script>
$(document).ready(function(){
	$(".countries").DataTable();
})
</script>

</body>

</html>