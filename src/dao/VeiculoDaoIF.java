package dao;

import java.sql.SQLException;
import java.util.Collection;

import domaim.Veiculo;

public interface VeiculoDaoIF {

	public void create(Veiculo veiculo) throws Exception; //criação 
	public Veiculo findByNome(String descricao) throws Exception; // pesquisa pela descrição
	public Collection<Veiculo> findAll() throws Exception; // busca todos dos registros
	public void remove(String descricao) throws Exception;
}