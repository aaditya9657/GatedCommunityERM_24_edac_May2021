package hibernate;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;

public class NoticesP 
{
	private int id;
	
	private Date date_of_creation;
	
	private Date date_of_expiry;
	
	private Date date_of_issue;
	
	private Time time_of_creation;
	
	private Time time_of_expiry;
	
	private Time time_of_issue;
		
	private String subject;
	
	private String content;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	
}
