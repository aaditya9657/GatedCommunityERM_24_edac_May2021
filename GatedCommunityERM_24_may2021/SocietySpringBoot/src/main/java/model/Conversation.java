package model;

import java.util.TreeSet;

import hibernate.UsersP;

public class Conversation 
{
	private UsersP with;
	
	private TreeSet<Message> messages;
	
	public Conversation() 
	{
		
	}
	
	public Conversation(UsersP with) 
	{
		super();
		this.with = with;
	}

	public UsersP getWith() 
	{
		return with;
	}

	public void setWith(UsersP with) 
	{
		this.with = with;
	}

	public TreeSet<Message> getMessages() 
	{
		return messages;
	}
	
	public Object[] getMessagesArray() 
	{
		return messages.toArray();
	}

	public void setMessages(TreeSet<Message> messages) 
	{
		this.messages = messages;
	}

	public void addMessages(Message message) 
	{
		if(messages==null)
		{
			messages = new TreeSet();
		}
		this.messages.add(message);
	}
}
