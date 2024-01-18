package encapsulation;

public class Login {
	private String username;
	private String pwd;

	public void setusername(String username) {
		this.username = username;
	}

	public String getusername() {
		if (username == "John") {
			return "Username is correct, Please Enter Password";
		} else {
			return "Username is Incorrect";
		}
	}
	
	 public void setpwd(String pwd) 
	 { 
	 this.pwd=pwd; 
	 } 
	 public String getpwd() 
	 { 
	 if(pwd=="John@14141") 
	 { 
	 return "Please go ahead" ; 
	 } 
	 else 
	 { 
	 return"Entered password is invalid" ; 
	 } 
	 } 
	} 

