package pl.sdacademy.lambda.example;

import pl.sdacademy.lambda.ISumInt;

public class MainWithLambda {

	public static void main(String[] args) {
		ISumInt object = (n) -> {
			int result = 0;
			for (int i = 0; i < n; i++) {
				result += i;
			}
			return result;
		};
		int sum = object.sum(5);
		System.out.println("sum=" + sum);
	}
}
