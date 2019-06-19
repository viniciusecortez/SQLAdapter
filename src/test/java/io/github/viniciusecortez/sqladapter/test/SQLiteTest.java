
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
        sql.exec("CREATE TABLE IF NOT EXISTS Pessoa(id INTEGER AUTO_INCREMENT, "
                + "nick VARCHAR(30),"
                + "nome VARCHAR(20));");
    }
    
    
    @Test
    public void test() throws SQLException{
        sql.update("DELETE FROM Pessoa WHERE nick = 'test';");
        sql.update("INSERT INTO Pessoa(nick, nome) VALUES ('test','testes');");
        ResultSet rs = sql.query("SELECT nick FROM Pessoa WHERE nick = 'test'");
        
        Assert.assertEquals(rs.getString("nick"), "test");
        sql.disconect();
    }
    /*
    This test below verify if a complete delete will
    happen in the database
    */
    @Test
    public void deleteAll() throws SQLException{
        sql.update("DELETE FROM Pessoa;");
        ResultSet rs = sql.query("SELECT * FROM Pessoa;");
        int size = 0;
        while(rs.next()){
            size++;
        }
        Assert.assertEquals(size, 0);
        
    }
    
}
