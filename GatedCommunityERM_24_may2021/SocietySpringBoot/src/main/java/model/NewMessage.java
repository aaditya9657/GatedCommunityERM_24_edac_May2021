package model;

public class NewMessage 
{
	private String u_id;
	private String to_id;
	private String message;
	
	public int getU_id() 
	{
		return Integer.parseInt(u_id);
	}
	public void setU_id(String u_id) 
	{
		this.u_id = u_id;
	}
	public int getWith_id() 
	{
		return Integer.parseInt(to_id);
	}
	
	public void setTo_id(String to_id)
	{
		this.to_id = to_id;
	}
	public String getMessage()
	{
		return message;
	}
	public void setMessage(String message)
	{
		this.message = message;
	}
	
}
