package DAO;

import DataBase.Database_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class DaoTurnRegister {
    
    /*Database_Connection dbConnection;
    
    private static final String turnRegister = "insert into (table_Name) ((column_Name_Number), (column_name_by_date_hour)) values (?, ?)";

    public void saveTurn(int turnNumber, LocalDateTime date_hour_generator){
    
        try(Connection connection_ = dbConnection.getConnection()); PreparedStatement statement = connection_.prepareStatement(turnRegister)){
        
            statement.setInt(1, turnNumber);
            statement.setTimestamp(2, Timestamp.valueOf(date_hour_generator));
            
            statement.executeUpdate();
        }
        catch(SQLException e){e.printStackTrace();}
    }*/
}
