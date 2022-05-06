package familia52;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		float ano,mes,dia,total;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com os anos: ");
		ano = leia.nextFloat();
		System.out.println("Entre com os meses: ");
		mes = leia.nextFloat();
		System.out.println("Entre com os dias");
		dia = leia.nextFloat();
		
		total = (ano*365) + (mes*30) + (dia);
		
		System.out.println("O total de dias é: "+total);

	}

}
