
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
		System.out.println("Diferença: " + diferenca);
		System.out.println("Divisão: " + divisao);
		
		if (first > second) {
			System.out.println(first  + " é maior");
		} else if (first < second) {
			System.out.println(second + " é maior");
		} else {
			System.out.println("Os números são iguais!");
		}
		
	}
}
