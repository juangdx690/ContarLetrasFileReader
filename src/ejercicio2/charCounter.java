package ejercicio2;

public class charCounter {

	public String vocals = "aeiou";

	public int a = 0;
	public int e = 0;
	public int i = 0;
	public int o = 0;
	public int u = 0;

	public charCounter(String vocals) {
		this.vocals = vocals;
	}

	public void countIfTargeted(int c) {

		if (c == 'a') {
			a++;
		}

		if (c == 'e') {
			e++;
		}

		if (c == 'i') {
			i++;
		}

		if (c == 'o') {
			o++;
		}

		if (c == 'u') {
			u++;
		}

	}

	@Override
	public String toString() {
		return "charCounter [vocals=" + vocals + ", a=" + a + ", e=" + e + ", i=" + i + ", o=" + o + ", u=" + u + "]";
	}

}
