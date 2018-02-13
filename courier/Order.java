
public class Order extends Calendar{
    private int orderId=0;
    private int customerId;
    private Calendar orderDate;
    private String recipientName;
    private String recipientAddress;
    private char recipientCity;
    private float courierWeight;
    private char courierStatus;
    private String description;
    
    public int getOrderId(){return this.orderId;}
    public void setOrderId(int orderId){this.orderId=orderId;}
    public int getCustomerId(){return this.customerId;}
    public void setCustomerId(int customerId){this.customerId=customerId;}
    public Calendar getOrderDate(){return this.orderDate;}
    public void setOrderDate(Calendar orderDate){this.orderDate=orderDate;}
    public String getRecipientName(){return this.recipientName;}
    public void setRecipientName(String recipientName){this.recipientName=recipientName;}
    public String getRecipientAddress(){return this.recipientAddress;}
    public void setRecipientAddress(String recipientAddress){this.recipientAddress=recipientAddress;}
    public char getRecipientCity(){return recipientCity;}
    public void setRecipientCity(char recipientCity ){this.recipientCity=recipientCity;}
    public float getCourierWeight(){return this.courierWeight;}
    public void setCourierWeight(float courierWeight){this.courierWeight=courierWeight;}
    public char getCourierStatus(){return this.courierStatus;}
    public void setCourierStatus(char courierStatus){this.courierStatus=courierStatus;}
    public String getDescription(){return this.description;}
    public void setDescription(String description){this.description=description;}

}
