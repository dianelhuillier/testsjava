import java.util.Scanner;

public class De {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		String rejouer = "";
		
		do {
		int n = 0;
		System.out.println("Combien de faces sur le dé ?");
		n = clavier.nextInt();
		clavier.nextLine();
		
		
		double jet1 = Math.random() * (n - 1);		
		int jet = (int)jet1;
			System.out.print("Le dé affiche " + jet + " !\n"
					+ "Relancer ? ");
			rejouer = clavier.nextLine();
		
		} while (rejouer.equals("oui"));
	}
}
