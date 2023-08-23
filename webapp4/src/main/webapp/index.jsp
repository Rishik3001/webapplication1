<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignIn&Up</title>
<link rel="stylesheet" href="./style.css">
</head>
<body>
	<div class="container" id="container">
        <div class="form-container sign-up-container">
            <form action="">
                <h1>Create Account</h1>
                <input type="text" placeholder="Enter Employee Id" name="empid" />
                <input type="text" placeholder="Name" name="empname" />
			    <input type="email" placeholder="Email" name="email" />
			    <input type="password" placeholder="Password" name="pwd" />
			    <button type="submit">Sign Up</button>
            </form>
        </div>
        <div class="form-container sign-in-container">
            <form action="./signin">
                <h1>Sign in</h1>
                <input type="email" placeholder="Email" name="email" />
			    <input type="password" placeholder="Password" name="pwd" />
			    <a href="#">Forgot your password?</a>
			    <button type="submit" >Sign In</button>
            </form>
        </div>
        <div class="overlay-container">
            <div class="overlay">
                <div class="overlay-panel overlay-left">
                    <h1>Welcome Back!</h1>
                    <p>To keep connected with us please login with your personal info</p>
                    <button class="ghost" id="signIn">Sign In</button>
                </div>
                <div class="overlay-panel overlay-right">
                    <h1>Hello, Friend!</h1>
				    <p>Enter your personal details and start journey with us</p>
                    <button class="ghost" id="signUp">Sign Up</button>
                </div>
            </div>
        </div>
    </div>
    <script src="./script.js"></script>
</body>
</html>