/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import Classe.ClasseCommander;
import Connection.ConnexionBase;
import java.sql.ResultSet;

/**
 *
 * @author MARCELLINA
 */
public class GestCommande {
    public ConnexionBase connection;
    
    public GestCommande() throws Exception{
        connection= new ConnexionBase();
   
    }
    
//Insertion
    public void insert(ClasseCommander obj) throws Exception{
        String query="insert into commander(NOM_CLI, PREN_CLI, DATE_COM, NOM_ACT, TITRE_ACT, TYPE_ACT, DATE_ACT, DATE_FIN_ACT, DURE_ACT, PRIX_COM) VALUES('"+obj.getNomCli()+"', '"+obj.getPrenCli()+"', '"+obj.getDateCom()+"', '"+obj.getNomAct()+"', '"+obj.getTitreAct()+"', '"+obj.getTypeAct()+"', '"+obj.getDateAct()+"', '"+obj.getDateFinAct()+"', '"+obj.getDureAct()+"', '"+obj.getPrixCom()+"')";
        connection.executeUpdate(query);
    }
    
 //Modification
    public void update(String id, ClasseCommander obj) throws Exception{
        String query="update commander set NUM_COM='"+obj.getIdCom()+"', NOM_CLI='"+obj.getNomCli()+"', PREN_CLI='"+obj.getPrenCli()+"', DATE_COM='"+obj.getDateCom()+"', NOM_ACT='"+obj.getNomAct()+"', TITRE_ACT='"+obj.getTitreAct()+"', TYPE_ACT='"+obj.getTypeAct()+"', DATE_ACT='"+obj.getDateAct()+"', DATE_FIN_ACT='"+obj.getDateFinAct()+"', DURE_ACT='"+obj.getDureAct()+"', PRIX_COM='"+obj.getPrixCom()+"' where NUM_COM='"+id+"'";
        connection.executeUpdate(query);
    } 
    
 //Suppression
    public void delete(String id) throws Exception{
        String query="delete from commander where NUM_COM='"+id+"'";
            connection.executeUpdate(query);
    }
    
     //Listes
     public ResultSet getAll() throws Exception{
        String query="select * from commander";
        ResultSet rs=connection.executeQuery(query);
        return rs;
    }
     
    public ResultSet ChargerCombo() throws Exception{
        String query="SELECT commander.NUM_COM FROM commander ORDER BY NUM_COM ASC";
        ResultSet rs = connection.executeQuery(query);
        return rs;
    }
    
    public ResultSet TFChargerCombo(String id2) throws Exception{
        String query="SELECT commander.NUM_COM, commander.NOM_CLI, commander.PREN_CLI, commander.NOM_ACT, commander.TYPE_ACT, commander.DURE_ACT, commander.DATE_COM, commander.PRIX_COM FROM commander WHERE NUM_COM='"+id2+"'";
        ResultSet rs = connection.executeQuery(query);
        return rs;
    } 
}
