
public class TriC {

	public TriC(int argumento) {

		for (Integer i = 0; i < argumento; i++) {
			
			for (Integer j = 1; j <= i+1; j++) {
				System.out.print(" ");
			}
			
			for (Integer k = argumento; k >= i+1; k--) {
				System.out.print("*");
			}
			
			System.out.println("");
			
		}
		
	}
}
