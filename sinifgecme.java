package java101;

import java.util.*;
public class sinifgecme {

	public static void main(String[] args) {
		
		double avg=0;
		int ders=5;
		
		Scanner input=new Scanner(System.in);
		System.out.print("mat notunuzu giriniz : ");
		int mat=input.nextInt();
		if(mat<0 || mat>100) {
			ders--;
			mat=0;
		}
		System.out.print("kimya notunuzu giriniz : ");
		int kimya=input.nextInt();
		if(kimya<0 || kimya>100) {
			ders--;
			kimya=0;
		}
		System.out.print("fizik notunuzu giriniz : ");
		int fizik=input.nextInt();
		if(fizik<0 || fizik>100) {
			ders--;
			mat=0;
		}
		System.out.print("turkce notunuzu giriniz : ");
		int turkce=input.nextInt();
		if(turkce<0 || turkce>100) {
			ders--;
			mat=0;
		}
		System.out.print("muzik notunuzu giriniz : ");
		int muzik=input.nextInt();
		if(muzik<0 || muzik>100) {
			ders--;
			mat=0;
		}
		
		avg=(mat+kimya+fizik+muzik+turkce)/ders;
		System.out.println(avg);
		System.out.println(avg>55 ? "gectiniz " : "kaldiniz");
	}
}