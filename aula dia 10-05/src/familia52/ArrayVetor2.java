package familia52;

import java.util.Scanner;

public class ArrayVetor2 {

	public static void main(String[] args) {
		
		int numero[] = new int[6];
		int x,somapar=0,qntimpar=0;
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++)
		{
			System.out.println("Entre com um valor inteiro:");
			numero[x] = leia.nextInt();
			if(numero[x]%2==0)
			{
				somapar += numero[x];
			}
			else
			{
				qntimpar++;
			}
		}
		System.out.println("\nN�meros pares digitados:");
		for(x=0;x<6;x++)
		{
			if(numero[x]%2==0)
			{
				System.out.println(numero[x]);
			}
		}
		System.out.println("\nSoma dos n�meros pares: "+somapar);
		System.out.println("\nN�meros �mpares digitados:");
		for(x=0;x<6;x++)
		{
			if(numero[x]%2!=0)
			{
				System.out.println(numero[x]);
			}
		}
		System.out.println("\nA quantidade de n�meros �mpares foi: "+qntimpar);

	}

}
