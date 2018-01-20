package interview.flipkart;

import java.util.ArrayList;
import java.util.List;

public class User {
	private Integer id;
	private String username;
	private Integer followers = 0;
	private List<User> following = new ArrayList<>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getFollowers() {
		return followers;
	}
	public void setFollowers(Integer followers) {
		this.followers = followers;
	}
	public void addFollower() {
		++ this.followers;
		
	}
	public void follow(User user2) {
		this.following.add(user2);
	}
	
	public boolean isFollowing(User user){
		return this.following.contains(user);
	}
}
