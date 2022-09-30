import java.util.Scanner;

public class C2_UD05_04_App {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Radio del circulo: ");
		String radioString = keyboard.nextLine();
		keyboard.close();
		
		double radio = Double.parseDouble(radioString);
		
		System.out.println("El área del circulo es " + (Math.PI * Math.pow(radio, 2)));

	}

}
