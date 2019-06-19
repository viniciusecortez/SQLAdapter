
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
    public abstract void exec(String query);
    public abstract ResultSet query(String query);
    public abstract void update(String query);
    public void disconect() throws SQLException{
        if(connect != null)
        connect.close();
    }
}
