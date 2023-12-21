/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import Classe.ClasseCommander;
import Classe.ClassePaiement;
import Connection.ConnexionBase;
import java.sql.ResultSet;

/**
 *
 * @author MARCELLINA
 */
public class GestPaiement {
    public ConnexionBase connection;
    
    public GestPaiement () throws Exception{
        connection = new ConnexionBase();
    }
    
    //Insertion
    public void insert(ClassePaiement obj) throws Exception{
        String query="insert into paiement (NUM_COM, NOM_CLI, PREN_CLI, NOM_ACT, TYPE_ACT, DURE_ACT, DATE_COM, DATE_PAIEM, MODE_PAIEM, MONTANT_PAYER, MOIS_PAIM)VALUES('"+obj.getNumCom()+"', '"+obj.getNomCli()+"', '"+obj.getPrenCli()+"', '"+obj.getNomAct()+"', '"+obj.getTypeAct()+"', '"+obj.getDureAct()+"',  '"+obj.getDateCom()+"', '"+obj.getDatePaiem()+"', '"+obj.getModePaiem()+"', '"+obj.getMontantPayer()+"', '"+obj.getMoisPayer()+"')";
        connection.executeUpdate(query);
    }
    
    //Modification
        public void update(String id, ClassePaiement obj) throws Exception{
        String query="update paiement set NUM_PAIEM='"+obj.getNumPaiem()+"',NUM_COM='"+obj.getNumCom()+"', NOM_CLI='"+obj.getNomCli()+"', PREN_CLI='"+obj.getPrenCli()+"',NOM_ACT='"+obj.getNomAct()+"', TYPE_ACT='"+obj.getTypeAct()+"', DURE_ACT='"+obj.getDureAct()+"', DATE_COM='"+obj.getDateCom()+"', DATE_PAIEM='"+obj.getDatePaiem()+"', MODE_PAIEM='"+obj.getModePaiem()+"', MONTANT_PAYER='"+obj.getMontantPayer()+"', MOIS_PAIM='"+obj.getMoisPayer()+"' where NUM_PAIEM='"+id+"'";
        connection.executeUpdate(query);
    }
    
    //Suppression
    public void delete(String id) throws Exception{
        String query="delete from paiement where NUM_PAIEM='"+id+"'";
        connection.executeUpdate(query);
    }
    
     //Listes
     public ResultSet getAll() throws Exception{
        String query="select * from paiement";
        ResultSet rs=connection.executeQuery(query);
        return rs;
    } 
     
 
     
    
}
