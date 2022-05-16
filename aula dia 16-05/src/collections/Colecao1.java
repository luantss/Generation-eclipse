package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecao1 {

	public static void main(String[] args) {

		int op;
		Scanner leia = new Scanner(System.in);
		ArrayList<String> estoque = new ArrayList();
		
		do
		{
			System.out.println("============================================");
			System.out.println("\n1- Adicionar um produto no estoque");
			System.out.println("\n2- Remover um produtor do estoque");
			System.out.println("\n3- Atualizar um produtor do estoque");
			System.out.println("\n4- Listar os produtos do estoque");
			System.out.println("\n0- Sair do programa");
			System.out.println("============================================");
			System.out.println("\n\tDigite sua opção: ");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produtor = leia.nextLine();
				if(estoque.contains(produtor))
				{
					estoque.remove(produtor);
				}
				else
				{
					System.out.println("\nEsse produto não existe no estoque!");
				}
				System.out.println("\nEstoque atual:");
				System.out.println(estoque);
				break;
			case 3:
				leia.nextLine();
				System.out.println("Digite o produto para atualizar do estoque: ");
				String old = leia.nextLine();
				System.out.println("Digite o produtor que irá entrar no lugar de "+old+" : ");
				String update = leia.nextLine();
				if(estoque.contains(old))
				{
					estoque.remove(old);
					estoque.add(update);
				}
				else
				{
					System.out.println("Produto não existe no estoque!");
				}
				break;
			case 4:
				System.out.println("\nProdutos no estoque:\n"+estoque);
				break;
			case 0:
				System.out.println("Obrigado por usar o programa!");
				break;
				default:
					System.out.println("Opção inválida!");
			}
		}
		while(op!=0);
	}

}
