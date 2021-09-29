package microservices;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.UserDocuments;
import hibernate.UserMobile;
import hibernate.Users;

public class DBUserDocuments 
{
	public boolean createUserDocuments(Session s, UserDocuments user_documents,Users user)
	{
		Transaction t = s.beginTransaction();
		try
		{
			user_documents.setUser(user);
			s.save(user_documents);
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
	
	public boolean deleteUserDocuments(Session s, UserDocuments user_documents)
	{
		Transaction t = s.beginTransaction();
		try
		{
			s.delete(user_documents);
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
	
	public UserDocuments readUserDocuments(Session s, int documents_id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from user_documents as a where a.id=:c");
			q.setParameter("c", documents_id);
			List<UserDocuments> list=q.list();
			t.commit();
			UserDocuments user_documents=null;
			for(UserDocuments u:list)
			{
				user_documents=u;
			}
			return user_documents;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return null;
	}
	
	public List<UserDocuments> readUserDocumentsByUser(Session s, int user_id )
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from user_documents as a where a.user.id=:c");
			q.setParameter("c", user_id);
			List<UserDocuments> list=q.list();
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
