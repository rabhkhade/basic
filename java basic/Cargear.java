package basic;

public class Cargear {
public static void main(String[]args) {
	int speed =30;
			if (speed>=10  && speed<=20){
				System.out.println("gear first");
			}
		else if (speed>=20 && speed<=30){
				System.out.println("gear second");
		
	}
			else if (speed>=30 && speed<=40) {
				System.out.println("gear third");
			}
			else if (speed>=40 && speed<=50) {
				System.out.println("gear fourth");
				
			}
			else {
				System.out.println("norunning");
			}
}
}
