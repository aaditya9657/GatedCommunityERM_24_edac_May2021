package hibernate;

import java.util.List;

public class LocalServicesP 
{
	private int id;
	
	private String uid;
	
	private Name name;
	
	private ProfilePhoto profile_pathname;
	
	private String types;
	
	private List<LocalServicesEmailP> emails;
	
	private List<LocalServicesMobileP> mobiles;
	
	private String registration_no;
	
	private String VehicleType;

	private List<LocalServicesDocumentsP> documents;
	
	private List<GateLocalServicesP> gatelocalservices;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public List<LocalServicesEmailP> getEmails() {
		return emails;
	}

	public void setEmails(List<LocalServicesEmailP> emails) {
		this.emails = emails;
	}

	public List<LocalServicesMobileP> getMobiles() {
		return mobiles;
	}

	public void setMobiles(List<LocalServicesMobileP> mobiles) {
		this.mobiles = mobiles;
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

	public List<LocalServicesDocumentsP> getDocuments() {
		return documents;
	}

	public void setDocuments(List<LocalServicesDocumentsP> documents) {
		this.documents = documents;
	}

	public List<GateLocalServicesP> getGatelocalservices() {
		return gatelocalservices;
	}

	public void setGatelocalservices(List<GateLocalServicesP> gatelocalservices) {
		this.gatelocalservices = gatelocalservices;
	}

}
