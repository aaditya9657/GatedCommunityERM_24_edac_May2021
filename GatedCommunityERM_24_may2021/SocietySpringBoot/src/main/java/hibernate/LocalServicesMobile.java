package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="local_services_mobile")
@Table(name="local_services_mobile")
public class LocalServicesMobile 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(unique=true,nullable=false)
	private long mob_no;
	
	@ManyToOne
	private LocalServices local_service;

	@Column(nullable=false)
	private boolean is_primary;

	public long getMob_no() {
		return mob_no;
	}

	public void setMob_no(long mob_no) {
		this.mob_no = mob_no;
	}

	public LocalServices getLocal_service() {
		return local_service;
	}

	public void setLocal_service(LocalServices local_service) {
		this.local_service = local_service;
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

	public LocalServicesMobileP toPOJO()
	{
		LocalServicesMobileP lsmp=new LocalServicesMobileP();
		lsmp.setId(id);
		lsmp.setIs_primary(is_primary);
		lsmp.setMob_no(mob_no);
		return lsmp;
	}
}