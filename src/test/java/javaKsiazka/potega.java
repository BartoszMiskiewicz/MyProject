package javaKsiazka;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class potega {

	// TODO Auto-generated constructor stub

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double x = 4;
		double y = Math.sqrt(x);
		System.out.println(y);
		double z = Math.pow(x, 5);
		System.out.println(z);
		System.out.println("Pierwiastek kwadratowy  z \u03C0 wynosi" + sqrt(PI));
		int n = 123456789;
		float f = n;
		System.out.println(f);
		double b = 9.997;
		int nb = (int) b;
		int cb = (int) Math.round(b);
		System.out.println(nb);
		System.out.println(cb);
		double liczba = f;
		liczba += 4;
		liczba = f + 4;
		System.out.println("wynik f to :" + liczba);
		int m = 7;
		int o = 7;
		int g = 2 * ++m;
		int h = 2 * o++;
		System.out.println(g + m);
		System.out.println(h + o);
		String greeting = "Cześć!";
		String s = greeting.substring(2, 4) + "my";
		System.out.println(s);
		String greetings = "Cześć!";
		int p = greetings.length();
		System.out.println(p);
		int cpCount = greeting.codePointCount(0, greetings.length());
		System.out.println(cpCount);
		char first = greetings.charAt(0);
		char last = greetings.charAt(4);
		System.out.println(first);
		System.out.println(last);

	}

}
