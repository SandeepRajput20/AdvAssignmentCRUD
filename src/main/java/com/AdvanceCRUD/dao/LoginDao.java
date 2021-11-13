package com.AdvanceCRUD.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.AdvanceCRUD.model.Login;
import com.AdvanceCRUD.model.Register;
import com.AdvanceCRUD.sqlconnection.sqlconnection;

public class LoginDao {

    public boolean loginValidate(Login login) throws ClassNotFoundException {

        String q2 = "select * from userlogin where userLoginId= ? and password= ?";
        boolean result = false;

        Connection con = sqlconnection.getConnection();
        try (PreparedStatement preparedStatement2 = con.prepareStatement(q2);) {

            preparedStatement2.setString(1, login.getEmail());
            preparedStatement2.setString(2, login.getPassword());

            ResultSet resultSet = preparedStatement2.executeQuery();
            result = resultSet.next();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }

}
