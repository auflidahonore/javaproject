/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author MARCELLINA
 */
public class ConnexionBase {
    public Connection con;
    public Statement stat;
public ConnexionBase () throws Exception{
    Class.forName("org.gjt.mm.mysql.Driver");
    con = DriverManager.getConnection(Constants.URL,Constants.USER,Constants.PASSWD);
    stat = (Statement) con.createStatement();
}

   public ResultSet executeQuery(String query)throws Exception{
	ResultSet rs=null;
	rs=stat.executeQuery(query);
	return(rs);
}
public int executeUpdate(String query) throws Exception{
	int rs=0;
	rs=stat.executeUpdate(query);
	return(rs);
}
public void close() throws Exception{
		stat.close();
		con.close();
}

}
