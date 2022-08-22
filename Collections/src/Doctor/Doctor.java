package Doctor;

public class Doctor implements Comparable<Doctor> {
	int id;
	String name;
	int age;
	String department;
	public Doctor(){}
	
	public Doctor(int id, String name, int age, String department) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
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
