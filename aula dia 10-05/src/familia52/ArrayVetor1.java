package familia52;

public class ArrayVetor1 {

	public static void main(String[] args) {
		
		int[] A = {1,0,5,-2,-5,7};
		int soma;
		
		soma = A[0] + A[1] + A[5]; 
		System.out.println("A soma é: "+soma);
		
		A[4] = 100;
	    System.out.println("\n1° valor: "+A[0]+"\n2° valor: "+A[1]+"\n3° valor: "+A[2]+"\n4° valor: "+A[3]+"\n5° valor: "+A[4]+"\n6° valor:  "+A[5]); 
		
	}

}
