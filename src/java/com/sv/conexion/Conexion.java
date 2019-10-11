package com.sv.conexion;
import java.util.*;
import java.sql.*;
/**
 *Clase: Clase que contendra la conexion sencilla ---> pronto cambiara a Datasource
 * @author Alexndra Gomez
 */
public class Conexion {
    
    private String user="root";
    private String password="";
    private String url="jdbc:mysql://localhost:3306/hotel_sv?";
    private String driver="com.mysql.jdbc.Driver";
    
    private Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public void Conectar(){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println("Error en la conexion"+e);
        }
    }
    
    public void Disconnect(){
        try {
            if (con != null) {
                if (con.isClosed()) {
                    con.close();
                }
            }
        } catch (Exception e) {
            System.out.println("Error al desconectar"+e);
        }
    }
    
}
