<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FeedBack Form</title>
</head>
<body>
	<div class="center">
		<h1>User Feedback Page<h1/>
		<h2>Enter your Feedback<h2>
		<form method="get" action="update">
			<input type="text" name="comment" placeholder="comment here" />
			<input type="number" name="rating" />
			<input type="text" name="name" />
			<input type="submit" value="Submit Feedback" />
		<form/>
		<a href="feedback">View Feedbacks</a>
	</div>
</body>
</html>