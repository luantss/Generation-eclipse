package familia52;

import java.util.Scanner;

public class LacosRepeticao1 {

	public static void main(String[] args) {
		
		float a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor: ");
		a = leia.nextFloat();
		System.out.println("Entre com o segundo valor: ");
		b = leia.nextFloat();
		System.out.println("Entre com o terceiro valor: ");
		c = leia.nextFloat();
		
		if(a<b)
		{
			if(b<c)
			{
				System.out.println("\n"+a+"\n"+b+"\n"+c);
			}
			else if(a<c)
			{
				System.out.println("\n"+a+"\n"+c+"\n"+b);
			}
			else
			{
				System.out.println("\n"+c+"\n"+a+"\n"+b);
			}			
		}	
		else if(b<c)
		{
			if(a<c)
			{
				System.out.println("\n"+b+"\n"+a+"\n"+c);
			}
			else
			{
				System.out.println("\n"+b+"\n"+c+"\n"+a);
			}
		}
		else
		{
			System.out.println("\n"+c+"\n"+b+"\n"+a);
		}

	}

}
