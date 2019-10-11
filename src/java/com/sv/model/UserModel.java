package com.sv.model;

import com.sv.conexion.Conexion;
import java.sql.*;

/**
 *
 * @author Alexandra Gomez
 */
public class UserModel extends Conexion{
    PreparedStatement pre;
    ResultSet res;

    public int login(String username, String password){
        int nivel = 0;
        try {
            this.Conectar();
            String sql ="select level from users where username='"+username+"' and password='"+password+"'";
            pre = this.getCon().prepareStatement(sql);
            res = pre.executeQuery();
            while(res.next()){
                nivel = res.getInt(1);               
            }  
        } catch (Exception e) {
            System.out.println("Error en modelo crud "+e);
        }
        return nivel;
    }
}
