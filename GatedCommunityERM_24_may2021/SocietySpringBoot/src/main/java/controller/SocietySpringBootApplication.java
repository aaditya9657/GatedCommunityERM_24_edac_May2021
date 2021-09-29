package controller;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hibernate.*;
import microservices.*;

@SpringBootApplication
public class SocietySpringBootApplication 
{
	public static void main(String[] args) 
	{
//		societiesEntry();
//		housesEntry();
//		usersEntry();
//		mobileEntry();
//		emailEntry();
//		vehicleEntry();
//		localServicesEntry();
//		localMobileEntry();
//		localEmailEntry();
//		committeeEntry();
//		emergencyContactsEntry();
//		gateLocalServicesEntry();
//		visitorsEntry();
//		maintenanceTypeEntry();
//		maintenanceEntry();
//		noticeEntry();
//		messagesEntry();
		SpringApplication.run(SocietySpringBootApplication.class, args);
	}

	public static void societiesEntry()
	{
		Societies s=new Societies();
		Address a=new Address();
		CreateSession cs = new CreateSession();
		DBSocieties dbs=new DBSocieties();

		a.setAddress("Pune");
		a.setCity("Aundh");
		a.setPincode(412007);
		a.setState("Maharashtra");
		a.setStreet("pride city mall");
		s.setName("Nakshatra");
		s.setAddress(a);

		dbs.createSocieties(cs.getSession(), s);

		Societies s1=new Societies();
		Address a1=new Address();
		a1.setAddress("Pune");
		a1.setCity("sinhgad");
		a1.setPincode(412008);
		a1.setState("Maharashtra");
		a1.setStreet("lavale");
		s1.setName("Chaitanya");
		s1.setAddress(a1);

		dbs.createSocieties(cs.getSession(), s1);

//		Societies s2=new Societies();
//		Address a2=new Address();
//		a2.setAddress("Pune");
//		a2.setCity("baner");
//		a2.setPincode(412009);
//		a2.setState("Maharashtra");
//		a2.setStreet("fs road");
//		s2.setName("akshatra");
//		s2.setAddress(a2);
//
//		dbs.createSocieties(cs.getSession(), s2);
//
//		Societies s3=new Societies();
//		Address a3=new Address();
//		a3.setAddress("Pune");
//		a3.setCity("talegaon");
//		a3.setPincode(412009);
//		a3.setState("Maharashtra");
//		a3.setStreet("maval-land");
//		s3.setName("sunshine");
//		s3.setAddress(a3);
//
//		dbs.createSocieties(cs.getSession(), s3);
//
//		Societies s4=new Societies();
//		Address a4=new Address();
//		a4.setAddress("Pune");
//		a4.setCity("kothrud");
//		a4.setPincode(412009);
//		a4.setState("Maharashtra");
//		a4.setStreet("null stop");
//		s4.setName("wonder futura");
//		s4.setAddress(a4);
//
//		dbs.createSocieties(cs.getSession(), s4);
//
//		Societies s5=new Societies();
//		Address a5=new Address();
//		a5.setAddress("Pune");
//		a5.setCity("mulshi");
//		a5.setPincode(412009);
//		a5.setState("Maharashtra");
//		a5.setStreet("wagholi");
//		s5.setName("Anand Park");
//		s5.setAddress(a5);
//
//		dbs.createSocieties(cs.getSession(), s5);
//
//		Societies s6=new Societies();
//		Address a6=new Address();
//		a6.setAddress("Pune");
//		a6.setCity("wakad");
//		a6.setPincode(412010);
//		a6.setState("Maharashtra");
//		a6.setStreet("vishal nagar");
//		s6.setName("Happy Society");
//		s6.setAddress(a6);
//
//		dbs.createSocieties(cs.getSession(), s6);
//
//		Societies s7=new Societies();
//		Address a7=new Address();
//		a7.setAddress("Pune");
//		a7.setCity("chinchwad");
//		a7.setPincode(412011);
//		a7.setState("Maharashtra");
//		a7.setStreet("akurdi road");
//		s7.setName("Dhanalakshmi Park");
//		s7.setAddress(a7);
//
//		dbs.createSocieties(cs.getSession(), s7);
//
//		Societies s8=new Societies();
//		Address a8=new Address();
//		a8.setAddress("Pune");
//		a8.setCity("akurdi");
//		a8.setPincode(412012);
//		a8.setState("Maharashtra");
//		a8.setStreet("pimpri road");
//		s8.setName("Sundaram");
//		s8.setAddress(a8);
//
//		dbs.createSocieties(cs.getSession(), s8);
//
//		Societies s9=new Societies();
//		Address a9=new Address();
//		a9.setAddress("Pune");
//		a9.setCity("mulshi");
//		a9.setPincode(412013);
//		a9.setState("Maharashtra");
//		a9.setStreet("Chandani Chowk");
//		s9.setName("Amrut Society");
//		s9.setAddress(a9);
//
//		dbs.createSocieties(cs.getSession(), s9);
//
//		Societies s10=new Societies();
//		Address a10=new Address();
//		a10.setAddress("Pune");
//		a10.setCity("Warje");
//		a10.setPincode(412014);
//		a10.setState("Maharashtra");
//		a10.setStreet("near warje bridge");
//		s10.setName("Dashabhuja Park");
//		s10.setAddress(a10);
//
//		dbs.createSocieties(cs.getSession(), s10);
		cs.closeSession();
	}

