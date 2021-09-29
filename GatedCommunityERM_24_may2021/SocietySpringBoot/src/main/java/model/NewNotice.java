package model;

import java.sql.Date;
import java.util.List;

import hibernate.Houses;
import hibernate.HousesP;
import hibernate.Societies;
import hibernate.SocietiesP;

public class NewNotice 
{
	private Date start_date;
	private Date expiry_date; 
	private String subject;
	private String content;
	private int soc_id;
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
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
	public int getSoc_id() {
		return soc_id;
	}
	public void setSoc_id(int soc_id) {
		this.soc_id = soc_id;
	}
	@Override
	public String toString() {
		return "NewNotice [start_date=" + start_date + ", expiry_date=" + expiry_date + ", subject=" + subject
				+ ", content=" + content + ", soc_id=" + soc_id + "]";
	}
	
	

}
