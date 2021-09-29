package microservices;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import hibernate.UserEmail;
import hibernate.UserMobile;
import hibernate.Users;

public class DBUserMobile
{
	public boolean createUserMobile(Session s, UserMobile user_mobile,Users user)
	{
		Transaction t = s.beginTransaction();
		try
		{
			user_mobile.setUser(user);
			s.save(user_mobile);
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
	
	public boolean deleteUserMobile(Session s, UserMobile user_mobile)
	{
		Transaction t = s.beginTransaction();
		try
		{
			s.delete(user_mobile);
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
	
	public UserMobile readUserMobile(Session s, int mobile_id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from user_mobile as a where a.id=:c");
			q.setParameter("c", mobile_id);
			List<UserMobile> list=q.list();
			t.commit();
			UserMobile user_mobile=null;
			for(UserMobile u:list)
			{
				user_mobile=u;
			}
			return user_mobile;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return null;
	}
	public UserMobile readUserMobile(Session s, long mob_no)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from user_mobile as a where a.mob_no=:c");
			q.setParameter("c", mob_no);
			List<UserMobile> list=q.list();
			t.commit();
			UserMobile user_mobile=null;
			for(UserMobile u:list)
			{
				user_mobile=u;
			}
			return user_mobile;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return null;
	}
	
	public List<UserMobile> readUserMobileByUser(Session s, int user_id )
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from user_mobile as a where a.user.id=:c");
			q.setParameter("c", user_id);
			List<UserMobile> list=q.list();
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
