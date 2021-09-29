package model;

import java.util.ArrayList;
import java.util.List;

import hibernate.*;
import hibernate.Users;

public class UserRegistrationDetails 
{
	private String firstname;
	
	private String middlename;
	
	private String lastname;
	
	private String email;
	
	private String mobile;


	public String getFirstname() 
	{
		return firstname;
	}

	public void setFirstname(String firstname) 
	{
		this.firstname = firstname;
	}

	public String getMiddlename() 
	{
		return middlename;
	}

	public void setMiddlename(String middlename) 
	{
		this.middlename = middlename;
	}

	public String getLastname() 
	{
		return lastname;
	}

	public void setLastname(String lastname) 
	{
		this.lastname = lastname;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getMobile() 
	{
		return mobile;
	}

	public void setMobile(String mobile) 
	{
		this.mobile = mobile;
	}
	
	public UserMobile toUserMobile()
	{
		List<UserMobile> mobiles = new ArrayList();
		UserMobile um = new UserMobile();
		um.setMob_no(Long.parseLong(mobile));
		um.setIs_primary(true);
		mobiles.add(um);
		return um;
	}
	
	public UserEmail toUserEmail()
	{
		List<UserEmail> emails = new ArrayList();
		UserEmail ue = new UserEmail();
		ue.setEmail(email);
		ue.setIs_primary(true);
		emails.add(ue);
		return ue;
	}

	public Users toUsers()
	{
		Name name = new Name();
		if(firstname!=null)
			name.setFname(firstname);
		else
			name.setFname(" ");
		name.setMname(middlename);
		if(lastname!=null)
			name.setLname(lastname);
		else
			name.setLname(" ");
		
		Users user = new Users();
		user.setName(name);
		return user;
	}

	@Override
	public String toString() {
		return "UserRegistrationDetails [firstname=" + firstname + ", middlename=" + middlename + ", lastname="
				+ lastname + ", email=" + email + ", mobile=" + mobile + "]";
	}

	
	
}
