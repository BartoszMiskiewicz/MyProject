package pl.sdacademy.sortMain;

public class mainSort {

	public mainSort() {

	}

	private static final int N = 35;
	private static int table[] = { 30, 29, 28, 1, 26, 25, 40, 2, 3, 4, 5, 6, 7, 24, 23, 22, 21, 20, 19, 18, 8, 9, 32,
			11, 17, 16, 15, 13, 14, 11, 2, 55, 77, 8, 9 };
	private static int array[] = new int[N]; // Tablica pomocnicza

	/*
	 * Scalanie dwoch posortowanych ciagow tab[pocz...sr] i tab[sr+1...kon] i
	 * wynik zapisuje w tab[pocz...kon]
	 */
	private static void merge(int first, int mergeObject, int last) {
		int i, j, q;
		for (i = first; i <= last; i++)
			array[i] = table[i]; // Skopiowanie danych do tablicy pomocniczej
		i = first;
		j = mergeObject + 1;
		q = first; // Ustawienie wskaźników tablic
		while (i <= mergeObject && j <= last) { // Przenoszenie danych z
												// sortowaniem ze zbiorów
												// pomocniczych do tablicy
												// głównej
			if (array[i] < array[j])
				table[q++] = array[i++];
			else
				table[q++] = array[j++];
		}
		while (i <= mergeObject)
			table[q++] = array[i++]; // Przeniesienie nie skopiowanych danych ze
										// zbioru pierwszego w przypadku,
										// gdy drugi zbiór się skończył
	}

	/* Procedura sortowania tab[pocz...kon] */
	public static void mergesort(int first, int last) {
		int sr;
		if (first < last) {
			sr = (first + last) / 2;
			mergesort(first, sr); // Dzielenie lewej części
			mergesort(sr + 1, last); // Dzielenie prawej części
			merge(first, sr, last); // Łączenie części lewej i prawej
		}
	}

	public static void main(String[] args) {
		int i;
		System.out.println("Zbior przed sortowaniem:");
		for (i = 0; i < N; i++) {
			System.out.print(table[i] + " ");
			mergesort(0, N - 1);
		}
		System.out.println("\nZbior po sortowaniu:");
		for (i = 0; i < N; i++) {
			System.out.print(table[i] + " ");
		}
	}

}
