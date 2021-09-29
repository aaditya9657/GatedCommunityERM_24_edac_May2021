package controller;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import hibernate.*;
import microservices.*;
import model.*;



@RestController
@CrossOrigin
@RequestMapping("/house")
public class GetHouseData 
{
	@GetMapping("/getHouseVisitors/{h_id}")
	public String getHouseVisitors1(@PathVariable int h_id)
	{
		CreateSession cs = new CreateSession();
		DBHouses h= new DBHouses();
		Houses house = h.getHouse(cs.getSession(), h_id);
		List<VisitorsP> jv=new ArrayList();
		String json_string="";

		for(Visitors visitor:house.getVisitors())
		{
			jv.add(visitor.toPOJO());
//			json_string +="\n<br>"+visitor.getEmail_id()+"  "+visitor.getId()+"  "+visitor.getMob_no()+"  "+visitor.getReason()+"  "+visitor.getRegistration_no()+"  "+visitor.getIn_time()+"  "+visitor.getOut_time()+"  "+visitor.getVehicletype()+"  "+visitor.getName();
		}
		
		json_string = new Gson().toJson(jv);
		cs.closeSession();
		return json_string;
	}	

	@PostMapping("/getHouseVisitors")
	public String getHouseVisitors(@RequestBody HouseId h_id)
	{
		CreateSession cs = new CreateSession();
		DBHouses h= new DBHouses();
		Houses house = h.getHouse(cs.getSession(), h_id.getId());
		List<VisitorsP> jv=new ArrayList();

		String json_string="";
		for(Visitors visitor:house.getVisitors())
		{
			jv.add(visitor.toPOJO());
//			json_string +="\n<br>"+visitor.getEmail_id()+"  "+visitor.getId()+"  "+visitor.getMob_no()+"  "+visitor.getReason()+"  "+visitor.getRegistration_no()+"  "+visitor.getIn_time()+"  "+visitor.getOut_time()+"  "+visitor.getVehicletype()+"  "+visitor.getName();
		}
		
		 json_string = new Gson().toJson(jv);
		cs.closeSession();
		return json_string;
	}	
	
	@PostMapping("/submitMaintenance")
	public boolean submitMaintenance(@RequestBody model.Maintenance m)
	{
		CreateSession cs = new CreateSession();
		DBHouses h= new DBHouses();
		Houses house = h.getHouse(cs.getSession(), m.getId());
		DBMaintenance dbm=new DBMaintenance();
		DBMaintenanceType dbmt=new DBMaintenanceType();
		List<MaintenanceType> types=dbmt.readMaintenanceTypeBySociety(cs.getSession(), house.getSociety().getId());
		boolean ret=false;
		if(m.getCr()>0)
		{
			hibernate.Maintenance m1=new hibernate.Maintenance();
			m1.setBegin_date(m.getBg());
			m1.setEnd_date(m.getEd());
			m1.setCost(m.getCr());
			for(MaintenanceType mt:types)
			{
				if(mt.getType().equals("Construction And Repair Funds"))
				{
					ret=dbm.createMaintenance(cs.getSession(),m1 ,mt, house);
				}
			}
			
		}
		if(m.getEc()>0)
		{
			hibernate.Maintenance m1=new hibernate.Maintenance();
			m1.setBegin_date(m.getBg());
			m1.setEnd_date(m.getEd());
			m1.setCost(m.getEc());
			for(MaintenanceType mt:types)
			{
				if(mt.getType().equals("Electricity Charges"))
				{
					ret=dbm.createMaintenance(cs.getSession(),m1 ,mt, house);
				}
			}
			
		}
		if(m.getOc()>0)
		{
			hibernate.Maintenance m1=new hibernate.Maintenance();
			m1.setBegin_date(m.getBg());
			m1.setEnd_date(m.getEd());
			m1.setCost(m.getOc());
			for(MaintenanceType mt:types)
			{
				if(mt.getType().equals("Other Charges"))
				{
					ret=dbm.createMaintenance(cs.getSession(),m1 ,mt, house);
				}
			}
			
		}
		if(m.getPc()>0)
		{
			hibernate.Maintenance m1=new hibernate.Maintenance();
			m1.setBegin_date(m.getBg());
			m1.setEnd_date(m.getEd());
			m1.setCost(m.getPc());
			for(MaintenanceType mt:types)
			{
				if(mt.getType().equals("Parking Charges"))
				{
					ret=dbm.createMaintenance(cs.getSession(),m1 ,mt, house);
				}
			}
			
		}
		if(m.getSc()>0)
		{
			hibernate.Maintenance m1=new hibernate.Maintenance();
			m1.setBegin_date(m.getBg());
			m1.setEnd_date(m.getEd());
			m1.setCost(m.getSc());
			for(MaintenanceType mt:types)
			{
				if(mt.getType().equals("Security Charges"))
				{
					ret=dbm.createMaintenance(cs.getSession(),m1 ,mt, house);
				}
			}
			
		}
		if(m.getWt()>0)
		{
			hibernate.Maintenance m1=new hibernate.Maintenance();
			m1.setBegin_date(m.getBg());
			m1.setEnd_date(m.getEd());
			m1.setCost(m.getWt());
			for(MaintenanceType mt:types)
			{
				if(mt.getType().equals("Water Taxes"))
				{
					ret=dbm.createMaintenance(cs.getSession(),m1 ,mt, house);
				}
			}
			
		}
		
		return ret;
	}	
	
