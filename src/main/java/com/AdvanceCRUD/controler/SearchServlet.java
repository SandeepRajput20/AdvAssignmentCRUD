package com.AdvanceCRUD.controler;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import javax.mail.Session;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.AdvanceCRUD.sqlconnection.sqlconnection;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public SearchServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");

        String query = "select * from party where firstname=? and lastname=?";
        Connection con = sqlconnection.getConnection();
        try (PreparedStatement preparedStatement = con.prepareStatement(query);) {

            ArrayList al = null;
            ArrayList userDetail = new ArrayList(18);

            preparedStatement.setString(1, fname);
            preparedStatement.setString(2, lname);
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
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/searchview");
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
