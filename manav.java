package java101;
import java.util.*;

public class manav {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Armut Kaç Kilo ? : ");
		double armut=input.nextDouble();
		System.out.print("Elma Kaç Kilo ? : ");
		double elma=input.nextDouble();
		System.out.print("Domates Kaç Kilo ? : ");
		double domates=input.nextDouble();
		System.out.print("Muz Kaç Kilo ? : ");
		double muz=input.nextDouble();
		System.out.print("Patlıcan Kaç Kilo ? : ");
		double patlican=input.nextDouble();
		
		double toplamtutar=(armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.0);
		System.out.print("toplam tutar : "+toplamtutar);

	}
}
