package interview.flipkart.command;

import interview.flipkart.Console;
import interview.flipkart.Post;
import interview.flipkart.Repository;
import interview.flipkart.User;

public class Reply {
	public void process(String input){

			try {
				String idtext = input.split(Console.DELIMETER)[1];
				String comment = input.split(Console.DELIMETER)[2];
				
				
				Integer id = Integer.parseInt(idtext);
				for(Post post: Repository.posts){
					if(post.getId()==id)
						post.addComment(comment);
				}
			} catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Invalid input usage reply~postid~text");
			}catch (Exception e) {
				System.out.println("Invalid input usage reply~postid~text");
			}
		
	}
}
