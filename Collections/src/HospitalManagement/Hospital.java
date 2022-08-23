package HospitalManagement;

import java.awt.Frame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Hospital {

	public HashMap<String, HashMap<String, ArrayList<Object>>> detail() {
		ArrayList<Object> doc = new ArrayList<>();
		Doctor d1 = new Doctor();
		doc.add(new Doctor(1, "Lokesh", 45, "ortho"));
		doc.add(new Doctor(2, "srinivasan", 61, "ortho"));
		doc.add(new Doctor(3, "anandh", 28, "Gynocologist"));
		doc.add(new Doctor(4, "thulasi", 24, "Cardio"));
		doc.add(new Doctor(5, "bala", 28, "ortho"));
		ArrayList<Object> clr = new ArrayList<>();
		clr.add(new Clerk(1,"Sowmi","sanitizing"));
		clr.add(new Clerk(2,"Deepak","Cleaning"));
		clr.add(new Clerk(3,"power","receptionist"));
		HashMap <String ,ArrayList<Object>> fd = new HashMap<>();
		fd.put("Doctor", doc);
		fd.put("Clerk", clr);
		HashMap <String,HashMap <String ,ArrayList<Object>>> hg = new HashMap<>();
		hg.put("Hospital", fd);
		return hg;
	}
	public static void main(String[] args) {
		Hospital h = new Hospital();
		System.out.println("Enter Doctor/Clerk to show available details");
		Scanner sc = new Scanner(System.in);
		String ame = sc.next();
		
		HashMap<String, HashMap<String, ArrayList<Object>>> ans = h.detail();
		HashMap<String, ArrayList<Object>> data = ans.get("Hospital");
			if(data.containsKey(ame)){
				ArrayList<Object> dd = data.get(ame);
				System.out.println("Enter the name");
				String sname = sc.next();
				for(Object oo : dd) {
					if(oo instanceof Doctor) {
						if(((Doctor) oo).getName().equals(sname)){
							System.out.println(oo);
						}
					}
					if(oo instanceof Clerk) {
						if(((Clerk) oo).getName().equals(sname)){
							System.out.println(oo);
						}
					}
				}
				}
			}
		}

