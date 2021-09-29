package hibernate;

import java.sql.Date;
import java.sql.Time;

public class VisitorsP 
{
	private int id;
	
	private Name name;
	
	private ProfilePhoto profile_pic;
	
	private String reason;
	
	private String email_id;
	
	private long mob_no;
	
	private String registration_no; 
	
	private String Vehicletype;

	private Time in_time;
	
	private Time out_time;
	
	private Date in_date;
	
	private Date out_date;
	

	public Date getIn_date() {
		return in_date;
	}

	public void setIn_date(Date in_date) {
		this.in_date = in_date;
	}

	public Date getOut_date() {
		return out_date;
	}

	public void setOut_date(Date out_date) {
		this.out_date = out_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public ProfilePhoto getProfile_pic() {
		return profile_pic;
	}

	public void setProfile_pic(ProfilePhoto profile_pic) {
		this.profile_pic = profile_pic;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public long getMob_no() {
		return mob_no;
	}

	public void setMob_no(long mob_no) {
		this.mob_no = mob_no;
	}

	public String getRegistration_no() {
		return registration_no;
	}

	public void setRegistration_no(String registration_no) {
		this.registration_no = registration_no;
	}

	public String getVehicletype() {
		return Vehicletype;
	}

	public void setVehicletype(String vehicletype) {
		Vehicletype = vehicletype;
	}

	public Time getIn_time() {
		return in_time;
	}

	public void setIn_time(Time in_time) {
		this.in_time = in_time;
	}

	public Time getOut_time() {
		return out_time;
	}

	public void setOut_time(Time out_time) {
		this.out_time = out_time;
	}
}
