package com.AdvanceCRUD.controler;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.AdvanceCRUD.sqlconnection.sqlconnection;

@WebServlet("/showallServlet")
public class ShowallServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ShowallServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        ArrayList al = null;
        ArrayList userDetail = new ArrayList(18);
        String query = "select * from party";

        Connection con = sqlconnection.getConnection();

        try (PreparedStatement preparedStatement = con.prepareStatement(query);) {
            ResultSet ResultSet = preparedStatement.executeQuery();
            while (ResultSet.next()) {
                al = new ArrayList();

                al.add(ResultSet.getInt(1));
                al.add(ResultSet.getString(2));
                al.add(ResultSet.getString(3));
                al.add(ResultSet.getString(4));
                al.add(ResultSet.getString(5));
                al.add(ResultSet.getString(6));
                al.add(ResultSet.getString(7));
                al.add(ResultSet.getString(8));
                al.add(ResultSet.getString(9));

                System.out.println("al :: " + al);
                userDetail.add(al);
            }

            request.setAttribute("userDetail", userDetail);
            request.setAttribute("UserDetail", userDetail);
//				String nextJSP = "viewSearch.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/showall");
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}
