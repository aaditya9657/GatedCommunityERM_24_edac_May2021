package hibernate;

import java.util.List;

public class SocietiesP
{
	private int id;
	
	private String name;
	
	private Address address;

	private List<UsersP> users;
	
	private List<HousesP> houses;
	
	private List<LocalServicesP> local_services;
	
	private List<EmergencyContactsP> emergency_contacts;
	
	private List<MaintenanceTypeP> maintenance_types;
	
	private List<NoticesP> notices;
	
	private List<UserVehiclesP> user_vehicles;
	
	private List<GateLocalServicesP> gate_local_services;
	
	private List<GateUsersP> gate_users;
	
	private List<GateUserVehiclesP> gate_user_vehicles;
	
	private List<CommitteeP> committee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<UsersP> getUsers() {
		return users;
	}

	public void setUsers(List<UsersP> users) {
		this.users = users;
	}

	public List<HousesP> getHouses() {
		return houses;
	}

	public void setHouses(List<HousesP> houses) {
		this.houses = houses;
	}

	public List<LocalServicesP> getLocal_services() {
		return local_services;
	}

	public void setLocal_services(List<LocalServicesP> local_services) {
		this.local_services = local_services;
	}

	public List<EmergencyContactsP> getEmergency_contacts() {
		return emergency_contacts;
	}

	public void setEmergency_contacts(List<EmergencyContactsP> emergency_contacts) {
		this.emergency_contacts = emergency_contacts;
	}

	public List<MaintenanceTypeP> getMaintenance_types() {
		return maintenance_types;
	}

	public void setMaintenance_types(List<MaintenanceTypeP> maintenance_types) {
		this.maintenance_types = maintenance_types;
	}

	public List<NoticesP> getNotices() {
		return notices;
	}

	public void setNotices(List<NoticesP> notices) {
		this.notices = notices;
	}

	public List<UserVehiclesP> getUser_vehicles() {
		return user_vehicles;
	}

	public void setUser_vehicles(List<UserVehiclesP> user_vehicles) {
		this.user_vehicles = user_vehicles;
	}

	public List<GateLocalServicesP> getGate_local_services() {
		return gate_local_services;
	}

	public void setGate_local_services(List<GateLocalServicesP> gate_local_services) {
		this.gate_local_services = gate_local_services;
	}

	public List<GateUsersP> getGate_users() {
		return gate_users;
	}

	public void setGate_users(List<GateUsersP> gate_users) {
		this.gate_users = gate_users;
	}

	public List<GateUserVehiclesP> getGate_user_vehicles() {
		return gate_user_vehicles;
	}

	public void setGate_user_vehicles(List<GateUserVehiclesP> gate_user_vehicles) {
		this.gate_user_vehicles = gate_user_vehicles;
	}

	public List<CommitteeP> getCommittee() {
		return committee;
	}

	public void setCommittee(List<CommitteeP> committee) {
		this.committee = committee;
	}
}
