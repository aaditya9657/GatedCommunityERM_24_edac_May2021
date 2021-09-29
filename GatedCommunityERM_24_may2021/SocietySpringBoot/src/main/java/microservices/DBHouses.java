package microservices;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.Houses;
import hibernate.Societies;
import hibernate.UserVehicles;
import hibernate.Users;


public class DBHouses 
{
	public boolean createHouses(Session s,Houses house,Societies soc)
    {
		Transaction t=s.beginTransaction();
    	try
    	{
    		house.setSociety(soc);
        	s.save(house);
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
	
	public List<Houses> readAllHouses(Session s,int soc_id)
	{
		Transaction t=s.beginTransaction();
		try
    	{
        	Query query=s.createQuery("from soc_houses as a where a.society.id=:b");
        	query.setParameter("b", soc_id);
        	List<Houses> list=query.list();
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
	
	public List<Houses> readAllHouses(Session s)
	{
		Transaction t=s.beginTransaction();
		try
    	{
        	Query query=s.createQuery("from soc_houses");
        	List<Houses> list=query.list();
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
	
	public Houses getHouse(Session s,int house_id)
	{
		Transaction t=s.beginTransaction();
		try
    	{
        	Query query=s.createQuery("from soc_houses where id=:b");
        	query.setParameter("b", house_id);
        	List<Houses> list=query.list();
        	t.commit();
        	for(Houses house:list)
        	{
        		return house;
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
	
	public List<Houses> getHouses(Session s,int user_id)
	{
		Transaction t=s.beginTransaction();
		try
    	{
        	Query query=s.createQuery("select a from soc_houses as a join a.users as b where b.id=:c");
        	query.setParameter("c", user_id);
        	List<Houses> list=query.list();
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
