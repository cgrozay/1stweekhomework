

public class MukemmelSayi {

	public void MukemmelSayi1() {
		int number = 8128;
		int total = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}
		if (number == total) {
			System.out.println("Mükemmel Sayıdır.");
		} else {
			System.out.println("Mükemmel Sayı değildir.");
		}
	}
}