	public static void housesEntry()
	{
		CreateSession cs = new CreateSession();
		DBSocieties dbs= new DBSocieties();
		List<Societies> societies = dbs.readAllSocieties(cs.getSession());
		Societies s=dbs.readSociety(cs.getSession(), 1);
		DBHouses dbh=new DBHouses();
		
		List<String> wings = new ArrayList();
		wings.add("A");
//		wings.add("B");
//		wings.add("C");
//		wings.add("D");

		for(Societies soc: societies)
		{
			for(String wing: wings)
			{
				for(int floor=1; floor<=4;floor++)
				{
					for(int flat=1;flat<=4;flat++)
					{
						Houses h = new Houses();
						h.setWing(wing);
						h.setFlat_no(floor*100+flat);
						dbh.createHouses(cs.getSession(), h, soc);
					}
				}
			}
			
		} 
		cs.closeSession();
	}

	public static void usersEntry()
	{
		List<String> first_names = new ArrayList();
		List<String> last_names = new ArrayList();
		
//		first_names.add("Himanshu");last_names.add("Deshpande");
//		first_names.add("Sahil");last_names.add("Kshirsagar");
//		first_names.add("Aishwarya");last_names.add("Pawar");
//		first_names.add("Prerna");last_names.add("Mohite");
//		first_names.add("Amit");last_names.add("Khendake");
//		first_names.add("Rutuja");last_names.add("Patil");
//		first_names.add("Akshay");last_names.add("Ringe");
//		first_names.add("Aaditya");last_names.add("Kulkarni");
//		first_names.add("Rina");last_names.add("Borchate");
//		first_names.add("Aniket");last_names.add("Korde");
//		first_names.add("Vaishnavi");last_names.add("Thorat");
//		first_names.add("Dipak");last_names.add("Mani");
//		first_names.add("Shraddha");last_names.add("Sabne");
//		first_names.add("Kalpesh");last_names.add("Desle");
//		first_names.add("Kiran");last_names.add("Kittur");
//		first_names.add("Pranav");last_names.add("Kolhe");
//		first_names.add("Shantanu");last_names.add("Dedhe");
//		first_names.add("Rushikesh");last_names.add("Vaijapurkar");
//		first_names.add("Manasi");last_names.add("Sarnaik");
//		first_names.add("Rohit");last_names.add("Sharma");
//		first_names.add("Sudhir");last_names.add("Phadke");
		first_names.add("Tanvi");last_names.add("Yevle");
		first_names.add("Rutuja");last_names.add("Kadam");
		first_names.add("Akanksha");last_names.add("Patil");
		first_names.add("Aditi");last_names.add("Deshmukh");	
		first_names.add("Apoorva");last_names.add("Adhikari");
		
		CreateSession cs = new CreateSession();
		DBSocieties dbs= new DBSocieties();
		DBHouses dbh=new DBHouses();
		DBUser dbu= new DBUser();
		
		List<Users> users = new ArrayList();
		for(String last:last_names)
		{
			for(String first:first_names)
			{
				Name name=new Name();
				name.setFname(first);
				name.setLname(last);
				Users user=new Users();
				user.setName(name);
				users.add(user);
			}
		}
		
		int i=0;
		for(Houses house: dbh.readAllHouses(cs.getSession()))
		{
			for(int j=0;j<2;j++,i++)
			{
				if(i>=users.size())
				{
					i=0;
				}
				users.get(i).addHouses(house);
				users.get(i).addSocieties(house.getSociety());
//				i++;
			}
		}
		
		for(Users user: users)
		{
			dbu.createUser(cs.getSession(), user, user.getHouses(), user.getSocieties());
		}
		
		cs.closeSession();
	}

