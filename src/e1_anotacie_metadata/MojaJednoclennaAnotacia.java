package e1_anotacie_metadata;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MojaJednoclennaAnotacia {

	String value();
	
}