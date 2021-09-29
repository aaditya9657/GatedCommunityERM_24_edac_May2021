package hibernate;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.*;

@Entity(name="messages")
@Table(name="messages")
public class Messages 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private Time time_sent;
	
	@Column(nullable=false)
	private Time time_received;
	
	@Column(nullable=false)
	private Date date_sent;
	
	@Column(nullable=false)
	private Date date_received;
	
	@Column(nullable=false)
	private String message;
	
	@ManyToOne
	private Users user_to;
	
	@ManyToOne
	private Users user_from;

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

	public Users getUser_to() {
		return user_to;
	}

	public void setUser_to(Users user_to) {
		this.user_to = user_to;
	}

	public Users getUser_from() {
		return user_from;
	}

	public void setUser_from(Users user_from) {
		this.user_from = user_from;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Messages [id=" + id + ", time_sent=" + time_sent + ", time_received=" + time_received + ", date_sent="
				+ date_sent + ", date_received=" + date_received + ", message=" + message + ", user_to=" + user_to
				+ ", user_from=" + user_from + "]";
	}
	
//	public Messages toPOJO()
//	{
//		JMessages jm=new JMessages();
//		jm.setDate_received(date_received);
//		jm.setDate_sent(date_sent);
//		jm.setId(id);
//		jm.setMessage(message);
//		jm.setTime_received(time_received);
//		jm.setTime_sent(time_sent);
//		return jm;
//	}
}