	public static void localServicesEntry()
	{
		CreateSession cs = new CreateSession();
		DBSocieties dbs= new DBSocieties();
		Societies s=dbs.readSociety(cs.getSession(), 1);
		List<Societies> soc= new ArrayList();
		soc.add(s);
		DBHouses dbh=new DBHouses();
		DBLocalServices dbl= new DBLocalServices();
		
		
		List<String> first_names = new ArrayList();
		List<String> last_names = new ArrayList();
		List<String> types = new ArrayList();
		
		types.add("Maid");
		types.add("Car Washer");
		types.add("Driver");
		types.add("Carpenter");
		types.add("Plumber");
		types.add("Electrician");
		types.add("Cook");
		
//		first_names.add("Kamala");last_names.add("Patil");
//		first_names.add("Roshan");last_names.add("Singh");
//		first_names.add("Usha");last_names.add("Pawar");
//		first_names.add("Nisha");last_names.add("Mohite");
//		first_names.add("Shaam");last_names.add("Khendake");
//		first_names.add("Raju");last_names.add("Patil");
//		first_names.add("Babu");last_names.add("Ringe");
//		first_names.add("Vivek");last_names.add("Kulkarni");
//		first_names.add("Ram");last_names.add("Borchate");
//		first_names.add("Lakhan");last_names.add("Korde");
//		first_names.add("Krishna");last_names.add("Thorat");
//		first_names.add("Arnab");last_names.add("Mani");
//		first_names.add("Dhiraj");last_names.add("Sabne");
//		first_names.add("Akash");last_names.add("Desle");
//		first_names.add("Ashok");last_names.add("Kittur");
//		first_names.add("Sunanda");last_names.add("Kolhe");
//		first_names.add("Kavita");last_names.add("Dedhe");
//		first_names.add("Rakesh");last_names.add("Vaijapurkar");
//		first_names.add("Shital");last_names.add("Sarnaik");
//		first_names.add("Atul");last_names.add("Adhikari");
//		first_names.add("Sagar");last_names.add("Phadke");
		first_names.add("Girish");last_names.add("Joshi");
		first_names.add("Vijay");last_names.add("Kulkarni");
		first_names.add("Amruta");last_names.add("Mohite");
		first_names.add("Harish");last_names.add("Pawar");
		first_names.add("Dinesh");last_names.add("Sharma");
		
		List<LocalServices> local_services = new ArrayList();
		int i=0;int num = 1000;
		for(String last:last_names)
		{
			for(String first:first_names)
			{
				Name name=new Name();
				name.setFname(first);
				name.setLname(last);
				LocalServices local_service=new LocalServices();
				local_service.setName(name);
				if(i>=types.size())
					i=0;
				local_service.setTypes(types.get(i));
				local_service.setVehicleType("Bike");
				local_service.setRegistration_no("MH 12 AB "+num++);
				local_services.add(local_service);
				i++;
			}
		}
		
		i=0;
		for(Houses house: dbh.readAllHouses(cs.getSession()))
		{
			if(i>=local_services.size())
				i=0;
			local_services.get(i).addHouses(house);
			local_services.get(i).addSocieties(house.getSociety());
			i++;
		}
		
		for(LocalServices local: local_services)
		{
			dbl.createLocalServices(cs.getSession(), local, local.getHouses(), local.getSocieties());
		}
		
		cs.closeSession();
	}

