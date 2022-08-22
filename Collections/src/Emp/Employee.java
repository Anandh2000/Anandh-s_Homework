package Emp;

public class Employee {
	int empid;
	String empname;
	String empdep;
	String phnumber;
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpdep() {
		return empdep;
	}

	public void setEmpdep(String empdep) {
		this.empdep = empdep;
	}

	public String getnumber() {
		return phnumber;
	}

	public void setnumber(String phnumber) {
		this.phnumber = phnumber;
	}

	@Override
	public String toString() {
		return "Variable [empid=" + empid + ", empname=" + empname + ", empdep=" + empdep + ", phone=" + phnumber + "]";
	}

}
