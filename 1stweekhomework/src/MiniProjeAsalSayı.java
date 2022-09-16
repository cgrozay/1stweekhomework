
public class MiniProjeAsalSayı {

	public void MiniProjeAsalSayı1() {
		int number = -1;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean isPrime = true;

		if (number < 1) {

			System.out.println("Geçersiz Sayı");
		}
		
		if (number==1) {
			System.out.println("Sayı Asal Değildir.");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}

		}
		if (isPrime) {
			System.out.println("Sayı asaldır.");
		} else {
			System.out.println("Sayı Asal Değildir.");
		}
	}
}
