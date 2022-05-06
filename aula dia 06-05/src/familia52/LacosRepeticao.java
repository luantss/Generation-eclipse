package familia52;

import java.util.Scanner;

public class LacosRepeticao {

	public static void main(String[] args) {
			
		int n1,n2,n3,maior=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor: ");
		n1 = leia.nextInt();
		System.out.println("Entre com o segundo valor: ");
		n2 = leia.nextInt();
		System.out.println("Entre com o terceiro valor: ");
		n3 = leia.nextInt();
		
		if(n1>=maior)
		{
			maior = n1;	
			if(n2>maior)
			{
				maior = n2;	
			}
			if(n3>maior)
			{
				maior = n3;
			}
		}
		
		System.out.println("O maior é: "+maior);

	}

}
