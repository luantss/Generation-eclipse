package familia52;

import java.util.Scanner;

public class LacosRepeticao3 {

	public static void main(String[] args) {
		
		double num,rnum,qnum;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um valor: ");
		num = leia.nextFloat();
		
		if(num == 0)
		{
			System.out.println("Valor neutro");
		}
		else if(num % 2 == 0)
		{
			rnum = Math.sqrt(num);
			System.out.printf("O n�mero � par e a raiz quadrada dele �: %.2f",rnum);
		}
		else
		{
			qnum = Math.pow(num, 2);	
			System.out.println("O n�mero � �mpar e o quadrado dele �: "+qnum);
		}
		

	}

}
