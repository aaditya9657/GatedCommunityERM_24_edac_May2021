package hibernate;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity(name="soc_visitors")
@Table(name="soc_visitors")
public class Visitors 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Embedded
	private Name name;
	
	@Embedded
	private ProfilePhoto profile_pic;
	
	@Column(nullable=false)
	private String reason;
	
	private String email_id;
	
	private long mob_no;
	
	private String registration_no; 
	
	private String Vehicletype;

	@Column(nullable=false)
	private Time in_time;
	
	private Time out_time;
	
	@Column(nullable=false)
	private Date in_date;
	
	private Date out_date;
	
	@ManyToMany
	private List<Houses> houses;
	
	public void addHouses(Houses value) 
	{
		
		if(this.houses==null)
		{
			this.houses = new ArrayList();
		}
		this.houses.add(value);
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

	public List<Houses> getHouses() {
		return houses;
	}

	public void setHouses(List<Houses> houses) {
		this.houses = houses;
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

	public VisitorsP toPOJO()
	{
		VisitorsP jv=new VisitorsP();
		jv.setEmail_id(email_id);
		jv.setId(id);
		jv.setIn_time(in_time);
		jv.setMob_no(mob_no);
		jv.setName(name);
		jv.setOut_time(out_time);
		jv.setReason(reason);
		jv.setRegistration_no(registration_no);
		jv.setVehicletype(Vehicletype);
		jv.setProfile_pic(profile_pic);
		jv.setIn_date(in_date);
		jv.setOut_date(out_date);
		return jv;
		
	}
	
	
	

}