public class GrussWort {
	public static void main (String[] args) {
		switch (args.length) {
			case 0:
				System.out.println("Bist du stumm?");
				break;
			case 1:
				System.out.println("Hallo " + args[0] + "!");
				System.out.println("Wie lautet dein Nachname?");
				break;
			default:
				System.out.print("Hallo");
				for (String element : args)
					System.out.print(" " + element);
				System.out.print("!");
		}
	}
}
