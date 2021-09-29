package model;

public class LoginCredentials
{
	private String email;
	private String mobile_no;
	private String otp;
	private String type;
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public long getMobile_no()
	{
		return Long.parseLong(mobile_no);
	}
	public void setMobile_no(String mobile_no)
	{
		this.mobile_no = mobile_no;
	}
	public int getOtp()
	{
		return Integer.parseInt(otp);
	}
	public void setOtp(String otp)
	{
		this.otp = otp;
	}
	
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public int getLoginType()
	{
		if(type.equals("email"))
		{
			return -1;
		}
		else 
		{
			return 1;
		}
	}
	@Override
	public String toString() {
		return "LoginCredentials [email=" + email + ", mobile_no=" + mobile_no + ", otp=" + otp + ", type=" + type
				+ "]";
	}
		
}
