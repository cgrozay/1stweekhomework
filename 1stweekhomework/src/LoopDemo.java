
public class LoopDemo {

	public void LoopDemo1() {
		for (int i = 0; i < 7; i += 2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti.");

		int i = 1;
		while (i < 6) {

			System.out.println(i);
			i++;
		}
		System.out.println("While Döngüsü Bitti.");
		
		int j=1;
		do {
			System.out.println(j);
			j+=2;
		} while (j<10);
		System.out.println("Do-While Döngüsü Bitti");
	}
}