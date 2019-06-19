
package io.github.viniciusecortez.sqladapter.structure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author viniciusecortez
 */
public abstract class SQL {
    protected Connection connect;
    public SQL(String manager, String address) throws Exception{
        connect = DriverManager.getConnection("jdbc:"+ manager + ":"+ address);
    }
  
    public void exec(String query)  throws SQLException{
            PreparedStatement ps =connect.prepareStatement(query);
            ps.execute();
    }

    public ResultSet query(String query)throws SQLException {
        PreparedStatement ps = connect.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        return rs;
    }
 
    public void update(String query) throws SQLException {
        PreparedStatement ps = connect.prepareStatement(query);
        ps.executeUpdate();
    }
    public void disconect() throws SQLException{
        if(connect != null)
        connect.close();
    }
}
