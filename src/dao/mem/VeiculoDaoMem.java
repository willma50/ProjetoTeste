package dao.mem;

import java.sql.SQLException;
import java.util.Collection;

import dao.VeiculoDaoIF;
import dao.sql.VeiculoDaoSql;
import domaim.Veiculo;

public class VeiculoDaoMem implements VeiculoDaoIF{

	//private VeiculoDaoSql DaoSql; 

	@Override
	public void create(Veiculo veiculo) throws  SQLException, ClassNotFoundException {
	//	if(veiculo.getClass().equals(Veiculo.class)){
		//this.DaoSql = new VeiculoDaoSql();
		//this.DaoSql.create(veiculo);	
		this.create(veiculo);	
		//}
	}

	@Override
	public Veiculo findByNome(String descricao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Veiculo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(String descricao) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
