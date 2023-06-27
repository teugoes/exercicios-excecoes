package pacote;

public class Divisao {

	public static void main(String[] args) {
		int dividendo = 5;
        int divisor = 0;
        try {
            System.out.println(dividendo / divisor); 
        }
        catch (ArithmeticException e) {
            System.out.println("Divisão por zero não permitida");
        }

	}

}
