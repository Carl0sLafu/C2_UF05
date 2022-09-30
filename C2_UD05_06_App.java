import java.util.Scanner;

public class C2_UD05_06_App {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		final double IVA = 0.21;
		
		System.out.print("Precio del producto: ");
		String precioString = keyboard.nextLine();
		keyboard.close();
		
		double precio = Double.parseDouble(precioString);
		
		System.out.println("El precio del producto con IVA es de " + (precio + (precio*IVA)));

	}

}
