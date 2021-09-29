package model;

public class MessageId 
{
	private String id;
	private String s_id;

	public int getId() 
	{
		int a = 0;
		try
		{
			a = Integer.parseInt(id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return a;
	}

	public void setId(String id) 
	{
		this.id = id;
	}

	public int getS_id() {
		int a = 0;
		try
		{
			a = Integer.parseInt(s_id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return a;
	}

	public void setS_id(String s_id) {
		this.s_id = s_id;
	}
	
	

}
