package interview.flipkart.command;

import java.util.Date;

import interview.flipkart.Console;
import interview.flipkart.Post;
import interview.flipkart.Repository;

public class Postman {
	public void post(String input){
		try {
			String content = input.split(Console.DELIMETER)[1];
			Post post = new Post();
			post.setOwner(Repository.current.getUsername());
			post.setContent(content);
			post.setCreated(new Date());
			Repository.posts.add(post);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid input usage post~content");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
