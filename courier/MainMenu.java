import java.io.IOException;

public class MainMenu {
	public static void main(String []args) throws IOException{
		System.out.println("===================================");
		System.out.println("     Sterling Courier Company");
		System.out.println("===================================");
		System.out.println("1. Customer Registration");
		System.out.println("2. Courier Order Booking");
		System.out.println("3. Courier Dispatch Responsibiility Genneration");
		System.out.println("4. Courier Delovery");
		System.out.println("5. Invoice Generation");
		System.out.println("6. Exit");
		System.out.println();
		System.out.println("Enter your choice:");
		int choice=0;
		choice=System.in.read()-48;
		System.out.println(choice);
		switch(choice){
			case 1:
				System.out.println("1");
				break;
			case 2:
				OrderTester orderTester=new OrderTester();
			    orderTester.readOrderInfo();
			    break;
			case 3:
				System.out.println("3");
				break;
			case 4:
				System.out.println("4");
				break;
			case 5:
				System.out.println("5");
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("You have not enter any choice!");
			    break;
		    
				
		}
		
		}
}
