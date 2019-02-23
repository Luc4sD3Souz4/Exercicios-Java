
public class TriD {

	public TriD(int argumento) {

		for (Integer i = 0; i < argumento; i++) {
			
			for (Integer j = argumento; j >= i+1; j--) {
				System.out.print(" ");
			}
			
			for (Integer k = 1; k <= i+1; k++) {
				System.out.print("*");
			}
			
			System.out.println("");
			
		}
		
	}
}
