package microservices;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.EmergencyContacts;
import hibernate.MaintenanceType;
import hibernate.Societies;
import hibernate.Users;

public class DBMaintenanceType 
{
	public boolean createMaintenanceType(Session s, MaintenanceType mt,Societies society)
	{
		Transaction t = s.beginTransaction();
		try
		{
			mt.setSociety(society);
			s.save(mt);
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
	
	public MaintenanceType  readMaintenanceType (Session s, int maintenancetype_id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from soc_maintenance_type as a where a.id=:c");
			q.setParameter("c", maintenancetype_id);
			List<MaintenanceType > list=q.list();
			t.commit();
			MaintenanceType mt=null;
			for(MaintenanceType  u:list)
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
	
	public List<MaintenanceType> readMaintenanceTypeBySociety(Session s, int society_id )
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from soc_maintenance_type as a where a.society.id=:c");
			q.setParameter("c", society_id);
			List<MaintenanceType> list=q.list();
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
	
	public boolean updateMaintenanceType(Session s, MaintenanceType mt)
	{
		Transaction t = s.beginTransaction();
		try
		{
			s.update(mt);
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
