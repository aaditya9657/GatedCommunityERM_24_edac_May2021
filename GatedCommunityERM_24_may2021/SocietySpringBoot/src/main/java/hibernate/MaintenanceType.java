package hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="soc_maintenance_type")
@Table(name="soc_maintenance_type")
public class MaintenanceType 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private String type;
	
	@OneToMany(mappedBy="maintenance_type")
	private List<Maintenance> maintenance;
	
	@ManyToOne
	private Societies society;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Maintenance> getMaintenance() {
		return maintenance;
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
		return "MaintenanceType [id=" + id + ", type=" + type +"]";
	}
	
	public MaintenanceTypeP toPOJO()
	{
		MaintenanceTypeP mtp=new MaintenanceTypeP();
		mtp.setId(id);
		mtp.setType(type);
		return mtp;
	}
}