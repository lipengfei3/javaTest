
public class OrderTester extends Order {
  public void readOrderInfo(){
	  setCustomerId(2002);
	  setRecipientName("Michelle");
	  setRecipientAddress("#F10,St.Mark's Road");
	  setRecipientCity('D');
	  setCourierWeight(4.2f);
	  setDescription("Envelope");
	  System.out.println("          Courier Order Booking");
	  System.out.println("Customer Id                    :"+getCustomerId() );
	  System.out.println("Date of Order(DD-MMM-YYYY)     :"+getOrderDate());
	  System.out.println("Recipient Name                 :"+getRecipientName());
	  System.out.println("Recipient Address              :"+getRecipientAddress());
	  System.out.println("Recipient City(D,P,B,C)        :"+getRecipientCity());
	  System.out.println("Courier Weight                 :"+getCourierWeight());
	  System.out.println("Description                    :"+getDescription());
  }
}
