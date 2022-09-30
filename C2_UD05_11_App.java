import java.util.Scanner;

public class C2_UD05_11_App {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduce un dia de la semana: ");
		String dia = keyboard.nextLine();
		keyboard.close();
		
		switch (dia.toLowerCase()) {
		
			case "lunes":
				System.out.println("Día laboral");
				break;
			case "martes":
				System.out.println("Día laboral");
				break;
			case "míercoles":
				System.out.println("Día laboral");
				break;
			case "jueves":
				System.out.println("Día laboral");
				break;
			case "viernes":
				System.out.println("Día laboral");
				break;
			case "sábado":
				System.out.println("Día festivo");
				break;
			case "domingo":
				System.out.println("Día festivo");
				break;
			default:
				System.out.println("No se ha encontrado tu día introducido.");
				System.out.println("Has escrito '" + dia + "'");
				System.out.println("Recuerda que Míercoles y Sábado llevan tílde");
		
		}

	}

}
