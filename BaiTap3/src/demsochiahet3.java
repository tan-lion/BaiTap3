import java.util.Scanner;

public class demsochiahet3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declare
		int number = 0, countWhile = 0, countFor = 0;

		// While
		while (number < 1000) {
			if (number % 3 == 0) {
				countWhile++;
			}
			number++;
		}
		// Output
		System.out.println("Tong so chia het cho 3 (While): " + countWhile);

		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0) {
				countFor++;
			}
		}
		//Output
		System.out.println("Tong so chia het cho 3 (For): " + countFor);
	}
}
