package interview.flipkart.command;

import interview.flipkart.Console;
import interview.flipkart.Post;
import interview.flipkart.Repository;
import interview.flipkart.User;

public class Downvote {
	public void process(String input){
		try {
			String text = input.split(Console.DELIMETER)[1];
			Integer id = Integer.parseInt(text);
			for(Post post: Repository.posts){
				if(post.getId()==id)
					post.adDownvote();
			}
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid input usage downvote~postid");
		}catch (Exception e) {
			System.out.println("Invalid input usage downvote~postid");
		}
	}
}
