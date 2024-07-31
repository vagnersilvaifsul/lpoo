package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
	public static Connection getConnection()  {

		final String url = "jdbc:mariadb://localhost:3306/lpoo_vendas_jdbc";

		try {
			//argumentos: url para o banco, usuário, senha
			//retorna um objeto da classe Connection (do pacote java.sql -> que segue a especificação JDBC).
			return DriverManager.getConnection(url, "mariadb", "mariadb");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	//um main para testar a conexão com o servidor do MariaDB
	public static void main(String[] args) {
		System.out.println(BaseDAO.getConnection());
    }

}
