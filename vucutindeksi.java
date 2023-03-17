package java101;
import java.util.*;
public class vucutindeksi {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("boyunuzu giriniz : ");
		double boy=input.nextDouble();
		System.out.print("kilonuzu giriniz : ");
		double kilo=input.nextDouble();
		double vki=kilo/(boy*boy);
		System.out.println("Vücut Kitle İndeksiniz :  "+vki);


	}
}
