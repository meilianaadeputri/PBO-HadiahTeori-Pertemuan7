import java.util.Scanner;

class hadiah7_hitungvolum{
	public static void main(String[]args){
		hadiah7_volum R = new hadiah7_volum();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan jari-jari: ");
		double jari = input.nextDouble();
		R.setJari(jari);
		R.getVolumByJari();
	}
}