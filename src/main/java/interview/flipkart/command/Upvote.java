package interview.flipkart.command;

import interview.flipkart.Console;
import interview.flipkart.Post;
import interview.flipkart.Repository;

public class Upvote {
	public void process(String input){
		try {
			String text = input.split(Console.DELIMETER)[1];
			Integer id = Integer.parseInt(text);
			for(Post post: Repository.posts){
				if(post.getId()==id)
					post.addUpvote();
			}
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid input usage upvote~postid");
		}catch (Exception e) {
			System.out.println("Invalid input usage upvote~postid");
		}
	}
}
