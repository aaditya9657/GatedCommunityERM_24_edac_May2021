package hibernate;

import javax.persistence.Column;

public class Name 
{
	@Column(nullable=false)
	private String fname;
	
	private String mname;
	
	@Column(nullable=false)
	private String lname;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Name [fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
	}

	
}
