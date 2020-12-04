import java.util.Scanner;

public class Mesure {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);

		String quote = "";
		double a, b, c;
		
		System.out.print("Dans cet exercice sur 3 cotés 1 est inconnu \n"
				+ "Entrer les données, pour l'inconnue entrer \"0\"\n"
				+ "\"a\" = ");
		a =  clavier.nextDouble();
		System.out.print("\"b\" = ");
		b =  clavier.nextDouble();
		System.out.print("\"c\" = ");
		c =  clavier.nextDouble();
		clavier.nextLine();
		
		double a2 = a*a;
		double b2 = b*b;
		double c2 = c*c;
		double d2 = b2 + c2;
		double d = Math.sqrt(d2);
		double e2 = b2 - c2;
		double e = Math.sqrt(e2);
		double f2 = c2-b2;
		double f = Math.sqrt(f2);
		double g2 = a2 + c2;
		double g = Math.sqrt(g2);
		double h2 = a2 - c2;
		double h = Math.sqrt(h2);
		double i2 = c2 - a2;
		double i = Math.sqrt(i2);
		double j2 = a2 + b2;
		double j = Math.sqrt(j2);
		double k2 = a2 - b2;
		double k = Math.sqrt(k2);
		double l2 = b2 - a2;
		double l = Math.sqrt(l2);
		
		
		
		if (a==0) {
			System.out.print("\"a\" est l'inconnue\n"
					+ "\"a\" est-il l'hypothénuse ? Oui/Non ? ");
		quote = clavier.nextLine(); 
	
			if (quote.equals("oui")) {
			
				System.out.print("Alors a² = b² + c² \n"
						+ "D'où : a² = " + b2 + " + " + c2 + "\n"
								+ "D'où a² = " + d2 + "\n"
										+ "Donc a = " + d);
			} else {
			System.out.print("\"b\" est-il l'hypothénuse ? Oui/Non ?  ");
			quote = clavier.nextLine(); 

			if (quote.equals("oui")) {
			System.out.print("Alors b² = a² + c² \n"
					+ "Et a² = b² - c² \n"
					+ "Avec a² = " + b2 + " - " + c2 + "\n"
							+ "D'où : a² = " + e2 + "\n"
									+ "Donc a = " + e);	
			} else {
			System.out.print("\"c\" est-il l'hypothénuse ? Oui/Non ?  ");
			quote = clavier.nextLine(); 

			if (quote.equals("oui")) {	
			System.out.print("Alors c² = a² + b² \n"
					+ "Et a² = c² - b² \n"
					+ "Avec a² = " + c2 + " - " + b2 + "\n"
						+ "D'où : a² = " + f2 + "\n"
							+ "Donc a = " + f);
			} else {
			System.out.print("Il doit y en avoir un ");}
		}
	}
		}
			if (b==0) {
				System.out.print("\"b\" est l'inconnue\n"
						+ "\"b\" est-il l'hypothénuse ? Oui/Non ? ");
			quote = clavier.nextLine(); 
		
				if (quote.equals("oui")) {
				
					System.out.print("Alors b² = a² + c² \n"
							+ "D'où : b² = " + a2 + " + " + c2 + "\n"
									+ "D'où b² = " + g2 + "\n"
											+ "Donc a = " + g);
				} else {
				System.out.print("\"a\" est-il l'hypothénuse ? Oui/Non ?  ");
				quote = clavier.nextLine(); 

				if (quote.equals("oui")) {
				System.out.print("Alors a² = b² + c² \n"
						+ "Et b² = a² - c² \n"
						+ "Avec a² = " + a2 + " - " + c2 + "\n"
								+ "D'où : a² = " + h2 + "\n"
										+ "Donc a = " + h);	
				} else {
				System.out.print("\"c\" est-il l'hypothénuse ? Oui/Non ?  ");
				quote = clavier.nextLine(); 

				if (quote.equals("oui")) {	
				System.out.print("Alors c² = a² + b² \n"
						+ "Et b² = c² - a² \n"
						+ "Avec b² = " + c2 + " - " + a2 + "\n"
							+ "D'où : b² = " + i2 + "\n"
								+ "Donc a = " + i);
				} else {
				System.out.print("Il doit y en avoir un ");}

		
		
		
						
	}
	}
				if (c==0) {
					System.out.print("\"c\" est l'inconnue\n"
							+ "\"c\" est-il l'hypothénuse ? Oui/Non ? ");
				quote = clavier.nextLine(); 
			
					if (quote.equals("oui")) {
					
						System.out.print("Alors c² = a² + b² \n"
								+ "D'où : c² = " + a2 + " + " + b2 + "\n"
										+ "D'où c² = " + j2 + "\n"
												+ "Donc a = " + j);
					} else {
					System.out.print("\"a\" est-il l'hypothénuse ? Oui/Non ?  ");
					quote = clavier.nextLine(); 

					if (quote.equals("oui")) {
					System.out.print("Alors a² = b² + c² \n"
							+ "Et c² = a² - b² \n"
							+ "Avec a² = " + a2 + " - " + b2 + "\n"
									+ "D'où : a² = " + k2 + "\n"
											+ "Donc a = " + k);	
					} else {
					System.out.print("\"b\" est-il l'hypothénuse ? Oui/Non ?  ");
					quote = clavier.nextLine(); 

					if (quote.equals("oui")) {	
					System.out.print("Alors b² = a² + c² \n"
							+ "Et c² = b² - a² \n"
							+ "Avec c² = " + b2 + " - " + a2 + "\n"
								+ "D'où : b² = " + l2 + "\n"
									+ "Donc a = " + l);
					} else {
					System.out.print("Il doit y en avoir un ");}

}
					}}
					}
					}
}
