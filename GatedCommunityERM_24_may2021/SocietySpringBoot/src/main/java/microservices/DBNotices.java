package microservices;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.Houses;
import hibernate.Notices;
import hibernate.Societies;


public class DBNotices 
{
	public boolean createNotices(Session s, Notices n, List<Houses> house,Societies society)
	{
		Transaction t = s.beginTransaction();
		try
		{
			n.setSociety(society);
			n.setHouses(house);
			s.save(n);
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
	
	public Notices readNoticesBysociety(Session s, int society_id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from soc_notices as a where a.society.id=:c");
			q.setParameter("c", society_id);
			List<Notices> list=q.list();
			t.commit();
			Notices n=null;
			for(Notices u:list)
			{
				n=u;
			}
			return n;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Notices> readNoticesByHouses(Session s, int house_id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from soc_notices as a join a.houses as b where b.id=:c");
			q.setParameter("c", house_id);
			List<Notices> list=q.list();
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
