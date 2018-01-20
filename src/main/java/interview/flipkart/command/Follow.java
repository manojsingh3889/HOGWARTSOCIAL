package interview.flipkart.command;

import interview.flipkart.Console;
import interview.flipkart.Repository;
import interview.flipkart.User;

public class Follow {
	public void process(String input){
		try {
			String name = input.split(Console.DELIMETER)[1];
			
			if(!Repository.users.containsKey(name)){
				System.out.println("Unknow user");
				return;
			}
			Repository.users.get(name).addFollower();
			Repository.current.follow(Repository.users.get(name));
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid input usage follow~username");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
