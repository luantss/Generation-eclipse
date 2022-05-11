package poo;

public class Funcionario {
	
	//Declara��o dos atributos da classe
	
	private String nome;
	private int idade;
	private String genero;
	private String cargo;
	private String endereco;
	
	
	//Declara��o do m�todo construtor
	
	public Funcionario(String nome,int idade,String genero,String cargo,String endereco)
	{
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.cargo = cargo;	
		this.endereco = endereco;
	}
	
	//Declara��o dos outros m�todos da classe
	
	public void imprimirInfo()
	{
		System.out.println("====Funcionarie====");
		System.out.println("Nome: "+nome+"\nIdade: "+idade+"\nGenero: "+genero+"\nCargo: "+cargo+"\nEndere�o: "+endereco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
