package microservices;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.GateUsers;
import hibernate.Houses;
import hibernate.Notices;
import hibernate.Societies;
import hibernate.Users;

public class DBGateUsers 
{
	public boolean createGateUsers(Session s, GateUsers gu,Users user,Societies society)
	{
		Transaction t = s.beginTransaction();
		try
		{
			gu.setSociety(society);
			gu.setUser(user);
			s.save(gu);
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
	
	public boolean deleteGateUsers(Session s, GateUsers gu)
	{
		Transaction t = s.beginTransaction();
		try
		{
			gu.setSociety(null);
			gu.setUser(null);
			s.update(gu);
			s.delete(gu);
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
	
	public GateUsers readGateUserBySociety (Session s, int society_id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from soc_gateusers as a where a.society.id=:c");
			q.setParameter("c", society_id);
			List<GateUsers> list=q.list();
			t.commit();
			GateUsers gu=null;
			for(GateUsers u:list)
			{
				gu=u;
			}
			return gu;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return null;
	}
	
//
}
