package hibernate;

public class CommitteeP 
{
	private int id;
	
	private String designation;
	
	private UsersP user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public UsersP getUser() {
		return user;
	}

	public void setUser(UsersP user) {
		this.user = user;
	}
}
