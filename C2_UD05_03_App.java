import java.util.Scanner;

public class C2_UD05_03_App {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Escribe tu nombre: ");
		String nombre = keyboard.nextLine();
		keyboard.close();
		
		System.out.println("Bienvenido " + nombre);

	}

}
