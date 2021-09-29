package model;

import java.sql.Date;

public class Maintenance 
{
	 private int id;
     private Date bg;
     private Date ed;
     private double ec;
     private double pc;
     private double cr;
     private double wt;
     private double sc;
     private double oc;
     private double tc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getBg() {
		return bg;
	}
	public void setBg(Date bg) {
		this.bg = bg;
	}
	public Date getEd() {
		return ed;
	}
	public void setEd(Date ed) {
		this.ed = ed;
	}
	public double getEc() {
		return ec;
	}
	public void setEc(double ec) {
		this.ec = ec;
	}
	public double getPc() {
		return pc;
	}
	public void setPc(double pc) {
		this.pc = pc;
	}
	public double getCr() {
		return cr;
	}
	public void setCr(double cr) {
		this.cr = cr;
	}
	public double getWt() 
	{
		return wt;
	}
	public void setWt(double wt) 
	{
		this.wt = wt;
	}
	public double getSc() 
	{
		return sc;
	}
	public void setSc(double sc) 
	{
		this.sc = sc;
	}
	public double getOc() 
	{
		return oc;
	}
	public void setOc(double oc) 
	{
		this.oc = oc;
	}
	public double getTc() 
	{
		return tc;
	}
	public void setTc(double tc) 
	{
		this.tc = tc;
	}
     
     

}
