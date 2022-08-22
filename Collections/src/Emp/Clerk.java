package Emp;

import java.util.ArrayList;

public class Clerk {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpid(1);
		e1.setEmpname("Anandh");
		e1.setEmpdep("develop");
		e1.setnumber("7735251333");
		
		Employee e2 = new Employee();
		e2.setEmpid(2);
		e2.setEmpname("Bala");
		e2.setEmpdep("development");
		e2.setnumber("9544648985");
		
		Employee e3 = new Employee();
		e3.setEmpid(3);
		e3.setEmpname("Shahil");
		e3.setEmpdep("deveops");
		e3.setnumber("5484889486");
		
		ArrayList<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		System.out.println(al);
		al.forEach(num -> System.out.println(num));
		for(Employee d : al) {
			if(d.getEmpdep().equals("development")) {
				System.out.println(d.getEmpname());
			}
		}
	}

}
