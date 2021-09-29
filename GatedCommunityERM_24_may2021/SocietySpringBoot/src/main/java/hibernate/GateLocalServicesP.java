package hibernate;

import java.sql.Date;
import java.sql.Time;

public class GateLocalServicesP 
{
	private int id;
	private Time in_time;
	private Time out_time;
	private Date in_date;
	private Date out_date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
}
