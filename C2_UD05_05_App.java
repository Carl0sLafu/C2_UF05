import java.util.Scanner;

public class C2_UD05_05_App {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int num = keyboard.nextInt();
		keyboard.close();
		
		if (num % 2 == 0) {
			
			System.out.println(num + " es divisible por 2");
			
		} else {
			
			System.out.println(num + " es divisible por 2");
			
		}

	}

}
