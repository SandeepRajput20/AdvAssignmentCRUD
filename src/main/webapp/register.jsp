<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New user</title>
<%@include file="component/common_css_js.jsp"%>
</head>
<body>
    <%@include file="component/nav1.jsp"%>
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-4 offset-md-4">
                <div class="card">
                    <div class="card-body px-5">
                        <h3 class="text-center my-3">Register
                            Here!!</h3>
                        <form
                            onsubmit="return !!(nameValidation() & Validation() & emailValidation())"
                            action="RegisterServlet" method="post">
                            <div class="form-group">
                                <label for="fname">First Name</label> <input
                                    name="firstName" type="text"
                                    class="form-control" id="firstName"
                                    placeholder="Enter First Name">
                                <span id="firstname" style="color: red;">
                                </span>
                            </div>
                            <div class="form-group">
                                <label for="last_name">Last Name</label>
                                <input name="lastName" type="text"
                                    class="form-control" id="lastName"
                                    placeholder="Enter Last Name">
                                <span id="lastname" style="color: red;">
                                </span>
                            </div>
                            <div class="form-group">
                                <label for="address">Address</label> <input
                                    name="address" type="text"
                                    class="form-control" id="address"
                                    placeholder="Enter Address">
                                <span id="Address" style="color: red;">
                                </span>
                            </div>
                            <div class="form-group">
                                <label for="city">City</label> <input
                                    name="city" type="text"
                                    class="form-control" id="city"
                                    placeholder="Enter City"> <span
                                    id="City" style="color: red;">
                                </span>
                            </div>
                            <div class="form-group">
                                <label for="state">State</label> <input
                                    name="state" type="text"
                                    class="form-control" id="state"
                                    placeholder="Enter State"> <span
                                    id="State" style="color: red;">
                                </span>
                            </div>
                            <div class="form-group">
                                <label for="country">Country</label> <input
                                    name="country" type="text"
                                    class="form-control" id="country"
                                    placeholder="Enter Country">
                                <span id="Country" style="color: red;">
                                </span>
                            </div>
                            <div class="form-group">
                                <label for="pincode">Pin-code</label> <input
                                    name="pincode" type="text"
                                    class="form-control" id="pincode"
                                    placeholder="Enter Pincode">
                                <span id="Pincode" style="color: red;">
                                </span>
                            </div>
                            <div class="form-group">
                                <label for="phone">Phone</label> <input
                                    name="phone" type="text"
                                    class="form-control" id="phone"
                                    placeholder="Enter Phone"> <span
                                    id="Phone" style="color: red;">
                                </span>
                            </div>
                            <div class="form-group">
                                <label for="email">Email</label> <input
                                    name="email" type="email"
                                    class="form-control" id="email"
                                    placeholder="Enter Email"> <span
                                    id="Email" style="color: red;">
                                </span>
                            </div>
                            <div class="form-group">
                                <label for="password">Password</label> <input
                                    name="password" type="password"
                                    class="form-control" id="password"
                                    placeholder="Enter Password">
                                <span id="Password" style="color: red;">
                                </span>
                            </div>
                            <div class="container text-center">
                                <button class="btn-outline-success">Register</button>
                            </div>
                        </form>
                    </div>

                </div>
            </div>
        </div>
    </div>
</body>
</html>
