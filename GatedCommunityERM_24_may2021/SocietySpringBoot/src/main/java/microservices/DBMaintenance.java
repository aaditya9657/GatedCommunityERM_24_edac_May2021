package microservices;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.*;

public class DBMaintenance 
{
	public boolean createMaintenance(Session s, Maintenance m,MaintenanceType mt, Houses house)
	{
		Transaction t = s.beginTransaction();
		try
		{
			m.setMaintenance_type(mt);
			m.setHouse(house);
			System.out.println(s.save(m));
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
	
	public Maintenance  readMaintenance (Session s, int maintenance_id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from soc_maintenance as a where a.id=:c");
			q.setParameter("c", maintenance_id);
			List<Maintenance > list=q.list();
			t.commit();
			Maintenance mt=null;
			for(Maintenance  u:list)
			{
				mt=u;
			}
			return mt;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Maintenance> readMaintenanceByHouse(Session s, int house_id )
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from soc_maintenance as a where a.house.id=:c");
			q.setParameter("c", house_id);
			List<Maintenance> list=q.list();
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
