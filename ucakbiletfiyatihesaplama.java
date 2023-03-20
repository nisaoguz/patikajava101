package java101;
import java.util.*;
public class ucakbiletfiyatihesaplama {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Mesafeyi km cinsinden giriniz : ");
		double km=input.nextDouble();
		System.out.print("Yaşınızı giriniz : ");
		int yas=input.nextInt();
		System.out.print("Yolculuk tipini giriniz (1=>Tek yön 2=>Gidiş dönüş): ");
		int secim=input.nextInt();
		
		if (km>0 && ((secim==1)||(secim==2)) && yas>0) {
			double tutar = km * 0.10;
			
			if(secim==1) {
				if(yas<12) {
					double indirim = tutar * 0.50;
					double indtutar=tutar-indirim;
					System.out.println("Toplam tutar : "+indtutar);
				}
				else if(yas>12 && yas<24) {
					double indirim = tutar * 0.10;
					double indtutar=tutar-indirim;
					System.out.println("Toplam tutar : "+indtutar);
				}
				else if(yas>65) {
					double indirim = tutar * 0.65;
					double indtutar=tutar-indirim;
					System.out.println("Toplam tutar : "+indtutar);
				}
				else {
					System.out.println("Toplam tutar : "+tutar);
				}
			
			}
			else if(secim==2) {
				
				if(yas<12) {
					double indirim = tutar * 0.50;
					double indtutar=tutar-indirim;
					double gdtutar = indtutar * 0.20;
					double gidisdonus=(indtutar-gdtutar)*2;
					System.out.println("Toplam tutar : "+gidisdonus);
				}
				else if(yas>12 && yas<24) {
					double indirim = tutar * 0.10;
					double indtutar=tutar-indirim;
					double gdtutar = indtutar * 0.20;
					double gidisdonus=(indtutar-gdtutar)*2;
					System.out.println("Toplam tutar : "+gidisdonus);
					
				}
				else if(yas>65) {
					double indirim = tutar * 0.65;
					double indtutar=tutar-indirim;
					double gdtutar = indtutar * 0.20;
					double gidisdonus=(indtutar-gdtutar)*2;
					System.out.println("Toplam tutar : "+gidisdonus);
				}
				else {
					double indtutar=tutar*0.20;
					double gd=tutar-indtutar;
					
					System.out.println("Toplam tutar : "+gd);
				}
				
			}
			
		}
		
		else {
			System.out.print("Hatalı veri girdiniz!");
		}

	}

}
