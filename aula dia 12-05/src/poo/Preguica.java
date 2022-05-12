package poo;

public class Preguica extends Animal {
	
	private String habitat;
	private String tempoSono;
	private String corPelo;
	
	public Preguica(String nomeAnimal, String racaAnimal, int idade, int peso, String habitat, String tempoSono,
			String corPelo) 
	{
		super(nomeAnimal, racaAnimal, idade, peso);
		this.habitat = habitat;
		this.tempoSono = tempoSono;
		this.corPelo = corPelo;
	}
	
	public void imprimirP()
	{
		System.out.println("\n===========Preguiça===========");
		System.out.println("\nTipo de habitat: "+habitat+"\nTempo de sono: "+tempoSono+"\nCor do pelo: "+corPelo);
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getTempoSono() {
		return tempoSono;
	}

	public void setTempoSono(String tempoSono) {
		this.tempoSono = tempoSono;
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	
	
	

}
