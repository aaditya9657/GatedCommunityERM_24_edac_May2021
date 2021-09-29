package model;

public class LocalServicesId
{
	private String id;
	
	private int s_id;
	
	

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

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
}
