/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unifacef;

import java.sql.*;

public class BancoDados {

    public static Connection conecta() {
        Connection con;
        String url  = "jdbc:postgresql://localhost:5432/academico";
        String user = "postgres";
        String psw  = "12345";

        try {
            con = DriverManager.getConnection(url, user, psw);
            System.out.println("Conectou!!!");
            return con;
            

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
