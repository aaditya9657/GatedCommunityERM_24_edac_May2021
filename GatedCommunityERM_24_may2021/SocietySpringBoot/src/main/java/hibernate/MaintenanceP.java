package hibernate;

import java.sql.Date;

public class MaintenanceP
{
	private int id;
	
	private Date begin_date;
	
	private Date end_date;
	
	private double cost;

	private MaintenanceTypeP maintenance_type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public MaintenanceTypeP getMaintenance_type() {
		return maintenance_type;
	}

	public void setMaintenance_type(MaintenanceTypeP maintenance_type) {
		this.maintenance_type = maintenance_type;
	} 
}
