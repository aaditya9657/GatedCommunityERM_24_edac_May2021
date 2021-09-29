package hibernate;

import javax.persistence.Column;

public class ProfilePhoto 
{
	@Column(name="profile_pathname" ,unique=true)
	private String path_name;

	public String getPath_name() {
		return path_name;
	}

	public void setPath_name(String path_name) {
		this.path_name = path_name;
	}
	
	
}