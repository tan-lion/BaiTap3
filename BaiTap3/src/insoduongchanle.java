import java.util.Iterator;
import java.util.Scanner;

public class insoduongchanle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declare
		int odd = 0, even = 0;

		// While
		System.out.println("while");
		System.out.println("Danh sach so le: ");
		while (odd < 100) {
			if (odd % 2 != 0) {
				System.out.print(odd + ", ");
			}
			odd++;
		}
		System.out.println();
		System.out.println("Danh sach so chan: ");
		while (even < 100) {
			if (even % 2 == 0) {
				System.out.print(even + ", ");
			}
			even++;
		}

		// For
		System.out.println();
		System.out.println("for");
		System.out.println("Danh sach so chan: ");
		for (int i = 0; i < 100; i += 2) {
			System.out.print(i + ", ");
		}
		System.out.println();
		System.out.println("Danh sach so le: ");
		for (int i = 1; i < 100; i += 2) {
			System.out.print(i + ", ");
		}
	}
}