	public static void mobileEntry()
	{
		CreateSession cs = new CreateSession();
		DBUser dbu=new DBUser();
		DBUserMobile dum=new DBUserMobile();
		List<Users> users=dbu.readAllUsers(cs.getSession());
		long mob_no=7777777777L;
		for(Users user:users)
		{
			for(int i=0;i<2;i++)
			{
				UserMobile um=new UserMobile();
				um.setMob_no(mob_no);
				mob_no=mob_no+2;
				if(i==0)
				{
					um.setIs_primary(true);
				}
				else
				{
					um.setIs_primary(false);
				}
				um.setUser(user);
				dum.createUserMobile(cs.getSession(), um, user);
			}
		}
		cs.closeSession();
	}

	public static void emailEntry()
	{
		CreateSession cs = new CreateSession();
		DBUser dbu=new DBUser();
		DBUserEmail due=new DBUserEmail();
		List<Users> users=dbu.readAllUsers(cs.getSession());

		for(Users user:users)
		{
			for(int i=0;i<2;i++)
			{
				UserEmail ue=new UserEmail();
				ue.setEmail((user.getName().getFname()).toLowerCase()+"."+(user.getName().getLname()).toLowerCase()+i+"@gmail.com");
				if(i==0)
				{
					ue.setIs_primary(true);
				}
				else
				{
					ue.setIs_primary(false);
				}
				ue.setUser(user);
				due.createUserEmail(cs.getSession(), ue, user);
			}
		}
		cs.closeSession();
	}

	public static void vehicleEntry()
	{
		CreateSession cs = new CreateSession();
		DBUser dbu=new DBUser();
		DBUserVehicles duv=new DBUserVehicles();
		List<Users> users=dbu.readAllUsersBySocieties(cs.getSession(), 1);

		DBSocieties dbs=new DBSocieties();
		Societies s=dbs.readSociety(cs.getSession(), 1);

		String car_regno="MH 12 AA";
		String bike_regno="MH 14 AA";
		int num1=1000;
		int num2=2000;
		for(Users user:users)
		{
			for(int i=0;i<2;i++)
			{
				UserVehicles uv=new UserVehicles();

				if(i==0)
				{
					uv.setType("Car");
					uv.setRegistration_no(car_regno+" "+num1);
					num1++;
				}
				else
				{
					uv.setType("Bike");
					uv.setRegistration_no(bike_regno+" "+num2);
					num2++;
				}
				uv.setUser(user);
				duv.createUserVehicles(cs.getSession(), uv, user,s ,user.getHouses().get(0));

			}
		}
		cs.closeSession();
	}

	public static void localMobileEntry()
	{
		CreateSession cs = new CreateSession();
		DBLocalServices dbu=new DBLocalServices();
		DBLocalServicesMobile dum=new DBLocalServicesMobile();
		List<LocalServices> users=dbu.readAllLocalServices(cs.getSession());
		long mob_no=7777777776L;
		for(LocalServices user:users)
		{
			for(int i=0;i<2;i++)
			{
				LocalServicesMobile um=new LocalServicesMobile();
				um.setMob_no(mob_no);
				mob_no=mob_no+2;
				if(i==0)
				{
					um.setIs_primary(true);
				}
				else
				{
					um.setIs_primary(false);
				}
				um.setLocal_service(user);;
				dum.createLocalServicesMobile(cs.getSession(), um, user);
			}
		}
		cs.closeSession();
	}

	public static void localEmailEntry()
	{
		CreateSession cs = new CreateSession();
		DBLocalServices dbu=new DBLocalServices();
		DBLocalServicesEmail due=new DBLocalServicesEmail();
		List<LocalServices> users=dbu.readAllLocalServices(cs.getSession());

		for(LocalServices user:users)
		{
			for(int i=0;i<2;i++)
			{
				LocalServicesEmail ue=new LocalServicesEmail();
				ue.setEmail((user.getName().getFname()).toLowerCase()+"."+(user.getName().getLname()).toLowerCase()+i+"@gmail.com");
				if(i==0)
				{
					ue.setIs_primary(true);
				}
				else
				{
					ue.setIs_primary(false);
				}
				ue.setLocal_service(user);;
				due.createLocalServices(cs.getSession(), ue, user);
			}
		}
		cs.closeSession();
	}

