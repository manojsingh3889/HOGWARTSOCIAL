package interview.flipkart.command;

import java.util.Collections;

import interview.flipkart.Comment;
import interview.flipkart.Post;
import interview.flipkart.Repository;

public class NewsFeed {
	public void display(){
		Collections.sort(Repository.posts);
		for(Post post : Repository.posts){
			System.out.println();
			System.out.println(post.getId());
			System.out.println(post.getOwner() +"("+post.getUpvote()+" upvotes,"+post.getDownvote()+" downvotes)");
			System.out.println(post.getContent());
			System.out.println(post.getCreated());
			
			for(Comment c : post.getComments()){
				System.out.println();
				System.out.print("\t");System.out.println(c.getId());
				System.out.print("\t");System.out.println(c.getOwner());
//				System.out.println(c.getOwner() +"("+c.getUpvote()+" upvotes,"+c.getDownvote()+" downvotes)");
				System.out.print("\t");System.out.println(c.getText());
				System.out.print("\t");System.out.println(c.getCreated());
				
				for(Comment r : c.getReplies()){
					System.out.println();
					System.out.print("\t\t");System.out.println(r.getId());
					System.out.print("\t\t");System.out.println(r.getOwner());
//					System.out.println(c.getOwner() +"("+c.getUpvote()+" upvotes,"+c.getDownvote()+" downvotes)");
					System.out.print("\t\t");System.out.println(r.getText());
					System.out.print("\t\t");System.out.println(r.getCreated());
				}
			}
			System.out.println();
		}
	}
}
