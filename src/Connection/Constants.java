/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

/**
 *
 * @author MARCELLINA
 */
public interface Constants{
	public static final String HOST="localhost";//nom de la machine dans laquelle s'installe la base de données
	public static final String BASE="bdcaisse";//nom de la base de données
	public static final String USER="root";//nom d'utilisateur
	public static final String PASSWD="";//mot de passe utilisateur
	public static final String URL="jdbc:mysql://"+HOST+"/"+BASE;//url de la base
}
