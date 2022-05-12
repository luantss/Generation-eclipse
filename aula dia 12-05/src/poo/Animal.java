package poo;

public class Animal {
	
	//Declara��o dos atributos da classe
	
	private String nomeAnimal;
	private String racaAnimal;
	private int idade;
	private int peso;
	
	//Declara��o do m�todo construtor
	public Animal(String nomeAnimal,String racaAnimal,int idade,int peso)
	{
		this.nomeAnimal = nomeAnimal;
		this.racaAnimal = racaAnimal; 
		this.idade = idade;
		this.peso = peso;
	}
	
	public void imprimirInfo()
	{
		System.out.println("===========Animal===========");
		System.out.println("\nNome: "+nomeAnimal+"\nRa�a: "+racaAnimal+"\nIdade: "+idade+"\nPeso: "+peso);
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public String getRacaAnimal() {
		return racaAnimal;
	}

	public void setRacaAnimal(String racaAnimal) {
		this.racaAnimal = racaAnimal;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
}
