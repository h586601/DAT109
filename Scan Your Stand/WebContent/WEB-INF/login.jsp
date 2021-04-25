<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<!--  See if a string can't be used for title -->
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Logg inn admin</title>
    <link rel="icon" type="image/png" sizes="32x32" href="${pageContext.request.contextPath}/images/favicon.png">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Squada+One&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/normalize.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
</head>

<body>
    <div class="login container-special clearfix">
        <div class="login-right">
            <img class="login-logo" src="../images/ScanYourStand.png" alt="">
        </div>

        <div class="login-left transparent-bg">
            <h1 class="login-title">Logg inn</h1>

            <form class="login-form" action="" method="POST">
                <label for="tlfnumber">Telefonnr</label>
                <input type="tel" class="tlfnumber" name="tlfnumber" placeholder="Skriv inn tlfnumeret ditt">
                <input type="submit" class="sign-in-cta button-default" value="Sign in">
            </form>
        </div>
    </div> <!--.login-->
</body>
</html>