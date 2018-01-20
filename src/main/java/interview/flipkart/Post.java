package interview.flipkart;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.omg.CORBA.RepositoryIdHelper;

public class Post implements Comparable<Post>{
	private Integer id;
	private String owner;
	private String content;
	private Date created;
	private Integer upvote = 0;
	private Integer downvote = 0;
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
	private List<Comment> comments = new ArrayList<>();
	private static int counter=1;
	public Post() {
		super();
		// TODO Auto-generated constructor stub
		comments = new ArrayList<>();
		this.id=counter++;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	@Override
	public int compareTo(Post o) {
		boolean followingO = Repository.current.isFollowing(Repository.users.get(o.getOwner()));
		boolean followingThis = Repository.current.isFollowing(Repository.users.get(this.getOwner()));

		if(followingO && !followingThis)
			return 1;
		else if(!followingO && followingThis)
			return -1;
		else{
			if(o.getUpvote()-o.getDownvote() > this.getUpvote()-this.getDownvote())
				return 1;
			else if(o.getUpvote()-o.getDownvote() < this.getUpvote()-this.getDownvote())
				return -1;
			else{
				if(o.getComments().size() > this.getComments().size())
					return 1;
				else if(o.getComments().size() < this.getComments().size()) 
					return -1;
				else{
					if(o.getCreated().after(this.getCreated()))
						return 1;
					else if (o.getCreated().before(this.getCreated()))
						return -1;
					else 
						return 0;
				}
			}
		}
	}
	public void addUpvote() {
		// TODO Auto-generated method stub
		++this.upvote;
	}

	public void adDownvote() {
		// TODO Auto-generated method stub
		++this.downvote;
	}
	public void addComment(String comment) {
		Comment c = new Comment();
		c.setCreated(new Date());
		c.setOwner(Repository.current.getUsername());
		c.setText(comment);
		comments.add(c);
	}
}
