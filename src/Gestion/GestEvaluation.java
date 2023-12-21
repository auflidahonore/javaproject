/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import Classe.ClasseEvaluation;
import Connection.ConnexionBase;
import java.sql.ResultSet;

/**
 *
 * @author MARCELLINA
 */
public class GestEvaluation {
     public ConnexionBase connection;
    
    public GestEvaluation() throws Exception{
        connection = new ConnexionBase();
    }
    
    //INSERT
    public void insert(ClasseEvaluation obj) throws Exception{
        String query="insert into evaluation(num_evalu, date_evalu, date_rech1, date_rech2, total_paiem, total_dep, solde_final_caisse) VALUES( "+obj.getNumEvalu()+", '"+obj.getDateEvalu()+"', '"+obj.getDateRech1()+"', '"+obj.getDateRech2()+"', '"+obj.getTotalPaiem()+"', '"+obj.getTotalDep()+"', '"+obj.getSoldefCaisse()+"')";
        connection.executeUpdate(query);
    }
    
    //MODIFIER
    public void update(String id, ClasseEvaluation obj) throws Exception{
        String query="UPDATE evaluation set num_evalu='"+obj.getNumEvalu()+"', date_evalu='"+obj.getDateEvalu()+"', date_rech1='"+obj.getDateRech1()+"', date_rech2='"+obj.getDateRech2()+"', total_paiem='"+obj.getTotalPaiem()+"', total_dep='"+obj.getTotalDep()+"', solde_final_caisse='"+obj.getSoldefCaisse()+"' where num_evalu='"+id+"'";
    }
    
     //Supprimer
    public void delete(String id) throws Exception{
        String query="delete from evaluation where num_evalu='"+id+"'";
        connection.executeUpdate(query);
    }
    
    //Listes
    public ResultSet getAll() throws Exception{
        String query="select * from evaluation";
        ResultSet rs=connection.executeQuery(query);
        return rs;
    }
    
}
