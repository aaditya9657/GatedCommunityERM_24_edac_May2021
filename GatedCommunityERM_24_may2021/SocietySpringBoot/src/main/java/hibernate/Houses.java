package hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity(name="soc_houses")
@Table(name="soc_Houses")
public class Houses 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private int flat_no;
	
	@Column(nullable=false)
	private String wing;

	@ManyToOne
	private Societies society;
	
	@ManyToMany(mappedBy="houses")
	private List<Users> users;
	
	@OneToMany(mappedBy="house")
	private List<UserVehicles> vehicles;
	
	@ManyToMany(mappedBy="houses")
	private List<LocalServices> local_services;
	
	@ManyToMany(mappedBy="houses")
	private List<Visitors> visitors;
	
	@ManyToMany(mappedBy="houses")
	private List<Notices> notices;
	
	@OneToMany(mappedBy="house")
	private List<Maintenance> maintenance;

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

	public Societies getSociety() {
		return society;
	}

	public void setSociety(Societies society) {
		this.society = society;
	}

	public List<Users> getUsers() {
		return users;
	}

	public List<UserVehicles> getVehicles() {
		return vehicles;
	}

	public List<LocalServices> getLocal_services() {
		return local_services;
	}

	public List<Visitors> getVisitors() {
		return visitors;
	}

	public List<Notices> getNotices() {
		return notices;
	}

	public List<Maintenance> getMaintenance() {
		return maintenance;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Houses [id=" + id + ", flat_no=" + flat_no + ", wing=" + wing + ", society=" + society + ", users="
				+ users + ", vehicles=" + vehicles + ", local_services=" + local_services + ", visitors=" + visitors
				+ ", notices=" + notices + ", maintenance=" + maintenance + "]";
	}

	public HousesP toPOJO()
	{
		HousesP jh=new HousesP();
		jh.setFlat_no(flat_no);
		jh.setId(id);
		jh.setWing(wing);
		
		List<UsersP> up=new ArrayList();
		for(Users u:this.users)
		{
			up.add(u.toPOJO());
		}
		jh.setUsers(up);
		
		List<LocalServicesP> lsp = new ArrayList();
		for(LocalServices ls: this.local_services)
		{
			lsp.add(ls.toPOJO());
		}
		jh.setLocal_services(lsp);
		
		List<VisitorsP> vp = new ArrayList();
		for(Visitors v: this.visitors)
		{
			vp.add(v.toPOJO());
		}
		jh.setVisitors(vp);
		
		List<UserVehiclesP> uvp = new ArrayList();
		for(UserVehicles uv: this.vehicles)
		{
			uvp.add(uv.toPOJO());
		}
		jh.setVehicles(uvp);
		
		List<NoticesP> np = new ArrayList();
		for(Notices n: this.notices)
		{
			np.add(n.toPOJO());
		}
		jh.setNotices(np);
		
		List<MaintenanceP> mp = new ArrayList();
		for(Maintenance m: this.maintenance)
		{
			mp.add(m.toPOJO());
		}
		jh.setMaintenance(mp);
		
		return jh;
	}
	
}