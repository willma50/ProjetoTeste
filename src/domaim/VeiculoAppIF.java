package domaim;



import java.util.Collection;

import dao.VeiculoDaoIF;

public interface VeiculoAppIF {

	public void addVeiculo(String descricao, int classe, String placa, int anoFabricacao) throws Exception;
	public Collection<Veiculo> findAll() throws Exception;
	public void setPersistencia(VeiculoDaoIF veiculoDAO);
	
}
