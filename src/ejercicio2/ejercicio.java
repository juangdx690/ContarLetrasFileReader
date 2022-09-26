package ejercicio2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class ejercicio {

	private static String FILE_NAME = "src\\fichero";
	private static String VOCALS = "aeiou";

	public static void main(String[] args) {

		try {
			charCounter counters = new charCounter(VOCALS);
			FileReader input = new FileReader(FILE_NAME);
			int c = input.read();

			while (c != -1) {

				counters.countIfTargeted((char) c);
				c = input.read();
			}
			input.close();
			System.out.println(counters.toString());

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
