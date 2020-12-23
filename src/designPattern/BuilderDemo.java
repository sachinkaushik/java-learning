package designPattern;

public class BuilderDemo {

	public static void main(String[] args) {
		User user  = new User.UserBuilder("sachin","sharma").build();
		
		System.out.println(user);
		
		User usr1 = new User.UserBuilder("sachin", "sharma").age(29).build();
		
		System.out.println(usr1);
	}
}
