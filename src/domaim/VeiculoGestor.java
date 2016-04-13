package domaim;

import java.util.Collection;

import dao.VeiculoDaoIF;
import dao.mem.VeiculoDaoMem;
import dao.sql.VeiculoDaoSql;

public class VeiculoGestor implements VeiculoAppIF{
	
	private VeiculoDaoIF VeiculoDao;

	@Override
	public void addVeiculo(String descricao, int classe, String placa,
			int anoFabricacao) throws Exception {
		
		Veiculo veiculo = new Veiculo(descricao, classe, placa, anoFabricacao);
		System.out.println("vendo "+veiculo.getDescricao());
		System.out.println("\n"+veiculo);
		//this.VeiculoDao = new VeiculoDaoMem();
		this.VeiculoDao = new VeiculoDaoSql();
		this.VeiculoDao.create(veiculo);
		
	}

	@Override
	public Collection<Veiculo> findAll() throws Exception {
		this.VeiculoDao = new VeiculoDaoSql();
		return this.VeiculoDao.findAll();
	}

	@Override
	public void setPersistencia(VeiculoDaoIF veiculoDAO) {
		this.VeiculoDao = veiculoDAO;
		
	}

}
