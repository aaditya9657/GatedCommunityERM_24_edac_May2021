package hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity(name="users")
@Table(name="users")
public class Users 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false,unique=true)
	private String uid;

	@Embedded
	private Name name;
	
	@Embedded
	private ProfilePhoto profile_pathname;
	
	@OneToMany(mappedBy="user")
	private List<UserEmail> emails;
	
	@OneToMany(mappedBy="user")
	private List<UserMobile> mobile_no;
	
	@ManyToMany
	private List<Societies> societies;
	
	@ManyToMany
	private List<Houses> houses;
	
	@OneToMany(mappedBy="user")
	private List<UserDocuments> documents;
	
	@OneToMany(mappedBy="user")
	private List<UserVehicles> vehicles;
	
	@OneToMany(mappedBy="user")
	private List<GateUsers> gateusers;
	
	@OneToMany(mappedBy="user")
	private List<Committee> committee;
	
	@OneToMany(mappedBy="user_from")
	private List<Messages> messages_sent; 
	
	@OneToMany(mappedBy="user_to")
	private List<Messages> messages_received;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public ProfilePhoto getProfile_pathname() {
		return profile_pathname;
	}

	public void setProfile_pathname(ProfilePhoto profile_pathname) {
		this.profile_pathname = profile_pathname;
	}

	public List<UserEmail> getEmails() {
		return emails;
	}

	public List<UserMobile> getMobile_no() {
		return mobile_no;
	}

	public List<Societies> getSocieties() {
		return societies;
	}

	public void setSocieties(List<Societies> societies) {
		this.societies = societies;
	}
	
	public void addSocieties(Societies value) {
		
		if(this.societies==null)
		{
			this.societies = new ArrayList();
		}
		this.societies.add(value);
	}

	public List<Houses> getHouses() {
		return houses;
	}

	public void setHouses(List<Houses> houses) {
		this.houses = houses;
	}
	
	public void addHouses(Houses value) {
		
		if(this.houses==null)
		{
			this.houses = new ArrayList();
		}
		this.houses.add(value);
	}

	public List<UserDocuments> getDocuments() {
		return documents;
	}

	public List<UserVehicles> getVehicles() {
		return vehicles;
	}

	public List<GateUsers> getGateusers() {
		return gateusers;
	}

	public List<Committee> getCommittee() {
		return committee;
	}

	public List<Messages> getMessages_sent() {
		return messages_sent;
	}

	public List<Messages> getMessages_received() {
		return messages_received;
	}

	public int getId() {
		return id;
	}

	public UsersP toPOJO()
	{
		UsersP ju=new UsersP();
		
		List<UserEmailP> jue= new ArrayList();
		for(UserEmail e:emails)
		{
			jue.add(e.toPOJO());
		}
		
		
		List<UserMobileP> jum= new ArrayList();
		for(UserMobile e:mobile_no)
		{
			jum.add(e.toPOJO());
		}
		
		List<UserDocumentsP> udp = new ArrayList();
		for(UserDocuments ud: this.documents)
		{
			udp.add(ud.toPOJO());
		}
		
		
		List<GateUsersP> gup = new ArrayList();
		for(GateUsers gu: this.gateusers)
		{
			gup.add(gu.toPOJO());
		}
		
		
		List<UserVehiclesP> uvp = new ArrayList();
		for(UserVehicles gu: this.vehicles)
		{
			uvp.add(gu.toPOJO());
		}
		
		
		ju.setId(id);
		ju.setName(name);
		ju.setUid(uid);
		ju.setVehicles(uvp);
		ju.setGateusers(gup);
		ju.setDocuments(udp);
		ju.setMobile_no(jum);
		ju.setEmails(jue);
		ju.setProfile_pathname(profile_pathname);
		return ju;
	}
	
}