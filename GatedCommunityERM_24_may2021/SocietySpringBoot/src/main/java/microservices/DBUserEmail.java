package microservices;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import hibernate.UserEmail;
import hibernate.Users;

public class DBUserEmail
{
	public boolean createUserEmail(Session s, UserEmail user_email,Users user)
	{
		Transaction t = s.beginTransaction();
		try
		{
			user_email.setUser(user);
			s.save(user_email);
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
	
	public boolean deleteUserEmail(Session s, UserEmail user_email)
	{
		Transaction t = s.beginTransaction();
		try
		{
			s.delete(user_email);
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
	
	public UserEmail readUserEmail(Session s, String email)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from user_email as a where a.email=:c");
			q.setParameter("c", email);
			List<UserEmail> list=q.list();
			t.commit();
			UserEmail user_email=null;
			for(UserEmail u:list)
			{
				user_email=u;
			}
			return user_email;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return null;
	}
	
	
	public UserEmail readUserEmail(Session s, int email_id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from user_email as a where a.id=:c");
			q.setParameter("c", email_id);
			List<UserEmail> list=q.list();
			t.commit();
			UserEmail user_email=null;
			for(UserEmail u:list)
			{
				user_email=u;
			}
			return user_email;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return null;
	}
	
	public List<UserEmail> readUserEmailByUser(Session s, int user_id )
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from user_email as a where a.user.id=:c");
			q.setParameter("c", user_id);
			List<UserEmail> list=q.list();
			t.commit();
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
