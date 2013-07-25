/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.login;


import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class ConexaoMySql {
    
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    String url = "jdbc:mysql://localhost:3306/bancoteste";
    String user = "root";
    String password = "";
    String driver = "com.mysql.jdbc.Driver";
    
    public void openConnectionMySql(){
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url,user,password);
            
            stmt = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro na conexão com banco de dados",
                    "Erro", JOptionPane.ERROR_MESSAGE, null);
        }
    }

}
