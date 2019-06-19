
package io.github.viniciusecortez.sqladapter.test;

import io.github.viniciusecortez.sqladapter.structure.SQL;
import io.github.viniciusecortez.sqladapter.structure.SQLite;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author viniciusecortez
 */
public class SQLiteTest {
    private SQL sql;
    @Before
    public void setUp() throws Exception{
        this.sql = new SQLite("test.db"); 
    }
    
    
    @Test
    public void test() throws SQLException{
        sql.update("DELETE FROM People WHERE nick = 'test';");
        sql.update("INSERT INTO People(nick, nome) VALUES ('test','testes');");
        ResultSet rs = sql.query("SELECT nick FROM People WHERE nick = 'test'");
        sql.disconect();
        Assert.assertEquals(rs.getString("nick"), "test");
    }
    
    
    
}
