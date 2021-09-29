package microservices;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import hibernate.Societies;


public class DBSocieties 
{
	public boolean createSocieties(Session s,Societies society)
    {
		Transaction t=s.beginTransaction();
    	try
    	{
        	s.save(society);
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
	
	public List<Societies> readAllSocieties(Session s)
	{
		Transaction t=s.beginTransaction();
		try
    	{
        	Query query=s.createQuery("from societies");
        	List<Societies> list=query.list();
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
	
	public Societies readSociety(Session s,int soc_id)
	{
		Transaction t=s.beginTransaction();
		try
    	{
        	Query query=s.createQuery("from societies where id=:a");
        	query.setParameter("a", soc_id);
        	List<Societies> list=query.list();
        	t.commit();
        	for(Societies soc:list)
        	{
        		return soc;
        	}
        	return null;
    	}
    	catch(Exception e)
    	{
			t.rollback();
    		e.printStackTrace();
    	}
    	return null;
	}
	

	

}
