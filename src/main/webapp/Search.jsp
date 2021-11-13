<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search</title>
<%@include file="component/common_css_js.jsp"%>
</head>
<body>
    <%@include file="component/nav2.jsp"%>
    <div class="container">
        <div class="row">
            <div class="col-md-6 offset-md-3">
                <div class="card mt-3">
                    <div class="card-body">
                        <h3 class="text-center my-3">Search</h3>
                        <form onsubmit="return nameValidation()"
                            action="SearchServlet" method="POST">
                            <div class="form-group">
                                <label for="fname">First Name</label> <input
                                    name="fname" type="text"
                                    class="form-control" id="fname"
                                    placeholder="Enter First Name">
                            </div>
                            <div class="form-group">
                                <label for="last_name">Last Name</label>
                                <input name="lname" type="text"
                                    class="form-control" id="email"
                                    placeholder="Enter Last Name">
                            </div>
                            <div class="container text-center">
                                <button type="submit"
                                    class="btn btn-primary custom-bg border-0">Search</button>
                            </div>
                        </form>
                    </div>
                    <div class="card-footer"></div>
                </div>
            </div>
        </div>
</body>
</html>
