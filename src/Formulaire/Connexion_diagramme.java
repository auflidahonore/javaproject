/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulaire;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author MARCELLINA
 */
public class Connexion_diagramme {
          Connection con=null;
    public static Connection connexion_chart() throws ClassNotFoundException{
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bdcaisse","root","");
        return con;
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null,ex);
        ex.printStackTrace();
        return null;
    }
}
       
    
    
}