	public static void committeeEntry()
	{
		CreateSession cs = new CreateSession();
		DBSocieties dbs= new DBSocieties();
		List<Societies> societies = dbs.readAllSocieties(cs.getSession());
		DBCommittee dbc=new DBCommittee();
		for(Societies s : societies)
		{
			Committee c1=new Committee();
			c1.setDesignation("Chairman");
			dbc.createCommittee(cs.getSession(), c1, s.getUsers().get(0), s);

			Committee c2=new Committee();
			c2.setDesignation("Secretary");
			dbc.createCommittee(cs.getSession(), c2, s.getUsers().get(2), s);

			Committee c3=new Committee();
			c3.setDesignation("Treasurer");
			dbc.createCommittee(cs.getSession(), c3, s.getUsers().get(4), s);

			Committee c4=new Committee();
			c4.setDesignation("Member1");
			dbc.createCommittee(cs.getSession(), c4, s.getUsers().get(6), s);

			Committee c5=new Committee();
			c5.setDesignation("Member2");
			dbc.createCommittee(cs.getSession(), c5, s.getUsers().get(8), s);

			Committee c6=new Committee();
			c6.setDesignation("Member3");
			dbc.createCommittee(cs.getSession(), c6, s.getUsers().get(10), s);

			Committee c7=new Committee();
			c7.setDesignation("Member4");
			dbc.createCommittee(cs.getSession(), c7, s.getUsers().get(12), s);

			Committee c8=new Committee();
			c8.setDesignation("Member5");
			dbc.createCommittee(cs.getSession(), c8, s.getUsers().get(14), s);
		}
		
		cs.closeSession();	 
	}

	public static void emergencyContactsEntry()
	{
		CreateSession cs = new CreateSession();
		DBSocieties dbs= new DBSocieties();
		List<Societies> societies = dbs.readAllSocieties(cs.getSession());
		DBEmergencyContacts dbec=new DBEmergencyContacts();
		for(Societies s: societies)
		{
			EmergencyContacts ec1=new EmergencyContacts();
			ec1.setName("hospital");
			ec1.setContact_no(8261273940L);
			dbec.createEmergencyContacts(cs.getSession(), ec1, s);

			EmergencyContacts ec2=new EmergencyContacts();
			ec2.setName("fire");
			ec2.setContact_no(8834728914L);
			dbec.createEmergencyContacts(cs.getSession(), ec1, s);

			EmergencyContacts ec3=new EmergencyContacts();
			ec3.setName("police");
			ec3.setContact_no(7761273942L);
			dbec.createEmergencyContacts(cs.getSession(), ec3, s);

			EmergencyContacts ec4=new EmergencyContacts();
			ec4.setName("women helpline");
			ec4.setContact_no(1091L);
			dbec.createEmergencyContacts(cs.getSession(), ec4, s);

			EmergencyContacts ec5=new EmergencyContacts();
			ec5.setName("mseb");
			ec5.setContact_no(9261253943L);
			dbec.createEmergencyContacts(cs.getSession(), ec5, s);

			EmergencyContacts ec6=new EmergencyContacts();
			ec6.setName("LPG leak helpline");
			ec6.setContact_no(1906L);
			dbec.createEmergencyContacts(cs.getSession(), ec6, s);
		}		
		cs.closeSession();
	}

	public static void gateLocalServicesEntry()
	{
		CreateSession cs = new CreateSession();
		DBLocalServices dbls=new DBLocalServices();
		DBSocieties dbs=new DBSocieties();
		Societies s=dbs.readSociety(cs.getSession(), 1);
		DBGateLocalServices dbl=new DBGateLocalServices();

		for(int i=1;i<20;i++)
		{
			for(Societies soc: dbs.readAllSocieties(cs.getSession()))
			{
				for(LocalServices ls1: soc.getLocal_services())
				{
					GateLocalServices gls1=new GateLocalServices();
					Date d1=new Date(121,8,i);
					gls1.setIn_date(d1);
					gls1.setOut_date(d1);
					int a=(int)(Math.random()*10)+5;
					Time t1=new Time(a, 5, 0);
					gls1.setIn_time(t1);
					Time t2=new Time(a+2, 5, 0);
					gls1.setOut_time(t2);
					dbl.createGateLocalServices(cs.getSession(), gls1, ls1, s);
				}
			}
		}
		cs.closeSession();
	}

