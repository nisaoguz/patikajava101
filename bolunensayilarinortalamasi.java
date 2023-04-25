package java101;
import java.util.*;
public class bolunensayilarinortalamasi {

	public static void main(String[] args) {
		int sayi;
		int toplam=0;
		int adet=0;
		Scanner input=new Scanner(System.in);
		System.out.print("sayi giriniz : ");
		sayi=input.nextInt();
		
		for(int i=1; i<=sayi; i++) {
			if(i%3==0 && i%4==0) {
				toplam=toplam+i;
				adet++;
			}
		}
		double ortalama = toplam/adet;
		System.out.println("3 ve 4e bölünen sayıların ortalaması : "+ortalama);
		

	}

}
