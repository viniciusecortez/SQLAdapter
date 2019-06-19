
package io.github.viniciusecortez.sqladapter.structure;

import java.sql.Connection;
import java.sql.DriverManager;
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
    public abstract void exec(String query) throws SQLException;
    public abstract ResultSet query(String query) throws SQLException;
    public abstract void update(String query) throws SQLException;
    public void disconect() throws SQLException{
        if(connect != null)
        connect.close();
    }
}
