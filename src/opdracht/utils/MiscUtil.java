package opdracht.utils;

public class MiscUtil {
	public static void wait(int milliseconds) {
		if (milliseconds < 0) {
			throw new IllegalArgumentException("De wachttijd moet groter dan 0 zijn.");
		}
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}
