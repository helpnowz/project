import java.util.Scanner;

public class Class {
	public static Scanner sc = new Scanner(System.in);
	public static int piz = 0, chick = 0, coke = 0;
	public static int pi;
	public static int choice;
	
	public static void Piz() {
		System.out.print("Enter Quantity : ");
		pi = sc.nextInt();
		piz = piz + pi;
	}
	public static void Chick() {
		System.out.print("Enter Quantity : ");
		pi = sc.nextInt();
		chick = chick + pi;
	}	
	public static void Coke() {
		System.out.print("Enter Quantity : ");
		pi = sc.nextInt();
		coke = coke + pi;
	}	
	public static int PiPiz() {
		return piz*250;
	}
	public static int PiChick() {
		return chick*120;
	}
	public static int PiCoke() {
		return coke*45;
	}

	public static void main(String[] args) {

		 System.out.print("--------- Welcome to SKE Restaurant ---------");  
    	 System.out.println(" \n1.)Pizza   250 Bath. \n2.)Chicken 120 Bath. \n3.)Coke    45 Bath. \n4.)Total \n5.)Exit \n");
		do {
			System.out.print("\nEnter your Choices : ");
			choice = sc.nextInt();
			pi = 0;
			if (choice == 1) {
			Piz();
			} else if (choice == 2) {
			Chick();
			} else if (choice == 3) {
			Coke();
			} else if (choice == 4) {
				System.out.println("+-------Menu-------+--Qty--+--Price-------+");
				if (piz > 0) {
					System.out.printf("| Pizza            |         %d  |   %d  |\n", piz, PiPiz());
				}
				if (chick > 0) {
					System.out.printf("| Chickens         |         %d  |   %d   |\n", chick, PiChick());
				}
				if (coke > 0) {
					System.out.printf("| Coke             |         %d  |   %d   |\n", coke, PiCoke());
				}
				System.out.println("+-----------------------------------------+");
				System.out.printf("| Total                         |   %d  |\n", PiPiz()+PiChick()+PiCoke());
				System.out.println("+-----------------------------------------+");
			}
		}
		while (choice != 5);
		System.out.print("===== Thank you =====");
	}
}

