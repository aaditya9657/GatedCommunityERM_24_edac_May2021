package microservices;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.LocalServices;
import hibernate.LocalServicesEmail;
import hibernate.UserEmail;
import hibernate.Users;

public class DBLocalServicesEmail
{
	public boolean createLocalServices(Session s, LocalServicesEmail ls_email,LocalServices ls)
	{
		Transaction t = s.beginTransaction();
		try
		{
			ls_email.setLocal_service(ls);
			s.save(ls_email);
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
	
	public LocalServicesEmail readLocalServicesEmail(Session s, int email_id)
	{
		Transaction t=s.beginTransaction();
		try
		{
			
			Query q=s.createQuery("from local_services_email as a where a.id=:c");
			q.setParameter("c", email_id);
			List<LocalServicesEmail> list=q.list();
			t.commit();
			LocalServicesEmail ls_email=null;
			for(LocalServicesEmail u:list)
			{
				ls_email=u;
			}
			return ls_email;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return null;
	}
	
	public List<LocalServicesEmail> readEmailByLocalServices(Session s, int ls_id )
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from local_services_email as a where a.local_service.id=:c");
			q.setParameter("c", ls_id);
			List<LocalServicesEmail> list=q.list();
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
