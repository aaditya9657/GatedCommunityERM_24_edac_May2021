package hibernate;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity(name="soc_notices")
@Table(name="soc_notices")
public class Notices 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private Date date_of_creation;
	
	@Column(nullable=false)
	private Date date_of_expiry;
	
	@Column(nullable=false)
	private Date date_of_issue;
	
	@Column(nullable=false)
	private Time time_of_creation;
	
	@Column(nullable=false)
	private Time time_of_expiry;
	
	@Column(nullable=false)
	private Time time_of_issue;
	
	@Column(nullable=false)
	private String subject;
	
	@Column(nullable=false,columnDefinition="TEXT")
	private String content;
	
	@ManyToMany
	private List<Houses> houses;
	
	@ManyToOne
	private Societies society;

	public Date getDate_of_creation() {
		return date_of_creation;
	}

	public void setDate_of_creation(Date date_of_creation) {
		this.date_of_creation = date_of_creation;
	}

	public Date getDate_of_expiry() {
		return date_of_expiry;
	}

	public void setDate_of_expiry(Date date_of_expiry) {
		this.date_of_expiry = date_of_expiry;
	}

	public Date getDate_of_issue() {
		return date_of_issue;
	}

	public void setDate_of_issue(Date date_of_issue) {
		this.date_of_issue = date_of_issue;
	}

	public Time getTime_of_creation() {
		return time_of_creation;
	}

	public void setTime_of_creation(Time time_of_creation) {
		this.time_of_creation = time_of_creation;
	}

	public Time getTime_of_expiry() {
		return time_of_expiry;
	}

	public void setTime_of_expiry(Time time_of_expiry) {
		this.time_of_expiry = time_of_expiry;
	}

	public Time getTime_of_issue() {
		return time_of_issue;
	}

	public void setTime_of_issue(Time time_of_issue) {
		this.time_of_issue = time_of_issue;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public Societies getSociety() {
		return society;
	}

	public void setSociety(Societies society) {
		this.society = society;
	}

	public int getId() {
		return id;
	}

	
	public NoticesP toPOJO()
	{
		NoticesP jn=new NoticesP();
		jn.setDate_of_creation(date_of_creation);
		jn.setDate_of_expiry(date_of_expiry);
		jn.setDate_of_issue(date_of_issue);
		jn.setId(id);
		jn.setTime_of_creation(time_of_creation);
		jn.setTime_of_expiry(time_of_expiry);
		jn.setTime_of_issue(time_of_issue);
		jn.setContent(content);
		jn.setSubject(subject);
		
		return jn;
		
	}
}
