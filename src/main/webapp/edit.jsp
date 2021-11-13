<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.AdvanceCRUD.sqlconnection.sqlconnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New user</title>
<%@include file="component/common_css_js.jsp"%>

</head>
<body>
    <%@include file="component/nav2.jsp"%>
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-4 offset-md-4">
                <div class="card">
                    <div class="card-body px-5">
                        <h3 class="text-center my-3">Register
                            Here!!</h3>
                        <%
                        String id = request.getParameter("id");

                        Connection con = sqlconnection.getConnection();
                        PreparedStatement preparedStatement = con.prepareStatement("select * from party where partyId=" + id + "");
                        ResultSet rs = preparedStatement.executeQuery();
                        if (rs.next()) {
                        %>
                        <form
                            onsubmit="return !!nameValidation() & Validation()"
                            action="UpdateServlet?id=<%=id%>"
                            method="POST">

                            <div class="form-group">
                                <label for="fname">First Name</label> <input
                                    name="firstName" type="text"
                                    value="<%=rs.getString(2)%>"
                                    class="form-control" id="firstName">
                            </div>
                            <div class="form-group">
                                <label for="last_name">Last Name</label>
                                <input name="lastName" type="text"
                                    value="<%=rs.getString(3)%>"
                                    class="form-control" id="lastName">
                            </div>
                            <div class="form-group">
                                <label for="address">Address</label> <input
                                    name="address" type="text"
                                    value="<%=rs.getString(4)%>"
                                    class="form-control" id="address">
                            </div>
                            <div class="form-group">
                                <label for="city">City</label> <input
                                    name="city"
                                    value="<%=rs.getString(5)%>"
                                    type="text" class="form-control"
                                    id="city">
                            </div>
                            <div class="form-group">
                                <label for="state">State</label> <input
                                    name="state"
                                    value="<%=rs.getString(6)%>"
                                    type="text" class="form-control"
                                    id="state">
                            </div>
                            <div class="form-group">
                                <label for="country">Country</label> <input
                                    name="country" type="text"
                                    value="<%=rs.getString(7)%>"
                                    class="form-control" id="country">
                            </div>
                            <div class="form-group">
                                <label for="pincode">Pin-code</label> <input
                                    name="pincode"
                                    value="<%=rs.getString(8)%>"
                                    type="text" class="form-control"
                                    id="pincode">
                            </div>
                            <div class="form-group">
                                <label for="phone">Phone</label> <input
                                    name="phone"
                                    value="<%=rs.getString(9)%>"
                                    type="text" class="form-control"
                                    id="phone">
                            </div>
                            <div class="container text-center">
                                <button type="submit"
                                    class="btn-outline-success">Update</button>
                            </div>
                            <%
                            }
                            preparedStatement.close();
                            %>

                        </form>

                    </div>

                </div>
            </div>
        </div>
    </div>
</body>
</html>
