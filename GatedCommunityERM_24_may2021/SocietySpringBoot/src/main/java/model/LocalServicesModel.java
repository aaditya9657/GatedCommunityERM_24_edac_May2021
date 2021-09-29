package model;

import java.util.ArrayList;
import java.util.List;

import hibernate.LocalServicesP;

public class LocalServicesModel 
{
	private String category;
	private List<LocalServicesP> local_services;
	
	public LocalServicesModel(String category) {
		this.category = category;
	}
	
	public String getCategory() {
		return category;
	}
		
	public List<LocalServicesP> getLocal_services() {
		return local_services;
	}
	
	public void setLocal_services(List<LocalServicesP> local_services) {
		this.local_services = local_services;
	}
	
	public void addLocal_services(LocalServicesP local_services) {
		if(this.local_services==null)
		{
			this.local_services = new ArrayList();
		}
		this.local_services.add(local_services);
	}
	
}
