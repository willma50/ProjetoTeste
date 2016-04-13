package dao.sql;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import dao.Dao;
import dao.VeiculoDaoIF;
import domaim.Veiculo;

public class VeiculoDaoSql implements VeiculoDaoIF{
	
	private static final String INSERT_VEICULO = "INSERT INTO VEICULO (DESCRICAO, CLASSE, PLACA, ANOFABRICACAO ) VALUES (?, ?, ?, ?)";
	private static final String FINDBYNOME = "select DESCRICAO, CLASSE, PLACA, ANOFABRICACAO from veiculo where descricao = ?";
	private static final String FINDALL = "select DESCRICAO, CLASSE, PLACA, ANOFABRICACAO from veiculo";
	private static final String DELETE = "delete from veiculo where descricao = ?";
	
	@Override
	public void create(Veiculo veiculo) throws ClassNotFoundException, SQLException {
		
		Connection conn = Dao.getConection();
		PreparedStatement pstam = conn.prepareStatement(INSERT_VEICULO);
		//pstam.setInt(1, 6);
		pstam.setString(1, veiculo.getDescricao());
		pstam.setInt(2, veiculo.getClasse());
		pstam.setString(3, veiculo.getPlaca());
		pstam.setInt(4, veiculo.getAnoFabricacao());
		pstam.execute();
		pstam.close();
	}

	@Override
	public Veiculo findByNome(String descricao) throws ClassNotFoundException, SQLException {
		Connection conn = Dao.getConection();
		PreparedStatement pstam = conn.prepareStatement(FINDBYNOME);
		pstam.setString(1, descricao);
		ResultSet rs = pstam.executeQuery();
		Veiculo veiculo = null;
		if(rs.next()){
			veiculo = new Veiculo(rs.getString("DESCRICAO"), rs.getInt("CLASSE"), rs.getString("PLACA"), rs.getInt("ANOFABRICACAO"));			
		}
		rs.close();
		pstam.close();
		
		return veiculo;
	}

	@Override
	public Collection<Veiculo> findAll() throws ClassNotFoundException, SQLException {
		Connection conn = Dao.getConection();
		PreparedStatement pstam = conn.prepareStatement(FINDALL);
		ResultSet rs = pstam.executeQuery();
		List<Veiculo> listVeiculo = new ArrayList<>();	
		
		while(rs.next()){
			Veiculo veiculo = new Veiculo(rs.getString("DESCRICAO"), rs.getInt("CLASSE"), rs.getString("PLACA"), rs.getInt("ANOFABRICACAO"));
			System.out.println(veiculo.getPlaca());
			listVeiculo.add(veiculo);
		}
		rs.close();
		pstam.close();
		return listVeiculo;
	}

	@Override
	public void remove(String descricao) throws Exception {
		Connection conn = Dao.getConection();
		PreparedStatement pstam = conn.prepareStatement(DELETE);
		pstam.setString(1, descricao);
		pstam.executeUpdate();
		pstam.close();
		
	}

	/*public static void main(String[] args) {
		VeiculoDaoSql daoSql = new VeiculoDaoSql();
		Veiculo veiculo = new Veiculo("FIAT", 1, "MGE-3654", 2006);
		try {
			daoSql.create(veiculo);
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC não encontrado");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("uri, user ou senha incorretos");
			e.printStackTrace();
		};
		
	}*/
	
}
