package microservices;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.*;

public class DBLocalServices
{
	public boolean createLocalServices(Session s,LocalServices ls,List<Houses> houses,List<Societies> societies)
	{
		String latest_uid = new ReadLatestUid().GetUid(s);
		Transaction t=s.beginTransaction();
		try
		{
			ls.setHouses(houses);
			ls.setSocieties(societies);
			ls.setUid(latest_uid);
			s.save(ls);
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
	
	public boolean updateLocalServices(Session s,LocalServices ls)
	{
		Transaction t=s.beginTransaction();
		try
		{
			s.update(ls);
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
	
	public LocalServices readLocalServices(Session s,String email)
	{
		Transaction t=s.beginTransaction();
		try
		{
			Query q=s.createQuery("select a from local_services as a join a.emails as b where b.email=:c");
			q.setParameter("c", email);
			List<LocalServices> list=q.list();
			t.commit();
			LocalServices ls=null;
			for(LocalServices u:list)
			{
				ls=u;
			}
			return ls;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return null;
	}
	
	public LocalServices readLocalServices(Session s,long mobile)
	{
		System.out.println(mobile);
		Transaction t=s.beginTransaction();
		try
		{
			Query q=s.createQuery("select a from local_services as a join a.mobiles as b where b.mob_no=:c");
			q.setParameter("c", mobile);
			List<LocalServices> list=q.list();
			t.commit();
			LocalServices ls=null;
			for(LocalServices u:list)
			{
				ls=u;
			}
			return ls;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return null;
	}
	
	public LocalServices readLocalServicesByUid(Session s,String uid)
	{
		Transaction t=s.beginTransaction();
		try
		{
			Query q=s.createQuery("from local_services as a where a.uid=:c");
			q.setParameter("c", uid);
			List<LocalServices> list=q.list();
			t.commit();
			LocalServices ls=null;
			for(LocalServices u:list)
			{
				ls=u;
			}
			return ls;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return null;
	}
	
	public LocalServices readLocalServices(Session s,int ls_id)
	{
		Transaction t=s.beginTransaction();
		try
		{
			Query q=s.createQuery("from local_services as a where a.id=:c");
			q.setParameter("c", ls_id);
			List<LocalServices> list=q.list();
			t.commit();
			LocalServices ls=null;
			for(LocalServices u:list)
			{
				ls=u;
			}
			return ls;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return null;
	}
	
	public List<LocalServices> readAllLocalServices(Session s)
	{
		Transaction t=s.beginTransaction();
		try
		{
			Query q=s.createQuery("from local_services");
			List<LocalServices> list=q.list();
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
	
	public List<LocalServices> readAllLocalServicesBySocieties(Session s,int soc_id)
	{
		Transaction t=s.beginTransaction();
		try
		{
			Query q=s.createQuery("select a from local_services as a join a.societies as b where b.id=:c");
			q.setParameter("c", soc_id);
			List<LocalServices> list=q.list();
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
	
	public List<LocalServices> readAllLocalServicesByHouses(Session s,int house_id)
	{
		Transaction t=s.beginTransaction();
		try
		{
			Query q=s.createQuery("select a from local_services as a join a.houses as b where b.id=:c");
			q.setParameter("c", house_id);
			List<LocalServices> list=q.list();
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
