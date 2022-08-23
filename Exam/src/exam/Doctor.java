package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class Doctor implements Comparable<Doctor> {
	int id;
	String name;
	int age;
	String department;
	public Doctor(){}
	
	public Doctor(int id, String name, int age, String department) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "1234");
		String query = "insert into doctor values(?,?,?,?);";
		PreparedStatement p = con.prepareStatement(query);
		p.setInt(1, id);
		p.setString(2, name);
		p.setInt(3, age);
		p.setString(4, department);
		p.executeUpdate();
		
	}

	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getdepartment() {
		return department;
	}
	public void setdepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", age=" + age + ", department=" + department + "]";
	}

	@Override
	public int compareTo(Doctor o) {
		// TODO Auto-generated method stub
		return id - o.id;
	}


}
