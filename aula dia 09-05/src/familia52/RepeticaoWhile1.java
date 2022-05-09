package familia52;

import java.util.Scanner;

public class RepeticaoWhile1 {

	public static void main(String[] args) {
		
		int age,pessoa21=0,pessoa50=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a idade: ");
		age = leia.nextInt();
		while(age!=-99)
		{
			if(age<21)
			{
				pessoa21++;
			}
			else if(age>50)
			{
				pessoa50++;
			}
			System.out.println("Entre com a idade: ");
			age = leia.nextInt();
		}
		System.out.println("Total de pessoas com menos de 21 anos: "+pessoa21);
		System.out.println("Total de pessoas com mais de 50 anos: "+pessoa50);

	}

}
