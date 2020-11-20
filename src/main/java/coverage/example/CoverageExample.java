package coverage.example;

public class CoverageExample {

	private CoverageExample() {
	}

	public static boolean isBissextile(int year) {
		boolean isBissextile = false;

		if ((year % 4) == 0) {
			isBissextile = true;
		}

		if (isBissextile && (year % 100) == 0) {
			if ((year % 400) == 0) {
				isBissextile = true;
			} else {
				isBissextile = false;
			}
		}

		return isBissextile;
	}
}
