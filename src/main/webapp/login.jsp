<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Login</title>
<%@include file="component/common_css_js.jsp"%>
</head>
<body>
    <%@include file="component/nav1.jsp"%>
    <div class="container">
        <div class="row">
            <div class="col-md-6 offset-md-3">
                <div class="card mt-3">
                    <div class="card-body">
                        <h3 class="text-center my-3">Login</h3>
                        <form onsubmit="return emailValidation()"
                            action="LoginServlet" method="POST">
                            <div class="form-group">
                                <label for="email">Email address</label>
                                <input name="email" type="email"
                                    class="form-control" id="email"
                                    aria-describedby="emailHelp"
                                    placeholder="Enter email"> <span
                                    id="Email" style="color: red;">
                                </span>
                            </div>
                            <div class="form-group">
                                <label for="password">Password</label> <input
                                    name="password" type="password"
                                    class="form-control" id="password"
                                    placeholder="Password"> <span
                                    id="Password" style="color: red;">
                            </div>
                            <a href="register"
                                class="text-center d-block mb-2">If
                                You Are Not Register Click Hear!!</a>
                            <div class="container text-center">
                                <button type="submit"
                                    class="btn btn-primary custom-bg border-0">Login</button>
                            </div>
                        </form>
                    </div>
                    <div class="card-footer"></div>
                </div>
            </div>
        </div>
</body>
</html>
