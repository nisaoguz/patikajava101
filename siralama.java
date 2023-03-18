package java101;
import java.util.*;

public class siralama {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int max=0;
		System.out.print("1.sayi : ");
		int n=input.nextInt();
		System.out.print("2.sayi : ");
		int n1=input.nextInt();
		System.out.print("3.sayi : ");
		int n2=input.nextInt();
		
		if(n>n1 && n>n2) 
			max=n;
		else if(n1>n && n1>n2) 
			max=n1;
		else if(n2>n1 && n2>n) 
			max=n2;
		System.out.print(max);		
	}
}