	@GetMapping("/getHouseLocalServices/{h_id}")
	public String getHouseLocalServices1(@PathVariable int h_id)
	{
		CreateSession cs = new CreateSession();
		DBHouses h= new DBHouses();
		Houses house = h.getHouse(cs.getSession(), h_id);
		String json_string="";
		List<LocalServicesP> jls=new ArrayList();
		for(LocalServices local_service:house.getLocal_services())
		{
			
//			for(GateLocalServices gls:local_service.getGatelocalservices())
//			{
				jls.add(local_service.toPOJO());
				//json_string += "\n<br>"+local_service.getId()+"  "+local_service.getRegistration_no()+"  "+local_service.getTypes()+"  "+local_service.getUid()+"  "+local_service.getVehicleType()+"  "+local_service.getName()+"  "+gls.getIn_time()+"  "+gls.getOut_time()+"  "+local_service.getEmails()+"  "+local_service.getMobiles();
//			}
		}
		json_string = new Gson().toJson(jls);
		cs.closeSession();
		return json_string;
		
	}
	
	@PostMapping("/getHouseLocalServices")
	public String getHouseLocalServices(@RequestBody HouseId h_id)
	{
		CreateSession cs = new CreateSession();
		DBHouses h= new DBHouses();
		Houses house = h.getHouse(cs.getSession(), h_id.getId());
		List<LocalServicesP> jls=new ArrayList();
		String json_string="";
		
		for(LocalServices local_service:house.getLocal_services())
		{
//			for(GateLocalServices gls:local_service.getGatelocalservices())
//			{
				jls.add(local_service.toPOJO());
//				json_string += "\n<br>"+local_service.getId()+"  "+local_service.getRegistration_no()+"  "+local_service.getTypes()+"  "+local_service.getUid()+"  "+local_service.getVehicleType()+"  "+local_service.getName()+"  "+gls.getIn_time()+"  "+gls.getOut_time()+"  "+local_service.getEmails()+"  "+local_service.getMobiles();
//			}
		}
		json_string = new Gson().toJson(jls);
		cs.closeSession();
		return json_string;
		
	}
	
	@GetMapping("/getNotices/{h_id}")
	public String getNotices(@PathVariable int h_id)
	{
		CreateSession cs = new CreateSession();
		DBHouses h= new DBHouses();
		Houses house = h.getHouse(cs.getSession(), h_id);
		String json_string="";
		List<NoticesP> jn=new ArrayList();
		for(Notices n:house.getNotices())
		{
			jn.add(n.toPOJO());
		}
		json_string = new Gson().toJson(jn);
		cs.closeSession();
		return json_string;
		
	}
	
