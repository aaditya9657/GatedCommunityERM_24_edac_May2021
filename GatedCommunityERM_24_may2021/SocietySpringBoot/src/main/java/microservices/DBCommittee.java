package microservices;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.Committee;
import hibernate.Societies;
import hibernate.Users;

public class DBCommittee
{
	public boolean createCommittee (Session s, Committee c, Users user,Societies society)
	{
		Transaction t = s.beginTransaction();
		try
		{
			c.setSociety(society);
			c.setUser(user);
			s.save(c);
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
	
	public boolean deleteCommittee (Session s, Committee c)
	{
		Transaction t = s.beginTransaction();
		try
		{
			c.setSociety(null);
			c.setUser(null);
			s.update(c);
			s.delete(c);
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
	
	public List<Committee> readCommitteeBySociety (Session s, int society_id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from soc_committee as a where a.society.id=:c");
			q.setParameter("c", society_id);
			List<Committee> list=q.list();
			t.commit();
			Committee c=null;
			for(Committee u:list)
			{
				c=u;
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
