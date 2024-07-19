<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.sty{
margin-bottom:20px;
gap:30px;
display: flex; flex-direction: column; 
width: 250px;
}
</style>
</head>
<body>
<h1>Add Registration</h1>
<div style="display: flex; justify-content: center; align-items: center;">

<form:form modelAttribute="objs" action="req1" >
<div class="sty">


  <form:input path="f_name"/>
    <form:errors path="f_name"></form:errors>
    <form:input path="l_name"/>
    <form:errors path="l_name"></form:errors>
   <form:input path="age"/><form:errors path="age"></form:errors>
    <form:input path="place"/>
   
    <form:select path="country">
   
        <form:option value="IND" label="India"></form:option>
        <form:option value="AUS" label="Australia"></form:option>
        <form:option value="PAK" label="Pakistan"></form:option>
        <form:option value="AFG" label="Afghanistan"></form:option>
        <form:option value="NZ" label="New Zealand"></form:option>
    </form:select>
    <label>Hobbies</label>
     </div> 
    Cricket:<form:checkbox path="hob" value="Cricket"/>
    Football:<form:checkbox path="hob" value="Football"/>
    Tennis:<form:checkbox path="hob" value="Tennis"/>
    Baseball:<form:checkbox path="hob" value="Baseball"/>
    Hockey:<form:checkbox path="hob" value="Hockey"/>
    <div class="sty">
    
    <label>
    Mail Id:
    </label>
    <form:input path="com.mail"/>
     <label>
    Phone No:
    </label>
    <form:input path="com.phone"/>
    <form:button>Click</form:button>
    </div>
</form:form>
</div>
</body>
</html>
