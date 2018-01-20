package interview.flipkart.command;

import interview.flipkart.Console;
import interview.flipkart.Repository;
import interview.flipkart.User;

public class Login {
	public void process(String input){
		try {
			String name = input.split(Console.DELIMETER)[1];
			if(Repository.users.containsKey(name))
				Repository.current = Repository.users.get(name);
			else{
				System.out.println("No such user exist. Please signup before login.");
				return;
			}
			new NewsFeed().display();
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid input usage login~username");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
