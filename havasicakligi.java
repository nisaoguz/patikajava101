package java101;
import java.util.*;

public class havasicakligi {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Sıcaklığı giriniz : ");
		int sicaklik=input.nextInt();
		
		if(sicaklik<5) 
			System.out.println("kayak yapabilirsiniz");
	    else if (sicaklik >= 5 && sicaklik <= 15) 
	    	System.out.println("Sinemaya gidebilirsiniz.");
        else if (sicaklik >= 15 && sicaklik <= 25) 
        	System.out.println("Pikniğe gidebilirsiniz.");
        else if(sicaklik>25) 
        	System.out.println("Yüzmeye gidebilirsiniz.");
	}
}
