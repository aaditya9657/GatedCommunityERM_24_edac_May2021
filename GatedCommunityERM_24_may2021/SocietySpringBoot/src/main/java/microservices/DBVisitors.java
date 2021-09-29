package microservices;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.*;

public class DBVisitors 
{
	public boolean createVisitors(Session s, Visitors v,List<Houses> h)
	{
		Transaction t = s.beginTransaction();
		try
		{
			v.setHouses(h);
			s.save(v);
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
	
	public Visitors  readVisitors (Session s, int visitors_id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from soc_visitors as a where a.id=:c");
			q.setParameter("c", visitors_id);
			List<Visitors > list=q.list();
			t.commit();
			Visitors v=null;
			for(Visitors  u:list)
			{
				v=u;
			}
			return v;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Visitors> readVisitorsByHouse(Session s, int house_id )
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from soc_visitors as a join a.houses as b where b.id=:c");
			q.setParameter("c", house_id);
			List<Visitors> list=q.list();
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
	
	public boolean updateVisitors(Session s, Visitors v)
	{
		Transaction t = s.beginTransaction();
		try
		{
			s.update(v);
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
	
}
