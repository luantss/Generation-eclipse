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
			System.out.printf("O número é par e a raiz quadrada dele é: %.2f",rnum);
		}
		else
		{
			qnum = Math.pow(num, 2);	
			System.out.println("O número é ímpar e o quadrado dele é: "+qnum);
		}
		

	}

}
