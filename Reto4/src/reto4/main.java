package reto4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		// Introduce tres nombres
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		do {
			try {
				for (int i = 0; i < 3; i++) {
					nombre = sc.nextLine();
				}

			} catch (Exception e) {
				System.out.println("Introduce un nombre válido");
			}

		} while (true);
	}

}
