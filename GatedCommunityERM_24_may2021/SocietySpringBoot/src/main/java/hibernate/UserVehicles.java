 package hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity(name="soc_user_vehicles")
@Table(name="soc_user_vehicles")
public class UserVehicles 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;                                          
	
	@Column(nullable=false,unique=true)
	private String registration_no;
	
	@Column(nullable=false)
	private String Type;

	@ManyToOne
	private Users user;
	
	@ManyToOne
	private Houses house;
	
	@OneToMany(mappedBy="user_vehicle")
	private List<GateUserVehicles> gateuservehicles;
	
	@ManyToOne
	private Societies society;

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

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Houses getHouse() {
		return house;
	}

	public void setHouse(Houses house) {
		this.house = house;
	}

	public List<GateUserVehicles> getGateuservehicles() {
		return gateuservehicles;
	}

	public Societies getSociety() {
		return society;
	}

	public void setSociety(Societies society) {
		this.society = society;
	}

	public int getId() {
		return id;
	}

	public UserVehiclesP toPOJO()
	{
		UserVehiclesP uvp = new UserVehiclesP();
		uvp.setId(id);
		uvp.setRegistration_no(registration_no);
		uvp.setType(Type);
		List<GateUserVehiclesP> guvpl = new ArrayList();
		for(GateUserVehicles guv:gateuservehicles)
		{
			guvpl.add(guv.toPOJO());
		}
		uvp.setGateuservehicles(guvpl);
		return uvp;
	}
	
}