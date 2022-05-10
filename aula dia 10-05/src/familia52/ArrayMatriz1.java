package familia52;

import java.util.Scanner;

public class ArrayMatriz1 {

	public static void main(String[] args) {
		
		float[][] matriz = new float[3][3];
		int contmaior10=0,contmenor10=0,l,i;
		Scanner leia = new Scanner(System.in);
		
		for(l=0;l<3;l++)
		{
			for(i=0;i<3;i++)
			{
				System.out.println("Entre com o valor da matriz:");
				matriz[l][i] = leia.nextFloat();
			}
		}
		for(l=0;l<3;l++)
		{
			for(i=0;i<3;i++)
			{
				if(matriz[l][i]>10)
				{
					contmaior10++;
					System.out.println("\n"+matriz[l][i]+"-Maior do que 10");
				}
				else if(matriz[l][i]<10)
				{
					contmenor10++;
					System.out.println("\n"+matriz[l][i]+"-Menor do que 10");
				}
				else
				{
					System.out.println("O número é o próprio 10!!");
				}
			}
		}
		System.out.println("\n\tTem "+contmaior10+" números maiores do que 10");
		System.out.println("\tTem "+contmenor10+" números menores do que 10");
	
	}

}
