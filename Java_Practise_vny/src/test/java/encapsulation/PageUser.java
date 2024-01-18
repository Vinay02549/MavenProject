package encapsulation;

public class PageUser {
	public static void main(String[] args) {

		Login l1 = new Login();
		l1.setusername("John");
		System.out.println(l1.getusername());
		l1.setpwd("Something@143");
		System.out.println(l1.getpwd());

	}
}
