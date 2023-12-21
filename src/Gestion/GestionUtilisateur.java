/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import Classe.ClasseUtilisateur;
import Connection.ConnexionBase;
import java.sql.ResultSet;

public class GestionUtilisateur {
    public ConnexionBase connexion;

    public GestionUtilisateur() throws Exception{
	connexion=new ConnexionBase();
    }

    public void insert(ClasseUtilisateur obj)throws Exception{
        String query="insert into utilisateur values ('"+obj.getLogin()+"','"+obj.getMdp()+"')";
        connexion.executeUpdate(query);
    }

    public void update(String id, ClasseUtilisateur obj) throws Exception{
        String query="update utilisateur set login='"+obj.getLogin()+"', mdp='"+obj.getMdp()+"'";
        connexion.executeUpdate(query);
    }

    public void delete(String id) throws Exception{
        String query="delete from utilisateur where login='"+id+"'";
        connexion.executeUpdate(query);
    }

     public ResultSet getUsers(String log) throws Exception{
        String query="select login,mdp from utilisateur where login='"+log+"'";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    public ResultSet getDetail() throws Exception{
        String query="SELECT ACTION.IDENTIFIANT, INTERVENANT.RESPONS_INTERV, INTERVENANT.TEL_RESP, INTERVENANT.SIEGE, INTERVENANT.JOUR_IMP,INTERVENANT.MOIS_IMP,INTERVENANT.ANNE_IMP, ACTION.INTUTIL_ACTION, ACTION.ACTIVITE, ACTION.ORG_FIN_ACTION, ACTION.CIBLE_ACTION, ZONE.COMMUNE, EXECUTER.DUREE_ACTION FROM ZONE INNER JOIN ((INTERVENANT INNER JOIN ACTION ON INTERVENANT.IDENTIFIANT = ACTION.IDENTIFIANT) INNER JOIN EXECUTER ON ACTION.NUM_ACTION = EXECUTER.NUM_ACTION) ON ZONE.CODE_ZONE = EXECUTER.CODE_ZONE ORDER BY ACTION.IDENTIFIANT";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
    public ResultSet getAll() throws Exception{
        String query="select * from utilisateur order by login asc";
        ResultSet rs = connexion.executeQuery(query);
        return rs;
    }
}
