package g1_subory_a_prudy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * Tento program je prepisanou verziou programu {@code Files2_copy.clss}
 * kde je pouzivane autmaticke uzatvaranie prostriedkov pomocou upraveneho
 * zachycovania vynimiek try-with-resources.
 */
public class Files3_try_with_resources {

	public static void main(String[] args) {
		int i;
		
		//try-with-resources
		try (FileInputStream fis = new FileInputStream ("C:\\devel\\Files1_read.txt");
			FileOutputStream fos = new FileOutputStream("C:\\devel\\Files2_copy.txt");) {
			do {
				i = fis.read();
				if (i != -1)
					fos.write(i);
			} while (i != -1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
