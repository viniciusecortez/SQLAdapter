
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
public class SQLite extends SQL{
    
    public SQLite(String address) throws Exception{
        super("sqlite", address);
    }

    @Override
    public void exec(String query)  throws SQLException{
            PreparedStatement ps = super.connect.prepareStatement(query);
            ps.execute();
    }

    @Override
    public ResultSet query(String query)throws SQLException {
        PreparedStatement ps = super.connect.prepareStatement(query);
        return ps.executeQuery();
    }

    @Override
    public void update(String query) throws SQLException {
        PreparedStatement ps = super.connect.prepareCall(query);
        ps.executeUpdate();
    }
    
    
}
