package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hibernate.*;
import microservices.*;
import model.*;

@CrossOrigin
@RestController
@RequestMapping("/registration")
public class RegistrationController 
{
	@PostMapping("/userregistration")
	public int registerUser(@RequestBody UserRegistrationDetails det)
	{
		DBUser cu = new DBUser();
		CreateSession cs = new CreateSession();
		Users user_tobe = det.toUsers();
		System.out.println(user_tobe);
		List<UserEmail> emails = new ArrayList();
		emails.add(det.toUserEmail());
		if(emails!=null)
		{
			DBUserEmail re = new DBUserEmail();
			for(UserEmail ue : emails)
			{
				if(re.readUserEmail(cs.getSession(), ue.getEmail())!=null)
					return -3;
			}
		}
		List<UserMobile> mobiles = new ArrayList();
		mobiles.add(det.toUserMobile());
		if(mobiles!=null)
		{
			DBUserMobile rm = new DBUserMobile();
			for(UserMobile um : mobiles)
			{
				if(rm.readUserMobile(cs.getSession(), um.getMob_no())!=null)
					return -4;
			}
		}
		
		boolean res = cu.createUser(cs.getSession(), user_tobe,null,null);
		if(res==false)
		{
			cs.closeSession();
			return -2;
		}
		else
		{
//			ReadUser ru = new ReadUser();
//			Users user = ru.readUserByUid(cs.getSession(), res_uid);
			Users user = user_tobe;
			if(user!=null)
			{
				if(emails!=null)
				{
					DBUserEmail cue = new DBUserEmail();
					for(UserEmail ue : emails)
					{
						ue.setUser(user);
						cue.createUserEmail(cs.getSession(), ue,user);
					}
				}

				if(mobiles!=null)
				{
					DBUserMobile cue = new DBUserMobile();
					for(UserMobile um : mobiles)
					{
						um.setUser(user);
						cue.createUserMobile(cs.getSession(), um,user);
					}
				}
				cs.closeSession();
				return user.getId();
			}
			else
			{
				cs.closeSession();
				return -1;
			}	
		}
	}
}
