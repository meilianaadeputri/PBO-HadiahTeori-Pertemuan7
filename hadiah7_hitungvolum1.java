import java.util.Scanner;

class hadiah7_hitungvolum1{
	public static void main(String[]args){
		hadiah7_volum V1 = new hadiah7_volum();
		hadiah7_volum1 V2 = new hadiah7_volum1();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan jari-jari: ");
		double jari = input.nextDouble();
		V1.setJari(jari);
		V1.getVolumByJari();
		
		System.out.print("Masukkan diameter: ");
		double diameter = input.nextDouble();
		V2.setDiameter(diameter);
		V2.getVolumByDiameter();
	}
}