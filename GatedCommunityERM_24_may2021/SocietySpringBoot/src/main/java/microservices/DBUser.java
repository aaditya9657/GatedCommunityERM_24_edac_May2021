package microservices;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.Committee;
import hibernate.GateUsers;
import hibernate.Houses;
import hibernate.Messages;
import hibernate.Societies;
import hibernate.UserDocuments;
import hibernate.UserEmail;
import hibernate.UserMobile;
import hibernate.UserVehicles;
import hibernate.Users;

public class DBUser
{
	public boolean createUser(Session s,Users user,List<Houses> houses,List<Societies> societies)
	{
		String latest_uid = new ReadLatestUid().GetUid(s);
		Transaction t=s.beginTransaction();
		try
		{
			user.setHouses(houses);
			user.setSocieties(societies);
			user.setUid(latest_uid);
			s.save(user);
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
	
	public boolean updateUser(Session s,Users user)
	{
		Transaction t=s.beginTransaction();
		try
		{
			s.update(user);
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
	
	public boolean deleteUser(Session s,Users user)
	{
		DBUserEmail dbue = new DBUserEmail();
		for(UserEmail ue:user.getEmails())
		{
			dbue.deleteUserEmail(s, ue);
		}
		DBUserDocuments dbud = new DBUserDocuments();
		for(UserDocuments ue:user.getDocuments())
		{
			dbud.deleteUserDocuments(s, ue);
		}
		DBUserMobile dbum = new DBUserMobile();
		for(UserMobile ue:user.getMobile_no())
		{
			dbum.deleteUserMobile(s, ue);
		}
		DBCommittee dbc = new DBCommittee();
		for(Committee ue:user.getCommittee())
		{
			dbc.deleteCommittee(s, ue);
		}
		DBGateUsers dbgu = new DBGateUsers();
		for(GateUsers ue:user.getGateusers())
		{
			dbgu.deleteGateUsers(s, ue);
		}
		DBMessages dbm = new DBMessages();
		for(Messages ue:user.getMessages_received())
		{
			dbm.deleteMessages(s, ue);
		}
		for(Messages ue:user.getMessages_sent())
		{
			dbm.deleteMessages(s, ue);
		}
		DBUserVehicles dbuv = new DBUserVehicles();
		for(UserVehicles ue:user.getVehicles())
		{
			dbuv.deleteUserVehicles(s, ue);
		}
		Transaction t=s.beginTransaction();
		try
		{
			user.setHouses(null);
			user.setSocieties(null);
			s.update(user);
			s.delete(user);
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
	
	public Users readUser(Session s,String email)
	{
		Transaction t=s.beginTransaction();
		try
		{
			Query q=s.createQuery("select a from users as a join a.emails as b where b.email=:c");
			q.setParameter("c", email);
			List<Users> list=q.list();
			t.commit();
			Users user=null;
			for(Users u:list)
			{
				user=u;
			}
			return user;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return null;
	}
	
	public Users readUser(Session s,long mobile)
	{
		System.out.println(mobile);
		Transaction t=s.beginTransaction();
		try
		{
			Query q=s.createQuery("select a from users as a join a.mobile_no as b where b.mob_no=:c");
			q.setParameter("c", mobile);
			List<Users> list=q.list();
			t.commit();
			Users user=null;
			for(Users u:list)
			{
				user=u;
			}
			return user;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return null;
	}
	
	public Users readUserByUid(Session s,String uid)
	{
		Transaction t=s.beginTransaction();
		try
		{
			Query q=s.createQuery("from users as a where a.uid=:c");
			q.setParameter("c", uid);
			List<Users> list=q.list();
			t.commit();
			Users user=null;
			for(Users u:list)
			{
				user=u;
			}
			return user;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return null;
	}
	
	public Users readUser(Session s,int u_id)
	{
		Transaction t=s.beginTransaction();
		try
		{
			Query q=s.createQuery("from users as a where a.id=:c");
			q.setParameter("c", u_id);
			List<Users> list=q.list();
			t.commit();
			Users user=null;
			for(Users u:list)
			{
				user=u;
			}
			return user;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Users> readAllUsers(Session s)
	{
		Transaction t=s.beginTransaction();
		try
		{
			Query q=s.createQuery("from users");
			List<Users> list=q.list();
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
	
	public List<Users> readAllUsersBySocieties(Session s,int soc_id)
	{
		Transaction t=s.beginTransaction();
		try
		{
			Query q=s.createQuery("select a from users as a join a.societies as b where b.id=:c");
			q.setParameter("c", soc_id);
			List<Users> list=q.list();
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
	
	public List<Users> readAllUsersByHouses(Session s,int house_id)
	{
		Transaction t=s.beginTransaction();
		try
		{
			Query q=s.createQuery("select a from users as a join a.houses as b where b.id=:c");
			q.setParameter("c", house_id);
			List<Users> list=q.list();
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
