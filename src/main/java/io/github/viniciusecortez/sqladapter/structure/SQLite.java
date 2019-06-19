
package io.github.viniciusecortez.sqladapter.structure;

/**
 *
 * @author viniciusecortez
 */
public class SQLite extends SQL{
    
    public SQLite(String address) throws Exception{
        super("sqlite", address);
    }
}
