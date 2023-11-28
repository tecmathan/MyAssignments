
/*- Create package name as week1.day1 under src/main/java
- Create a  new class as "Mobile" under week1.day1
- Create 2 methods (makeCall() , sendMsg()) with simple print statement
- In first method create variable  mobileModel (String),mobileWeight (float)
- In second method create variable  isFullCharged (boolean),mobileCost (int)
- Create main method
Create object for class and call  from main method and print them
- print a statement---->"This is my mobile";
-run and confirm the output printed in console */

package week1.day1;
public class Mobile {

	public void makeCall() {
		String mobileModel = "Motrolla";
		float mobileWeight = 125.5f;
		System.out.println("Mobile model is "+mobileModel);
		System.out.println("Mobile weight is "+mobileWeight);

	}
	public void sendMsg() {
		boolean isFullCharged =true;
		int mobileCost = 15000;
		System.out.println("Whether mobile is fully changed "+isFullCharged);
		System.out.println("Mobile cost "+mobileCost);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mobile = new Mobile();
		mobile.makeCall();
		mobile.sendMsg();

	}
}
