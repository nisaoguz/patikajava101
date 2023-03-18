package java101;
import java.util.*;

public class hesapmakinesi {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("ilk sayiyi giriniz : ");
		double n=input.nextDouble();
		System.out.print("ilk sayiyi giriniz : ");
		double n1=input.nextDouble();
		
		System.out.println("İşlem seçiniz 1-Toplama 2-Çıkarma 3-Çarpma 4-Bölme");
		int secim=input.nextInt();
		switch(secim) { 
		case 1:
			System.out.println(n+n1);
			break;
		case 2:
			System.out.println(n-n1);
			break;
		case 3:
			System.out.println(n*n1);
			break;
		case 4:
			System.out.println(n/n1);
			break;
		}
	}
}
