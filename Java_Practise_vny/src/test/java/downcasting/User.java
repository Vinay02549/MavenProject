package downcasting;

public class User {

	public static void main(String[] args) {

		Police po = new Boyfriend(); // upcasting object...
		po.lockdown(); // compiles successfully..
		// po.meetingGirlfrnd(); // compile time error(CTE).

		// down casting...
		Boyfriend bro = (Boyfriend) po;
		bro.lockdown();
		bro.meetingGirlfrnd();
		
	}
}
