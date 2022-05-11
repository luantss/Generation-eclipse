package poo;

public class Cliente {
	
	//Declara��o dos atributos da classe
	
	private String nomeCliente;
	private int idadeCliente;
	private float alturaCliente;
	
	//Declara��o do m�todo construtor
	public Cliente(String nomeCliente,int idadeCliente,float alturaCliente)
	{
		this.nomeCliente = nomeCliente;
		this.idadeCliente = idadeCliente;
		this.alturaCliente = alturaCliente;
	}
	
	//Declara��o dos demais m�todos da classe
	
	public void imprimirInfo()
	{
		System.out.println("Nome do cliente: "+nomeCliente+", com idade de: "+idadeCliente+" e com altura de: "+alturaCliente);
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getIdadeCliente() {
		return idadeCliente;
	}
	public void setIdadeCliente(int idadeCliente) {
		this.idadeCliente = idadeCliente;
	}
	public float getAlturaCliente() {
		return alturaCliente;
	}
	public void setAlturaCliente(float alturaCliente) {
		this.alturaCliente = alturaCliente;
	}
	

}
