package model;

public class ConversationId 
{
	private String u_id;
	private String with_id;
	
	public int getU_id() {
		return Integer.parseInt(u_id);
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public int getWith_id() {
		return Integer.parseInt(with_id);
	}
	public void setWith_id(String with_id) {
		this.with_id = with_id;
	}
	
	
}
