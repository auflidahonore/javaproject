/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import Classe.ClasseCaisse;
import Connection.ConnexionBase;
import java.sql.ResultSet;

/**
 *
 * @author MARCELLINA
 */
public class GestCaisse {
     public ConnexionBase connection;
    
    public GestCaisse() throws Exception{
        connection = new ConnexionBase();
    }
    
    //insert
    public void insert(ClasseCaisse obj, String cc) throws Exception{
        String query="insert into  caisse(solde_caisse)VALUES('"+obj.getCaisse()+"' + '"+cc+"')";
        connection.executeUpdate(query);
    }
    
    public void update(ClasseCaisse obj, String cc) throws Exception{
        String query="UPDATE caisse SET solde_caisse='"+obj.getCaisse()+"' + '"+cc+"'";
        connection.executeUpdate(query);
    }
    
    public ResultSet Caisse() throws Exception{
        String query = "select sum(soldecaisse) from caisse";
        ResultSet rs = connection.executeQuery(query);
        return rs;
    }
    
    
        //insert
    public void insert1(ClasseCaisse obj, String cc) throws Exception{
        String query="insert into  caisse(solde_caisse)VALUES('"+obj.getCaisse()+"' - '"+cc+"')";
        connection.executeUpdate(query);
    }
    
    public void update1(ClasseCaisse obj, String cc) throws Exception{
        String query="UPDATE caisse SET solde_caisse='"+obj.getCaisse()+"' - '"+cc+"'";
        connection.executeUpdate(query);
    }
}
