package hibernate;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.*;

@Entity(name="soc_gateusers")
@Table(name="soc_gateusers")
public class GateUsers 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private Time in_time;
	
	@Column(nullable=false)
	private Time out_time;
	
	@ManyToOne
	private Users user;
	
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

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
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

	public GateUsersP toPOJO()
	{
		GateUsersP gup = new GateUsersP();
		gup.setId(id);
		gup.setIn_date(in_date);
		gup.setIn_time(in_time);
		gup.setOut_date(out_date);
		gup.setOut_time(out_time);
		return gup;
	}
}