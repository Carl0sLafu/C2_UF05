import java.util.Scanner;

public class CalculadoraInversa {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduce el primer numero: ");
		int operador1 = keyboard.nextInt();
		
		System.out.print("Introduce el segundo numero: ");
		int operador2 = keyboard.nextInt();
		
		//Al introducir numeros entreros el "Enter" queda apartado como un caracter más,
		//por eso se pone esta linea, para que se lo coma y desaparezca
		keyboard.nextLine();
		
		System.out.print("Introduce el signo aritmético: ");
		String signo = keyboard.nextLine();
		
		keyboard.close();
		
		double resultado = 0;
		
		switch (signo.trim()) {
		
			case "+":
				resultado = operador1 + operador2;
				break;
			case "-":
				resultado = operador1 - operador2;
				break;
			case "*":
				resultado = operador1 * operador2;
				break;
			case "/":
				resultado = operador1 / operador2;
				break;
			case "^":
				resultado = Math.pow(operador1, operador2) ;
				break;
			case "%":
				resultado = operador1 % operador2;
				break;
			default:
				System.out.println("No se pudo encontrar un operador esperado");
				System.exit(0);
		
		}
		
		System.out.println(operador1 + " " + signo + " " + operador2 + " = " + resultado);

	}

}
