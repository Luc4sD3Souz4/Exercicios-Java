
public class TriA {

	public TriA(int argumento) {

		for (Integer i = 0; i < argumento; i++) {
			for (Integer j = 1; j <= i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
			
		}
		
	}
}
