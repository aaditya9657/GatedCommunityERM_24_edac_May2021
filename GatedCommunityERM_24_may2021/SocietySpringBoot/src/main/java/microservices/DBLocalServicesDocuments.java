package microservices;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.*;

public class DBLocalServicesDocuments 
{
	public boolean createLocalServicesDocuments(Session s, LocalServicesDocuments ls_documents,LocalServices ls)
	{
		Transaction t = s.beginTransaction();
		try
		{
			ls_documents.setLocal_service(ls);
			s.save(ls_documents);
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
	
	public LocalServicesDocuments readLocalServicesDocuments(Session s, int lsdocuments_id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from local_services_documents as a where a.id=:c");
			q.setParameter("c", lsdocuments_id);
			List<LocalServicesDocuments> list=q.list();
			t.commit();
			LocalServicesDocuments ls_documents=null;
			for(LocalServicesDocuments u:list)
			{
				ls_documents=u;
			}
			return ls_documents;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return null;
	}
	
	public List<LocalServicesDocuments> readDocumentsByLocalService(Session s, int ls_id )
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from local_services_documents as a where a.local_service.id=:c");
			q.setParameter("c", ls_id);
			List<LocalServicesDocuments> list=q.list();
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
