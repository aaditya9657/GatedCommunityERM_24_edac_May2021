package hibernate;

import javax.persistence.*;

@Entity(name="soc_emergency_contacts")
@Table(name="soc_emergency_contacts")
public class EmergencyContacts 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private long contact_no;
	
	@ManyToOne
	private Societies society;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact_no() {
		return contact_no;
	}

	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
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

	@Override
	public String toString() {
		return "EmergencyContacts [id=" + id + ", name=" + name + ", contact_no=" + contact_no + ", society=" + society
				+ "]";
	}
	
	public EmergencyContactsP toPOJO()
	{
		EmergencyContactsP ec=new EmergencyContactsP();
		ec.setContact_no(contact_no);
		ec.setId(id);
		ec.setName(name);
		return ec;
	}
	
}
