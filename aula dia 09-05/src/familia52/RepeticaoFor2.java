package familia52;

import java.util.Scanner;

public class RepeticaoFor2 {

	public static void main(String[] args) {
		
		int x,num,qpar=0,qimpar=0;
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=10;x++)
		{
			System.out.println("Entre com um n�mero: ");
			num = leia.nextInt();
			if(num%2==0)
			{
				qpar++;
			}
			else
			{
				qimpar++;
			}
		}
		System.out.println("\nA quantidade de n�mero �mpar �: "+qimpar);
		System.out.println("\nA quantidade de n�mero par �: "+qpar);

	}

}
