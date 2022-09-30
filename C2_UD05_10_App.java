import java.util.Scanner;

public class C2_UD05_10_App {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Ventas: ");
		String ventasString = keyboard.nextLine();
		int ventas = Integer.parseInt(ventasString);
		double valorTotalVentas = 0;
		
		for (int i = 0; i < ventas; i++) {
			
			System.out.print("Valor de la venta " + (i+1) + ": ");
			String value = keyboard.nextLine();
			valorTotalVentas += Double.parseDouble(value);
			
		}
		
		keyboard.close();
		
		System.out.println("Valor total " + valorTotalVentas);

	}

}
