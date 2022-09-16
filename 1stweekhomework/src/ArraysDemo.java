
public class ArraysDemo {

	public void ArraysDemo1() {
		String[] ogrenciler = { "Çağrı", "Engin", "Veli", "Ahmet" };

		for (int ogrenci = 0; ogrenci < ogrenciler.length; ogrenci++) {
			System.out.println(ogrenciler[ogrenci]);
		}
		System.out.println("-----------------------------------");
		String[] ogrenciler2 = new String[4];
		ogrenciler2[0] = "Engin";
		ogrenciler2[1] = "Derin";
		ogrenciler2[2] = "Salih";
		ogrenciler2[3] = "Ahmet";

		for (int i = 0; i < ogrenciler2.length; i++) {
			System.out.println(ogrenciler2[i]);
		}
		System.out.println("------------------------------------");
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
	}
}
