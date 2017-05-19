package pl.sdacademy.lambda.example;

import pl.sdacademy.lambda.ISumInt;

public class MainWithoutLambda {

	public static void main(String[] args) {
		ISumInt object = new SumInt();
		int sum = object.sum(5);
		System.out.println("sum=" + sum);

	}

}
