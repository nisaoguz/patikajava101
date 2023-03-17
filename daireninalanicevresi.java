package java101;
import java.util.*;
public class daireninalanicevresi {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		 double r,a,alan;

	        System.out.print("Yarıçapı Giriniz:");
	        r=input.nextDouble();
	        System.out.print("Daire Diliminin Açısını Giriniz:");
	        a=input.nextDouble();
	        alan=(3.14*(r*r)*a)/360;
	        System.out.print("Üçgen Dilimin Alanı: "+alan);

	    }
}
