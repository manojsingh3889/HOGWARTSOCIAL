package interview.flipkart.command;

import interview.flipkart.Console;
import interview.flipkart.Repository;
import interview.flipkart.User;

public class Signup {
	public void process(String input){
		try {
			String name = input.split(Console.DELIMETER)[1];
			User user = new User();
			user.setUsername(name);
			Repository.users.put(name, user);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid input usage signup~username");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
