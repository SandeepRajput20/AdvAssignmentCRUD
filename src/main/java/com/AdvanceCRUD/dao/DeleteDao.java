package com.AdvanceCRUD.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.AdvanceCRUD.sqlconnection.sqlconnection;

public class DeleteDao {
    String id;

    public DeleteDao(String id) {
        // TODO Auto-generated constructor stub
        this.id = id;
    }

    public void deleteDao() {
        Connection con = sqlconnection.getConnection();
        try (PreparedStatement preparedStatement = con.prepareStatement("DELETE FROM party WHERE partyid=?");) {
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
            System.out.println(" Data Deleted Successfully!");
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }

    }

}
