package java;

import java.util.Scanner;

public class scaner {

	public scaner() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Jak się nazywasz");
		String name = in.nextLine();
		System.out.println("Ile masz lat");
		int age = in.nextInt();
		System.out.println("Witaj użytkowniku " + name + ", W przyszłym roku będiesz mieć " + (age + 1) + "lat");
		double x = 10000.0 / 3.0;
		System.out.println();
		System.out.printf("Witaj, %s, W przyszłym roku bedziesz mieć lat %d", name, age);
		System.out.println(x);
		System.out.println();
		System.out.printf("+%, .2f", 10000.0 / 3.0);
		System.out.println();

		System.out.println("Podaj liczbe dziesiętną");
		int number = in.nextInt();
		System.out.println();
		System.out.printf("Twoja licza w postaci szesnastkowej to:" + "%1$x", number);
		System.out.println();
		// System.out.printf("%tz ", new Date());

	}

	// static char[] readPassword(String prompt. Object username){
	// Console cons = System.console();
	// String username = cons.readLine("Nazwa użytkownika:");
	// char[] passwd = cons.readPassword("Hasło:");
	// }

}
