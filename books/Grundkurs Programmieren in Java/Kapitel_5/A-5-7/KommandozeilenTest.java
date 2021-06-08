public class KommandozeilenTest {
	public static void main (String[] args) {
		switch (args.length) {
			case 0:
				System.out.println("Der Aufruf erfolgte ohne Kommandozeilenargumente");
				break;
			default:
				for (int i = 0; i < args.length; i++) 
					System.out.println("Das " + (i+1) + ". Kommandozeilenargument lautet: " + args[i]);
		}
	}
}
				