package week1.day1;
public class Mobile {
 
public void addSms() {
  System.out.println( "hello");
}
  protected void allowVoiceCall() {
	  System.out.println("voice call");
  } 
	  private void takeVideo() {
		 System.out.println("take video");
	 }
  
public static void main(String[] args) {
	Mobile obj = new Mobile();
	obj.addSms();
	obj.allowVoiceCall();
	obj.takeVideo();
	
	System.out.println("This is my mobile function");
}
}
