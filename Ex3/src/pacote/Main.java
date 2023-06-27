package pacote;

public class Main {

	public static void main(String[] args) {
		int[] array = {};
		// Testei com int[] array = {5, 10, 15} e funcionou
		
		try {
			double media = calcularMedia(array);
			System.out.println("Média: " + media);		
		}catch(IllegalArgumentException e){
			System.out.println("Erro: A array está vazia. ");			
		}

	}
	
	public static double calcularMedia(int[] array) {
		if(array.length == 0) {
			throw new IllegalArgumentException();
		}
		
		int soma = 0;
		for(int numero : array) {
			soma += numero;
		}
		return (double) soma / array.length;
	}

}
