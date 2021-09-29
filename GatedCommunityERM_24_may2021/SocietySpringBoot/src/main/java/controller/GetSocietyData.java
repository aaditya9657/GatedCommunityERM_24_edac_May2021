package controller;

import java.util.ArrayList;
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
@RequestMapping("/society")
public class GetSocietyData 
{
	@PostMapping("/getSocietyResidents")
	public String getSocietyResidents(@RequestBody SocietyId s_id)
	{
		CreateSession cs = new CreateSession();
		DBSocieties s=new DBSocieties();
		Societies soc = s.readSociety(cs.getSession(), s_id.getId());
		String json_string="";
		List<HousesP> ec2=new ArrayList();
		for(Houses h:soc.getHouses())
		{
			ec2.add(h.toPOJO());
		}
		
		json_string = new Gson().toJson(ec2);
		cs.closeSession();
		return json_string;
	}	
	
	
	@PostMapping("/getSocietyEmergencyContacts")
	public String getSocietyEmergencyContacts(@RequestBody SocietyId s_id)
	{
		CreateSession cs = new CreateSession();
		DBSocieties s=new DBSocieties();
		Societies soc = s.readSociety(cs.getSession(), s_id.getId());
		String json_string="";
		List<EmergencyContactsP> ec2=new ArrayList();
		for(EmergencyContacts ec:soc.getEmergency_contacts())
		{
			ec2.add(ec.toPOJO());
		}
		
		json_string = new Gson().toJson(ec2);
		cs.closeSession();
		return json_string;
	}	
	
	
	@GetMapping("/getSocietyEmergencyContacts/{s_id}")
	public String getSocietyEmergencyContacts(@PathVariable int s_id)
	{
		CreateSession cs = new CreateSession();

		DBEmergencyContacts dbec= new DBEmergencyContacts();
		List<EmergencyContacts> ec1=dbec.readEmergencyContactsBySociety(cs.getSession(), s_id);
		String json_string="";
		List<EmergencyContactsP> ec2=new ArrayList();
		for(EmergencyContacts ec:ec1)
		{
			ec2.add(ec.toPOJO());			 

		}
		json_string = new Gson().toJson(ec2);


		cs.closeSession();
		return json_string;
	}	
	
	@PostMapping("/getSocietyCommittee")
	public String getSocietyCommittee(@RequestBody SocietyId s_id)
	{
		CreateSession cs = new CreateSession();
		DBSocieties s=new DBSocieties();
		Societies soc = s.readSociety(cs.getSession(), s_id.getId());
		String json_string="";
		List<CommitteeP> jc=new ArrayList();

		for(Committee c:soc.getCommittee())
		{
			jc.add(c.toPOJO());
//			json_string+=""+c.getId()+""+c.getDesignation();	
		}
		
		 json_string = new Gson().toJson(jc);
		cs.closeSession();
		return json_string;
	}	
	
	@GetMapping("/getSocietyCommittee/{s_id}")
	public String getSocietyCommittee(@PathVariable int s_id)
	{
		CreateSession cs = new CreateSession();

		DBCommittee dbc=new DBCommittee();
		List<Committee> co=dbc.readCommitteeBySociety(cs.getSession(), s_id);
		List<CommitteeP> jc=new ArrayList();
		
		String json_string="";
		
		for(Committee c:co)
		{
			jc.add(c.toPOJO());
		}
		
		json_string = new Gson().toJson(jc);
		cs.closeSession();
		return json_string;
	}	
	
	@PostMapping("/getGateLocalServices")
	public String getGateLocalServices(@RequestBody SocietyId s_id)
	{
		CreateSession cs = new CreateSession();
		DBSocieties s=new DBSocieties();
		Societies soc = s.readSociety(cs.getSession(), s_id.getId());
		String json_string="";
		List<GateLocalServicesP> jgls=new ArrayList();

		for(GateLocalServices gls:soc.getGate_local_services())
		{
			jgls.add(gls.toPOJO());
//			json_string+=""+gls.getId()+""+gls.getIn_date()+" "+gls.getIn_time()+" "+gls.getOut_date()+" "+gls.getOut_time();	
		}
		
		json_string = new Gson().toJson(jgls);
		cs.closeSession();
		return json_string;
	}	
	
	@GetMapping("/getGateLocalServices/{s_id}")
	public String getGateLocalServices(@PathVariable int s_id)
	{
		CreateSession cs = new CreateSession();

		DBGateLocalServices dbgls=new DBGateLocalServices();
		List<GateLocalServices> ls=dbgls.readGateLocalServicesBySociety(cs.getSession(), s_id);
		String json_string="";
		List<GateLocalServicesP> jgls=new ArrayList();
		for(GateLocalServices gls:ls)
		{
			jgls.add(gls.toPOJO());
		}
		
		json_string = new Gson().toJson(jgls);
		cs.closeSession();
		return json_string;
	}	
	
