/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembelian;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class koneksi {
      private static java.sql.Connection koneksi;
    
    
  
    public static java.sql.Connection getKoneksi() {
        // TODO code application logic here
     if(koneksi == null){
         try{
             String url = "jdbc:mysql://localhost:3306/pembelianpupuk";
             String user= "root";
             String password = "";
             koneksi = DriverManager.getConnection(url, user, password);
             System.out.println("Koneksi Berhasil");
         }catch(Exception e){
             System.out.println("Error");
         }
     }
     return koneksi;
    }
    
    
    public static void main (String [] args){
        getKoneksi();
    }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

