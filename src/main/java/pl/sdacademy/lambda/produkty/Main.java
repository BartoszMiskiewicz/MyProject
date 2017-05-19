package pl.sdacademy.lambda.produkty;

import java.util.Date;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		Date data = new Date();

		Produkt produktMarchewka = new Produkt("9432459", "Marchewka", 12.23, "Warzywa", "Matka Ziemia", data);
		Produkt produktPyra = new Produkt("12345", "Ziemniaki", 11.23, "Warzywa", "Matka Ziemia", data);
		Produkt produktWhisky = new Produkt("12666", "Balantyna", 60.66, "Alkohol", "Szkocka Destylarnia", data);
		Produkt produktWodka = new Produkt("12667", "Wyborowa", 42.65, "Alkohol", "Polmos Wyborowa", data);
		Produkt produktOgorek = new Produkt("9432459", "Ogorek", 2.23, "Warzywa", "Matka Ziemia", data);
		Produkt produktWino = new Produkt("12668", "Komandos", 6.66, "Alkohol", "Domowe Napitki", data);
		Produkt produktPapierowka = new Produkt("2468", "Jabłko papierówka", 2.49, "owoc", "sadownik Zbyszek", data);
		Produkt produktMleko = new Produkt("123", "Mleko 3,2%", 2.5, "Nabial", "terravita", data);
		Produkt produktChleb = new Produkt("435674", "Razowy", 2.40, "jedzenie", "Piekpol", data);
		Produkt produktGruszka = new Produkt("13579", "Gruszeczka", 1.89, "owoc", "sadownik Janek", data);

		Produkt[] tablicaProduktow = new Produkt[] { produktPapierowka, produktWino, produktWodka, produktWhisky,
				produktOgorek, produktMarchewka, produktPyra, produktGruszka, produktMleko, produktChleb };
		Produkt znalezionyProdukt = null;
		Produkt znalezionyProdukt2 = null;
		String kodKreskowy = "12668";

		IProdukt produktOgolny = new IProdukt() {

			@Override
			public <T> T znajdzProdukt(Predicate<T> predicate, T[] listaProduktow) {
				for (int i = 0; i < listaProduktow.length; i++) {
					boolean condition = predicate.test(listaProduktow[i]);
					if (condition) {
						return listaProduktow[i];
					}
				}
				return null;
			}
		};

		znalezionyProdukt = produktOgolny.znajdzProdukt(n -> n.getKodKreskowy() == kodKreskowy, tablicaProduktow);
		znalezionyProdukt2 = produktOgolny.znajdzProdukt(n -> n.getNazwa() == "Ogorek", tablicaProduktow);

		System.out.println(znalezionyProdukt);
		System.out.println(znalezionyProdukt2);

	}

}