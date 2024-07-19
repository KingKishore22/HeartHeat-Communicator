<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Date</h2>
<h3>${ob.date}</h3>
<h2>Currency</h2>
<h3>${ob.currency}</h3>
<h2>card</h2>
<h3>1)  ${ob.card.getFir()}</h3>
<h3>2)  ${ob.card.getSec()}</h3>
<h3>3)  ${ob.card.getThi()}</h3>
<h3>4)  ${ob.card.getFort()}</h3>
<h2>Amount</h2>
<h3>${ob.amount}</h3>
<h2>Name</h2>
<h3>${ob.name}</h3>
</body>
</html>