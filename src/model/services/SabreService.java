package model.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DbException;
import db.conexoes.ConexaoSQLite;
import model.entities.Sabre;

public class SabreService {

	ConexaoSQLite conexaoSQLite = new ConexaoSQLite();

	public List<Sabre> findAll() {

		List<Sabre> listaSabres = selectAllSabres(conexaoSQLite);

		return listaSabres;
	}
	
	private static List<Sabre> selectAllSabres(ConexaoSQLite conexaoSQLite) {
		ResultSet resultSet = null;
		Statement statement = null;
		
		conexaoSQLite.conectar();
		
		String query = "SELECT * FROM tb_sabre;";
		
		statement = conexaoSQLite.criarStatement();
		
		try {
			resultSet = statement.executeQuery(query);
			
			List<Sabre> sabres = new ArrayList<>();
			
			while(resultSet.next()) {
				sabres.add(new Sabre(
						resultSet.getInt("idSabre"),
						resultSet.getString("modelo"),
						resultSet.getString("dataFabricacao"),
						resultSet.getString("situacao"),
						resultSet.getString("jedi"),
						resultSet.getString("modeloBotaoDestrava"),
						resultSet.getString("galaxias"),
						resultSet.getString("modeloSensorDestrava"),
						resultSet.getString("validadeSensorDestrava")
						));
			}
			
			return sabres;
			
		} catch (SQLException ex) {
			throw new DbException(ex.getMessage());
		} finally {
			if(resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException ex) {
					throw new DbException(ex.getMessage());
				}
			}
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException ex) {
					throw new DbException(ex.getMessage());
				}
			}
			conexaoSQLite.desconectar();			
		}
	}
	
}
