package db.conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import db.DbException;

public class ConexaoSQLite {
	
private Connection conexao;
	
	/**
	 * Conecta a um banco de dados ou cria um banco se nao existir
	 **/
	public Boolean conectar() {
		
		try {
			String url = "jdbc:sqlite:banco_de_dados/banco_sabres.db";
			
			this.conexao = DriverManager.getConnection(url);
			
		} catch(SQLException ex) {
			throw new DbException(ex.getMessage());
		}
		
		System.out.println("Conectou!!!");
		return true;
	}
	
	/**
	 * Desconecta do banco de dados
	 **/
	public Boolean desconectar() {
		
		try {
			if (this.conexao.isClosed() == false) {
				this.conexao.isClosed();
			}
			
		} catch(SQLException ex) {
			throw new DbException(ex.getMessage());
		}
		
		System.out.println("Desconectou!!!");
		return true;
	}
	
	/**
	 * Cria um statement para os sqls serem executados
	 **/
	public Statement criarStatement() {
		try {
			return this.conexao.createStatement();
		} catch (SQLException ex) {
			throw new DbException(ex.getMessage());
		}
	}

	public PreparedStatement criarPreparedStatement(String sql) {
		try {
			return this.conexao.prepareStatement(sql);
		} catch (SQLException ex) {
			throw new DbException(ex.getMessage());
		}
	}

	public Connection getConexao() {
		return this.conexao;
	}


}
