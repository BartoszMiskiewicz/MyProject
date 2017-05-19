package pl.sdacademy.lambda.produkty;

import java.util.function.Predicate;

public interface IProdukt {

	public <T> T znajdzProdukt(Predicate<T> predicate, T[] listaProduktow);

}