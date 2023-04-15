package java101;
import java.util.*;
public class artikyil {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("yil giriniz : ");
		int yil=input.nextInt();
		if(yil%4==0) 
			System.out.println(yil+" artik yildir");
		
		else if (yil%400==0)
			System.out.println(yil+" artik yildir");
		
		else
			System.out.println("Artik yil değildir");
		

	}

}
