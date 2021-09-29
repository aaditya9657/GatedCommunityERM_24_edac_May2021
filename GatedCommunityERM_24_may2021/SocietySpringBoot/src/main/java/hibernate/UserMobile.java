package hibernate;

import javax.persistence.*;

@Entity(name="user_mobile")
@Table(name="user_mobile")
public class UserMobile 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(unique=true,nullable=false)
	private long mob_no;
	
	@ManyToOne
	private Users user;

	@Column(nullable=false)
	private boolean is_primary;

	public long getMob_no() {
		return mob_no;
	}

	public void setMob_no(long mob_no) {
		this.mob_no = mob_no;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public boolean isIs_primary() {
		return is_primary;
	}

	public void setIs_primary(boolean is_primary) {
		this.is_primary = is_primary;
	}

	public int getId() {
		return id;
	}

	public UserMobileP toPOJO()
	{
		UserMobileP jum=new UserMobileP();
		jum.setId(id);
		jum.setIs_primary(is_primary);
		jum.setMob_no(mob_no);
		return jum;
	}
}