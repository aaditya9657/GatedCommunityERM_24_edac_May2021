package hibernate;

import javax.persistence.*;

@Entity(name="soc_committee")
@Table(name="soc_committee")
public class Committee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private String designation;
	
	@ManyToOne
	private Users user;
	
	@ManyToOne
	private Societies society;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Societies getSociety() {
		return society;
	}

	public void setSociety(Societies society) {
		this.society = society;
	}

	public int getId() {
		return id;
	}

	public CommitteeP toPOJO()
	{
		CommitteeP jc=new CommitteeP();
		jc.setDesignation(designation);
		jc.setId(id);
		jc.setUser(user.toPOJO());
		return jc;
	}
	
}