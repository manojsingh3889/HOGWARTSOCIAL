package interview.flipkart;

public class User {
	private Integer id;
	private String username;
	private Integer followers = 0;
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
}