	public static void visitorsEntry()
	{
		CreateSession cs = new CreateSession();
		DBSocieties dbs = new DBSocieties();
		DBHouses dbh = new DBHouses();
		DBVisitors dbv=new DBVisitors();
		List<String> firstnames= new ArrayList();
		List<String> lastnames= new ArrayList();

		firstnames.add("Akash");lastnames.add("Verma");
		firstnames.add("Ruchira");lastnames.add("kolekar");
		firstnames.add("Rucha");lastnames.add("Nade");
		firstnames.add("Palak");lastnames.add("Muchhal");
		firstnames.add("Kanika");lastnames.add("Kapoor");
		firstnames.add("Aniket");lastnames.add("Jadhav");
		firstnames.add("Rutuja");lastnames.add("Palkar");
		firstnames.add("Aishwarya");lastnames.add("Chavan");
		firstnames.add("Anish");lastnames.add("Deshmukh");
		firstnames.add("Purva");lastnames.add("Mohire");
		firstnames.add("Amol");lastnames.add("Pachore");
		firstnames.add("Kshitija");lastnames.add("Patil");
		firstnames.add("Namrata");lastnames.add("Shinde");
		firstnames.add("Devaki");lastnames.add("Tilekar");
		firstnames.add("Pragati");lastnames.add("Jagadale");
		firstnames.add("Devaki");lastnames.add("Pandit");
		firstnames.add("Viraj");lastnames.add("Magar");
		firstnames.add("Prasanna");lastnames.add("Prathamwar");
		firstnames.add("Sangram");lastnames.add("Patil");
		firstnames.add("Jigisha");lastnames.add("Agarkar");
		firstnames.add("shreya");lastnames.add("Lohar");
		firstnames.add("Manasi");lastnames.add("Chillar");
		firstnames.add("Shubham");lastnames.add("Agale");
		firstnames.add("Shweta");lastnames.add("kshirsagar");
		firstnames.add("Shruti");lastnames.add("Marathe");
		firstnames.add("Ojas");lastnames.add("ladda");
		firstnames.add("Prashant");lastnames.add("Rane");
		firstnames.add("Nitin");lastnames.add("Gadkari");
		firstnames.add("Priyanka");lastnames.add("Ranshul");
		firstnames.add("Shantanu");lastnames.add("Dedhe");
		firstnames.add("Riya");lastnames.add("Patel");
		firstnames.add("Rucha");lastnames.add("Deshmukh");
		firstnames.add("Rohan");lastnames.add("Aaglave");
		firstnames.add("Mihir");lastnames.add("Jadhav");
		firstnames.add("Pranav");lastnames.add("Patil");
		firstnames.add("Utkarsh");lastnames.add("Mahajan");
		firstnames.add("Manohar");lastnames.add("Borchate");
		firstnames.add("Omkar");lastnames.add("Vibhute");
		firstnames.add("Vaishnavi");lastnames.add("Pandure");
		firstnames.add("Divya");lastnames.add("Bharati");
		firstnames.add("Ganesh");lastnames.add("Dinde");
		firstnames.add("Tejal");lastnames.add("Jain");
		firstnames.add("Tanvi");lastnames.add("Sabne");
		firstnames.add("Swati");lastnames.add("Manal");
		firstnames.add("Dhiraj");lastnames.add("Shah");
		firstnames.add("Survi");lastnames.add("Patil");
		firstnames.add("Sai");lastnames.add("Tamhankar");
		firstnames.add("Soham");lastnames.add("Parekh");
		firstnames.add("Krutika");lastnames.add("Suryawanshi");
		firstnames.add("Arbaz");lastnames.add("Pathan");
		firstnames.add("Mahima");lastnames.add("Mujumdar");
		firstnames.add("Shubham");lastnames.add("Walsade");
		firstnames.add("Mrunal");lastnames.add("Kulkarni");
		firstnames.add("Shraddha");lastnames.add("Kharat");
		firstnames.add("Neha");lastnames.add("Shirsath");
		firstnames.add("Rutuja");lastnames.add("Jevughale");
		firstnames.add("Poonam");lastnames.add("Nipul");
		firstnames.add("Ruchika");lastnames.add("Bhole");
		firstnames.add("Pratiksha");lastnames.add("Deshmukh");
		firstnames.add("Priti");lastnames.add("Shahane");
		firstnames.add("Rachita");lastnames.add("Surve");
		firstnames.add("Purva");lastnames.add("Khande");
		firstnames.add("Remya");lastnames.add("Manoharan");
		firstnames.add("Pournima");lastnames.add("Kakade");

		List<String> reasons= new ArrayList();
		reasons.add("Delivery");
		reasons.add("Guest");

		List<String> vehicle_type= new ArrayList();
		vehicle_type.add("Car");
		vehicle_type.add("Bike");

		List<Societies> soc = dbs.readAllSocieties(cs.getSession());
		for(Societies s: soc)
		{
			List<Houses> houses = s.getHouses();
			for(int l=0;l<20;l++)
			{
				for(int i=0,j=0,k=0;j<firstnames.size();i++,j++,k++)
				{
					if(i==houses.size())
					{
						i=0;
					}
					if(k==reasons.size())
					{
						k=0;
					}
					List<Houses> house=new ArrayList();
					house.add(houses.get(i));
					Visitors v1= new Visitors();
					Name n1= new Name();
					n1.setFname(firstnames.get(j));
					n1.setLname(lastnames.get(j));
					n1.setMname("");
					v1.setName(n1);
					v1.setEmail_id((n1.getFname()).toLowerCase()+"."+(n1.getLname()).toLowerCase()+"@gmail.com");
					v1.setMob_no(9026372000L+j);
					v1.setReason(reasons.get(k));
					v1.setVehicletype(vehicle_type.get(k));
					v1.setRegistration_no("MH 12 AA"+" "+(2000+j));
					Date d1=new Date(121,8,l);
					v1.setIn_date(d1);
					v1.setOut_date(d1);
					int a=(int)(Math.random()*10)+5;
					Time t = new Time(a, 5, 00);
					v1.setIn_time(t);
					t=new Time(a+2, 10, 55);
					v1.setOut_time(t);
		
					dbv.createVisitors(cs.getSession(), v1, house);
				}
			}
		}
		
		cs.closeSession();
	}

