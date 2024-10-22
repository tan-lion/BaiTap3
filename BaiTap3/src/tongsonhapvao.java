import java.util.Scanner;

public class tongsonhapvao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declare
		int number, sum = 0;

		// Input
		do {
			System.out.println("Nhap mot so bat ky: ");
			number = sc.nextInt();

			if (number > 0) {
				sum += number;
			}

		} while (number > 0);
		
		//Output
		System.out.println("Tong gia tri nhap vao: "+ sum);
		
	}
}
