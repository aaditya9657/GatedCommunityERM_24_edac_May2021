package controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/login")
public class LoginController
{
	@GetMapping("/v")
	public String funct()
	{
		return "hello world";
	}
	
	@PostMapping("/verify")
	public String getUserId(@RequestBody LoginCredentials cred)
	{
		System.out.println(cred);
		DBUser ru=new DBUser();
		CreateSession cs=new CreateSession();
		VerifyOtp vo=new VerifyOtp();
		Users user;
		if(cred.getLoginType()<0)
		{
			user=ru.readUser(cs.getSession(), cred.getEmail());
		}
		else
		{
			user=ru.readUser(cs.getSession(), cred.getMobile_no());
		}
		if(user==null)
		{
			return "-1";
		}
		else
		{
			if(vo.verifyOtp(cred.getOtp()))
			{
				return new Gson().toJson(user.toPOJO());
			}
			else
			{
				return "0";
			}
		}
	}
	
	@PostMapping("/verify1")
	public String getUserId1(@RequestBody LoginCredentials cred)
	{
		System.out.println(cred);
		DBUser ru=new DBUser();
		CreateSession cs=new CreateSession();
		VerifyOtp vo=new VerifyOtp();
		Users user;
		if(cred.getLoginType()<0)
		{
			user=ru.readUser(cs.getSession(), cred.getEmail());
		}
		else
		{
			user=ru.readUser(cs.getSession(), cred.getMobile_no());
		}
		if(user==null)
		{
			return "-1";
		}
		else
		{
			if(vo.verifyOtp(cred.getOtp()))
			{
				return new Gson().toJson(user.toPOJO());
			}
			else
			{
				return "0";
			}
		}
	}
}
