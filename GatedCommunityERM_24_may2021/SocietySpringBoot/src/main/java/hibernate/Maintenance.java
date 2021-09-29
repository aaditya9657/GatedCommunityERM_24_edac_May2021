package hibernate;

import java.sql.Date;

import javax.persistence.*;

@Entity(name="soc_maintenance")
@Table(name="soc_maintenance")
public class Maintenance 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private Date begin_date;
	
	@Column(nullable=false)
	private Date end_date;
	
	@Column(nullable=false)
	private double cost;

	@ManyToOne
	private MaintenanceType maintenance_type; 
	
	@ManyToOne
	private Houses house;

	public Date getBegin_date() {
		return begin_date;
	}

	public void setBegin_date(Date begin_date) {
		this.begin_date = begin_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public MaintenanceType getMaintenance_type() {
		return maintenance_type;
	}

	public void setMaintenance_type(MaintenanceType maintenance_type) {
		this.maintenance_type = maintenance_type;
	}

	public Houses getHouse() {
		return house;
	}

	public void setHouse(Houses house) {
		this.house = house;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Maintenance [id=" + id + ", begin_date=" + begin_date + ", end_date=" + end_date + ", cost=" + (int)cost
				+ ", maintenance_type=" + maintenance_type + ", house=" + house + "]";
	}
	
	
	public MaintenanceP toPOJO()
	{
		MaintenanceP jm=new MaintenanceP();
		jm.setBegin_date(begin_date);
		jm.setCost(cost);
		jm.setEnd_date(end_date);
		jm.setId(id);
		jm.setMaintenance_type(maintenance_type.toPOJO());
		return jm;
	}
}