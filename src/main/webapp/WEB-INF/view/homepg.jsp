<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
form:errors{
margin-left: 50px;
color: red;
font-weight: bold;
}


</style>
</head>

<body>
<div style="display: flex; justify-content: space-around; background-color: purple; width: 100%; height: 21px%;">
<h1 >LOVE CALCULATOR</h1>
<div style="margin-left: auto; text-align: center; padding-top:30px; list-style: none;  ">
<a  href="/">Search History</a>
</div >

</div>

<div align="center">
<div style="height: 100px"></div>
<form:form modelAttribute="mods" action="click" >
<div>
<label for="na">YOUR NAME</label>
<form:input id="na" path="yourname"/>
    <form:errors path="yourname"></form:errors>
</div>
<br>
<br>
<div>
<label for="la">CRUSH NAME</label>
<form:input id="la" path="crushname"/>
    <form:errors path="crushname"></form:errors>
</div>
<div style="margin-top: 30px">

<form:checkbox path="ok"/>
<label>I am Agreeing that this for fun</label>
<form:errors path="ok"></form:errors>
</div>
<p align="center">
<form:button>Submit</form:button>


</p>
</form:form>
</div>

</body>
</html>







  
    
   
    
