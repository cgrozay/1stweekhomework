
public class SayiBulma {

	public void SayiBulma1() {
		int[] sayilar=new int[] {1,2,5,7,9};
		int aranacak=5;
		boolean varMi=false;
		
		for (int sayi : sayilar) {
			if (sayi==aranacak) {
				varMi=true;
				break;
			} 
			
		}
		if (varMi) {
			System.out.println("Sayı Mevcuttur");
		}else {
			System.out.println("Sayı Mevcut Değildir.");
		}
	}
}
