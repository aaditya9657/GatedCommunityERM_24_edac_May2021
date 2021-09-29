package controller;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import hibernate.*;
import microservices.*;
import model.*;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class GetUserData 
{
	
	@PostMapping("/deleteUser")
	public boolean getSocietyResidents(@RequestBody UserId u_id)
	{
		CreateSession cs = new CreateSession();
		DBUser dbu = new DBUser();
		Users user = dbu.readUser(cs.getSession(), u_id.getId());
		boolean ret = dbu.deleteUser(cs.getSession(), user);
		cs.closeSession();
//		new Scanner(System.in).next();
		return ret;
	}
	
	@GetMapping("/getProfile/{u_id}")
	public String getProfile(@PathVariable int u_id)
	{
		CreateSession cs = new CreateSession();
		DBUser ru = new DBUser();
		Users user = ru.readUser(cs.getSession(), u_id);
		String json_string=new Gson().toJson(user.toPOJO());

//		String json_string = ""+user.getUid()+""+user.getId()+""+user.getName()+""+user.getEmails()+""+user.getMobile_no();
		cs.closeSession();
		return json_string;
	}

	
	@PostMapping("/getProfile")
	public String getProfile(@RequestBody UserId u_id)
	{
		
		CreateSession cs = new CreateSession();
		DBUser ru = new DBUser();
		Users user = ru.readUser(cs.getSession(), u_id.getId());
		String json_string=new Gson().toJson(user.toPOJO());
//		String json_string = ""+user.getUid()+""+user.getId()+""+user.getName()+""+user.getEmails()+""+user.getMobile_no();
		cs.closeSession();
		return json_string;
	}
	
	@PostMapping("/addHouse")
	public boolean addHouse(@RequestBody AddHouse h)
	{
		boolean ret=false;
		if(h.getUid()>0 && h.getSid()>0 && h.getHid()>0)
		{
			CreateSession cs = new CreateSession();
			DBUser dbu=new DBUser();
			DBSocieties dbs=new DBSocieties();
			DBHouses dbh=new DBHouses();
			Users user=dbu.readUser(cs.getSession(), h.getUid());
			Societies s=dbs.readSociety(cs.getSession(), h.getSid());
			Houses h1=dbh.getHouse(cs.getSession(), h.getHid());
			boolean found=false;
			boolean added=false;
			for(Societies soc:user.getSocieties())
			{
				if(soc.getId()==h.getSid())
				{
					found=true;
					break;
				}
				
			}
			if(!found)
			{
				user.addSocieties(s);
				added=true;
			}
			
			found=false;
			for(Houses ho:user.getHouses())
			{
				if(ho.getId()==h.getHid())
				{
					found=true;
					break;
				}
				
			}
			if(!found)
			{
				user.addHouses(h1);
				added=true;
			}
			if(added)
			{
				
				ret=dbu.updateUser(cs.getSession(), user);
			}
			cs.closeSession();
			
		}
		
		return ret;
	}
	
	@PostMapping("/getUserHouses")
	public String getUserHouses(@RequestBody UserId u_id)
	{
		CreateSession cs = new CreateSession();
		DBUser ru = new DBUser();
		Users user = ru.readUser(cs.getSession(), u_id.getId());
		List<HousesP> jh=new ArrayList();
		for(Houses house:user.getHouses())
		{
			jh.add(house.toPOJO());
//			json_string+=""+house.getFlat_no()+""+house.getWing()+""+house.getId();
		}
		String json_string = new Gson().toJson(jh);
		cs.closeSession();
		return json_string;
	}
	
	@PostMapping("/getUserSocieties")
	public String getUserSocieties(@RequestBody UserId u_id)
	{
		CreateSession cs = new CreateSession();
//		System.out.println(u_id.getId());
//		new Scanner(System.in).nextLine();
		DBUser dbu=new DBUser();
		Users u = dbu.readUser(cs.getSession(), u_id.getId());
		List<Societies> s =u.getSocieties();
		List<SocietiesP> sp=new ArrayList();
		for(Societies soc:s)
		{
			sp.add(soc.toPOJO());
		}
		String json_string = new Gson().toJson(sp);
		cs.closeSession();
		return json_string;
	}
	
	@PostMapping("/getUser1stHouse")
	public String getUser1stHouse(@RequestBody UserId u_id)
	{
		CreateSession cs = new CreateSession();
		DBUser ru = new DBUser();
		Users user = ru.readUser(cs.getSession(), u_id.getId());
		String json_string=null;
//		List<HousesP> jh=new ArrayList();

//		for(Houses house:user.getHouses())
//		{
//			jh.add(house.toPOJO());
////			json_string+=""+house.getFlat_no()+""+house.getWing()+""+house.getId();
//		}
		if(user.getHouses()!=null && user.getHouses().size()>0)
		{
			json_string = new Gson().toJson(user.getHouses().get(0).toPOJO());
		}
//		 json_string = new Gson().toJson(jh);
		cs.closeSession();
		return json_string;
	}
	
	@PostMapping("/getSocByHouseId")
	public String getSocByHouseId(@RequestBody HouseId h_id)
	{
		CreateSession cs = new CreateSession();
		DBHouses ru = new DBHouses();
		Houses house = ru.getHouse(cs.getSession(), h_id.getId());
		String json_string=null;
//		List<HousesP> jh=new ArrayList();

//		for(Houses house:user.getHouses())
//		{
//			jh.add(house.toPOJO());
////			json_string+=""+house.getFlat_no()+""+house.getWing()+""+house.getId();
//		}
		if(house!=null)
		{
			json_string = new Gson().toJson(house.getSociety().toPOJO());
		}
//		 json_string = new Gson().toJson(jh);
		cs.closeSession();
		return json_string;
	}
	
	@GetMapping("/getUserHouses/{u_id}")
	public String getUserHouses(@PathVariable int u_id)
	{
		CreateSession cs = new CreateSession();
		
		DBHouses dbh=new DBHouses();
		List<Houses> h=dbh.getHouses(cs.getSession(), u_id);
		List<HousesP> jh=new ArrayList();
		String json_string="";
	
		for(Houses house:h)
		{
			jh.add(house.toPOJO());
		}
		 json_string = new Gson().toJson(jh);
		cs.closeSession();
		return json_string;
	}
	
	@GetMapping("/getMessages/{u_id}")
	public String getUserMessages(@PathVariable int u_id)
	{
		CreateSession cs = new CreateSession();
		DBUser ru = new DBUser();
		Users user = ru.readUser(cs.getSession(), u_id);
		String json_string="";
		List<Conversation> conv = new ArrayList();
		for(Messages msg:user.getMessages_sent())
		{
			boolean added = false;
			for(Conversation con:conv)
			{
				if(con.getWith().getId()==msg.getUser_to().getId())
				{
					added=true;
					Message message = new Message();
					message.setDate_received(msg.getDate_received());
					message.setDate_sent(msg.getDate_sent());
					message.setId(msg.getId());
					message.setMessage(msg.getMessage());
					message.setSent(true);
					message.setTime_received(msg.getTime_received());
					message.setTime_sent(msg.getTime_sent());
					con.addMessages(message);
				}
			}
			if(!added)
			{
				Conversation new_con = new Conversation(msg.getUser_to().toPOJO());
				Message message = new Message();
				message.setDate_received(msg.getDate_received());
				message.setDate_sent(msg.getDate_sent());
				message.setId(msg.getId());
				message.setMessage(msg.getMessage());
				message.setSent(true);
				message.setTime_received(msg.getTime_received());
				message.setTime_sent(msg.getTime_sent());
				new_con.addMessages(message);
				
				conv.add(new_con);
			}
		}

		for(Messages msg:user.getMessages_received())
		{
			boolean added = false;
			for(Conversation con:conv)
			{
				if(con.getWith().getId()==msg.getUser_from().getId())
				{
					added=true;
					Message message = new Message();
					message.setDate_received(msg.getDate_received());
					message.setDate_sent(msg.getDate_sent());
					message.setId(msg.getId());
					message.setMessage(msg.getMessage());
					message.setSent(false);
					message.setTime_received(msg.getTime_received());
					message.setTime_sent(msg.getTime_sent());
					con.addMessages(message);
				}
			}
			if(!added)
			{
				Conversation new_con = new Conversation(msg.getUser_from().toPOJO());
				Message message = new Message();
				message.setDate_received(msg.getDate_received());
				message.setDate_sent(msg.getDate_sent());
				message.setId(msg.getId());
				message.setMessage(msg.getMessage());
				message.setSent(false);
				message.setTime_received(msg.getTime_received());
				message.setTime_sent(msg.getTime_sent());
				new_con.addMessages(message);
				
				conv.add(new_con);
			}
		}
		
		json_string +="\n<br><br>"+user.getName();
		json_string +="\n<br><br>";
		for(Conversation con:conv)
		{
			json_string +="\n<br><br>"+con.getWith().getName();
			for(Object msg: con.getMessagesArray())
			{
				
				json_string +="\n<br>"+msg;
			}
			
		}
		json_string = new Gson().toJson(conv);
		cs.closeSession();
		return json_string;
	}
	
	
	@PostMapping("/getMessages")
	public String getUserMessages(@RequestBody MessageId m_id)
	{
		CreateSession cs = new CreateSession();
		DBUser ru = new DBUser();
		Users user = ru.readUser(cs.getSession(), m_id.getId());
		String json_string="";
		
		List<Conversation> conv = new ArrayList();
		
		for(Messages msg:user.getMessages_sent())
		{
			for(Societies s: msg.getUser_to().getSocieties())
			{
				if(s.getId()==m_id.getS_id())
				{
					boolean added = false;
					for(Conversation con:conv)
					{
						if(con.getWith().getId()==msg.getUser_to().getId())
						{
							added=true;
							Message message = new Message();
							message.setDate_received(msg.getDate_received());
							message.setDate_sent(msg.getDate_sent());
							message.setId(msg.getId());
							message.setMessage(msg.getMessage());
							message.setSent(true);
							message.setTime_received(msg.getTime_received());
							message.setTime_sent(msg.getTime_sent());
							con.addMessages(message);
						}
					}
					if(!added)
					{
						Conversation new_con = new Conversation(msg.getUser_to().toPOJO());
						Message message = new Message();
						message.setDate_received(msg.getDate_received());
						message.setDate_sent(msg.getDate_sent());
						message.setId(msg.getId());
						message.setMessage(msg.getMessage());
						message.setSent(true);
						message.setTime_received(msg.getTime_received());
						message.setTime_sent(msg.getTime_sent());
						new_con.addMessages(message);
						
						conv.add(new_con);
					}
				}
			}
			
		}
		for(Messages msg:user.getMessages_received())
		{
			for(Societies s: msg.getUser_from().getSocieties())
			{
				if(s.getId()==m_id.getS_id())
				{
					boolean added = false;
					for(Conversation con:conv)
					{
						if(con.getWith().getId()==msg.getUser_from().getId())
						{
							added=true;
							Message message = new Message();
							message.setDate_received(msg.getDate_received());
							message.setDate_sent(msg.getDate_sent());
							message.setId(msg.getId());
							message.setMessage(msg.getMessage());
							message.setSent(false);
							message.setTime_received(msg.getTime_received());
							message.setTime_sent(msg.getTime_sent());
							con.addMessages(message);
						}
					}
					if(!added)
					{
						Conversation new_con = new Conversation(msg.getUser_from().toPOJO());
						Message message = new Message();
						message.setDate_received(msg.getDate_received());
						message.setDate_sent(msg.getDate_sent());
						message.setId(msg.getId());
						message.setMessage(msg.getMessage());
						message.setSent(false);
						message.setTime_received(msg.getTime_received());
						message.setTime_sent(msg.getTime_sent());
						new_con.addMessages(message);
						
						conv.add(new_con);
					}
				}
			}
			
		}
		
		json_string +="\n<br><br>"+user.getName();
		json_string +="\n<br><br>";
		for(Conversation con:conv)
		{
			json_string +="\n<br><br>"+con.getWith().getName();
			for(Object msg: con.getMessagesArray())
			{
				json_string +="\n<br>"+msg;
			}
			
		}
		cs.closeSession();
		json_string = new Gson().toJson(conv);
		return json_string;
	}
	
	@PostMapping("/getConversation")
	public String getConversation(@RequestBody ConversationId c_id)
	{
		CreateSession cs = new CreateSession();
		DBUser ru = new DBUser();
		Users user = ru.readUser(cs.getSession(), c_id.getU_id());
		
		Conversation conv = new Conversation();
		for(Messages msg:user.getMessages_sent())
		{
			if(msg.getUser_to().getId()==c_id.getWith_id())
			{
				conv.setWith(msg.getUser_to().toPOJO());
				
				Message message = new Message();
				message.setDate_received(msg.getDate_received());
				message.setDate_sent(msg.getDate_sent());
				message.setId(msg.getId());
				message.setMessage(msg.getMessage());
				message.setSent(true);
				message.setTime_received(msg.getTime_received());
				message.setTime_sent(msg.getTime_sent());
				
				conv.addMessages(message);
			}
		}
		
		for(Messages msg:user.getMessages_received())
		{
			if(msg.getUser_from().getId()==c_id.getWith_id())
			{
				conv.setWith(msg.getUser_from().toPOJO());
				
				Message message = new Message();
				message.setDate_received(msg.getDate_received());
				message.setDate_sent(msg.getDate_sent());
				message.setId(msg.getId());
				message.setMessage(msg.getMessage());
				message.setSent(false);
				message.setTime_received(msg.getTime_received());
				message.setTime_sent(msg.getTime_sent());
				
				conv.addMessages(message);
			}
		}
		cs.closeSession();
		String json_string = new Gson().toJson(conv);
		return json_string;
	}
	
	@PostMapping("/sendMessage")
	public boolean sendMessage(@RequestBody NewMessage msg)
	{
		CreateSession cs = new CreateSession();
		DBMessages dbm = new DBMessages();
		DBUser ru = new DBUser();
		Users user = ru.readUser(cs.getSession(), msg.getU_id());
		Users to = ru.readUser(cs.getSession(), msg.getWith_id());
		Messages message = new Messages();
		long millis=System.currentTimeMillis();  
		message.setDate_sent(new Date(millis));
		message.setDate_received(new Date(millis));
		message.setMessage(msg.getMessage());
		message.setTime_sent(new Time(millis));
		message.setTime_received(new Time(millis));
		message.setUser_from(to);
		message.setUser_from(user);
		dbm.createMessages(cs.getSession(), message, to, user);
		return true;
	}
	
}