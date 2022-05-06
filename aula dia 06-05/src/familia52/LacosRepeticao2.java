package familia52;

import java.util.Scanner;

public class LacosRepeticao2 {

	public static void main(String[] args) {
		
		int age;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a idade: ");
		age = leia.nextInt();
		
		if(age>=10 && age<=14)
		{
			System.out.println("Categoria infantil!");
		}
		else if(age>=15 && age<=17)
		{
			System.out.println("Categoria juvenil!");
		}
		else if(age>=18 && age<=25)
		{
			System.out.println("Categoria adulto!");
		}
		else
		{
			System.out.println("Categoria inexistente!");
		}

	}

}
