
package io.github.viniciusecortez.sqladapter.structure;

/**
 *
 * @author viniciusecortez
 */
public class MySQL extends SQL{
    public MySQL(String address) throws Exception{
        super("mysql", address);
    }
}
