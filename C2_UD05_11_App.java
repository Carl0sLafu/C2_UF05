import java.util.Scanner;

public class C2_UD05_11_App {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduce un dia de la semana: ");
		String dia = keyboard.nextLine();
		keyboard.close();
		
		switch (dia.toLowerCase()) {
		
			case "lunes":
				System.out.println("D�a laboral");
				break;
			case "martes":
				System.out.println("D�a laboral");
				break;
			case "m�ercoles":
				System.out.println("D�a laboral");
				break;
			case "jueves":
				System.out.println("D�a laboral");
				break;
			case "viernes":
				System.out.println("D�a laboral");
				break;
			case "s�bado":
				System.out.println("D�a festivo");
				break;
			case "domingo":
				System.out.println("D�a festivo");
				break;
			default:
				System.out.println("No se ha encontrado tu d�a introducido.");
				System.out.println("Has escrito '" + dia + "'");
				System.out.println("Recuerda que M�ercoles y S�bado llevan t�lde");
		
		}

	}

}
