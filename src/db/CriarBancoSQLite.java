package db;

import java.sql.SQLException;
import java.sql.Statement;

import db.conexoes.ConexaoSQLite;

public class CriarBancoSQLite {
	
	private final ConexaoSQLite conexaoSQLite;
	
	public CriarBancoSQLite(ConexaoSQLite pConexaoSQLite) {
		this.conexaoSQLite = pConexaoSQLite;
	}
	
	public void criarTabelaManutencao() {
		String sqlCriarTabela = "CREATE TABLE IF NOT EXISTS tb_manutencao"
				+ "("
				+ "idManutencao integer PRIMARY KEY AUTOINCREMENT, "
				+ "dataManutencao text NOT NULL, "
				+ "responsavel text NOT NULL, "
				+ "idSabre integer NOT NULL "
				+ ");";
		
		//executando o sql para criar a tabela
		boolean conectou = false;
		
		try {
			conectou = this.conexaoSQLite.conectar();
			
			Statement stmt = this.conexaoSQLite.criarStatement();
			
			stmt.execute(sqlCriarTabela);
			
			System.out.println("Tabela Manutencao Criada");
			
			
		} catch(SQLException ex) {
			System.err.println("Erro na criacao da tabela " + ex.getMessage());
		} finally {
			if(conectou) {
				this.conexaoSQLite.desconectar();
			}
		}
		
	}
	
	public void criarTabelaSabre() {
		String sqlCriarTabela = "CREATE TABLE IF NOT EXISTS tb_sabre"
				+ "("
				+ "idSabre integer PRIMARY KEY AUTOINCREMENT, "
				+ "modelo text NOT NULL, "
				+ "dataFabricacao text NOT NULL, "
				+ "situacao text NOT NULL, "
				+ "jedi text NOT NULL, "
				+ "modeloBotaoDestrava text, "
				+ "galaxias text, "
				+ "modeloSensorDestrava text, "
				+ "validadeSensorDestrava text "
				+ ");";
		
		//executando o sql para criar a tabela
		boolean conectou = false;
		
		try {
			conectou = this.conexaoSQLite.conectar();
			
			Statement stmt = this.conexaoSQLite.criarStatement();
			
			stmt.execute(sqlCriarTabela);
			
			System.out.println("Tabela Sabre Criada");
			
			
		} catch(SQLException ex) {
			System.err.println("Erro na criacao da tabela " + ex.getMessage());
		} finally {
			if(conectou) {
				this.conexaoSQLite.desconectar();
			}
		}
		
	}
	
}
	