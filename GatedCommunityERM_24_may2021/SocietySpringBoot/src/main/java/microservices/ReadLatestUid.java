package microservices;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import hibernate.LatestUID;

public class ReadLatestUid 
{
	private String addZeros(String uid)
	{
		String new_uid = "";
		int i;
		for(i=0;i<uid.length();i++)
		{
			new_uid = new_uid + uid.charAt(i);
		}
		for(;i<6;i++)
		{
			new_uid = "0" + new_uid;
		}
		return new_uid;
	}
	
	private String getCurrentDate()
	{
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");  
		 LocalDateTime now = LocalDateTime.now();  
		 return dtf.format(now);
	}
	
	public String GetUid(Session s)
	{
		Date curr_date = Date.valueOf(LocalDate.now());
		Transaction t=s.beginTransaction();
		Query query=s.createQuery("from latest_uid_sequence where date=:d");
		query.setParameter("d", curr_date);
		List<LatestUID> list=query.list();
		Iterator<LatestUID> itr=list.iterator();
		LatestUID latest_uid = null;
		while(itr.hasNext())
		{
			latest_uid = itr.next();
		}
		if(latest_uid!=null)
		{
			latest_uid.setLatest_uid(latest_uid.getLatest_uid()+1);
			s.update(latest_uid);
		}
		else
		{
			latest_uid = new LatestUID();
			latest_uid.setDate(curr_date);
			latest_uid.setLatest_uid(1);
			s.save(latest_uid);
		}
		
		String uid = "u_"+getCurrentDate() + addZeros(""+latest_uid.getLatest_uid());
		System.out.println();
		t.commit();
		return uid;
	}
}
