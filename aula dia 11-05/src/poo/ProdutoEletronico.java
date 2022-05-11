package poo;

public class ProdutoEletronico {
	
	//Declaração dos atributos da classe
	
	private String tipoProduto;
	private String marcaProduto;
	private int voltagemProduto;
	private int precoProduto;
	
	//Declaração do método construtor
	
	public ProdutoEletronico(String tipoProduto,String marcaProduto,int voltagemProduto,int precoProduto)
	{
		this.tipoProduto = tipoProduto;
		this.marcaProduto = marcaProduto;
		this.voltagemProduto = voltagemProduto;
		this.precoProduto = precoProduto;
	}
	
	//Declaração dos demais métodos da classe
	
	public void imprimirInfo()
	{
		System.out.println("O tipo do produto é: "+tipoProduto+", da marca: "+marcaProduto+", e voltagem de: "+voltagemProduto+"\nPreço: R$"+precoProduto);
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public String getMarcaProduto() {
		return marcaProduto;
	}

	public void setMarcaProduto(String marcaProduto) {
		this.marcaProduto = marcaProduto;
	}

	public int getVoltagemProduto() {
		return voltagemProduto;
	}

	public void setVoltagemProduto(int voltagemProduto) {
		this.voltagemProduto = voltagemProduto;
	}

	public float getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(int precoProduto) {
		this.precoProduto = precoProduto;
	}
	

}
