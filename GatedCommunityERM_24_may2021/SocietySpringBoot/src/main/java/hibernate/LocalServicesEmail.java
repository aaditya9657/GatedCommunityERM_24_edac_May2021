package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="local_services_email")
@Table(name="local_services_email")
public class LocalServicesEmail 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false,unique=true)
	private String email;
	
	@Column(nullable=false)
	private boolean is_primary;
	
	@ManyToOne 
	private LocalServices local_service;

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

	public LocalServices getLocal_service() {
		return local_service;
	}

	public void setLocal_service(LocalServices local_service) {
		this.local_service = local_service;
	}

	public int getId() {
		return id;
	}

	public LocalServicesEmailP toPOJO()
	{
		LocalServicesEmailP lsep=new LocalServicesEmailP();
		lsep.setEmail(email);
		lsep.setId(id);
		lsep.setIs_primary(is_primary);
		return lsep;
	}
	
}