package e1_anotacie_metadata;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * Tato anotacia ma nastavenu politiku zivotnosti na 
 * RUNTIME, co znamena, ze je mozne k nej pristupovat
 * prostrednictvom virtualneho stroja Javy za behu.
 * 
 * Tato anotacia ma anotaciou @Target nastavene mozne
 * pouzitie na konstruktory a metody, co znamena, ze
 * tuto anotaciu nie je mozne pouzit na triedy, polia,
 * lokalne premenne, typove parametre a pod.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface X {
	/*
	 * Tato anotacia ma definovaneho len jedneho clena,
	 * s nazvom value, co znaci, ze nie je potrebne
	 * priradzovat hodnotu pomocou explicitneho zadania
	 * jej nazvu pri pouziti.
	 * Taktiez, nie je nutne tuto hodnotu vobec zadavat,
	 * kedze metoda value() ma nastavenu aj defaultnu
	 * hodnotu.
	 */
	String value() default "undefined";
}

