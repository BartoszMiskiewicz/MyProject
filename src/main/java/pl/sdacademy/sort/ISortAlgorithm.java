package pl.sdacademy.sort;

public interface ISortAlgorithm {

	default void sort(int[] array) {
		sort(array, true);
	};

	void sort(int[] array, boolean ascending);

}
