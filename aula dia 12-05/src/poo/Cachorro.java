package poo;

import java.text.NumberFormat;

public class Cachorro extends Animal {
	
	//Declara��o dos atributos da classe
	
	private String residencia;
	private String tipoRacao;
	private double gastoMensal;
	
	//Declara��o do m�todo construtor
	public Cachorro(String nomeAnimal,String racaAnimal,int idade,int peso,String residencia,String tipoRacao,double gastoMensal)
	{
		super(nomeAnimal,racaAnimal,idade,peso);
		this.residencia = residencia;
		this.tipoRacao = tipoRacao;
		this.gastoMensal = gastoMensal;
	}
	
	//Declara��o dos outros m�todos da classe
	public String getResidencia() {
		return residencia;
	}

	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}

	public String getTipoRacao() {
		return tipoRacao;
	}

	public void setTipoRacao(String tipoRacao) {
		this.tipoRacao = tipoRacao;
	}

	public double getGastoMensal() {
		return gastoMensal;
	}

	public void setGastoMensal(double gastoMensal) {
		this.gastoMensal = gastoMensal;
	}
	
	public String formatoRacao()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoRacao = nf.format(gastoMensal);
		return formatoRacao;
	}
	public void imprimir()
	{
		System.out.println("===========Cachorro==========="); 
		System.out.println("\nResidencia: "+residencia+"\nTipo de ra��o: "+tipoRacao+"\nGasto mensal: "+this.formatoRacao());
	}

	@Override
	public void som(String somA) {
		System.out.println("Auau...auuuuuaauauua");		
	}
	
	
	
	
	
	
	
}
