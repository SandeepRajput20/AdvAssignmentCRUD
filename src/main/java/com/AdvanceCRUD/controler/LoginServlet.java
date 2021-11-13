package com.AdvanceCRUD.controler;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.AdvanceCRUD.dao.LoginDao;
import com.AdvanceCRUD.model.Login;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private LoginDao loginDao = new LoginDao();

    public LoginServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        Login login = new Login();
        login.setEmail(email);
        login.setPassowrd(password);

        try {
            if (loginDao.loginValidate(login)) {

                HttpSession session = request.getSession();
                session.setAttribute("uid", email);
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("home");
                requestDispatcher.forward(request, response);
            } else {
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("login");
                requestDispatcher.forward(request, response);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
