package poo;

public class Cavalo extends Animal {
	
	//Declaração dos atributos da classe
	private String estabulo;
	private String tipoCama;
	private String cor;
	private String alimento;
	
	public Cavalo(String nomeAnimal, String racaAnimal, int idade, int peso, String estabulo, String tipoCama,
			String cor, String alimento) 
	{
		super(nomeAnimal, racaAnimal, idade, peso);
		this.estabulo = estabulo;
		this.tipoCama = tipoCama; 
		this.cor = cor;
		this.alimento = alimento;
	}
	
	public void imprimirC()
	{
		System.out.println("\n===========Cavalo===========");
		System.out.println("\nEstábulo: "+estabulo+"\nCama: "+tipoCama+"\nCor da pelagem: "+cor+"\nAlimentação: "+alimento);
	}

	public String getEstabulo() {
		return estabulo;
	}

	public void setEstabulo(String estabulo) {
		this.estabulo = estabulo;
	}

	public String getTipoCama() {
		return tipoCama;
	}

	public void setTipoCama(String tipoCama) {
		this.tipoCama = tipoCama;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public void som(String somA) {
		System.out.println("*som de cavalo");
	}
	

}
