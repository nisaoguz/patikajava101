package java101;

import java.util.*;
public class notortalama {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.print("mat notunuzu giriniz : ");
		int mat=inp.nextInt();
		System.out.print("kimya notunuzu giriniz : ");
		int kimya=inp.nextInt();
		System.out.print("fizik notunuzu giriniz : ");
		int fizik=inp.nextInt();
		System.out.print("turkce notunuzu giriniz : ");
		int turkce=inp.nextInt();
		System.out.print("muzik notunuzu giriniz : ");
		int muzik=inp.nextInt();
		System.out.print("tarih notunuzu giriniz : ");
		int tarih=inp.nextInt();
		
		int toplam=(mat+fizik+tarih+muzik+turkce+kimya);
		double ortalama = toplam/6;
		System.out.println(ortalama>60 ? "gectiniz " : "kaldiniz");
		
		
		
		

	}

}
