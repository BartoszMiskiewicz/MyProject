package pl.sdacademy.sort;

public class SortAlgorithm implements ISortAlgorithm {

	public SortAlgorithm() {
		// TODO Auto-generated constructor stub
	}

	// TODO Zaimplementuj ponizszy pseudokod
	// procedure BubbleSort( var a: array of TItemBubbleSort );
	// var
	// n, newn, i:integer;
	// begin
	// n := high( a );
	// repeat
	// newn := 0;
	// for i := 1 to n do
	// begin
	// if a[ i - 1 ] > a[ i ] then
	// begin
	// swap( a[ i - 1 ], a[ i ]);
	// newn := i ;
	// end;
	// end ;
	// n := newn;
	// until n = 0;
	// end;
	//
	// end.
	@Override
	public void sort(int[] array, boolean ascending) {
		int n = array.length;

		do {
			for (int i = 0; i < array.length - 1; i++) {
				if ((array[i] > array[i + 1] && ascending) || (array[i] < array[i + 1] && !ascending)) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
			n = n - 1;

		} while (n > 1);

	}

}