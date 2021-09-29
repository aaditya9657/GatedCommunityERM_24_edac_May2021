package microservices;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.GateLocalServices;
import hibernate.LocalServices;
import hibernate.Societies;
import hibernate.Visitors;

public class DBGateLocalServices
{
	public boolean createGateLocalServices(Session s, GateLocalServices glc,LocalServices local_services,Societies society)
	{
		Transaction t = s.beginTransaction();
		try
		{
			glc.setSociety(society);
			glc.setLocal_service(local_services);
			s.save(glc);
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
	
	public List<GateLocalServices> readGateLocalServicesBySociety (Session s, int society_id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from soc_gatelocalservices as a where a.society.id=:c");
			q.setParameter("c", society_id);
			List<GateLocalServices> list=q.list();
			t.commit();
			GateLocalServices gls=null;
			for(GateLocalServices u:list)
			{
				gls=u;
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
