
public class SwitchDemo {

	public void SwitchDemo1() {
		char grade = 'G';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel Geçtiniz.");
			break;
		case 'B':
			System.out.println("İyi Geçtiniz.");
			break;
		case 'C':
			System.out.println("Geçtiniz.");
			break;
		case 'D':
			System.out.println("Şartlı Geçtiniz.");
			break;

		case 'F':
			System.out.println("Kaldınız.");
			break;
		default:
			System.out.println("Geçersiz Not Girdiniz.");
			break;
		}
	}
}
