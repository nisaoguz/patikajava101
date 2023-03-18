package java101;
import java.util.*;

public class kullanicigirisi {

	public static void main(String[] args) {
		String username,password;
		Scanner input=new Scanner(System.in);
		System.out.print("Kullanıcı adı : ");
		username=input.nextLine();
		System.out.print("Şifre  : ");
		password=input.nextLine();
		
		if(username.equals("patika")&& password.equals("java123")) {
			System.out.println("Giriş yaptınız");
		}
		else {
			System.out.println("Bilgileriniz yanlış");
			 System.out.println("Sıfırlamak istiyor musunuz (1-evet / 0-hayır)");
	            int selection = input.nextInt();
	            switch (selection) {
	                case 0:
	                    System.out.println("İşlem iptal edildi.");
	                    break;
	                case 1:
	                    System.out.println("Yeni şifrenizi giriniz : ");
	                    String newPassword = input.next();
	                    if ((newPassword.equals(password))) {
	                        System.out.println("Yeni şifreniz öncekinden farklı olmalıdır.");
	                    } else {
	                        System.out.println("işlem tamamlandı");
	                    }
	                    break;
	                default:
	                    System.out.println("Geçersiz.");
		}
	}

  }
}
