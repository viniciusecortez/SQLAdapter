
package io.github.viniciusecortez.sqladapter.structure;

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
}
