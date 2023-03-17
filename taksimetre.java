package java101;
import java.util.*;

public class taksimetre {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("Gidilen mesafe kaç km : ");
		int km=input.nextInt();
		
		double tutar=2.20*km;
		
		tutar= (tutar<20) ? 20 : (tutar+10);

		System.out.println("odenecek tutar : "+(tutar));
	
	}

}
