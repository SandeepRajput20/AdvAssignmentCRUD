package com.AdvanceCRUD.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SessionmsgServlet")
public class SessionmsgServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<h1>");
        out.println("Before Access Detail Page please login Hear");
        out.println("</h1>");
        RequestDispatcher rd = request.getRequestDispatcher("login");
        rd.include(request, response);
    }
}