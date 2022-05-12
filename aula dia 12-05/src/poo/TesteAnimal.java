package poo;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro dog1 = new Cachorro("Khaleesi","SRD",9,15,"João Maria","Croc",220);
		Cavalo horse1 = new Cavalo("Pé de pano","Mustangue",3,300,"Número 5","Palha","Branco","Vegetais");
		Preguica bicho1 = new Preguica("Cher","Preguiça-real",2,29,"Floresta Tropical","20 horas","Marrom");
		
		dog1.imprimirInfo();
		dog1.imprimir();
		
		horse1.imprimirInfo(); 
		horse1.imprimirC();
		
		bicho1.imprimirInfo();
		bicho1.imprimirP();

	}

}
