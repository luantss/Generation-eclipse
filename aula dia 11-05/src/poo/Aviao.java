package poo;

public class Aviao {
	
	//Declaração dos atributos da classe
	
	private String modeloAviao;
	private String corAviao;
	private int capacidadePassageiro;	
	
	//Declaração do método construtor
	
	public Aviao(String modeloAviao,String corAviao,int capacidadePassageiros)
	{
		this.modeloAviao = modeloAviao;
		this.corAviao = corAviao;
		this.capacidadePassageiro = capacidadePassageiros;
	}
	
	//Declaração dos demais métodos da classe
	
	public void imprimirInfo()
	{
		System.out.println("Modelo do avião: "+modeloAviao+"\nCor avião: "+corAviao+"\nCapacidade de passageiros: "+capacidadePassageiro);
	}

	public String getModeloAviao() {
		return modeloAviao;
	}

	public void setModeloAviao(String modeloAviao) {
		this.modeloAviao = modeloAviao;
	}

	public String getCorAviao() {
		return corAviao;
	}

	public void setCorAviao(String corAviao) {
		this.corAviao = corAviao;
	}

	public int getCapacidadePassageiro() {
		return capacidadePassageiro;
	}

	public void setCapacidadePassageiro(int capacidadePassageiro) {
		this.capacidadePassageiro = capacidadePassageiro;
	}
	

}
