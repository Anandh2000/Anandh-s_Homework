package hibernat;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hiber {

	public static void main(String[] args) {
		System.out.println("hii");
		Configuration cfg = new  Configuration();
		System.out.println("hii");
		cfg.configure();
		System.out.println("hii");
		cfg.addAnnotatedClass(Clerk.class);
		System.out.println("hii");
		SessionFactory sf = cfg.buildSessionFactory();
		System.out.println("hii");
		Session s = sf.openSession();
		Transaction tr =  s.beginTransaction();
		
		Criteria cc = s.createCriteria(Clerk.class);
		List<Clerk> l = cc.list();
		System.out.println(l);
		
		tr.commit();
		s.close();

	}

}
