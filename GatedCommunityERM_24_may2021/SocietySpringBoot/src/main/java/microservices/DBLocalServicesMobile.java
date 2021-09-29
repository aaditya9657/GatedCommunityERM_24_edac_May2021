package microservices;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.LocalServices;
import hibernate.LocalServicesEmail;
import hibernate.LocalServicesMobile;
import hibernate.UserEmail;
import hibernate.Users;

public class DBLocalServicesMobile
{
	public boolean createLocalServicesMobile(Session s, LocalServicesMobile ls_mobile,LocalServices ls)
	{
		Transaction t = s.beginTransaction();
		try
		{
			ls_mobile.setLocal_service(ls);
			s.save(ls_mobile);
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
	
	public LocalServicesMobile readLocalServicesMobile(Session s, int mobile_id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from local_services_mobile as a where a.id=:c");
			q.setParameter("c", mobile_id);
			List<LocalServicesMobile> list=q.list();
			t.commit();
			LocalServicesMobile ls_mobile=null;
			for(LocalServicesMobile u:list)
			{
				ls_mobile=u;
			}
			return ls_mobile;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return null;
	}
	
	public List<LocalServicesMobile> readMobileByLocalServices(Session s, int ls_id )
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from local_services_mobile as a where a.local_service.id=:c");
			q.setParameter("c", ls_id);
			List<LocalServicesMobile> list=q.list();
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
