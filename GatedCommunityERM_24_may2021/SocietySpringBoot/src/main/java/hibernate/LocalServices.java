package hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity(name="local_services")
@Table(name="local_services")
public class LocalServices 
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
	
	@Column(nullable=false)
	private String types;
	
	@OneToMany(mappedBy="local_service")
	private List<LocalServicesEmail> emails;
	
	@OneToMany(mappedBy="local_service")
	private List<LocalServicesMobile> mobiles;
	
	private String registration_no;
	
	private String VehicleType;

	@OneToMany(mappedBy="local_service")
	private List<LocalServicesDocuments> documents;
	
	@ManyToMany
	private List<Houses> houses;
	
	@ManyToMany
	private List<Societies> societies;
	
	@OneToMany(mappedBy="local_service")
	private List<GateLocalServices> gatelocalservices;

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

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public List<LocalServicesEmail> getEmails() {
		return emails;
	}

	public List<LocalServicesMobile> getMobiles() {
		return mobiles;
	}
	
	public List<LocalServicesDocuments> getDocuments() {
		return documents;
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

	public List<GateLocalServices> getGatelocalservices() {
		return gatelocalservices;
	}

	public void setGatelocalservices(List<GateLocalServices> gatelocalservices) {
		this.gatelocalservices = gatelocalservices;
	}
	
	public void addGatelocalservices(GateLocalServices value) {
		
		if(this.gatelocalservices==null)
		{
			this.gatelocalservices = new ArrayList();
		}
		this.gatelocalservices.add(value);
	}

	public int getId() {
		return id;
	}

	public String getRegistration_no() {
		return registration_no;
	}

	public void setRegistration_no(String registration_no) {
		this.registration_no = registration_no;
	}

	

	public String getVehicleType() {
		return VehicleType;
	}

	public void setVehicleType(String vehicleType) {
		VehicleType = vehicleType;
	}

	public void setEmails(List<LocalServicesEmail> emails) {
		this.emails = emails;
	}

	public void setMobiles(List<LocalServicesMobile> mobiles) {
		this.mobiles = mobiles;
	}

	public void setDocuments(List<LocalServicesDocuments> documents) {
		this.documents = documents;
	}
	

	public LocalServicesP toPOJO()
	{
		LocalServicesP jls=new LocalServicesP();
		jls.setId(id);
		jls.setName(name);
		jls.setRegistration_no(registration_no);
		jls.setTypes(types);
		jls.setUid(uid);
		jls.setVehicleType(VehicleType);
		jls.setProfile_pathname(profile_pathname);
		
		List<LocalServicesEmailP> le=new ArrayList();
		for(LocalServicesEmail lse:this.emails)
		{
			le.add(lse.toPOJO());
		}
		jls.setEmails(le);
		
		List<LocalServicesMobileP> lm=new ArrayList();
		for(LocalServicesMobile lsm:this.mobiles)
		{
			lm.add(lsm.toPOJO());
		}
		jls.setMobiles(lm);
		
		List<LocalServicesDocumentsP> ld=new ArrayList();
		for(LocalServicesDocuments lsd:this.documents)
		{
			ld.add(lsd.toPOJO());
		}
		jls.setDocuments(ld);
		
		List<GateLocalServicesP> glsp=new ArrayList();
		for(GateLocalServices gls:this.gatelocalservices)
		{
			glsp.add(gls.toPOJO());
		}
		jls.setGatelocalservices(glsp);
		return jls;
		
	}
	
}