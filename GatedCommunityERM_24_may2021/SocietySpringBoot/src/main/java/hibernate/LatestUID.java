package hibernate;

import java.sql.Date;

import javax.persistence.*;


@Entity(name="latest_uid_sequence")
@Table(name="latest_uid_sequence")
public class LatestUID 
{
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false,unique=true)
	private Date date;
	
	@Column(nullable=false)
	private int latest_uid;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getLatest_uid() {
		return latest_uid;
	}

	public void setLatest_uid(int latest_uid) {
		this.latest_uid = latest_uid;
	}

	public int getId() {
		return id;
	}
	
	
}