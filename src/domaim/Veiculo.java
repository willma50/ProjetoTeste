package domaim;

public class Veiculo {
	
	private int id;
	private String descricao;
	private int classe;  // 0 - Veículo individual  e  1 - frota veicular
	private String placa;
	private int anoFabricacao;
	
	public Veiculo(){
		
	}
	
	public Veiculo(String descricao, int classe, String placa, int anoFabricacao){
		this.setDescricao(descricao);
		this.setClasse(classe);
		this.setPlaca(placa);
		this.setAnoFabricacao(anoFabricacao);		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getClasse() {
		return classe;
	}
	public void setClasse(int classe) {
		this.classe = classe;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	
}
