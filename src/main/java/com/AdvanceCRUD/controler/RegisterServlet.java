package com.AdvanceCRUD.controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.AdvanceCRUD.dao.RegisterDao;
import com.AdvanceCRUD.model.Register;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private RegisterDao registerDao = new RegisterDao();

    public RegisterServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String country = request.getParameter("country");
        String pincode = request.getParameter("pincode");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        Register register = new Register();
        register.setFirstName(firstName);
        register.setLastName(lastName);
        register.setAddress(address);
        register.setCity(city);
        register.setState(state);
        register.setCountry(country);
        register.setPincode(pincode);
        register.setPhone(phone);
        register.setEmail(email);
        register.setPassword(password);

        try {
            registerDao.Registeration(register);
            RequestDispatcher dispatcher = request.getRequestDispatcher("login");
            dispatcher.forward(request, response);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
