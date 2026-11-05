<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="main.css">
</head>
<body>
    <h1>Thanks for joining our email list</h1>
    <p>Here is the information that you entered:</p>

    <p>
        <label>Email:</label>
        <span class="data">${user.email}</span><br>

        <label>First Name:</label>
        <span class="data">${user.firstName}</span><br>

        <label>Last Name:</label>
        <span class="data">${user.lastName}</span><br>
    </p>

    <p>To enter another email address, click on the Back button in your browser or the Return button shown below.</p>

    <form action="emailList" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>
</body>
</html>