	public static void maintenanceTypeEntry()
	{
		CreateSession cs = new CreateSession();
		DBSocieties dbs= new DBSocieties();
		
		DBMaintenanceType dmt= new DBMaintenanceType();
		List<String> mtypes = new ArrayList();
		mtypes.add("Electricity Charges");
		mtypes.add("Parking Charges");
		mtypes.add("Construction And Repair Funds");
		mtypes.add("Water Taxes");
		mtypes.add("Security Charges");
		mtypes.add("Other Charges");
		for(Societies s: dbs.readAllSocieties(cs.getSession()))
		{
			for(String mtt: mtypes)
			{
				MaintenanceType mt=new MaintenanceType();
				mt.setType(mtt);
				mt.setSociety(s);
				dmt.createMaintenanceType(cs.getSession(), mt, s);
			}
		}		
		cs.closeSession();
	}

	private static void maintenanceEntry()
	{
		CreateSession cs = new CreateSession();
		DBHouses dbh = new DBHouses();
		DBSocieties dbs=new DBSocieties();
		DBMaintenanceType dbmt = new DBMaintenanceType();
		DBMaintenance dbm = new DBMaintenance();
		List<Double> costs = new ArrayList();
		costs.add(new Double(200));
		costs.add(new Double(100));
		costs.add(new Double(300));
		costs.add(new Double(100));
		costs.add(new Double(500));
		costs.add(new Double(300));
		for(Societies soc: dbs.readAllSocieties(cs.getSession()))
		{
			List<Houses> houses = soc.getHouses();
			List<MaintenanceType> mtypes = soc.getMaintenance_types();
			for(int m=1;m<8;m++)
			{
				for(Houses h :houses)
				{
					for(int i=0;i<6;i++)
					{
						Maintenance mn = new Maintenance();
						mn.setBegin_date(new Date(121, m, 27));
						mn.setEnd_date(new Date(121, m+1, 26));
						mn.setHouse(h);
						mn.setCost(costs.get(i));
						mn.setMaintenance_type(mtypes.get(i));
						dbm.createMaintenance(cs.getSession(), mn, mtypes.get(i), h);
					}
				}
			}
		}
		cs.closeSession();
	}

