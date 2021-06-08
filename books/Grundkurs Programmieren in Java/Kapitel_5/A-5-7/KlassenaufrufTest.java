import java.util.Scanner;

public class KlassenaufrufTest {
	public static void main (String[] args) {
		var scanner = new Scanner(System.in);
		boolean fertig = false;

		System.out.println();
		System.out.println("Programmliste:");
		System.out.println("1 - GrussWort");
		System.out.println("2 - KommandozeilenTest");
		System.out.println("3 - Beenden");

		while (!fertig) {
			System.out.println();
			System.out.print("Bitte ein Programm auswaehlen (1-3): ");
			int auswahl = scanner.nextInt();
			switch (auswahl) {
				case 1:
					GrussWort.main(args);
					break;
				case 2: 
					KommandozeilenTest.main(args);
					break;
				case 3:
					fertig = true;
					break;
				default:
					System.out.println("Fehlerhafte Eingabe!");
				
			}		
		}
	}
}