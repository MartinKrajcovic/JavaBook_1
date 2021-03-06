package e1_anotacie_metadata;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MojaAnotacia4 {

	/*
	 * Jednotlivym clenom anotacie mozeme priradit aj nejake pociatocne hodnoty,
	 * ktore budu pouzite vtedy, ked nebudu pri priradzovani anotacie ziadne ine
	 * hodnoty.
	 * Prednastavene hodnoty sa daju specifikovat pridanim klauzule 'default' k
	 * daklaracii clena.
	 */
	String s() default "Prednastavena hodnota.";
	int val() default 900;
}


