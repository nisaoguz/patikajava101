package java101;
import java.util.*;
public class kdv {

	public static void main(String[] args) {
		Scanner girdi=new Scanner(System.in);
		System.out.print("tutar giriniz : ");
		int tutar=girdi.nextInt();
		
		if(tutar>=0 && tutar<1000) { 
			double kdvtutari =tutar * 0.18;
			double kdv = tutar+kdvtutari;
			System.out.println("kdvli fiyat : " +kdv);
			System.out.println("kdv tutarı : "+kdvtutari);
		}
		else {
			double kdvtutari =tutar * 0.8;
			double kdv = tutar+kdvtutari;
			System.out.println("kdvli fiyat : " +kdv);
			System.out.println("kdv tutarı : "+kdvtutari);
		}

	}

}
