/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightschedulerceg5409;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Chloe
 */
public class QueryHandler {
    private static final String URL = "jdbc:derby://localhost:1527/FlightSchedulerDBceg5409";
    private static final String USERNAME = "java";
    private static final String PASSWORD = "java";
    
    private Connection connection;
    private PreparedStatement selectAllDates;
    private PreparedStatement insertNewDate;
    
    public QueryHandler() {
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            
            selectAllDates = connection.prepareStatement("SELECT * FROM DAYTABLE");
            insertNewDate = connection.prepareStatement("INSERT INTO DAYTABLE" + "(DATE)" + "VALUES (?)");
        }
        catch(SQLException sqlException) {
            sqlException.printStackTrace();
            System.exit(1);
        }
    }
    
    public List< Day > getAllDates() {
        List< Day > results = null;
        ResultSet resultSet = null;
        
        try {
            resultSet = selectAllDates.executeQuery();
            results = new ArrayList< Day >();
            
            while (resultSet.next()) {
                results.add(new Day(resultSet.getString("DATE")));
            }
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        finally {
            try {
                resultSet.close();
            }
            catch (SQLException sqlException) {
                sqlException.printStackTrace();
                close();
            }
        }
        
        return results;
    }
    
    public int addNewDate(String date) {
        int result = 0;
        
        try {
            insertNewDate.setString(1, date);
            result = insertNewDate.executeUpdate();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
            close();
        }
        
        return result;
    }
    
    public void close() {
        try {
            connection.close();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
