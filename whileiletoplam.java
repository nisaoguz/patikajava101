package java101;
import java.util.*;

public class whileiletoplam {

	public static void main(String[] args) {
		int sayi;
		int toplam=0;
		int adet=0;
		Scanner input=new Scanner(System.in);
		
		do {
		System.out.print("sayi giriniz : ");
		sayi=input.nextInt();
		if(sayi%2==0 && sayi%4==0) 
			toplam=toplam+sayi;
		}
		while(sayi%2==0); 

		System.out.println("çift ve 4'ün katları olan sayıların toplamı : "+toplam);
		// TODO Auto-generated method stub

	}

}
