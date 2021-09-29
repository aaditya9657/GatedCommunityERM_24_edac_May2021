
package model;

import java.sql.Date;
import java.sql.Time;

public class Message implements Comparable<Message>
{
	private int id;
	private Time time_sent;
	private Time time_received;
	private Date date_sent;
	private Date date_received;
	private String message;
	private boolean isSent;
	
	public int compareTo(Message arg0) 
	{
		int res = this.date_sent.compareTo(arg0.date_sent);
		if(res<0)
		{
			return -1;
		}
		else if(res==0)
		{
			int res1 = this.time_sent.compareTo(arg0.time_sent);
			if(res1==0)
			{
				return 1;
			}
			return res1;
		}
		else
		{
			return 1;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Time getTime_sent() {
		return time_sent;
	}

	public void setTime_sent(Time time_sent) {
		this.time_sent = time_sent;
	}

	public Time getTime_received() {
		return time_received;
	}

	public void setTime_received(Time time_received) {
		this.time_received = time_received;
	}

	public Date getDate_sent() {
		return date_sent;
	}

	public void setDate_sent(Date date_sent) {
		this.date_sent = date_sent;
	}

	public Date getDate_received() {
		return date_received;
	}

	public void setDate_received(Date date_received) {
		this.date_received = date_received;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSent() {
		return isSent;
	}

	public void setSent(boolean isSent) {
		this.isSent = isSent;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", time_sent=" + time_sent + ", time_received=" + time_received + ", date_sent="
				+ date_sent + ", date_received=" + date_received + ", message=" + message + ", isSent=" + isSent + "]";
	}
	
	
}
