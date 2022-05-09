package familia52;

import java.util.Scanner;

public class RepeticaoDoWhile1 {

	public static void main(String[] args) {
		
		float num,somanum=0;
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.println("Entre com um número: ");
			num = leia.nextFloat();
			somanum += num;
		}
		while(num!=0);
		System.out.println("A soma dos números foi: "+somanum);

	}

}
