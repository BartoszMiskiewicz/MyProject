package pl.sdacademy.lambda.example.exampel1;

import pl.sdacademy.lambda.example.exampel1.model.Bulka;
import pl.sdacademy.lambda.example.exampel1.model.Kanapka;
import pl.sdacademy.lambda.example.exampel1.model.Maslo;
import pl.sdacademy.lambda.example.exampel1.model.Warzywo;

public class UmiejetnosciPanaKanapki implements IUmiejetnosci {

	@Override
	public Kanapka zrobKanapka(Bulka bulka, Maslo maslo, Warzywo warzywo) {
		return new Kanapka("pusta");
	}

}
