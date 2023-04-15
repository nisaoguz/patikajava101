package java101;
	import java.util.Scanner;
public class cinburchesabı {

	    public static void main(String[] args) {
	        int dogum_yili, burc;

	        Scanner input = new Scanner(System.in);
	        System.out.print("Doğum yılınızı yazınız");
	        dogum_yili=input.nextInt();
	        burc=dogum_yili%12;
	        switch (burc){
	            case 0:
	                System.out.print(" Zodiac Burcunuz: Maymun ");
	                break;
	            case 1:
	                System.out.print(" Zodiac Burcunuz: Horoz ");
	                break;
	            case 2:
	                System.out.print(" Zodiac Burcunuz: Köpek ");
	                break;
	            case 3:
	                System.out.print(" Zodiac Burcunuz: Domuz ");
	                break;
	            case 4:
	                System.out.print(" Zodiac Burcunuz: Fare ");
	                break;
	            case 5:
	                System.out.print(" Zodiac Burcunuz: Öküz ");
	                break;
	            case 6:
	                System.out.print(" Zodiac Burcunuz: Kaplan ");
	                break;
	            case 7:
	                System.out.print(" Zodiac Burcunuz: Tavşan ");
	                break;
	            case 8:
	                System.out.print(" Zodiac Burcunuz: Ejderha ");
	                break;
	            case 9:
	                System.out.print(" Zodiac Burcunuz: Yılan ");
	                break;
	            case 10:
	                System.out.print(" Zodiac Burcunuz: At ");
	                break;
	            case 11:
	                System.out.print(" Zodiac Burcunuz: Koyun ");
	                break;
	            default :
	                System.out.print(" Geçersiz bir durum var");


	        }

	

	}

}
