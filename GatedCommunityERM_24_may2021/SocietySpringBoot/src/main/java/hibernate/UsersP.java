package hibernate;

import java.util.List;

public class UsersP 
{
	private int id;
	private String uid;
	private Name name;
	
	private ProfilePhoto profile_pathname;
	
	private List<UserEmailP> emails;
	
	private List<UserMobileP> mobile_no;
			
	private List<UserDocumentsP> documents;
	
	private List<UserVehiclesP> vehicles;
	
	private List<GateUsersP> gateusers;

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

	public List<UserEmailP> getEmails() {
		return emails;
	}

	public void setEmails(List<UserEmailP> emails) {
		this.emails = emails;
	}

	public List<UserMobileP> getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(List<UserMobileP> mobile_no) {
		this.mobile_no = mobile_no;
	}

	public List<UserDocumentsP> getDocuments() {
		return documents;
	}

	public void setDocuments(List<UserDocumentsP> documents) {
		this.documents = documents;
	}

	public List<UserVehiclesP> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<UserVehiclesP> vehicles) {
		this.vehicles = vehicles;
	}

	public List<GateUsersP> getGateusers() {
		return gateusers;
	}

	public void setGateusers(List<GateUsersP> gateusers) {
		this.gateusers = gateusers;
	}
	
	
}
