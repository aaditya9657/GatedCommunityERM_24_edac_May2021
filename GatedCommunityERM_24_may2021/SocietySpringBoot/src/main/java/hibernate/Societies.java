package hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity(name="societies")
@Table(name="societies")
public class Societies 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private String name;
	
	@Embedded
	private Address address;

	@ManyToMany(mappedBy="societies")
	private List<Users> users;
	
	@OneToMany(mappedBy="society")
	private List<Houses> houses;
	
	@ManyToMany(mappedBy="societies")
	private List<LocalServices> local_services;
	
	@OneToMany(mappedBy="society")
	private List<EmergencyContacts> emergency_contacts;
	
	@OneToMany(mappedBy="society")
	private List<MaintenanceType> maintenance_types;
	
	@OneToMany(mappedBy="society")
	private List<Notices> notices;
	
	@OneToMany(mappedBy="society")
	private List<UserVehicles> user_vehicles;
	
	@OneToMany(mappedBy="society")
	private List<GateLocalServices> gate_local_services;
	
	@OneToMany(mappedBy="society")
	private List<GateUsers> gate_users;
	
	@OneToMany(mappedBy="society")
	private List<GateUserVehicles> gate_user_vehicles;
	
	@OneToMany(mappedBy="society")
	private List<Committee> committee;

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

	public List<Users> getUsers() {
		return users;
	}

	public List<Houses> getHouses() {
		return houses;
	}

	public List<LocalServices> getLocal_services() {
		return local_services;
	}

	public List<EmergencyContacts> getEmergency_contacts() {
		return emergency_contacts;
	}

	public List<MaintenanceType> getMaintenance_types() {
		return maintenance_types;
	}

	public List<Notices> getNotices() {
		return notices;
	}

	public List<UserVehicles> getUser_vehicles() {
		return user_vehicles;
	}
	
	public List<GateLocalServices> getGate_local_services() {
		return gate_local_services;
	}

	public List<GateUsers> getGate_users() {
		return gate_users;
	}

	public List<GateUserVehicles> getGate_user_vehicles() {
		return gate_user_vehicles;
	}

	public List<Committee> getCommittee() {
		return committee;
	}

	public int getId() {
		return id;
	}

	public SocietiesP toPOJO()
	{
		SocietiesP sp=new SocietiesP();
		sp.setAddress(address);
		sp.setId(id);
		sp.setName(name);
		
		List<UsersP> up=new ArrayList();
		for(Users u:this.users)
		{
			up.add(u.toPOJO());
		}
		sp.setUsers(up);
		
		List<HousesP> hp=new ArrayList();
		for(Houses h:this.houses)
		{
			hp.add(h.toPOJO());
		}
		sp.setHouses(hp);
		
		List<LocalServicesP> lsp=new ArrayList();
		for(LocalServices ls:this.local_services)
		{
			lsp.add(ls.toPOJO());
		}
		sp.setLocal_services(lsp);
		
		List<EmergencyContactsP> ecp=new ArrayList();
		for(EmergencyContacts ec:this.emergency_contacts)
		{
			ecp.add(ec.toPOJO());
		}
		sp.setEmergency_contacts(ecp);
		
		List<MaintenanceTypeP> mtp=new ArrayList();
		for(MaintenanceType mt:this.maintenance_types)
		{
			mtp.add(mt.toPOJO());
		}
		sp.setMaintenance_types(mtp);
		
		List<NoticesP> np=new ArrayList();
		for(Notices n:this.notices)
		{
			np.add(n.toPOJO());
		}
		sp.setNotices(np);
		
		List<UserVehiclesP> uvp=new ArrayList();
		for(UserVehicles uv:this.user_vehicles)
		{
			uvp.add(uv.toPOJO());
		}
		sp.setUser_vehicles(uvp);
		
		List<GateLocalServicesP> gls=new ArrayList();
		for(GateLocalServices gl:this.gate_local_services)
		{
			gls.add(gl.toPOJO());
		}
		sp.setGate_local_services(gls);
		
		List<GateUsersP> gup=new ArrayList();
		for(GateUsers g:this.gate_users)
		{
			gup.add(g.toPOJO());
		}
		sp.setGate_users(gup); 
		
		List<GateUserVehiclesP> gvp=new ArrayList();
		for(GateUserVehicles gv:this.gate_user_vehicles)
		{
			gvp.add(gv.toPOJO());
		}
		sp.getGate_user_vehicles();
		
		List<CommitteeP> cp=new ArrayList();
		for(Committee c:this.committee)
		{
			cp.add(c.toPOJO());
		}
		sp.setCommittee(cp);
		
		return sp;
	}
}