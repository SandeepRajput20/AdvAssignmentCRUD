package com.AdvanceCRUD.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.ldap.ExtendedRequest;
import javax.servlet.RequestDispatcher;

import com.AdvanceCRUD.model.Update;
import com.AdvanceCRUD.sqlconnection.sqlconnection;

public class UpdateDao {

    public int valueUpdate(Update update) throws ClassNotFoundException {
        String q1 = "update party set firstname=?,lastname=?,address=?,city=?,state=?,country=?,pincode=?,phone=? where partyId=?";
        int result = 0;
        System.out.println("" + update.getPartyId());

        Connection con = sqlconnection.getConnection();

        try (PreparedStatement preparedStatement3 = con.prepareStatement(q1)) {

            String fname = update.getFirstName();
            String lname = update.getLastName();
            String address = update.getAddress();
            String city = update.getCity();
            String state = update.getState();
            String country = update.getCountry();
            String pincode = update.getPincode();
            String phone = update.getPhone();
            String id = update.getPartyId();

            preparedStatement3.setString(1, fname);
            preparedStatement3.setString(2, lname);
            preparedStatement3.setString(3, address);
            preparedStatement3.setString(4, city);
            preparedStatement3.setString(5, state);
            preparedStatement3.setString(6, country);
            preparedStatement3.setString(7, pincode);
            preparedStatement3.setString(8, phone);
            preparedStatement3.setString(9, id);

            if (preparedStatement3.executeUpdate() != 0) {
                System.out.println("Update successfully");
            } else {
                System.out.println("Update UNsuccessfully");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    private void setString(int i, String firstName) {
    }

}
