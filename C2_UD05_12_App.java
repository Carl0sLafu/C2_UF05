import java.util.Scanner;

public class C2_UD05_12_App {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String password = "LoremIpsum";
		
		boolean passwordIntrouced = false;
		int tries = 0;
		
		do {
			
			System.out.print("Introuce la contrase�a (" + Math.abs(tries - 3) + " intentos restantes): ");
			String passwordToCompare = keyboard.nextLine();
			
			if (passwordToCompare.equals(password)) {
				
				passwordIntrouced = true;
				System.out.println("Enhorabuena");
				keyboard.close();
				
			} else {
				
				tries++;
				System.out.println("Contrase�a incorrecta");
				
			}
			
		} while (!passwordIntrouced && tries < 3);
		
		if (!passwordIntrouced) {
			
			System.out.println("No has podido introducir correctamente la contrase�a");
			
		}

	}

}
