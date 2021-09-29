package model;

public class HouseId
{
	private String id;

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
