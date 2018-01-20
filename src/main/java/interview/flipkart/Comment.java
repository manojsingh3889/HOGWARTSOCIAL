package interview.flipkart;

import java.util.Date;
import java.util.List;

public class Comment {
	private Integer id;
	private String text;
	private String owner;
	private Integer upvote;
	private Integer downvote;
	private Date created;
	private List<Comment> replies;
	private static int counter = 1;
	
	
	public Comment() {
		super();
		this.id= counter++;
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Integer getUpvote() {
		return upvote;
	}
	public void setUpvote(Integer upvote) {
		this.upvote = upvote;
	}
	public Integer getDownvote() {
		return downvote;
	}
	public void setDownvote(Integer downvote) {
		this.downvote = downvote;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public List<Comment> getReplies() {
		return replies;
	}
	public void setReplies(List<Comment> replies) {
		this.replies = replies;
	}
	
	
}
