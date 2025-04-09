package br.com.larissa.academia;

public class Equipamentos {

	private String nomeDoEquipamento;
	private String focoDoEquipamento;
	
	
		// TODO Auto-generated constructor stub
	public Equipamentos(String nomeDoEquipamento, String focoDoEquipamento) {
		super();
		this.nomeDoEquipamento = nomeDoEquipamento;
		this.focoDoEquipamento = focoDoEquipamento;
	}


	public void exibirInfoEquipamento() {
		System.out.println(" - Nome do equipamento: " +nomeDoEquipamento);
		System.out.println(" - Foco do equipamento: " +focoDoEquipamento);
	}
	
	

}
