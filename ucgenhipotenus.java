package java101;
import java.util.*;
public class ucgenhipotenus {

	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
	        int a, b;
	        double c, u, alan;
	        System.out.print("Ucgenin 1.kenar uzunlugu degerini giriniz  :  ");
	        a = input.nextInt();
	        System.out.print("Ucgenin 2.kenar uzunlugu degerini giriniz  :  ");
	        b = input.nextInt();
	        c = Math.sqrt((a * a) + (b * b));
	        System.out.println("Hipotenus : " + c);
	        u = (a + b + c) / 2;
	        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
	        System.out.println("Ucgenin Alani : " + alan);

	    }
	}



