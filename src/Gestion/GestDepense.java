/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import Classe.ClasseDepense;
import Connection.ConnexionBase;
import java.sql.ResultSet;

/**
 *
 * @author MARCELLINA
 */
public class GestDepense {
    public ConnexionBase connection;
    
    public GestDepense() throws Exception{
        connection = new ConnexionBase();
    }
    
    //INSERT
    public void insert(ClasseDepense obj) throws Exception{
        String query="insert into depense(date_dep, montant_dep, motif_dep, mois_dep) VALUES('"+obj.getDateDep()+"', '"+obj.getMontantDep()+"', '"+obj.getMotifDep()+"', '"+obj.getMoisDep()+"')";
        connection.executeUpdate(query);
    }
    
    //MODIFIER
    public void update(String id, ClasseDepense obj) throws Exception{
        String query="UPDATE depense set num_dep='"+obj.getIdDep()+"', date_dep='"+obj.getDateDep()+"', montant_dep='"+obj.getMontantDep()+"', motif_dep='"+obj.getMotifDep()+"', mois_dep='"+obj.getMoisDep()+"' where num_dep='"+id+"'";
        connection.executeUpdate(query);
    }
    
     //Supprimer
    public void delete(String id) throws Exception{
        String query="delete from depense where NUM_DEP='"+id+"'";
        connection.executeUpdate(query);
}
    
    //Listes
     public ResultSet getAll() throws Exception{
        String query="select * from depense";
        ResultSet rs=connection.executeQuery(query);
        return rs;
    }
}