	@PostMapping("/getNotices")
	public String getNotices(@RequestBody HouseId h_id)
	{
		CreateSession cs = new CreateSession();
		DBHouses h= new DBHouses();
		Houses house = h.getHouse(cs.getSession(), h_id.getId());
		List<NoticesP> jn=new ArrayList();
		String json_string="";
		
		for(Notices n:house.getNotices())
		{
			jn.add(n.toPOJO());
		}
		json_string = new Gson().toJson(jn);
		cs.closeSession();
		return json_string;
		
	}
	
	@GetMapping("/getMaintenance/{h_id}")
	public String getMaintenance(@PathVariable int h_id)
	{
		CreateSession cs = new CreateSession();		
		DBMaintenance dbm = new DBMaintenance();
		List<hibernate.Maintenance> mt = dbm.readMaintenanceByHouse(cs.getSession(), h_id);
		List<MaintenanceP> jm=new ArrayList();
		String json_string="";

		for(hibernate.Maintenance m:mt)
		{
			jm.add(m.toPOJO());
		}
		json_string = new Gson().toJson(jm);

		cs.closeSession();
		return json_string;
	}
	
	@PostMapping("/getMaintenance")
	public String getMaintenance(@RequestBody HouseId h_id)
	{
		CreateSession cs = new CreateSession();
		DBHouses h= new DBHouses();
		Houses house = h.getHouse(cs.getSession(), h_id.getId());
		List<MaintenanceP> jm=new ArrayList();
		String json_string="";
		
		for(hibernate.Maintenance m:house.getMaintenance())
		{
			jm.add(m.toPOJO());
//			json_string += "\n<br>"+m.getId()+"  "+m.getCost()+"  "+m.getBegin_date()+"  "+m.getEnd_date()+"  "+m.getMaintenance_type();
		}
		json_string = new Gson().toJson(jm);
		cs.closeSession();
		return json_string;
	}
	
	@GetMapping("/getLocalServicesHouses/{l_id}")
	public String getLocalServicesHouses(@PathVariable int l_id)
	{
		CreateSession cs = new CreateSession();
		DBLocalServices dls= new DBLocalServices();
		LocalServices ls= dls.readLocalServices(cs.getSession(), l_id);
		List<HousesP> houses=new ArrayList();
		String json_string="";
		
		for(Houses h:ls.getHouses())
		{
			houses.add(h.toPOJO());
		}
		json_string = new Gson().toJson(houses);
		cs.closeSession();
		return json_string;

		
	}
	
	@PostMapping("/getLocalServicesHouses")
	public String getLocalServicesHouses(@RequestBody LocalServicesId l_id)
	{
		CreateSession cs = new CreateSession();
		DBLocalServices dls= new DBLocalServices();
		LocalServices ls= dls.readLocalServices(cs.getSession(), l_id.getId());
		List<HousesP> houses=new ArrayList();
		String json_string="";
		
		for(Houses h:ls.getHouses())
		{
			houses.add(h.toPOJO());
		}
		json_string = new Gson().toJson(houses);
		cs.closeSession();
		return json_string;

	}
	
	@PostMapping("/sendNotice")
	public boolean CreateNotices(@RequestBody NewNotice nn)
	{
		System.out.println(nn);
		CreateSession cs = new CreateSession();
		
		DBSocieties dbs = new DBSocieties();
		DBHouses dbh = new DBHouses();
		Societies soc = dbs.readSociety(cs.getSession(), nn.getSoc_id());
		DBNotices dbn = new DBNotices();
		Notices n = new Notices();
		n.setDate_of_issue(nn.getStart_date());
		n.setDate_of_expiry(nn.getExpiry_date());
		n.setSubject(nn.getSubject());
		n.setContent(nn.getContent());
		Calendar cal = Calendar.getInstance();
		n.setDate_of_creation(new Date(cal.getTimeInMillis()));
		n.setTime_of_creation(new Time(cal.getTimeInMillis()));
		n.setTime_of_issue(new Time(6,0,0));
		n.setTime_of_expiry(new Time(22,0,0));
		dbn.createNotices(cs.getSession(), n, dbh.readAllHouses(cs.getSession(), nn.getSoc_id()), soc);
		return true;

	}
}