	private static void noticeEntry()
	{
		CreateSession cs = new CreateSession();
		DBSocieties dbs=new DBSocieties();
		DBNotices dbn=new DBNotices();		
		DBHouses dbh = new DBHouses();
		List<String> subjects = new ArrayList();
		subjects.add("Water Tank Cleaning");
		subjects.add("Lift Repairing");
		subjects.add("Parking Warning");
		subjects.add("Garbage Disposal");
		
		List<String> contents = new ArrayList();
		contents.add("Please be informed that the building will be carrying out the water tank cleaning\r\n"
				+ "works as per date mentioned. The cleaning works will not disrupt water supply as\r\n"
				+ "each tower has 2 water tanks for domestic supply purpose. Some of your units may\r\n"
				+ "encounter cloudy water during the period of times. We recommend residents to\r\n"
				+ "perform flushing for about 5 - 7 minutes or until its gain back the water clarity.");
		
		contents.add("This is to inform you that Lift No. P56 at HW Tower is kept\r\n"
				+ "closed for safety as the wire rope needs to be replaced.\r\n"
				+ "Since the replacement material is not available locally, it is\r\n"
				+ "being procured from abroad. Hence, there is a delay in\r\n"
				+ "completing the work.");
		
		contents.add("We are writing this Notices to inform you of the illegal parking we observed on our private property over the past 2/3 days. \r\n"
				+ " We would like to inform you that we do not allow vehicles to be parked on our property without prior permission.\r\n"
				+ "This is simply a warning; as long as you comply with our instructions, we will not be pursuing any further action.\r\n"
				+ "Please park your vehicle elsewhere in the future. Otherwise, we may tow your vehicle.");
		
		contents.add("The residents of this society have already complained about this issue many times. "
				+ "The Cleaning and Waste management committee is performing so badly. Due to their negligence, the streets of our society are becoming filthy.");

		
		for(Societies soc: dbs.readAllSocieties(cs.getSession()))
		{
			
			for(int i=1,j=0;i<=17;i++,j++)
			{
				List<Houses> h=dbh.readAllHouses(cs.getSession(), soc.getId());
				Notices n=new Notices();
				if(j>=contents.size())
				{
					j=0;
				}
				n.setContent(contents.get(j));
				n.setSubject(subjects.get(j));
				
				n.setDate_of_creation(new Date(121, 8, i));			
				n.setDate_of_issue(new Date(121, 8, i+2));
				n.setDate_of_expiry(new Date(121, 8, i+5));
				
				n.setTime_of_creation(new Time((int) (Math.random()*10),5,25));
				n.setTime_of_issue(new Time((int) (Math.random()*10),5,25));
				n.setTime_of_expiry(new Time((int) (Math.random()*10),5,25));
				
				dbn.createNotices(cs.getSession(), n, h, soc);
			}
		}
		cs.closeSession();
		
	}
	
	private static void messagesEntry()
	{
		CreateSession cs = new CreateSession();
		DBUser dbu = new DBUser();
		DBSocieties dbs = new DBSocieties();
		List<String> messages = new ArrayList();
		DBMessages dbm=new DBMessages();
		messages.add("Hi");
//		messages.add("Hello");
//		messages.add("How Are You");
//		messages.add("I am fine,what about you?");
//		messages.add("i am good");
//		messages.add("Bye");
		List<Societies> societies = dbs.readAllSocieties(cs.getSession());
		for(Societies soc : societies)
		{
			List<Users> users = soc.getUsers();
			for(Users user1:users)
			{
				for(Users user2:users)
				{
					if(user1!=user2)
					{
						for(int j=0,i=11;j<messages.size();j++,i++)
						{
							Messages msg=new Messages();
							msg.setUser_to(user1);
							msg.setUser_from(user2);
							msg.setDate_sent(new Date(121, 8, i));
							msg.setDate_received(new Date(121, 8, i));
							int t=(int) (Math.random()*10);
							msg.setTime_sent(new Time(t,10,30));
							msg.setTime_received(new Time(t,11,0));
							msg.setMessage(messages.get(j));
							dbm.createMessages(cs.getSession(), msg, user2, user1);
						}
					}
				}
			}
		}
		cs.closeSession();
	}
}