package br.sceweb.model;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import br.sceweb.servi�o.FabricaDeConexoes;

public class Empresa {

	public int adiciona(Empresa empresa){
		PreparedStatement ps;
		int codigoRetorno=0;
		try (Connection conn = new FabricaDeConexoes().getConnection()){
		} catch (SQLException e){
		throw new RuntimeException(e);
		}
		return 1;
		}
}
