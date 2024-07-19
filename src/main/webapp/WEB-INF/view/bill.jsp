<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

.sty{
display: flex;
flex-direction: row;
margin-bottom: 50px;
gap:10px;
}
.base{
display: flex;
align-items: center;
justify-content: center;
width: 100%;
height: 100%;
}
</style>
</head>
<body>


<h1 align="center">ADD BILL</h1>


<form:form modelAttribute="ob" action="bill1" >
<div style="display: flex; justify-content: center; align-items: center; flex-direction: column; margin-top: 100px; ">

<div class="sty">
    <label>
Enter Name:
</label>
    <form:input path="name"/>
    <form:errors path="name"></form:errors>
</div>


<div class="sty">
<label>
Enter Card No:
</label>
  <form:input path="card"/>
     <form:errors path="card"></form:errors>
</div>
<div class="sty">
    <label>
Enter Amount:
</label>
   <form:input path="amount"/><form:errors path="amount"></form:errors>
</div>

<div class="sty">
   <label>
Enter Currency:
</label>
    <form:input path="currency"/>
     <form:errors path="currency"></form:errors>
</div>

<div class="sty">
    <label>
Enter Date:
</label>
    <form:input path="date"/>
     <form:errors path="date"></form:errors>
</div>
    <form:button>Click</form:button>
<div/>   
</form:form>


</body>
</html>