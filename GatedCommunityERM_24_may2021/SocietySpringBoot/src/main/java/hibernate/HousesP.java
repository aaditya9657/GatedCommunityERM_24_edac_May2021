package hibernate;

import java.util.List;

public class HousesP 
{
	private int id;
	
	private int flat_no;
	
	private String wing; 
	
	private List<UserVehiclesP> vehicles;
	
	private List<LocalServicesP> local_services;
	
	private List<VisitorsP> visitors;
	
	private List<NoticesP> notices;
	
	private List<MaintenanceP> maintenance;
	
	private List<UsersP> users;

	public List<UsersP> getUsers() {
		return users;
	}

	public void setUsers(List<UsersP> users) {
		this.users = users;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFlat_no() {
		return flat_no;
	}

	public void setFlat_no(int flat_no) {
		this.flat_no = flat_no;
	}

	public String getWing() {
		return wing;
	}

	public void setWing(String wing) {
		this.wing = wing;
	}

	public List<UserVehiclesP> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<UserVehiclesP> vehicles) {
		this.vehicles = vehicles;
	}

	public List<LocalServicesP> getLocal_services() {
		return local_services;
	}

	public void setLocal_services(List<LocalServicesP> local_services) {
		this.local_services = local_services;
	}

	public List<VisitorsP> getVisitors() {
		return visitors;
	}

	public void setVisitors(List<VisitorsP> visitors) {
		this.visitors = visitors;
	}

	public List<NoticesP> getNotices() {
		return notices;
	}

	public void setNotices(List<NoticesP> notices) {
		this.notices = notices;
	}

	public List<MaintenanceP> getMaintenance() {
		return maintenance;
	}

	public void setMaintenance(List<MaintenanceP> maintenance) {
		this.maintenance = maintenance;
	}
}
