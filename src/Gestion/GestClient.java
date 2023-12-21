/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import Classe.ClasseClient;
import Connection.ConnexionBase;
import java.sql.ResultSet;

/**
 *
 * @author MARCELLINA
 */
public class GestClient {
    public ConnexionBase connection;
    
    public GestClient() throws Exception{
        connection = new ConnexionBase();
    }
    
    //INSERT
    public void insert(ClasseClient obj) throws Exception{
        String query="insert into client(NOM_CLI, PREN_CLI, ADRESSE_CLI, TEL_CLI) VALUES('"+obj.getNomClient()+"', '"+obj.getPrenClient()+"', '"+obj.getAdrClient()+"', '"+obj.getTelClient()+"')";
        connection.executeUpdate(query);
    }
    
    //MODIFIER
    public void update(String id, ClasseClient obj) throws Exception{
        String query="UPDATE client set NUM_CLI='"+obj.getIdClient()+"', NOM_CLI='"+obj.getNomClient()+"', PREN_CLI='"+obj.getPrenClient()+"', ADRESSE_CLI='"+obj.getAdrClient()+"', TEL_CLI='"+obj.getTelClient()+"' where NUM_CLI='"+id+"'";
        connection.executeUpdate(query);
    }
    
     //Supprimer
    public void delete(String id) throws Exception{
        String query="delete from client where NUM_CLI='"+id+"'";
        connection.executeUpdate(query);
}
    
    //Listes
     public ResultSet getAll() throws Exception{
        String query="select * from client";
        ResultSet rs=connection.executeQuery(query);
        return rs;
    }
}
