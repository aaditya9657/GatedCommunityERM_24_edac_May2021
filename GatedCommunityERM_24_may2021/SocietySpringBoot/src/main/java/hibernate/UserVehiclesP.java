package hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class UserVehiclesP 
{
	private int id;                                          
	
	private String registration_no;
	
	private String Type;
	
	private List<GateUserVehiclesP> gateuservehicles;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegistration_no() {
		return registration_no;
	}

	public void setRegistration_no(String registration_no) {
		this.registration_no = registration_no;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public List<GateUserVehiclesP> getGateuservehicles() {
		return gateuservehicles;
	}

	public void setGateuservehicles(List<GateUserVehiclesP> gateuservehicles) {
		this.gateuservehicles = gateuservehicles;
	}

	
}
