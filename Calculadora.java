
public class Calculadora {
	public static void main(String[] args) {
		
		if (args.length != 2) {
			System.out.println("Passe um (e apenas um) argumento para o comando!");
			System.exit(0);
		}
		
		Integer first = Integer.valueOf(args[0]);
		Integer second = Integer.valueOf(args[1]);
		
		Integer soma      = first + second;
		Integer produto   = first * second;
		Integer diferenca = first - second;
		Integer divisao   = first / second;
		
		System.out.println("Soma: " + soma);
		System.out.println("Produto: " + produto);
		System.out.println("Diferen�a: " + diferenca);
		System.out.println("Divis�o: " + divisao);
		
		if (first > second) {
			System.out.println(first  + " � maior");
		} else if (first < second) {
			System.out.println(second + " � maior");
		} else {
			System.out.println("Os n�meros s�o iguais!");
		}
		
	}
}
