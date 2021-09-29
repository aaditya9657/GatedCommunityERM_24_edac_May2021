package microservices;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.Messages;
import hibernate.UserVehicles;
import hibernate.Users;

public class DBMessages 
{
	public boolean createMessages(Session s, Messages message,Users user_to,Users user_from)
	{
		Transaction t = s.beginTransaction();
		try
		{
			message.setUser_to(user_to);
			message.setUser_from(user_from);
			s.save(message);
			t.commit();
			return true;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean deleteMessages(Session s, Messages message)
	{
		Transaction t = s.beginTransaction();
		try
		{
			message.setUser_to(null);
			message.setUser_from(null);
			s.update(message);
			s.delete(message);
			t.commit();
			return true;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return false;
	}
	
	public List<Messages> readMessages(Session s, int user_to, int user_from)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from messages as a where a.user_to.id=:c and a.user_from.id=:d");
			q.setParameter("c", user_to);
			q.setParameter("d", user_from);
			List<Messages> list=q.list();
			t.commit();
			Messages message=null;
			for(Messages u:list)
			{
				message=u;
			}
			return list;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return null;
	}
	
	
}
