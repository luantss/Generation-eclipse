package poo;

public class Aviao {
	
	//Declara��o dos atributos da classe
	
	private String modeloAviao;
	private String corAviao;
	private int capacidadePassageiro;	
	
	//Declara��o do m�todo construtor
	
	public Aviao(String modeloAviao,String corAviao,int capacidadePassageiros)
	{
		this.modeloAviao = modeloAviao;
		this.corAviao = corAviao;
		this.capacidadePassageiro = capacidadePassageiros;
	}
	
	//Declara��o dos demais m�todos da classe
	
	public void imprimirInfo()
	{
		System.out.println("Modelo do avi�o: "+modeloAviao+"\nCor avi�o: "+corAviao+"\nCapacidade de passageiros: "+capacidadePassageiro);
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
