package com.AdvanceCRUD.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.AdvanceCRUD.dao.RegisterDao;
import com.AdvanceCRUD.dao.UpdateDao;
import com.AdvanceCRUD.model.Update;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UpdateDao updateDao = new UpdateDao();
    String id;

    public UpdateServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        String id = request.getParameter("id");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String country = request.getParameter("country");
        String pincode = request.getParameter("pincode");
        String phone = request.getParameter("phone");

        Update update = new Update();
        update.setPartyId(id);
        update.setFirstName(firstName);
        update.setLastName(lastName);
        update.setAddress(address);
        update.setCity(city);
        update.setState(state);
        update.setCountry(country);
        update.setPincode(pincode);
        update.setPhone(phone);

        try {
            System.out.print("" + update.getPartyId());
            updateDao.valueUpdate(update);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/home");
            dispatcher.forward(request, response);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
