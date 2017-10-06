package br.sceweb.serviço;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class FabricaDeConexoes {

	public Connection getConnection(){
		String url = "jdbc:mysql://localhost/sceweb";
		try {
		Class. forName("com.mysql.jdbc.Driver");
		return (Connection) DriverManager. getConnection(url,"root","");
		}
		catch (Exception e){
		throw new RuntimeException(e);
		}
	}
	
}
