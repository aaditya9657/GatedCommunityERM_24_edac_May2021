package microservices;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.EmergencyContacts;
import hibernate.Messages;
import hibernate.Societies;
import hibernate.UserVehicles;
import hibernate.Users;

public class DBEmergencyContacts 
{
	public boolean createEmergencyContacts(Session s, EmergencyContacts ec,Societies society)
	{
		Transaction t = s.beginTransaction();
		try
		{
			ec.setSociety(society);
			s.save(ec);
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
	
	public EmergencyContacts  readEmergencyContacts (Session s, int EmergencyContacts_id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from soc_emergency_contacts as a where a.id=:c");
			q.setParameter("c", EmergencyContacts_id);
			List<EmergencyContacts > list=q.list();
			t.commit();
			EmergencyContacts ec=null;
			for(EmergencyContacts  u:list)
			{
				ec=u;
			}
			return ec;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return null;
	}
	
	public List<EmergencyContacts> readEmergencyContactsBySociety(Session s, int society_id )
	{
		Transaction t=s.beginTransaction();
		try
		{
			Query q=s.createQuery("from soc_emergency_contacts as a where a.society.id=:c");
			q.setParameter("c", society_id);
			List<EmergencyContacts> list=q.list();
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
