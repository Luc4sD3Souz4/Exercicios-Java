
public class Triangulos {
	public static void main(String[] args) {
		
		if (args.length != 2) {
			System.out.println("Passe uma letra (a, b, c ou d) e um n�mero para o comando!");
			System.exit(0);
		}
		
		String letterArg = String.valueOf(args[0]);
		Integer numberArg = Integer.valueOf(args[1]);
		
		switch (letterArg) {
		case "a" :
			TriA triA = new TriA(numberArg);
	        break;
		case "b" :
			TriB triB = new TriB(numberArg); 
	        break;
		case "c" :
			TriC triC = new TriC(numberArg);  
	        break;
		case "d" :
			TriD triD = new TriD(numberArg); 
	        break;
        default:
             System.out.println("Esta letra n�o � v�lida!");
     }
		
	}
}
