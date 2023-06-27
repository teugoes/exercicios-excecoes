package pacote;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numero = lerInteiro();
		System.out.println("Número digitado: " + numero);

	}
	
	public static int lerInteiro() {
		Scanner scanner = new Scanner(System.in); //Tentei dar scanner.close() no try e no catch mas crashou o programa ao fazer a recursividade no catch
		System.out.print("Digite um número: ");
		String input = scanner.nextLine();
		
		try {
			return Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("Valor digitado não é um número inteiro");
			return lerInteiro(); //Para tentar novamente
		}
	}

}
