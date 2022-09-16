
public class ReCapDemo1 {

	public void ReCapDemo() {
		int sayi1 = 10;
		int sayi2 = 25;
		int sayi3 = 5;
		int enbuyuk = sayi1;

		if (enbuyuk < sayi2) {
			enbuyuk = sayi2;

		}
		if (enbuyuk < sayi3) {
			enbuyuk = sayi3;
		}
		System.out.println("En büyük sayı :" + enbuyuk);

	}
}
