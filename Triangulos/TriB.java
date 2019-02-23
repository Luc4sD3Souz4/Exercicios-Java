
public class TriB {

	public TriB(int argumento) {

		for (Integer i = 0; i < argumento; i++) {
			for (Integer j = argumento; j >= i+1; j--) {
				System.out.print("*");
			}
			
			System.out.println("");
			
		}
		
	}
}

