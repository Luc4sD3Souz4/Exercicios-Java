import javax.swing.JOptionPane;

public class PopulacaoMundial{
	public static void main(String[] args){
		
		//int num1 = Integer.parseInt( JOptionPane.showInputDialog("Informe a quantidade de anos para descobrir o crescimento anual!"));
		
		if (args.length != 1) {
			System.out.println("Passe um (e apenas um) argumento para o comando!");
			System.exit(0);
		}
		
		Integer numberArg = Integer.valueOf(args[0]);
		Long populacao = 7000000000L;
		
		Long resposta = Math.round(populacao*Math.pow(1.012, numberArg - 1));
		
	System.out.println(resposta);
	
	}
}