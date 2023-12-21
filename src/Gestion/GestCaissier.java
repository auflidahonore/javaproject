/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import Classe.ClasseCaissier;
import Connection.ConnexionBase;
import java.sql.ResultSet;

/**
 *
 * @author MARCELLINA
 */
public class GestCaissier {
    public ConnexionBase connection;
    
    public GestCaissier() throws Exception{
        connection = new ConnexionBase();
    }
    
//insert
    public void insert(ClasseCaissier obj) throws Exception{
        String query="insert into caissier (cin_caissier, nom_caissier, pren_caissier, fonction, telephone) VALUES ("+obj.getCinCaissier()+", '"+obj.getNomCaissier()+"', '"+obj.getPrenCaissier()+"', '"+obj.getFonctCaissier()+"', '"+obj.getTelCaissier()+"')";
            connection.executeUpdate(query);
    }
    
//Modifier
    public void update(String id, ClasseCaissier obj) throws Exception{
        String query="UPDATE caissier set cin_caissier='"+obj.getCinCaissier()+"', nom_caissier='"+obj.getNomCaissier()+"', pren_caissier='"+obj.getPrenCaissier()+"', fonction='"+obj.getFonctCaissier()+"', telephone='"+obj.getTelCaissier()+"' where cin_caissier='"+id+"'";
    }
 //Supprimer
    public void delete(String id) throws Exception{
        String query="delete from caissier where cin_caissier='"+id+"'";
           connection.executeUpdate(query);
    } 
    
    //Listes
     public ResultSet getAll() throws Exception{
        String query="select * from caissier";
        ResultSet rs=connection.executeQuery(query);
        return rs;
    }
    
}
