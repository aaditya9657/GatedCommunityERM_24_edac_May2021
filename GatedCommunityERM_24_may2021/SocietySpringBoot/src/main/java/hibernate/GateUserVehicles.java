package hibernate;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.*;

@Entity(name="soc_gateuservehicles")
@Table(name="soc_gateuservehicles")
public class GateUserVehicles 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private Time in_time;
	
	@Column(nullable=false)
	private Time out_time;
	
	@ManyToOne
	private UserVehicles user_vehicle;
	
	@ManyToOne
	private Societies society;
	
	private Date in_date;
	
	@Column(nullable=false)
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

	public UserVehicles getUser_vehicle() {
		return user_vehicle;
	}

	public void setUser_vehicle(UserVehicles user_vehicle) {
		this.user_vehicle = user_vehicle;
	}

	public Societies getSociety() {
		return society;
	}

	public void setSociety(Societies society) {
		this.society = society;
	}

	public int getId() {
		return id;
	}

	public GateUserVehiclesP toPOJO()
	{
		GateUserVehiclesP guvp = new GateUserVehiclesP();
		guvp.setId(id);
		guvp.setIn_date(in_date);
		guvp.setIn_time(in_time);
		guvp.setOut_date(out_date);
		guvp.setOut_time(out_time);
		return guvp;
	}
	
}