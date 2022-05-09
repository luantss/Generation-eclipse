package familia52;

import java.util.Scanner;

public class RepeticaoWhile2 {

	public static void main(String[] args) {
		
		int p=1,idade,sexo,humor,contPC=0,contMN=0,contHA=0,contOC=0,contN40=0,contC18=0;
		Scanner leia = new Scanner(System.in);
			
		while(p!=5)
		{
			System.out.println("\nQual a idade da pessoa?");
			idade=leia.nextInt();
			System.out.println("\nQual o sexo?");
			System.out.println(" 1-Feminino\n 2-Masculino\n 3-Outros");
			sexo=leia.nextInt();
			System.out.println("\nQual o humor?");
			System.out.println(" 1-Calma\n 2-Nervosa\n 3-Agressiva");
			humor=leia.nextInt();			
			if(humor==1)
			{
				contPC++;
			}
			if(sexo==1 && humor==2)
			{
				contMN++;
			}
			if(sexo==2 && humor==3)
			{
				contHA++;
			}
			if(sexo==3 && humor==1)
			{
				contOC++;
			}
			if(idade>40 && humor==2)
			{
				contN40++;
			}
			if(idade<18 && humor==1)
			{
				contC18++;
			}
			p++;
		}
		System.out.println("O número de pessoas calmas é: "+contPC);
		System.out.println("O número de mulheres nervosas é: "+contMN);
		System.out.println("O número de homens agressivos é: "+contHA);
		System.out.println("O número de outros calmos é: "+contOC);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é: "+contN40);
		System.out.println("O número de pessoas calmas com menos de 18 anos é: "+contC18);
	}

}
