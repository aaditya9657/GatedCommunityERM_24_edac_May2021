package microservices;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.GateUserVehicles;
import hibernate.Societies;
import hibernate.UserVehicles;
import hibernate.Visitors;

public class DBGateUserVehicles 
{
	public boolean createGateUserVehicles (Session s, GateUserVehicles  guv,UserVehicles user_vehicle,Societies society)
	{
		Transaction t = s.beginTransaction();
		try
		{
			guv.setSociety(society);
			guv.setUser_vehicle(user_vehicle);
			s.save(guv);
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
	

	public GateUserVehicles readGateUserVehiclesBySocieties (Session s, int society_id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from soc_gateuservehicles as a where a.society.id=:c");
			q.setParameter("c", society_id);
			List<GateUserVehicles> list=q.list();
			t.commit();
			GateUserVehicles guv=null;
			for(GateUserVehicles u:list)
			{
				guv=u;
			}
			return guv;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return null;
	}
}
