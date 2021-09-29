package hibernate;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.*;

@Entity(name="soc_gatelocalservices")
@Table(name="soc_gatelocalservices")
public class GateLocalServices 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private Time in_time;
	private Time out_time;
	
	@Column(nullable=false)
	private Date in_date;
	private Date out_date;
	
	@ManyToOne
	private LocalServices local_service;
	
	@ManyToOne
	private Societies society;
	
	public Date getIn_date() 
	{
		return in_date;
	}

	public void setIn_date(Date in_date)
	{
		this.in_date = in_date;
	}

	public Date getOut_date() 
	{
		return out_date;
	}

	public void setOut_date(Date out_date) 
	{
		this.out_date = out_date;
	}

	public Time getIn_time() 
	{
		return in_time;
	}
	
	public void setIn_time(Time in_time) 
	{
		this.in_time = in_time;
	}

	public Time getOut_time() 
	{
		return out_time;
	}

	public void setOut_time(Time out_time) 
	{
		this.out_time = out_time;
	}

	public LocalServices getLocal_service() 
	{
		return local_service;
	}

	public void setLocal_service(LocalServices local_service) {
		this.local_service = local_service;
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

	
	public GateLocalServicesP toPOJO()
	{
		GateLocalServicesP jgls=new GateLocalServicesP();
		jgls.setIn_date(in_date);
		jgls.setIn_time(in_time);
		jgls.setOut_date(out_date);
		jgls.setOut_time(out_time);
		jgls.setId(id);
		return jgls;
	}
	
}