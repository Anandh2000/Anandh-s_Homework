package Doctor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class clerk {
	public static void main(String[] args) {
		ArrayList<Doctor> al = new ArrayList<>();
		al.add(new Doctor(1, "lokesh", 45, "Cardio"));
		al.add(new Doctor(2, "srinivasan", 61, "ortho"));
		al.add(new Doctor(3, "anandh", 20, "Gynocologist"));
		al.add(new Doctor(4, "thulasi", 34, "Cardio"));
		al.add(new Doctor(5, "bala", 28, "ortho"));
		
		Collections.sort(al);
		//Collections.sort(al, new ComparatorAge());
		System.out.println(al);
		for (Doctor su : al) {
			System.out.println(su);
		}
		Scanner input = new Scanner(System.in);
		System.out.println("enter  the  name");
		String name = input.nextLine();
		
		for(Doctor st :al) {
			if (st.getName().equals(name)) {
				System.out.println("Doctor id = "+st.getid() +"   "+ "department = " +st.getdepartment());
			}
		}
	}
	 

}