	@GetMapping("/getSocietyLocalServices/{s_id}")
	public String getHouseLocalServices1(@PathVariable int s_id)
	{
		CreateSession cs = new CreateSession();
		DBSocieties dbs= new DBSocieties();
		Societies soc = dbs.readSociety(cs.getSession(), s_id);
		String json_string="";
		List<LocalServicesModel> lsm=new ArrayList();
		for(LocalServices local_service:soc.getLocal_services())
		{
			boolean added = false;
			for(LocalServicesModel ls:lsm)
			{
				if(ls.getCategory().equals(local_service.getTypes()))
				{
					added = true;
					ls.addLocal_services(local_service.toPOJO());
				}
			}
			if(!added)
			{
				LocalServicesModel new_lsm = new LocalServicesModel(local_service.getTypes());
				new_lsm.addLocal_services(local_service.toPOJO());
			}
			
		}
		json_string = new Gson().toJson(lsm);
		cs.closeSession();
		return json_string;
		
	}
	
	@PostMapping("/getSocietyLocalServices")
	public String getHouseLocalServices(@RequestBody SocietyId s_id)
	{
		CreateSession cs = new CreateSession();
		DBSocieties dbs= new DBSocieties();
		Societies soc = dbs.readSociety(cs.getSession(), s_id.getId());
		String json_string="";
		List<LocalServicesModel> lsm=new ArrayList();
		for(LocalServices local_service:soc.getLocal_services())
		{
			boolean added = false;
			for(LocalServicesModel ls:lsm)
			{
				if(ls.getCategory().equalsIgnoreCase(local_service.getTypes()))
				{
					added = true;
					ls.addLocal_services(local_service.toPOJO());
				}
			}
			if(!added)
			{
				LocalServicesModel new_lsm = new LocalServicesModel(local_service.getTypes());
				new_lsm.addLocal_services(local_service.toPOJO());
				lsm.add(new_lsm);
			}
			
		}
		json_string = new Gson().toJson(lsm);
		cs.closeSession();
		return json_string;
	}
	
	@PostMapping("/getLocalServices")
	public String getHouseLocalServices1(@RequestBody SocietyId s_id)
	{
		CreateSession cs = new CreateSession();
		DBSocieties dbs= new DBSocieties();
		Societies soc = dbs.readSociety(cs.getSession(), s_id.getId());
		String json_string="";
		List<LocalServicesP> lsp=new ArrayList();
		for(LocalServices ls:soc.getLocal_services())
		{
			lsp.add(ls.toPOJO());
		}
		json_string = new Gson().toJson(lsp);
		cs.closeSession();
		return json_string;
	}
	
	@PostMapping("/getNotices")
	public String getNotices(@RequestBody SocietyId s_id)
	{
		CreateSession cs = new CreateSession();
		DBSocieties dbs = new DBSocieties();
		Societies soc = dbs.readSociety(cs.getSession(), s_id.getId());
		List<NoticesP> jn=new ArrayList();
		String json_string="";
		
		for(Notices n:soc.getNotices())
		{
			jn.add(n.toPOJO());
		}
		json_string = new Gson().toJson(jn);
		cs.closeSession();
		return json_string;
		
	}
	
	@PostMapping("/deleteLocalService")
	public boolean deleteSocietyLocalService(@RequestBody LocalServicesId l_id)
	{
//		System.out.println(l_id.getId());
		CreateSession cs = new CreateSession();
		DBLocalServices dbls = new DBLocalServices();
		LocalServices ls = dbls.readLocalServices(cs.getSession(), l_id.getId());
//		System.out.println(ls.getId());
		List<Societies> new_soc = new ArrayList();
		List<Houses> new_houses = new ArrayList();
		try
		{
			for(Societies soc: ls.getSocieties())
			{
				if(soc.getId()==l_id.getS_id())
				{
					System.out.println("found soc");
//					ls.getSocieties().remove(soc);
				}
				else
				{
					new_soc.add(soc);
				}
			}
			ls.setSocieties(new_soc);
			for(Houses house: ls.getHouses())
			{
				if(house.getSociety().getId()==l_id.getS_id())
				{
					System.out.println("found house");
//					ls.getHouses().remove(house);
				}
				else
				{
					new_houses.add(house);
				}
			}
			ls.setHouses(new_houses);
			boolean ret = dbls.updateLocalServices(cs.getSession(), ls);
			cs.closeSession();
			return ret;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	@GetMapping("/getSocieties")
	public String getSocieties()
	{
		CreateSession cs = new CreateSession();
		DBSocieties dbs = new DBSocieties();
		List<Societies> soc = dbs.readAllSocieties(cs.getSession());
		String json_string="";
		List<SocietiesP> socp=new ArrayList();
		for(Societies s:soc)
		{
			socp.add(s.toPOJO());
		}
		json_string = new Gson().toJson(socp);
		cs.closeSession();
		return json_string;
		
	}
	
}
