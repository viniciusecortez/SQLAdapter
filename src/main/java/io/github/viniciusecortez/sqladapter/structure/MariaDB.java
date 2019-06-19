/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.viniciusecortez.sqladapter.structure;

/**
 *
 * @author viniciusecortez
 */
public class MariaDB extends SQL{
    public MariaDB(String address) throws Exception{
        super("mariadb", address);
    }
}
