package week1.day1;

public class MobilePhone {
	
	 public void makeCall( String mobileModel, float mobileWeight ) {
		System.out.println("mobile model is "+mobileModel); 
		System.out.println("mobile weight is "+mobileWeight);
		System.out.println("Make a call");
	 }
	public void sendMsg (int mobileCost,Boolean isfullychared) {
		System.out.println("mobile cost is "+mobileCost);
		System.out.println("my mobile is fully charged :"+isfullychared);
		System.out.println("Send the msg");
		
	 }
public static void main(String[] args) {
	MobilePhone mob = new MobilePhone();
	mob.makeCall("redmi10G",24.4f);
	mob.sendMsg(9000,true);
	System.out.println("This is my Mobile");
	
}
}
