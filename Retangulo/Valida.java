
public class Valida { 
	public void validador( Float largura ) {
		if( largura <= 0.0 || largura <= 0  ) {
			System.out.println( " Erro: Um dos lados do ret�ngulo � igual ou menor que zero " );
			System.exit(0);
		}
	}
}
