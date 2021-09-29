package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="user_email")
@Table(name="user_email")
public class UserEmail 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false,unique=true)
	private String email;
	
	@Column(nullable=false)
	private boolean is_primary;
	
	@ManyToOne 
	private Users user;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isIs_primary() {
		return is_primary;
	}

	public void setIs_primary(boolean is_primary) {
		this.is_primary = is_primary;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}
	
	public UserEmailP toPOJO()
	{
		UserEmailP jue=new UserEmailP();
		jue.setEmail(email);
		jue.setId(id);
		jue.setIs_primary(is_primary);
		return jue;
	}
}