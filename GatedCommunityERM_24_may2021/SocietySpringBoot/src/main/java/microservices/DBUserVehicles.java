package microservices;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.Houses;
import hibernate.Societies;
import hibernate.UserVehicles;
import hibernate.Users;

public class DBUserVehicles 
{
	public boolean createUserVehicles(Session s, UserVehicles user_vehicles,Users user,Societies society,Houses house)
	{
		Transaction t = s.beginTransaction();
		try
		{
			user_vehicles.setUser(user);
			user_vehicles.setSociety(society);
			user_vehicles.setHouse(house);
			s.save(user_vehicles);
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
	
	public boolean deleteUserVehicles(Session s, UserVehicles user_vehicles)
	{
		Transaction t = s.beginTransaction();
		try
		{
			user_vehicles.setSociety(null);
			user_vehicles.setHouse(null);
			s.update(user_vehicles);
			s.delete(user_vehicles);
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
	
	public UserVehicles readUserVehicles(Session s, int vehicles_id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from soc_user_vehicles as a where a.id=:c");
			q.setParameter("c", vehicles_id);
			List<UserVehicles> list=q.list();
			t.commit();
			UserVehicles user_vehicles=null;
			for(UserVehicles u:list)
			{
				user_vehicles=u;
			}
			return user_vehicles;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return null;
	}
	
	public List<UserVehicles> readUserVehiclesByUser(Session s, int user_id )
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from soc_user_vehicles as a where a.user.id=:c");
			q.setParameter("c", user_id);
			List<UserVehicles> list=q.list();
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
	
	public List<UserVehicles> readUserVehiclesByHouse(Session s, int house_id )
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query q=s.createQuery("from soc_user_vehicles as a where a.house.id=:c");
			q.setParameter("c", house_id);
			List<UserVehicles> list=q.list();
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
