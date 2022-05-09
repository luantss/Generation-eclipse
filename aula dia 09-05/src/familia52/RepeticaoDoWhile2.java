package familia52;

import java.util.Scanner;

public class RepeticaoDoWhile2 {

	public static void main(String[] args) {
		
		int num,soma=0,totalnum=0;
		float media;
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.println("Entre com um número: ");
			num = leia.nextInt();
			if(num%3==0)
			{
				soma += num;
				totalnum++;
			}
		}
		while(num!=0);
		media = soma / totalnum;
		System.out.printf("A média do valores múltiplos de 3 é: %.2f",media);

	}

}
