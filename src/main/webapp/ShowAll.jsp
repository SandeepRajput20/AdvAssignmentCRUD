<%@ page import="java.util.*"%>

<html>
<head>
<%@include file="component/common_css_js.jsp"%>
</head>
<body>
    <%@include file="component/nav2.jsp"%>
    <div class="container" style="text-align: center;">
        <h1>ShowAll</h1>
    </div>
    <table class="table">
        <thead class="thead-dark">
            <tr>
                <th scope="col"><b>PartyId</b></th>
                <th scope="col"><b>FirstName</b></th>
                <th scope="col"><b>LastName</b></th>
                <th scope="col"><b>Address</b></th>
                <th scope="col"><b>City</b></th>
                <th scope="col"><b>State</b></th>
                <th scope="col"><b>Country</b></th>
                <th scope="col"><b>Pin-code</b></th>
                <th scope="col"><b>Phone</b></th>
                <th scope="col"><b></b></th>
                <th scope="col"><b></b></th>
            </tr>
        </thead>
        <%
        int count = 0;
        if (request.getAttribute("userDetail") != null) {
            ArrayList al = new ArrayList(15);
            al = (ArrayList) request.getAttribute("userDetail");
            Iterator itr = al.iterator();

            while (itr.hasNext()) {

                count++;
                ArrayList userDetail = (ArrayList) itr.next();
        %>
        <tbody>
            <tr>
                <td><%=userDetail.get(0)%></td>
                <td><%=userDetail.get(1)%></td>
                <td><%=userDetail.get(2)%></td>
                <td><%=userDetail.get(3)%></td>
                <td><%=userDetail.get(4)%></td>
                <td><%=userDetail.get(5)%></td>
                <td><%=userDetail.get(6)%></td>
                <td><%=userDetail.get(7)%></td>
                <td><%=userDetail.get(8)%></td>
                <td><a
                    href="DeleteServlet?id= <%=userDetail.get(0)%>"><button
                            type="button"
                            style="background-color: #f44336;"
                            class="Delete">Delete</button></a></td>
                <td><a href="edit?id= <%=userDetail.get(0)%>"><button
                            type="button"
                            style="background-color: #f44336;"
                            class="UpDate">Edit</button></a></td>

            </tr>
        </tbody>
        <%
        }
        }
        %>
        <%
        if (count == 0) {
        %>
        <tr>
            <td colspan=8 align="center"><b>No Record</b></td>
        </tr>
        <%
        }
        %>
    </table>
</body>
</html>